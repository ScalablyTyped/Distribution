package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StandardTimeZoneOffset extends js.Object {
  // Represents the nth occurrence of the day of week that the transition from daylight saving time to standard time occurs.
  var dayOccurrence: js.UndefOr[Double] = js.undefined
  // Represents the day of the week when the transition from daylight saving time to standard time.
  var dayOfWeek: js.UndefOr[DayOfWeek] = js.undefined
  // Represents the month of the year when the transition from daylight saving time to standard time occurs.
  var month: js.UndefOr[Double] = js.undefined
  // Represents the time of day when the transition from daylight saving time to standard time occurs.
  var time: js.UndefOr[String] = js.undefined
  /**
    * Represents how frequently in terms of years the change from daylight saving time to standard time occurs. For example,
    * a value of 0 means every year.
    */
  var year: js.UndefOr[Double] = js.undefined
}

object StandardTimeZoneOffset {
  @scala.inline
  def apply(
    dayOccurrence: js.UndefOr[Double] = js.undefined,
    dayOfWeek: DayOfWeek = null,
    month: js.UndefOr[Double] = js.undefined,
    time: String = null,
    year: js.UndefOr[Double] = js.undefined
  ): StandardTimeZoneOffset = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dayOccurrence)) __obj.updateDynamic("dayOccurrence")(dayOccurrence.get.asInstanceOf[js.Any])
    if (dayOfWeek != null) __obj.updateDynamic("dayOfWeek")(dayOfWeek.asInstanceOf[js.Any])
    if (!js.isUndefined(month)) __obj.updateDynamic("month")(month.get.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    if (!js.isUndefined(year)) __obj.updateDynamic("year")(year.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[StandardTimeZoneOffset]
  }
}

