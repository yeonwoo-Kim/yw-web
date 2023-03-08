package dev.ywweb.work;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Work {
    Long id;
    String workName;
    LocalDateTime regDtm;
}
