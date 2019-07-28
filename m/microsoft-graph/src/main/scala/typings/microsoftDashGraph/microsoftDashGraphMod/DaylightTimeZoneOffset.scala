package typings.microsoftDashGraph.microsoftDashGraphMod

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
    dayOccurrence: Int | Double = null,
    dayOfWeek: DayOfWeek = null,
    daylightBias: Int | Double = null,
    month: Int | Double = null,
    time: String = null,
    year: Int | Double = null
  ): DaylightTimeZoneOffset = {
    val __obj = js.Dynamic.literal()
    if (dayOccurrence != null) __obj.updateDynamic("dayOccurrence")(dayOccurrence.asInstanceOf[js.Any])
    if (dayOfWeek != null) __obj.updateDynamic("dayOfWeek")(dayOfWeek)
    if (daylightBias != null) __obj.updateDynamic("daylightBias")(daylightBias.asInstanceOf[js.Any])
    if (month != null) __obj.updateDynamic("month")(month.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time)
    if (year != null) __obj.updateDynamic("year")(year.asInstanceOf[js.Any])
    __obj.asInstanceOf[DaylightTimeZoneOffset]
  }
}

