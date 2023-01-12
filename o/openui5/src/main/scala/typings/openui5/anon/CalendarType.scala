package typings.openui5.anon

import typings.openui5.int
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalendarType extends StObject {
  
  /**
    * if true, the time is formatted and parsed as UTC instead of the local timezone
    */
  var UTC: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The calender type which is used to format and parse the date. This value is by default either set in
    * configuration or calculated based on current locale.
    */
  var calendarType: js.UndefOr[
    typings.openui5.sapUiCoreCalendarTypeMod.CalendarType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarType * / any */ String)
  ] = js.undefined
  
  /**
    * @since 1.108.0 specifies the calendar week numbering. If specified, this overwrites `oFormatOptions.firstDayOfWeek`
    * and `oFormatOptions.minimalDaysInFirstWeek`.
    */
  var calendarWeekNumbering: js.UndefOr[
    typings.openui5.sapUiCoreDateCalendarWeekNumberingMod.CalendarWeekNumbering | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarWeekNumbering * / any */ String)
  ] = js.undefined
  
  /**
    * @since 1.105.0 specifies the first day of the week starting with `0` (which is Sunday); if not defined,
    * the value taken from the locale is used
    */
  var firstDayOfWeek: js.UndefOr[int] = js.undefined
  
  /**
    * @since 1.34.0 contains pattern symbols (e.g. "yMMMd" or "Hms") which will be converted into the pattern
    * in the used locale, which matches the wanted symbols best. The symbols must be in canonical order, that
    * is: Era (G), Year (y/Y), Quarter (q/Q), Month (M/L), Week (w), Day-Of-Week (E/e/c), Day (d), Hour (h/H/k/K/j/J),
    * Minute (m), Second (s), Timezone (z/Z/v/V/O/X/x) See http://unicode.org/reports/tr35/tr35-dates.html#availableFormats_appendItems
    */
  var format: js.UndefOr[String] = js.undefined
  
  /**
    * @since 1.48.0 if true, the {@link sap.ui.core.format.DateFormat#format format} method expects an array
    * with two dates as the first argument and formats them as interval. Further interval "Jan 10, 2008 - Jan
    * 12, 2008" will be formatted as "Jan 10-12, 2008" if the 'format' option is set with necessary symbols.
    * Otherwise the two given dates are formatted separately and concatenated with local dependent pattern.
    */
  var interval: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @since 1.105.0 minimal days at the beginning of the year which define the first calendar week; if not
    * defined, the value taken from the locale is used
    */
  var minimalDaysInFirstWeek: js.UndefOr[int] = js.undefined
  
  /**
    * a time pattern in LDML format. It is not verified whether the pattern only represents a time.
    */
  var pattern: js.UndefOr[String] = js.undefined
  
  /**
    * if true, the date is formatted relatively to todays date if it is within the given day range, e.g. "today",
    * "1 day ago", "in 5 days"
    */
  var relative: js.UndefOr[Boolean] = js.undefined
  
  /**
    * the day range used for relative formatting. If `oFormatOptions.relativeScale` is set to default value
    * 'day', the relativeRange is by default [-6, 6], which means only the last 6 days, today and the next
    * 6 days are formatted relatively. Otherwise when `oFormatOptions.relativeScale` is set to 'auto', all
    * dates are formatted relatively.
    */
  var relativeRange: js.UndefOr[js.Array[int]] = js.undefined
  
  /**
    * if 'auto' is set, new relative time format is switched on for all Date/Time Instances. The relative scale
    * is chosen depending on the difference between the given date and now.
    */
  var relativeScale: js.UndefOr[String] = js.undefined
  
  /**
    * @since 1.32.10, 1.34.4 the style of the relative format. The valid values are "wide", "short", "narrow"
    */
  var relativeStyle: js.UndefOr[String] = js.undefined
  
  /**
    * Only relevant if oFormatOptions.interval is set to 'true'. This allows to pass an array with only one
    * date object to the {@link sap.ui.core.format.DateFormat#format format} method.
    */
  var singleIntervalValue: js.UndefOr[Boolean] = js.undefined
  
  /**
    * if true, by parsing it is checked if the value is a valid time
    */
  var strictParsing: js.UndefOr[Boolean] = js.undefined
  
  /**
    * can be either 'short, 'medium', 'long' or 'full'. If no pattern is given, a locale dependent default
    * time pattern of that style is used from the LocaleData class.
    */
  var style: js.UndefOr[String] = js.undefined
}
object CalendarType {
  
