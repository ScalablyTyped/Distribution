package typings.moment.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DurationInputObject
  extends MomentInputObject
     with _DurationInputArg1 {
  var Q: js.UndefOr[numberlike] = js.undefined
  var quarter: js.UndefOr[numberlike] = js.undefined
  var quarters: js.UndefOr[numberlike] = js.undefined
  var w: js.UndefOr[numberlike] = js.undefined
  var week: js.UndefOr[numberlike] = js.undefined
  var weeks: js.UndefOr[numberlike] = js.undefined
}

object DurationInputObject {
  @scala.inline
  def apply(
    D: numberlike = null,
    M: numberlike = null,
    Q: numberlike = null,
    d: numberlike = null,
    date: numberlike = null,
    dates: numberlike = null,
    day: numberlike = null,
    days: numberlike = null,
    h: numberlike = null,
    hour: numberlike = null,
    hours: numberlike = null,
    m: numberlike = null,
    millisecond: numberlike = null,
    milliseconds: numberlike = null,
    minute: numberlike = null,
    minutes: numberlike = null,
    month: numberlike = null,
    months: numberlike = null,
    ms: numberlike = null,
    quarter: numberlike = null,
    quarters: numberlike = null,
    s: numberlike = null,
    second: numberlike = null,
    seconds: numberlike = null,
    w: numberlike = null,
    week: numberlike = null,
    weeks: numberlike = null,
    y: numberlike = null,
    year: numberlike = null,
    years: numberlike = null
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

