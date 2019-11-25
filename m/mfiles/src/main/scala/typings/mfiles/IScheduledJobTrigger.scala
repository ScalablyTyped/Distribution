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
    val __obj = js.Dynamic.literal(BeginDay = BeginDay.asInstanceOf[js.Any], BeginMonth = BeginMonth.asInstanceOf[js.Any], BeginYear = BeginYear.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), EndDay = EndDay.asInstanceOf[js.Any], EndMonth = EndMonth.asInstanceOf[js.Any], EndYear = EndYear.asInstanceOf[js.Any], StartHour = StartHour.asInstanceOf[js.Any], StartMinute = StartMinute.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], ValidEndDate = ValidEndDate.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IScheduledJobTrigger]
  }
}