  inline def apply(): CalendarType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalendarType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CalendarType] (val x: Self) extends AnyVal {
    
    inline def setCalendarType(
      value: typings.openui5.sapUiCoreCalendarTypeMod.CalendarType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarType * / any */ String)
    ): Self = StObject.set(x, "calendarType", value.asInstanceOf[js.Any])
    
    inline def setCalendarTypeUndefined: Self = StObject.set(x, "calendarType", js.undefined)
    
    inline def setCalendarWeekNumbering(
      value: typings.openui5.sapUiCoreDateCalendarWeekNumberingMod.CalendarWeekNumbering | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarWeekNumbering * / any */ String)
    ): Self = StObject.set(x, "calendarWeekNumbering", value.asInstanceOf[js.Any])
    
    inline def setCalendarWeekNumberingUndefined: Self = StObject.set(x, "calendarWeekNumbering", js.undefined)
    
    inline def setFirstDayOfWeek(value: int): Self = StObject.set(x, "firstDayOfWeek", value.asInstanceOf[js.Any])
    
    inline def setFirstDayOfWeekUndefined: Self = StObject.set(x, "firstDayOfWeek", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setInterval(value: Boolean): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    inline def setMinimalDaysInFirstWeek(value: int): Self = StObject.set(x, "minimalDaysInFirstWeek", value.asInstanceOf[js.Any])
    
    inline def setMinimalDaysInFirstWeekUndefined: Self = StObject.set(x, "minimalDaysInFirstWeek", js.undefined)
    
    inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    
    inline def setRelative(value: Boolean): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
    
    inline def setRelativeRange(value: js.Array[int]): Self = StObject.set(x, "relativeRange", value.asInstanceOf[js.Any])
    
    inline def setRelativeRangeUndefined: Self = StObject.set(x, "relativeRange", js.undefined)
    
    inline def setRelativeRangeVarargs(value: int*): Self = StObject.set(x, "relativeRange", js.Array(value*))
    
    inline def setRelativeScale(value: String): Self = StObject.set(x, "relativeScale", value.asInstanceOf[js.Any])
    
    inline def setRelativeScaleUndefined: Self = StObject.set(x, "relativeScale", js.undefined)
    
    inline def setRelativeStyle(value: String): Self = StObject.set(x, "relativeStyle", value.asInstanceOf[js.Any])
    
    inline def setRelativeStyleUndefined: Self = StObject.set(x, "relativeStyle", js.undefined)
    
    inline def setRelativeUndefined: Self = StObject.set(x, "relative", js.undefined)
    
    inline def setSingleIntervalValue(value: Boolean): Self = StObject.set(x, "singleIntervalValue", value.asInstanceOf[js.Any])
    
    inline def setSingleIntervalValueUndefined: Self = StObject.set(x, "singleIntervalValue", js.undefined)
    
    inline def setStrictParsing(value: Boolean): Self = StObject.set(x, "strictParsing", value.asInstanceOf[js.Any])
    
    inline def setStrictParsingUndefined: Self = StObject.set(x, "strictParsing", js.undefined)
    
    inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setUTC(value: Boolean): Self = StObject.set(x, "UTC", value.asInstanceOf[js.Any])
    
    inline def setUTCUndefined: Self = StObject.set(x, "UTC", js.undefined)
  }
}
