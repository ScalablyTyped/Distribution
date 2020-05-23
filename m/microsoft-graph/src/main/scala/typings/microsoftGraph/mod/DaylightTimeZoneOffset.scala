package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DaylightTimeZoneOffset extends StandardTimeZoneOffset {
  // The time offset from Coordinated Universal Time (UTC) for daylight saving time. This value is in minutes.
  var daylightBias: js.UndefOr[Double] = js.undefined
}

object DaylightTimeZoneOffset {
  @scala.inline
  def apply(
    dayOccurrence: js.UndefOr[Double] = js.undefined,
    dayOfWeek: DayOfWeek = null,
    daylightBias: js.UndefOr[Double] = js.undefined,
    month: js.UndefOr[Double] = js.undefined,
    time: String = null,
    year: js.UndefOr[Double] = js.undefined
  ): DaylightTimeZoneOffset = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dayOccurrence)) __obj.updateDynamic("dayOccurrence")(dayOccurrence.get.asInstanceOf[js.Any])
    if (dayOfWeek != null) __obj.updateDynamic("dayOfWeek")(dayOfWeek.asInstanceOf[js.Any])
    if (!js.isUndefined(daylightBias)) __obj.updateDynamic("daylightBias")(daylightBias.get.asInstanceOf[js.Any])
    if (!js.isUndefined(month)) __obj.updateDynamic("month")(month.get.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    if (!js.isUndefined(year)) __obj.updateDynamic("year")(year.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DaylightTimeZoneOffset]
  }
}

