package typings.openui5.sap.ui.core

import typings.openui5.sap.ui.base.Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocaleData extends Object {
  /**
    * Returns the defined pattern for representing the calendar week number.
    * @since 1.32.0
    * @param sStyle the style of the pattern. It can only be either "wide" or "narrow".
    * @param iWeekNumber the week number
    * @returns the week number string
    */
  def getCalendarWeek(sStyle: String, iWeekNumber: Double): String = js.native
  /**
    * Get combined datetime pattern with given date and and time style
    * @param sDateStyle the required style for the date part
    * @param sTimeStyle the required style for the time part
    * @param sCalendarType the type of calendar. If it's not set, it falls back to the calendar type
    * either set in configuration or calculated from locale.
    * @returns the combined datetime pattern
    */
  def getCombinedDateTimePattern(sDateStyle: String, sTimeStyle: String): String = js.native
  def getCombinedDateTimePattern(sDateStyle: String, sTimeStyle: String, sCalendarType: CalendarType): String = js.native
  /**
    * Returns the currency code which is corresponded with the given currency symbol.
    * @since 1.27.0
    * @param sCurrencySymbol The currency symbol which needs to be converted to currency code
    * @returns The corresponded currency code defined for the given currency symbol. The given currency
    * symbol is returned if no currency code can be found by using the given currency symbol.
    */
  def getCurrencyCodeBySymbol(sCurrencySymbol: String): String = js.native
  /**
    * Returns the number of digits of the specified currency
    * @since 1.21.1
    * @param sCurrency ISO 4217 currency code
    * @returns digits of the currency
    */
  def getCurrencyDigits(sCurrency: String): Double = js.native
  /**
    * Get currency format pattern
    * @param sContext the context of the currency pattern (standard or accounting)
    * @returns The pattern
    */
  def getCurrencyPattern(sContext: String): String = js.native
  /**
    * Returns the currency symbol for the specified currency, if no symbol is found the ISO 4217 currency
    * code is returned
    * @since 1.21.1
    * @param sCurrency ISO 4217 currency code
    * @returns the currency symbol
    */
  def getCurrencySymbol(sCurrency: String): String = js.native
  /**
    * Get custom datetime pattern for a given skeleton format.The format string does contain pattern
    * symbols (e.g. "yMMMd" or "Hms") and will be converted into the pattern in the usedlocale, which
    * matches the wanted symbols best. The symbols must be in canonical order, that is:Era (G), Year
    * (y/Y), Quarter (q/Q), Month (M/L), Week (w/W), Day-Of-Week (E/e/c), Day (d/D),Hour (h/H/k/K/),
    * Minute (m), Second (s), Timezone (z/Z/v/V/O/X/x)See
    * http://unicode.org/reports/tr35/tr35-dates.html#availableFormats_appendItems
    * @since 1.34
    * @param sSkeleton the wanted skeleton format for the datetime pattern
    * @param sCalendarType the type of calendar. If it's not set, it falls back to the calendar type
    * either set in configuration or calculated from locale.
    * @returns the best matching datetime pattern
    */
  def getCustomDateTimePattern(sSkeleton: String): String = js.native
  def getCustomDateTimePattern(sSkeleton: String, sCalendarType: CalendarType): String = js.native
  /**
    * Get date pattern in format "short", "medium", "long" or "full"
    * @param sStyle the required style for the date pattern
    * @param sCalendarType the type of calendar. If it's not set, it falls back to the calendar type
    * either set in configuration or calculated from locale.
    * @returns the selected date pattern
    */
  def getDatePattern(sStyle: String): String = js.native
  def getDatePattern(sStyle: String, sCalendarType: CalendarType): String = js.native
  /**
    * Get datetime pattern in style "short", "medium", "long" or "full"
    * @param sStyle the required style for the datetime pattern
    * @param sCalendarType the type of calendar. If it's not set, it falls back to the calendar type
    * either set in configuration or calculated from locale.
    * @returns the selected datetime pattern
    */
  def getDateTimePattern(sStyle: String): String = js.native
  def getDateTimePattern(sStyle: String, sCalendarType: CalendarType): String = js.native
  /**
    * Get day periods in width "narrow", "abbreviated" or "wide"
    * @param sWidth the required width for the day period names
    * @param sCalendarType the type of calendar. If it's not set, it falls back to the calendar type
    * either set in configuration or calculated from locale.
    * @returns array of day periods (AM, PM)
    */
  def getDayPeriods(sWidth: String): js.Array[_] = js.native
  def getDayPeriods(sWidth: String, sCalendarType: CalendarType): js.Array[_] = js.native
  /**
    * Get standalone day periods in width "narrow", "abbreviated" or "wide"
    * @param sWidth the required width for the day period names
    * @param sCalendarType the type of calendar. If it's not set, it falls back to the calendar type
    * either set in configuration or calculated from locale.
    * @returns array of day periods (AM, PM)
    */
  def getDayPeriodsStandAlone(sWidth: String): js.Array[_] = js.native
  def getDayPeriodsStandAlone(sWidth: String, sCalendarType: CalendarType): js.Array[_] = js.native
  /**
    * Get day names in width "narrow", "abbreviated" or "wide"
    * @param sWidth the required width for the day names
    * @param sCalendarType the type of calendar. If it's not set, it falls back to the calendar type
    * either set in configuration or calculated from locale.
    * @returns array of day names (starting with Sunday)
    */
  def getDays(sWidth: String): js.Array[_] = js.native
  def getDays(sWidth: String, sCalendarType: CalendarType): js.Array[_] = js.native
  /**
    * Get stand alone day names in width "narrow", "abbreviated" or "wide"
    * @param sWidth the required width for the day names
    * @param sCalendarType the type of calendar. If it's not set, it falls back to the calendar type
    * either set in configuration or calculated from locale.
    * @returns array of day names (starting with Sunday)
    */
  def getDaysStandAlone(sWidth: String): js.Array[_] = js.native
  def getDaysStandAlone(sWidth: String, sCalendarType: CalendarType): js.Array[_] = js.native
  /**
    * Returns the short decimal formats (like 1K, 1M....)
    * @since 1.25.0
    * @param sStyle short or long
    * @param sNumber 1000, 10000 ...
    * @param sPlural one or other (if not exists other is used)
    * @returns decimal format
    */
  def getDecimalFormat(sStyle: String, sNumber: String, sPlural: String): String = js.native
  /**
    * Get decimal format pattern
    * @returns The pattern
    */
  def getDecimalPattern(): String = js.native
  /**
    * Returns the display name for a time unit (second, minute, hour, day, week, month, year)
    * @since 1.34.0
    * @param sType Type (second, minute, hour, day, week, month, year)
    * @param sStyle @since 1.32.10, 1.34.4 the style of the pattern. The valid values are "wide", "short"
    * and "narrow"returns {string} display name
    */
  def getDisplayName(sType: String): Unit = js.native
  def getDisplayName(sType: String, sStyle: String): Unit = js.native
  /**
    * Returns the map of era ids to era dates
    * @since 1.32.0
    * @param sCalendarType the type of calendar
    * @returns the array of eras containing objects with either an _end or _start property with a date
    */
  def getEraDates(sCalendarType: CalendarType): js.Array[_] = js.native
  /**
    * Returns array of eras
    * @since 1.32.0
    * @param sWidth the style of the era name. It can be 'wide', 'abbreviated' or 'narrow'
    * @param sCalendarType the type of calendar
    * @returns the array of eras
    */
  def getEras(sWidth: String): js.Array[_] = js.native
  def getEras(sWidth: String, sCalendarType: CalendarType): js.Array[_] = js.native
  /**
    * Returns the day that usually is regarded as the first dayof a week in the current locale. Days are
    * encoded as integerwhere sunday=0, monday=1 etc.All week data information in the CLDR is provides for
    * territories (countries).If the locale of this LocaleData doesn't contain country information (e.g.
    * if itcontains only a language), then the "likelySubtag" information of the CLDRis taken into account
    * to guess the "most likely" territory for the locale.
    * @returns first day of week
    */
  def getFirstDayOfWeek(): Double = js.native
  /**
    * Returns the interval format with the given Id (see CLDR documentation for valid Ids)or the fallback
    * format if no interval format with that Id is known.The empty Id ("") might be used to retrieve the
    * interval format fallback.
    * @since 1.17.0
    * @param sId Id of the interval format, e.g. "d-d"
    * @param sCalendarType the type of calendar. If it's not set, it falls back to the calendar type
    * either set in configuration or calculated from locale.
    * @returns interval format string with placeholders {0} and {1}
    */
  def getIntervalPattern(sId: String): String = js.native
  def getIntervalPattern(sId: String, sCalendarType: CalendarType): String = js.native
  /**
    * Get locale specific language names
    * @returns map of locale specific language names
    */
  def getLanguages(): js.Any = js.native
  /**
    * Get month names in width "narrow", "abbreviated" or "wide"
    * @param sWidth the required width for the month names
    * @param sCalendarType the type of calendar. If it's not set, it falls back to the calendar type
    * either set in configuration or calculated from locale.
    * @returns array of month names (starting with January)
    */
  def getMonths(sWidth: String): js.Array[_] = js.native
  def getMonths(sWidth: String, sCalendarType: CalendarType): js.Array[_] = js.native
  /**
    * Get stand alone month names in width "narrow", "abbreviated" or "wide"
    * @param sWidth the required width for the month names
    * @param sCalendarType the type of calendar. If it's not set, it falls back to the calendar type
    * either set in configuration or calculated from locale.
    * @returns array of month names (starting with January)
    */
  def getMonthsStandAlone(sWidth: String): js.Array[_] = js.native
  def getMonthsStandAlone(sWidth: String, sCalendarType: CalendarType): js.Array[_] = js.native
  /**
    * Get number symbol "decimal", "group", "plusSign", "minusSign", "percentSign"
    * @param sType the required type of symbol
    * @returns the selected number symbol
    */
  def getNumberSymbol(sType: String): String = js.native
  /**
    * Get orientation (left-to-right or right-to-left)
    * @returns character orientation for this locale
    */
  def getOrientation(): String = js.native
  /**
    * Get percent format pattern
    * @returns The pattern
    */
  def getPercentPattern(): String = js.native
  /**
    * Returns the preferred calendar type for the current locale which exists in {@link
    * sap.ui.core.CalendarType}returns {sap.ui.core.CalendarType} the preferred calendar type
    * @since 1.28.6
    */
  def getPreferredCalendarType(): Unit = js.native
  /**
    * Returns the preferred hour pattern symbol (h for 12, H for 24 hours) for the current localereturns
    * {string} the preferred hour symbol
    * @since 1.34
    */
  def getPreferredHourSymbol(): Unit = js.native
  /**
    * Get quarter names in width "narrow", "abbreviated" or "wide"
    * @param sWidth the required width for the quarter names
    * @param sCalendarType the type of calendar. If it's not set, it falls back to the calendar type
    * either set in configuration or calculated from locale.
    * @returns array of quarters
    */
  def getQuarters(sWidth: String): js.Array[_] = js.native
  def getQuarters(sWidth: String, sCalendarType: CalendarType): js.Array[_] = js.native
  /**
    * Get stand alone quarter names in width "narrow", "abbreviated" or "wide"
    * @param sWidth the required width for the quarter names
    * @param sCalendarType the type of calendar. If it's not set, it falls back to the calendar type
    * either set in configuration or calculated from locale.
    * @returns array of quarters
    */
  def getQuartersStandAlone(sWidth: String): js.Array[_] = js.native
  def getQuartersStandAlone(sWidth: String, sCalendarType: CalendarType): js.Array[_] = js.native
  /**
    * Returns the relative day resource pattern (like "Today", "Yesterday", "{0} days ago") based on the
    * givendifference of days (0 means today, 1 means tommorrow, -1 means yesterday, ...).
    * @since 1.25.0
    * @param iDiff the difference in days
    * @param sStyle @since 1.32.10, 1.34.4 the style of the pattern. The valid values are "wide", "short"
    * and "narrow"
    * @returns the relative day resource pattern
    */
  def getRelativeDay(iDiff: Double): String = js.native
  def getRelativeDay(iDiff: Double, sStyle: String): String = js.native
  /**
    * Returns the relative resource pattern with unit 'hour' (like "in {0} hour(s)", "{0} hour(s) ago"
    * under locale 'en') based on the givendifference value (positive value means in the future and
    * negative value means in the past).There's no pattern defined for 0 difference and the function
    * returns null if 0 is given. In the 0 difference case, you can use the getRelativeMinute or
    * getRelativeSecondfunction to format the difference using unit 'minute' or 'second'.
    * @since 1.31.0
    * @param iDiff the difference in hours
    * @param sStyle @since 1.32.10, 1.34.4 the style of the pattern. The valid values are "wide", "short"
    * and "narrow"
    * @returns the relative resource pattern in unit 'hour'. The method returns null if 0 is given as
    * parameter.
    */
  def getRelativeHour(iDiff: Double): String | js.Any = js.native
  def getRelativeHour(iDiff: Double, sStyle: String): String | js.Any = js.native
  /**
    * Returns the relative resource pattern with unit 'minute' (like "in {0} minute(s)", "{0} minute(s)
    * ago" under locale 'en') based on the givendifference value (positive value means in the future and
    * negative value means in the past).There's no pattern defined for 0 difference and the function
    * returns null if 0 is given. In the 0 difference case, you can use the getRelativeSecondfunction to
    * format the difference using unit 'second'.
    * @since 1.31.0
    * @param iDiff the difference in minutes
    * @param sStyle @since 1.32.10, 1.34.4 the style of the pattern. The valid values are "wide", "short"
    * and "narrow"
    * @returns the relative resource pattern in unit 'minute'. The method returns null if 0 is given as
    * parameter.
    */
  def getRelativeMinute(iDiff: Double): String | js.Any = js.native
  def getRelativeMinute(iDiff: Double, sStyle: String): String | js.Any = js.native
  /**
    * Returns the relative month resource pattern (like "This month", "Last month", "{0} months ago")
    * based on the givendifference of months (0 means this month, 1 means next month, -1 means last month,
    * ...).
    * @since 1.25.0
    * @param iDiff the difference in months
    * @param sStyle @since 1.32.10, 1.34.4 the style of the pattern. The valid values are "wide", "short"
    * and "narrow"
    * @returns the relative month resource pattern
    */
  def getRelativeMonth(iDiff: Double): String = js.native
  def getRelativeMonth(iDiff: Double, sStyle: String): String = js.native
  /**
    * Returns the relative format pattern with given scale (year, month, week, ...) and difference value
    * @since 1.34
    * @param sScale the scale the relative pattern is needed for
    * @param iDiff the difference in the given scale unit
    * @param bFuture whether a future or past pattern should be used
    * @param sStyle @since 1.32.10, 1.34.4 the style of the pattern. The valid values are "wide", "short"
    * and "narrow"
    * @returns the relative format pattern
    */
  def getRelativePattern(sScale: String, iDiff: Double): String = js.native
  def getRelativePattern(sScale: String, iDiff: Double, bFuture: Boolean): String = js.native
  def getRelativePattern(sScale: String, iDiff: Double, bFuture: Boolean, sStyle: String): String = js.native
  /**
    * Returns relative time patterns for the given scales as an array of objects containing scale, value
    * and pattern.The array may contain the following values: "year", "month", "week", "day", "hour",
    * "minute" and "second". Ifno scales are given, patterns for all available scales will be returned.The
    * return array will contain objects looking like:{    scale: "minute",    sign: 1,    pattern: "in {0}
    * minutes"}
    * @since 1.34
    * @param aScales The scales for which the available patterns should be returned
    * @param sStyle @since 1.32.10, 1.34.4 The style of the scale patterns. The valid values are "wide",
    * "short" and "narrow".
    * @returns An array of all relative time patterns
    */
  def getRelativePatterns(aScales: js.Array[String]): js.Array[_] = js.native
  def getRelativePatterns(aScales: js.Array[String], sStyle: String): js.Array[_] = js.native
  /**
    * Returns the relative resource pattern with unit 'second' (like now, "in {0} seconds", "{0} seconds
    * ago" under locale 'en') based on the givendifference value (0 means now, positive value means in the
    * future and negative value means in the past).
    * @since 1.31.0
    * @param iDiff the difference in seconds
    * @param sStyle @since 1.32.10, 1.34.4 the style of the pattern. The valid values are "wide", "short"
    * and "narrow"
    * @returns the relative resource pattern in unit 'second'
    */
  def getRelativeSecond(iDiff: Double): String = js.native
  def getRelativeSecond(iDiff: Double, sStyle: String): String = js.native
  /**
    * Returns the relative week resource pattern (like "This week", "Last week", "{0} weeks ago") based on
    * the givendifference of weeks (0 means this week, 1 means next week, -1 means last week, ...).
    * @since 1.31.0
    * @param iDiff the difference in weeks
    * @param sStyle @since 1.32.10, 1.34.4 the style of the pattern. The valid values are "wide", "short"
    * and "narrow"
    * @returns the relative week resource pattern
    */
  def getRelativeWeek(iDiff: Double): String = js.native
  def getRelativeWeek(iDiff: Double, sStyle: String): String = js.native
  /**
    * Returns the relative year resource pattern (like "This year", "Last year", "{0} year ago") based on
    * the givendifference of years (0 means this year, 1 means next year, -1 means last year, ...).
    * @since 1.25.0
    * @param iDiff the difference in years
    * @param sStyle @since 1.32.10, 1.34.4 the style of the pattern. The valid values are "wide", "short"
    * and "narrow"
    * @returns the relative year resource pattern
    */
  def getRelativeYear(iDiff: Double): String = js.native
  def getRelativeYear(iDiff: Double, sStyle: String): String = js.native
  /**
    * Get locale specific script names
    * @returns map of locale specific script names
    */
  def getScripts(): js.Any = js.native
  /**
    * Get locale specific territory names
    * @returns map of locale specific territory names
    */
  def getTerritories(): js.Any = js.native
  /**
    * Get time pattern in style "short", "medium", "long" or "full"
    * @param sStyle the required style for the date pattern
    * @param sCalendarType the type of calendar. If it's not set, it falls back to the calendar type
    * either set in configuration or calculated from locale.
    * @returns the selected time pattern
    */
  def getTimePattern(sStyle: String): String = js.native
  def getTimePattern(sStyle: String, sCalendarType: CalendarType): String = js.native
  /**
    * Returns the last day of a weekend for the given locale.Days are encoded in the same way as for
    * {@link #getFirstDayOfWeek}.All week data information in the CLDR is provides for territories
    * (countries).If the locale of this LocaleData doesn't contain country information (e.g. if itcontains
    * only a language), then the "likelySubtag" information of the CLDRis taken into account to guess the
    * "most likely" territory for the locale.
    * @returns last day of weekend
    */
  def getWeekendEnd(): Double = js.native
  /**
    * Returns the first day of a weekend for the given locale.Days are encoded in the same way as for
    * {@link #getFirstDayOfWeek}.All week data information in the CLDR is provides for territories
    * (countries).If the locale of this LocaleData doesn't contain country information (e.g. if itcontains
    * only a language), then the "likelySubtag" information of the CLDRis taken into account to guess the
    * "most likely" territory for the locale.
    * @returns first day of weekend
    */
  def getWeekendStart(): Double = js.native
}

