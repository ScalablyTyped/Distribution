package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IScheduledJobTrigger extends js.Object {
  var BeginDay: Double
  var BeginMonth: Double
  var BeginYear: Double
  var EndDay: Double
  var EndMonth: Double
  var EndYear: Double
  var StartHour: Double
  var StartMinute: Double
  var Type: ITriggerType
  var ValidEndDate: Boolean
  def Clone(): IScheduledJobTrigger
}

object IScheduledJobTrigger {
  @scala.inline
  def apply(
    BeginDay: Double,
    BeginMonth: Double,
    BeginYear: Double,
    Clone: () => IScheduledJobTrigger,
    EndDay: Double,
    EndMonth: Double,
    EndYear: Double,
    StartHour: Double,
    StartMinute: Double,
    Type: ITriggerType,
    ValidEndDate: Boolean
  ): IScheduledJobTrigger = {
    val __obj = js.Dynamic.literal(BeginDay = BeginDay, BeginMonth = BeginMonth, BeginYear = BeginYear, Clone = js.Any.fromFunction0(Clone), EndDay = EndDay, EndMonth = EndMonth, EndYear = EndYear, StartHour = StartHour, StartMinute = StartMinute, Type = Type, ValidEndDate = ValidEndDate)
  
    __obj.asInstanceOf[IScheduledJobTrigger]
  }
}

