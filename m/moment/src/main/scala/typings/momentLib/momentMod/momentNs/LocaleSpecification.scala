package typings
package momentLib.momentMod.momentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocaleSpecification
  extends // Allow anything: in general any property that is passed as locale spec is
// put in the locale object so it can be used by locale functions
/* x */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var calendar: js.UndefOr[CalendarSpec] = js.undefined
  var invalidDate: js.UndefOr[java.lang.String] = js.undefined
  var isPM: js.UndefOr[js.Function1[/* input */ java.lang.String, scala.Boolean]] = js.undefined
  var longDateFormat: js.UndefOr[LongDateFormatSpec] = js.undefined
  var meridiem: js.UndefOr[
    js.Function3[
      /* hour */ scala.Double, 
      /* minute */ scala.Double, 
      /* isLower */ scala.Boolean, 
      java.lang.String
    ]
  ] = js.undefined
  var meridiemParse: js.UndefOr[stdLib.RegExp] = js.undefined
  var months: js.UndefOr[js.Array[java.lang.String] | StandaloneFormatSpec | MonthWeekdayFn] = js.undefined
  var monthsShort: js.UndefOr[js.Array[java.lang.String] | StandaloneFormatSpec | MonthWeekdayFn] = js.undefined
  var ordinal: js.UndefOr[js.Function1[/* n */ scala.Double, java.lang.String]] = js.undefined
  var ordinalParse: js.UndefOr[stdLib.RegExp] = js.undefined
  var relativeTime: js.UndefOr[RelativeTimeSpec] = js.undefined
  var week: js.UndefOr[WeekSpec] = js.undefined
  var weekdays: js.UndefOr[js.Array[java.lang.String] | StandaloneFormatSpec | MonthWeekdayFn] = js.undefined
  var weekdaysMin: js.UndefOr[js.Array[java.lang.String] | StandaloneFormatSpec | WeekdaySimpleFn] = js.undefined
  var weekdaysShort: js.UndefOr[js.Array[java.lang.String] | StandaloneFormatSpec | WeekdaySimpleFn] = js.undefined
}

object LocaleSpecification {
  @scala.inline
  def apply(
    StringDictionary: // Allow anything: in general any property that is passed as locale spec is
  // put in the locale object so it can be used by locale functions
  /* x */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    calendar: CalendarSpec = null,
    invalidDate: java.lang.String = null,
    isPM: js.Function1[/* input */ java.lang.String, scala.Boolean] = null,
    longDateFormat: LongDateFormatSpec = null,
    meridiem: js.Function3[
      /* hour */ scala.Double, 
      /* minute */ scala.Double, 
      /* isLower */ scala.Boolean, 
      java.lang.String
    ] = null,
    meridiemParse: stdLib.RegExp = null,
    months: js.Array[java.lang.String] | StandaloneFormatSpec | MonthWeekdayFn = null,
    monthsShort: js.Array[java.lang.String] | StandaloneFormatSpec | MonthWeekdayFn = null,
    ordinal: js.Function1[/* n */ scala.Double, java.lang.String] = null,
    ordinalParse: stdLib.RegExp = null,
    relativeTime: RelativeTimeSpec = null,
    week: WeekSpec = null,
    weekdays: js.Array[java.lang.String] | StandaloneFormatSpec | MonthWeekdayFn = null,
    weekdaysMin: js.Array[java.lang.String] | StandaloneFormatSpec | WeekdaySimpleFn = null,
    weekdaysShort: js.Array[java.lang.String] | StandaloneFormatSpec | WeekdaySimpleFn = null
  ): LocaleSpecification = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (calendar != null) __obj.updateDynamic("calendar")(calendar)
    if (invalidDate != null) __obj.updateDynamic("invalidDate")(invalidDate)
    if (isPM != null) __obj.updateDynamic("isPM")(isPM)
    if (longDateFormat != null) __obj.updateDynamic("longDateFormat")(longDateFormat)
    if (meridiem != null) __obj.updateDynamic("meridiem")(meridiem)
    if (meridiemParse != null) __obj.updateDynamic("meridiemParse")(meridiemParse)
    if (months != null) __obj.updateDynamic("months")(months.asInstanceOf[js.Any])
    if (monthsShort != null) __obj.updateDynamic("monthsShort")(monthsShort.asInstanceOf[js.Any])
    if (ordinal != null) __obj.updateDynamic("ordinal")(ordinal)
    if (ordinalParse != null) __obj.updateDynamic("ordinalParse")(ordinalParse)
    if (relativeTime != null) __obj.updateDynamic("relativeTime")(relativeTime)
    if (week != null) __obj.updateDynamic("week")(week)
    if (weekdays != null) __obj.updateDynamic("weekdays")(weekdays.asInstanceOf[js.Any])
    if (weekdaysMin != null) __obj.updateDynamic("weekdaysMin")(weekdaysMin.asInstanceOf[js.Any])
    if (weekdaysShort != null) __obj.updateDynamic("weekdaysShort")(weekdaysShort.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocaleSpecification]
  }
}

