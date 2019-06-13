package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StandardTimeZoneOffset extends js.Object {
  /** Represents the nth occurrence of the day of week that the transition from daylight saving time to standard time occurs. */
  var dayOccurrence: js.UndefOr[scala.Double] = js.undefined
  /** Represents the day of the week when the transition from daylight saving time to standard time. */
  var dayOfWeek: js.UndefOr[DayOfWeek] = js.undefined
  /** Represents the month of the year when the transition from daylight saving time to standard time occurs. */
  var month: js.UndefOr[scala.Double] = js.undefined
  /** Represents the time of day when the transition from daylight saving time to standard time occurs. */
  var time: js.UndefOr[java.lang.String] = js.undefined
  /** Represents how frequently in terms of years the change from daylight saving time to standard time occurs. For example, a value of 0 means every year. */
  var year: js.UndefOr[scala.Double] = js.undefined
}

object StandardTimeZoneOffset {
  @scala.inline
  def apply(
    dayOccurrence: scala.Int | scala.Double = null,
    dayOfWeek: DayOfWeek = null,
    month: scala.Int | scala.Double = null,
    time: java.lang.String = null,
    year: scala.Int | scala.Double = null
  ): StandardTimeZoneOffset = {
    val __obj = js.Dynamic.literal()
    if (dayOccurrence != null) __obj.updateDynamic("dayOccurrence")(dayOccurrence.asInstanceOf[js.Any])
    if (dayOfWeek != null) __obj.updateDynamic("dayOfWeek")(dayOfWeek)
    if (month != null) __obj.updateDynamic("month")(month.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time)
    if (year != null) __obj.updateDynamic("year")(year.asInstanceOf[js.Any])
    __obj.asInstanceOf[StandardTimeZoneOffset]
  }
}

