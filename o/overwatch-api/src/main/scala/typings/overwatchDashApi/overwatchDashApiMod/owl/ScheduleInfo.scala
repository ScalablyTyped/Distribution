package typings.overwatchDashApi.overwatchDashApiMod.owl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScheduleInfo extends js.Object {
  var endDate: String
  var stages: js.Array[StageScheduleInfo]
  var startDate: String
}

object ScheduleInfo {
  @scala.inline
  def apply(endDate: String, stages: js.Array[StageScheduleInfo], startDate: String): ScheduleInfo = {
    val __obj = js.Dynamic.literal(endDate = endDate, stages = stages, startDate = startDate)
  
    __obj.asInstanceOf[ScheduleInfo]
  }
}

