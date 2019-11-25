package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkingHours extends js.Object {
  // The days of the week on which the user works.
  var daysOfWeek: js.UndefOr[js.Array[DayOfWeek]] = js.undefined
  // The time of the day that the user stops working.
  var endTime: js.UndefOr[String] = js.undefined
  // The time of the day that the user starts working.
  var startTime: js.UndefOr[String] = js.undefined
  // The time zone to which the working hours apply.
  var timeZone: js.UndefOr[TimeZoneBase] = js.undefined
}

object WorkingHours {
  @scala.inline
  def apply(
    daysOfWeek: js.Array[DayOfWeek] = null,
    endTime: String = null,
    startTime: String = null,
    timeZone: TimeZoneBase = null
  ): WorkingHours = {
    val __obj = js.Dynamic.literal()
    if (daysOfWeek != null) __obj.updateDynamic("daysOfWeek")(daysOfWeek.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkingHours]
  }
}

