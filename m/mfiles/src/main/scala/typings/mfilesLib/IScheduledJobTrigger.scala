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
    Clone: js.Function0[IScheduledJobTrigger],
    EndDay: scala.Double,
    EndMonth: scala.Double,
    EndYear: scala.Double,
    StartHour: scala.Double,
    StartMinute: scala.Double,
    Type: ITriggerType,
    ValidEndDate: scala.Boolean
  ): IScheduledJobTrigger = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("BeginDay")(BeginDay)
    __obj.updateDynamic("BeginMonth")(BeginMonth)
    __obj.updateDynamic("BeginYear")(BeginYear)
    __obj.updateDynamic("Clone")(Clone)
    __obj.updateDynamic("EndDay")(EndDay)
    __obj.updateDynamic("EndMonth")(EndMonth)
    __obj.updateDynamic("EndYear")(EndYear)
    __obj.updateDynamic("StartHour")(StartHour)
    __obj.updateDynamic("StartMinute")(StartMinute)
    __obj.updateDynamic("Type")(Type)
    __obj.updateDynamic("ValidEndDate")(ValidEndDate)
    __obj.asInstanceOf[IScheduledJobTrigger]
  }
}

