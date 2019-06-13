package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkingHours extends js.Object {
  /** The days of the week on which the user works. */
  var daysOfWeek: js.UndefOr[js.Array[DayOfWeek]] = js.undefined
  /** The time of the day that the user stops working. */
  var endTime: js.UndefOr[java.lang.String] = js.undefined
  /** The time of the day that the user starts working. */
  var startTime: js.UndefOr[java.lang.String] = js.undefined
  /** The time zone to which the working hours apply. */
  var timeZone: js.UndefOr[TimeZoneBase] = js.undefined
}

object WorkingHours {
  @scala.inline
  def apply(
    daysOfWeek: js.Array[DayOfWeek] = null,
    endTime: java.lang.String = null,
    startTime: java.lang.String = null,
    timeZone: TimeZoneBase = null
  ): WorkingHours = {
    val __obj = js.Dynamic.literal()
    if (daysOfWeek != null) __obj.updateDynamic("daysOfWeek")(daysOfWeek)
    if (endTime != null) __obj.updateDynamic("endTime")(endTime)
    if (startTime != null) __obj.updateDynamic("startTime")(startTime)
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone)
    __obj.asInstanceOf[WorkingHours]
  }
}

