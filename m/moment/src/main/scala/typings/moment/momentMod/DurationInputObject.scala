package typings.moment.momentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DurationInputObject
  extends MomentInputObject
     with _DurationInputArg1 {
  var Q: js.UndefOr[Double] = js.undefined
  var quarter: js.UndefOr[Double] = js.undefined
  var quarters: js.UndefOr[Double] = js.undefined
  var w: js.UndefOr[Double] = js.undefined
  var week: js.UndefOr[Double] = js.undefined
  var weeks: js.UndefOr[Double] = js.undefined
}

object DurationInputObject {
  @scala.inline
  def apply(
    D: Int | Double = null,
    M: Int | Double = null,
    Q: Int | Double = null,
    d: Int | Double = null,
    date: Int | Double = null,
    dates: Int | Double = null,
    day: Int | Double = null,
    days: Int | Double = null,
    h: Int | Double = null,
    hour: Int | Double = null,
    hours: Int | Double = null,
    m: Int | Double = null,
    millisecond: Int | Double = null,
    milliseconds: Int | Double = null,
    minute: Int | Double = null,
    minutes: Int | Double = null,
    month: Int | Double = null,
    months: Int | Double = null,
    ms: Int | Double = null,
    quarter: Int | Double = null,
    quarters: Int | Double = null,
    s: Int | Double = null,
    second: Int | Double = null,
    seconds: Int | Double = null,
    w: Int | Double = null,
    week: Int | Double = null,
    weeks: Int | Double = null,
    y: Int | Double = null,
    year: Int | Double = null,
    years: Int | Double = null
  ): DurationInputObject = {
    val __obj = js.Dynamic.literal()
    if (D != null) __obj.updateDynamic("D")(D.asInstanceOf[js.Any])
    if (M != null) __obj.updateDynamic("M")(M.asInstanceOf[js.Any])
    if (Q != null) __obj.updateDynamic("Q")(Q.asInstanceOf[js.Any])
    if (d != null) __obj.updateDynamic("d")(d.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (dates != null) __obj.updateDynamic("dates")(dates.asInstanceOf[js.Any])
    if (day != null) __obj.updateDynamic("day")(day.asInstanceOf[js.Any])
    if (days != null) __obj.updateDynamic("days")(days.asInstanceOf[js.Any])
    if (h != null) __obj.updateDynamic("h")(h.asInstanceOf[js.Any])
    if (hour != null) __obj.updateDynamic("hour")(hour.asInstanceOf[js.Any])
    if (hours != null) __obj.updateDynamic("hours")(hours.asInstanceOf[js.Any])
    if (m != null) __obj.updateDynamic("m")(m.asInstanceOf[js.Any])
    if (millisecond != null) __obj.updateDynamic("millisecond")(millisecond.asInstanceOf[js.Any])
    if (milliseconds != null) __obj.updateDynamic("milliseconds")(milliseconds.asInstanceOf[js.Any])
    if (minute != null) __obj.updateDynamic("minute")(minute.asInstanceOf[js.Any])
    if (minutes != null) __obj.updateDynamic("minutes")(minutes.asInstanceOf[js.Any])
    if (month != null) __obj.updateDynamic("month")(month.asInstanceOf[js.Any])
    if (months != null) __obj.updateDynamic("months")(months.asInstanceOf[js.Any])
    if (ms != null) __obj.updateDynamic("ms")(ms.asInstanceOf[js.Any])
    if (quarter != null) __obj.updateDynamic("quarter")(quarter.asInstanceOf[js.Any])
    if (quarters != null) __obj.updateDynamic("quarters")(quarters.asInstanceOf[js.Any])
    if (s != null) __obj.updateDynamic("s")(s.asInstanceOf[js.Any])
    if (second != null) __obj.updateDynamic("second")(second.asInstanceOf[js.Any])
    if (seconds != null) __obj.updateDynamic("seconds")(seconds.asInstanceOf[js.Any])
    if (w != null) __obj.updateDynamic("w")(w.asInstanceOf[js.Any])
    if (week != null) __obj.updateDynamic("week")(week.asInstanceOf[js.Any])
    if (weeks != null) __obj.updateDynamic("weeks")(weeks.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (year != null) __obj.updateDynamic("year")(year.asInstanceOf[js.Any])
    if (years != null) __obj.updateDynamic("years")(years.asInstanceOf[js.Any])
    __obj.asInstanceOf[DurationInputObject]
  }
}

