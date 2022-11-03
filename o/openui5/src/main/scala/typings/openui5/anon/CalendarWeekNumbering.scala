package typings.openui5.anon

import typings.openui5.int
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalendarWeekNumbering extends StObject {
  
  /**
    * The calendar type which is used to format and parse the date. This value is by default either set in
    * the configuration or calculated based on the current locale.
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
    * A string containing pattern symbols (e.g. "yMMMd" or "Hms") which will be converted into a pattern for
    * the used locale that matches the wanted symbols best. The symbols must be in canonical order, that is:
    * Era (G), Year (y/Y), Quarter (q/Q), Month (M/L), Week (w), Day-Of-Week (E/e/c), Day (d), Hour (h/H/k/K/j/J),
    * Minute (m), Second (s), Timezone (z/Z/v/V/O/X/x) See http://unicode.org/reports/tr35/tr35-dates.html#availableFormats_appendItems
    */
  var format: js.UndefOr[String] = js.undefined
  
  /**
    * @since 1.105.0 minimal days at the beginning of the year which define the first calendar week; if not
    * defined, the value taken from the locale is used
    */
  var minimalDaysInFirstWeek: js.UndefOr[int] = js.undefined
  
  /**
    * a datetime pattern in LDML format. It is not verified whether the pattern represents a full datetime.
    */
  var pattern: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the date is formatted relatively to today's date if it is within the given day range, e.g. "today",
    * "1 day ago", "in 5 days"
    */
  var relative: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The day range used for relative formatting. If `oFormatOptions.relativeScale` is set to the default value
    * 'day', the `relativeRange is by default [-6, 6], which means that only the previous 6 and the following
    * 6 days are formatted relatively. If oFormatOptions.relativeScale` is set to 'auto', all dates are
    * formatted relatively.
    */
  var relativeRange: js.UndefOr[js.Array[int]] = js.undefined
  
  /**
    * If 'auto' is set, a new relative time format is switched on for all Date/Time instances. The default
    * value depends on `showDate` and `showTime` options.
    */
  var relativeScale: js.UndefOr[String] = js.undefined
  
  /**
    * The style of the relative format. The valid values are "wide", "short", "narrow"
    */
  var relativeStyle: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies if the date should be displayed. It is ignored for formatting when an options pattern or a
    * format are supplied.
    */
  var showDate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies if the time should be displayed. It is ignored for formatting when an options pattern or a
    * format are supplied.
    */
  var showTime: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies if the timezone should be displayed. It is ignored for formatting when an options pattern or
    * a format are supplied.
    */
  var showTimezone: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to check by parsing if the value is a valid datetime
    */
  var strictParsing: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Can be either 'short, 'medium', 'long' or 'full'. For datetime you can also define mixed styles, separated
    * with a slash, where the first part is the date style and the second part is the time style (e.g. "medium/short").
    * If no pattern is given, a locale-dependent default datetime pattern of that style from the LocaleData
    * class is used.
    */
  var style: js.UndefOr[String] = js.undefined
}
object CalendarWeekNumbering {
  
  inline def apply(): CalendarWeekNumbering = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalendarWeekNumbering]
  }
  
  extension [Self <: CalendarWeekNumbering](x: Self) {
    
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
    
    inline def setShowDate(value: Boolean): Self = StObject.set(x, "showDate", value.asInstanceOf[js.Any])
    
    inline def setShowDateUndefined: Self = StObject.set(x, "showDate", js.undefined)
    
    inline def setShowTime(value: Boolean): Self = StObject.set(x, "showTime", value.asInstanceOf[js.Any])
    
    inline def setShowTimeUndefined: Self = StObject.set(x, "showTime", js.undefined)
    
    inline def setShowTimezone(value: Boolean): Self = StObject.set(x, "showTimezone", value.asInstanceOf[js.Any])
    
    inline def setShowTimezoneUndefined: Self = StObject.set(x, "showTimezone", js.undefined)
    
    inline def setStrictParsing(value: Boolean): Self = StObject.set(x, "strictParsing", value.asInstanceOf[js.Any])
    
    inline def setStrictParsingUndefined: Self = StObject.set(x, "strictParsing", js.undefined)
    
    inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
