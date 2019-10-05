package typings.overwatchDashApi.overwatchDashApiMod.owl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stages extends js.Object {
  var stage1: StageStandingInfo
  var stage2: StageStandingInfo
  var stage3: StageStandingInfo
  var stage4: StageStandingInfo
}

object Stages {
  @scala.inline
  def apply(
    stage1: StageStandingInfo,
    stage2: StageStandingInfo,
    stage3: StageStandingInfo,
    stage4: StageStandingInfo
  ): Stages = {
    val __obj = js.Dynamic.literal(stage1 = stage1, stage2 = stage2, stage3 = stage3, stage4 = stage4)
  
    __obj.asInstanceOf[Stages]
  }
}

