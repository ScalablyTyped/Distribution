package typings.moment.momentMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocaleSpecification
  extends // Allow anything: in general any property that is passed as locale spec is
// put in the locale object so it can be used by locale functions
/* x */ StringDictionary[js.Any] {
  var calendar: js.UndefOr[CalendarSpec] = js.undefined
  var invalidDate: js.UndefOr[String] = js.undefined
  var isPM: js.UndefOr[js.Function1[/* input */ String, Boolean]] = js.undefined
  var longDateFormat: js.UndefOr[LongDateFormatSpec] = js.undefined
  var meridiem: js.UndefOr[
    js.Function3[/* hour */ Double, /* minute */ Double, /* isLower */ Boolean, String]
  ] = js.undefined
  var meridiemParse: js.UndefOr[RegExp] = js.undefined
  var months: js.UndefOr[js.Array[String] | StandaloneFormatSpec | MonthWeekdayFn] = js.undefined
  var monthsShort: js.UndefOr[js.Array[String] | StandaloneFormatSpec | MonthWeekdayFn] = js.undefined
  var ordinal: js.UndefOr[js.Function1[/* n */ Double, String]] = js.undefined
  var ordinalParse: js.UndefOr[RegExp] = js.undefined
  var relativeTime: js.UndefOr[RelativeTimeSpec] = js.undefined
  var week: js.UndefOr[WeekSpec] = js.undefined
  var weekdays: js.UndefOr[js.Array[String] | StandaloneFormatSpec | MonthWeekdayFn] = js.undefined
  var weekdaysMin: js.UndefOr[js.Array[String] | StandaloneFormatSpec | WeekdaySimpleFn] = js.undefined
  var weekdaysShort: js.UndefOr[js.Array[String] | StandaloneFormatSpec | WeekdaySimpleFn] = js.undefined
}

object LocaleSpecification {
  @scala.inline
  def apply(
    StringDictionary: // Allow anything: in general any property that is passed as locale spec is
  // put in the locale object so it can be used by locale functions
  /* x */ StringDictionary[js.Any] = null,
    calendar: CalendarSpec = null,
    invalidDate: String = null,
    isPM: /* input */ String => Boolean = null,
    longDateFormat: LongDateFormatSpec = null,
    meridiem: (/* hour */ Double, /* minute */ Double, /* isLower */ Boolean) => String = null,
    meridiemParse: RegExp = null,
    months: js.Array[String] | StandaloneFormatSpec | MonthWeekdayFn = null,
    monthsShort: js.Array[String] | StandaloneFormatSpec | MonthWeekdayFn = null,
    ordinal: /* n */ Double => String = null,
    ordinalParse: RegExp = null,
    relativeTime: RelativeTimeSpec = null,
    week: WeekSpec = null,
    weekdays: js.Array[String] | StandaloneFormatSpec | MonthWeekdayFn = null,
    weekdaysMin: js.Array[String] | StandaloneFormatSpec | WeekdaySimpleFn = null,
    weekdaysShort: js.Array[String] | StandaloneFormatSpec | WeekdaySimpleFn = null
  ): LocaleSpecification = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (calendar != null) __obj.updateDynamic("calendar")(calendar.asInstanceOf[js.Any])
    if (invalidDate != null) __obj.updateDynamic("invalidDate")(invalidDate.asInstanceOf[js.Any])
    if (isPM != null) __obj.updateDynamic("isPM")(js.Any.fromFunction1(isPM))
    if (longDateFormat != null) __obj.updateDynamic("longDateFormat")(longDateFormat.asInstanceOf[js.Any])
    if (meridiem != null) __obj.updateDynamic("meridiem")(js.Any.fromFunction3(meridiem))
    if (meridiemParse != null) __obj.updateDynamic("meridiemParse")(meridiemParse.asInstanceOf[js.Any])
    if (months != null) __obj.updateDynamic("months")(months.asInstanceOf[js.Any])
    if (monthsShort != null) __obj.updateDynamic("monthsShort")(monthsShort.asInstanceOf[js.Any])
    if (ordinal != null) __obj.updateDynamic("ordinal")(js.Any.fromFunction1(ordinal))
    if (ordinalParse != null) __obj.updateDynamic("ordinalParse")(ordinalParse.asInstanceOf[js.Any])
    if (relativeTime != null) __obj.updateDynamic("relativeTime")(relativeTime.asInstanceOf[js.Any])
    if (week != null) __obj.updateDynamic("week")(week.asInstanceOf[js.Any])
    if (weekdays != null) __obj.updateDynamic("weekdays")(weekdays.asInstanceOf[js.Any])
    if (weekdaysMin != null) __obj.updateDynamic("weekdaysMin")(weekdaysMin.asInstanceOf[js.Any])
    if (weekdaysShort != null) __obj.updateDynamic("weekdaysShort")(weekdaysShort.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocaleSpecification]
  }
}

