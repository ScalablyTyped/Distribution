package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IScheduledJobTrigger extends js.Object {
  var BeginDay: scala.Double
  var BeginMonth: scala.Double
  var BeginYear: scala.Double
  var EndDay: scala.Double
  var EndMonth: scala.Double
  var EndYear: scala.Double
  var StartHour: scala.Double
  var StartMinute: scala.Double
  var Type: ITriggerType
  var ValidEndDate: scala.Boolean
  def Clone(): IScheduledJobTrigger
}

object IScheduledJobTrigger {
  @scala.inline
  def apply(
    BeginDay: scala.Double,
    BeginMonth: scala.Double,
    BeginYear: scala.Double,
    Clone: () => IScheduledJobTrigger,
    EndDay: scala.Double,
    EndMonth: scala.Double,
    EndYear: scala.Double,
    StartHour: scala.Double,
    StartMinute: scala.Double,
    Type: ITriggerType,
    ValidEndDate: scala.Boolean
  ): IScheduledJobTrigger = {
    val __obj = js.Dynamic.literal(BeginDay = BeginDay, BeginMonth = BeginMonth, BeginYear = BeginYear, Clone = js.Any.fromFunction0(Clone), EndDay = EndDay, EndMonth = EndMonth, EndYear = EndYear, StartHour = StartHour, StartMinute = StartMinute, Type = Type, ValidEndDate = ValidEndDate)
  
    __obj.asInstanceOf[IScheduledJobTrigger]
  }
}

