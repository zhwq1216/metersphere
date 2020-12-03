package io.metersphere.base.domain;

import java.io.Serializable;
import lombok.Data;

@Data
public class ApiScenarioReport implements Serializable {
    private String id;

    private String scenarioId;

    private String name;

    private String description;

    private Long createTime;

    private Long updateTime;

    private String status;

    private String userId;

    private String triggerMode;

    private static final long serialVersionUID = 1L;
}