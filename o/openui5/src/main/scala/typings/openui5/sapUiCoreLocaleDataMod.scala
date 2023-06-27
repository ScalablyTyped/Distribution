package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiCoreCalendarTypeMod.CalendarType
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreLocaleDataMod {
  
  @JSImport("sap/ui/core/LocaleData", JSImport.Default)
  @js.native
  open class default protected () extends LocaleData {
    /**
      * Creates an instance of LocaleData for the given locale.
      */
    def this(/**
      * the locale
      */
    oLocale: typings.openui5.sapUiCoreLocaleMod.default) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/core/LocaleData", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.core.LocaleData with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.base.Object.extend}.
      *
      * @returns Created class / constructor function
      */
    inline def extend[T /* <: Record[String, Any] */](/**
      * Name of the class being created
      */
    sClassName: String): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any]).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: Unit,
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, LocaleData]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, LocaleData],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.core.LocaleData.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
  }
  
  @js.native
  trait LocaleData
    extends typings.openui5.sapUiBaseObjectMod.default {
    
    /**
      * @since 1.92.0
      *
      * Whether 1 January is the first day of the first calendar week. This is the definition of the calendar
      * week in the US.
      *
      * @returns true if the first week of the year starts with 1 January.
      */
    def firstDayStartsFirstWeek(): Boolean = js.native
    
    /**
      * @since 1.32.0
      *
      * Returns the defined pattern for representing the calendar week number.
      *
      * @returns the week number string
      */
    def getCalendarWeek(
      /**
      * the style of the pattern. It can only be either "wide" or "narrow".
      */
    sStyle: String,
      /**
      * the week number
      */
    iWeekNumber: int
    ): String = js.native
    
    /**
      * Get combined datetime pattern with given date and time style.
      *
      * @returns the combined datetime pattern
      */
    def getCombinedDateTimePattern(
      /**
      * the required style for the date part
      */
    sDateStyle: String,
      /**
      * the required style for the time part
      */
    sTimeStyle: String
    ): String = js.native
    def getCombinedDateTimePattern(
      /**
      * the required style for the date part
      */
    sDateStyle: String,
      /**
      * the required style for the time part
      */
    sTimeStyle: String,
      /**
      * the type of calendar. If it's not set, it falls back to the calendar type either set in configuration
      * or calculated from locale.
      */
    sCalendarType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarType * / any */ String
    ): String = js.native
    def getCombinedDateTimePattern(
      /**
      * the required style for the date part
      */
    sDateStyle: String,
      /**
      * the required style for the time part
      */
    sTimeStyle: String,
      /**
      * the type of calendar. If it's not set, it falls back to the calendar type either set in configuration
      * or calculated from locale.
      */
    sCalendarType: CalendarType
    ): String = js.native
    
    /**
      * @since 1.46
      *
      * Get combined interval pattern using a given pattern and the fallback interval pattern.
      *
      * If a skeleton based pattern is not available or not wanted, this method can be used to create an interval
      * pattern based on a given pattern, using the fallback interval pattern.
      *
      * @returns the calculated interval pattern
      */
    def getCombinedIntervalPattern(/**
      * the single date pattern to use within the interval pattern
      */
    sPattern: String): String = js.native
    def getCombinedIntervalPattern(
      /**
      * the single date pattern to use within the interval pattern
      */
    sPattern: String,
      /**
      * the type of calendar. If it's not set, it falls back to the calendar type either set in configuration
      * or calculated from locale.
      */
    sCalendarType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarType * / any */ String
    ): String = js.native
    def getCombinedIntervalPattern(
      /**
      * the single date pattern to use within the interval pattern
      */
    sPattern: String,
      /**
      * the type of calendar. If it's not set, it falls back to the calendar type either set in configuration
      * or calculated from locale.
      */
    sCalendarType: CalendarType
    ): String = js.native
    
    /**
      * @since 1.27.0
      *
      * Returns the currency code which is corresponded with the given currency symbol.
      *
      * @returns The corresponded currency code defined for the given currency symbol. The given currency symbol
      * is returned if no currency code can be found by using the given currency symbol.
      */
    def getCurrencyCodeBySymbol(
      /**
      * The currency symbol which needs to be converted to currency code
      */
    sCurrencySymbol: String
    ): String = js.native
    
    /**
      * @since 1.21.1
      *
      * Returns the number of digits of the specified currency.
      *
      * @returns digits of the currency
      */
    def getCurrencyDigits(/**
      * ISO 4217 currency code
      */
    sCurrency: String): int = js.native
    
    /**
      * @since 1.51.0
      *
      * Returns the short currency formats (like 1K USD, 1M USD....).
      *
      * @returns decimal format
      */
    def getCurrencyFormat(
      /**
      * short
      */
    sStyle: String,
      /**
      * 1000, 10000 ...
      */
    sNumber: String,
      /**
      * one or other (if not exists other is used)
      */
    sPlural: String
    ): String = js.native
    
    /**
      * Get currency format pattern.
      *
      * CLDR format pattern:
      * See:
      * 	https://cldr.unicode.org/translation/numbers-currency/number-patterns
      *
      * @returns The pattern
      */
    def getCurrencyPattern(/**
      * the context of the currency pattern (standard or accounting)
      */
    sContext: String): String = js.native
    
    /**
      * @since 1.21.1
      *
      * Returns the currency symbol for the specified currency, if no symbol is found the ISO 4217 currency code
      * is returned.
      *
      * @returns the currency symbol
      */
    def getCurrencySymbol(/**
      * ISO 4217 currency code
      */
    sCurrency: String): String = js.native
    
    /**
      * @since 1.60
      *
      * Returns the currency symbols available for this locale. Currency symbols get accumulated by custom currency
      * symbols.
      *
      * @returns the map of all currency symbols available in this locale, e.g. { "AUD": "A$", "BRL": "R$", "EUR":
      * "€", "GBP": "£", }
      */
    def getCurrencySymbols(): Record[String, String] = js.native
    
    /**
      * @since 1.34
      *
      * Get custom datetime pattern for a given skeleton format.
      *
      * The format string does contain pattern symbols (e.g. "yMMMd" or "Hms") and will be converted into the
      * pattern in the used locale, which matches the wanted symbols best. The symbols must be in canonical order,
      * that is: Era (G), Year (y/Y), Quarter (q/Q), Month (M/L), Week (w/W), Day-Of-Week (E/e/c), Day (d/D),
      * Hour (h/H/k/K/), Minute (m), Second (s), Timezone (z/Z/v/V/O/X/x)
      *
      * See https://unicode.org/reports/tr35/tr35-dates.html#availableFormats_appendItems
      *
      * @returns the best matching datetime pattern
      */
    def getCustomDateTimePattern(/**
      * the wanted skeleton format for the datetime pattern
      */
    sSkeleton: String): String = js.native
    def getCustomDateTimePattern(
      /**
      * the wanted skeleton format for the datetime pattern
      */
    sSkeleton: String,
      /**
      * the type of calendar. If it's not set, it falls back to the calendar type either set in configuration
      * or calculated from locale.
      */
    sCalendarType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarType * / any */ String
    ): String = js.native
    def getCustomDateTimePattern(
      /**
      * the wanted skeleton format for the datetime pattern
      */
    sSkeleton: String,
      /**
      * the type of calendar. If it's not set, it falls back to the calendar type either set in configuration
      * or calculated from locale.
      */
    sCalendarType: CalendarType
    ): String = js.native
    
    def getCustomIntervalPattern(
      /**
      * the wanted skeleton format for the datetime pattern
      */
    sSkeleton: String,
      /**
      * is either a string which represents the symbol matching the greatest difference in the two dates to format
      * or an object which contains key-value pairs. The value is always true. The key is one of the date field
      * symbol groups whose value are different between the two dates. The key can only be set with 'Year', 'Quarter',
      * 'Month', 'Week', 'Day', 'DayPeriod', 'Hour', 'Minute', or 'Second'.
      */
    vGreatestDiff: String
    ): String | js.Array[String] = js.native
    def getCustomIntervalPattern(
      /**
      * the wanted skeleton format for the datetime pattern
      */
    sSkeleton: String,
      /**
      * is either a string which represents the symbol matching the greatest difference in the two dates to format
      * or an object which contains key-value pairs. The value is always true. The key is one of the date field
      * symbol groups whose value are different between the two dates. The key can only be set with 'Year', 'Quarter',
      * 'Month', 'Week', 'Day', 'DayPeriod', 'Hour', 'Minute', or 'Second'.
      */
    vGreatestDiff: String,
      /**
      * the type of calendar. If it's not set, it falls back to the calendar type either set in configuration
      * or calculated from locale.
      */
    sCalendarType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarType * / any */ String
    ): String | js.Array[String] = js.native
    def getCustomIntervalPattern(
      /**
      * the wanted skeleton format for the datetime pattern
      */
    sSkeleton: String,
      /**
      * is either a string which represents the symbol matching the greatest difference in the two dates to format
      * or an object which contains key-value pairs. The value is always true. The key is one of the date field
      * symbol groups whose value are different between the two dates. The key can only be set with 'Year', 'Quarter',
      * 'Month', 'Week', 'Day', 'DayPeriod', 'Hour', 'Minute', or 'Second'.
      */
    vGreatestDiff: String,
      /**
      * the type of calendar. If it's not set, it falls back to the calendar type either set in configuration
      * or calculated from locale.
      */
    sCalendarType: CalendarType
    ): String | js.Array[String] = js.native
    /**
      * @since 1.46
      *
      * Get interval pattern for a given skeleton format.
      *
      * The format string does contain pattern symbols (e.g. "yMMMd" or "Hms") and will be converted into the
      * pattern in the used locale, which matches the wanted symbols best. The symbols must be in canonical order,
      * that is: Era (G), Year (y/Y), Quarter (q/Q), Month (M/L), Week (w/W), Day-Of-Week (E/e/c), Day (d/D),
      * Hour (h/H/k/K/), Minute (m), Second (s), Timezone (z/Z/v/V/O/X/x)
      *
      * See https://unicode.org/reports/tr35/tr35-dates.html#availableFormats_appendItems
      *
      * @returns the best matching interval pattern if interval difference is given otherwise an array with all
      * possible interval patterns which match the given skeleton format
      */
    def getCustomIntervalPattern(
      /**
      * the wanted skeleton format for the datetime pattern
      */
    sSkeleton: String,
      /**
      * is either a string which represents the symbol matching the greatest difference in the two dates to format
      * or an object which contains key-value pairs. The value is always true. The key is one of the date field
      * symbol groups whose value are different between the two dates. The key can only be set with 'Year', 'Quarter',
      * 'Month', 'Week', 'Day', 'DayPeriod', 'Hour', 'Minute', or 'Second'.
      */
    vGreatestDiff: js.Object
    ): String | js.Array[String] = js.native
    def getCustomIntervalPattern(
      /**
      * the wanted skeleton format for the datetime pattern
      */
    sSkeleton: String,
      /**
      * is either a string which represents the symbol matching the greatest difference in the two dates to format
      * or an object which contains key-value pairs. The value is always true. The key is one of the date field
      * symbol groups whose value are different between the two dates. The key can only be set with 'Year', 'Quarter',
      * 'Month', 'Week', 'Day', 'DayPeriod', 'Hour', 'Minute', or 'Second'.
      */
    vGreatestDiff: js.Object,
      /**
      * the type of calendar. If it's not set, it falls back to the calendar type either set in configuration
      * or calculated from locale.
      */
    sCalendarType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarType * / any */ String
    ): String | js.Array[String] = js.native
    def getCustomIntervalPattern(
      /**
      * the wanted skeleton format for the datetime pattern
      */
    sSkeleton: String,
      /**
      * is either a string which represents the symbol matching the greatest difference in the two dates to format
      * or an object which contains key-value pairs. The value is always true. The key is one of the date field
      * symbol groups whose value are different between the two dates. The key can only be set with 'Year', 'Quarter',
      * 'Month', 'Week', 'Day', 'DayPeriod', 'Hour', 'Minute', or 'Second'.
      */
    vGreatestDiff: js.Object,
      /**
      * the type of calendar. If it's not set, it falls back to the calendar type either set in configuration
      * or calculated from locale.
      */
    sCalendarType: CalendarType
    ): String | js.Array[String] = js.native
    
    /**
      * Get date pattern in format "short", "medium", "long" or "full".
      *
      * @returns the selected date pattern
      */
    def getDatePattern(/**
      * the required style for the date pattern
      */
    sStyle: String): String = js.native
    def getDatePattern(
      /**
      * the required style for the date pattern
      */
    sStyle: String,
      /**
      * the type of calendar. If it's not set, it falls back to the calendar type either set in configuration
      * or calculated from locale.
      */
    sCalendarType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarType * / any */ String
    ): String = js.native
    def getDatePattern(
      /**
      * the required style for the date pattern
      */
    sStyle: String,
      /**
      * the type of calendar. If it's not set, it falls back to the calendar type either set in configuration
      * or calculated from locale.
      */
    sCalendarType: CalendarType
    ): String = js.native
    
    /**
      * Get datetime pattern in style "short", "medium", "long" or "full".
      *
      * @returns the selected datetime pattern
      */
    def getDateTimePattern(/**
      * the required style for the datetime pattern
      */
    sStyle: String): String = js.native
    def getDateTimePattern(
      /**
      * the required style for the datetime pattern
      */
    sStyle: String,
      /**
      * the type of calendar. If it's not set, it falls back to the calendar type either set in configuration
      * or calculated from locale.
      */
    sCalendarType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarType * / any */ String
    ): String = js.native
    def getDateTimePattern(
      /**
      * the required style for the datetime pattern
      */
    sStyle: String,
      /**
      * the type of calendar. If it's not set, it falls back to the calendar type either set in configuration
      * or calculated from locale.
      */
    sCalendarType: CalendarType
    ): String = js.native
    
    /**
      * Get day periods in width "narrow", "abbreviated" or "wide".
      *
      * @returns array of day periods (AM, PM)
      */
    def getDayPeriods(/**
      * the required width for the day period names
      */
    sWidth: String): js.Array[Any] = js.native
    def getDayPeriods(
      /**
      * the required width for the day period names
      */
    sWidth: String,
      /**
      * the type of calendar. If it's not set, it falls back to the calendar type either set in configuration
      * or calculated from locale.
      */
    sCalendarType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarType * / any */ String
    ): js.Array[Any] = js.native
    def getDayPeriods(
      /**
      * the required width for the day period names
      */
    sWidth: String,
      /**
      * the type of calendar. If it's not set, it falls back to the calendar type either set in configuration
      * or calculated from locale.
      */
    sCalendarType: CalendarType
    ): js.Array[Any] = js.native
    
    /**
      * Get standalone day periods in width "narrow", "abbreviated" or "wide".
      *
      * @returns array of day periods (AM, PM)
      */
    def getDayPeriodsStandAlone(/**
      * the required width for the day period names
      */
    sWidth: String): js.Array[Any] = js.native
    def getDayPeriodsStandAlone(
      /**
      * the required width for the day period names
      */
    sWidth: String,
      /**
      * the type of calendar. If it's not set, it falls back to the calendar type either set in configuration
      * or calculated from locale.
      */
    sCalendarType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarType * / any */ String
    ): js.Array[Any] = js.native
    def getDayPeriodsStandAlone(
      /**
      * the required width for the day period names
      */
    sWidth: String,
      /**
      * the type of calendar. If it's not set, it falls back to the calendar type either set in configuration
      * or calculated from locale.
      */
    sCalendarType: CalendarType
    ): js.Array[Any] = js.native
    
    /**
      * Get day names in width "narrow", "abbreviated" or "wide".
      *
      * @returns array of day names (starting with Sunday)
      */
    def getDays(/**
      * the required width for the day names
      */
    sWidth: String): js.Array[Any] = js.native
    def getDays(
      /**
      * the required width for the day names
      */
    sWidth: String,
      /**
      * the type of calendar. If it's not set, it falls back to the calendar type either set in configuration
      * or calculated from locale.
      */
    sCalendarType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarType * / any */ String
    ): js.Array[Any] = js.native
    def getDays(
      /**
      * the required width for the day names
      */
    sWidth: String,
      /**
      * the type of calendar. If it's not set, it falls back to the calendar type either set in configuration
      * or calculated from locale.
      */
    sCalendarType: CalendarType
    ): js.Array[Any] = js.native
    
    /**
      * Get standalone day names in width "narrow", "abbreviated" or "wide".
      *
      * @returns array of day names (starting with Sunday)
      */
    def getDaysStandAlone(/**
      * the required width for the day names
      */
    sWidth: String): js.Array[Any] = js.native
    def getDaysStandAlone(
      /**
      * the required width for the day names
      */
    sWidth: String,
      /**
      * the type of calendar. If it's not set, it falls back to the calendar type either set in configuration
      * or calculated from locale.
      */
    sCalendarType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarType * / any */ String
    ): js.Array[Any] = js.native
    def getDaysStandAlone(
      /**
      * the required width for the day names
      */
    sWidth: String,
      /**
      * the type of calendar. If it's not set, it falls back to the calendar type either set in configuration
      * or calculated from locale.
      */
    sCalendarType: CalendarType
    ): js.Array[Any] = js.native
    
    /**
      * @since 1.25.0
      *
      * Returns the short decimal formats (like 1K, 1M....).
      *
      * @returns decimal format
      */
    def getDecimalFormat(
      /**
      * short or long
      */
    sStyle: String,
      /**
      * 1000, 10000 ...
      */
    sNumber: String,
      /**
      * one or other (if not exists other is used)
      */
    sPlural: String
    ): String = js.native
    
    /**
      * Get decimal format pattern.
      *
      * @returns The pattern
      */
    def getDecimalPattern(): String = js.native
    
    /**
      * @since 1.34.0
      *
      * Returns the display name for a time unit (second, minute, hour, day, week, month, year).
      */
    def getDisplayName(/**
      * Type (second, minute, hour, day, week, month, year)
      */
    sType: String): Unit = js.native
    def getDisplayName(
      /**
      * Type (second, minute, hour, day, week, month, year)
      */
    sType: String,
      /**
      * @since 1.32.10, 1.34.4 the style of the pattern. The valid values are "wide", "short" and "narrow" returns
      * {string} display name
      */
    sStyle: String
    ): Unit = js.native
    
    /**
      * @since 1.32.0
      *
      * Returns the map of era IDs to era dates.
      *
      * @returns the array of eras containing objects with either an _end or _start property with a date
      */
    def getEraDates(): js.Array[Any] = js.native
    def getEraDates(
      /**
      * the type of calendar
      */
    sCalendarType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarType * / any */ String
    ): js.Array[Any] = js.native
    def getEraDates(/**
      * the type of calendar
      */
    sCalendarType: CalendarType): js.Array[Any] = js.native
    
    /**
      * @since 1.32.0
      *
      * Returns array of eras.
      *
      * @returns the array of eras
      */
    def getEras(/**
      * the style of the era name. It can be 'wide', 'abbreviated' or 'narrow'
      */
    sWidth: String): js.Array[Any] = js.native
    def getEras(
      /**
      * the style of the era name. It can be 'wide', 'abbreviated' or 'narrow'
      */
    sWidth: String,
      /**
      * the type of calendar
      */
    sCalendarType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarType * / any */ String
    ): js.Array[Any] = js.native
    def getEras(
      /**
      * the style of the era name. It can be 'wide', 'abbreviated' or 'narrow'
      */
    sWidth: String,
      /**
      * the type of calendar
      */
    sCalendarType: CalendarType
    ): js.Array[Any] = js.native
    
    /**
      * Returns the day that usually is regarded as the first day of a week in the current locale.
      *
      * Days are encoded as integer where Sunday=0, Monday=1 etc.
      *
      * All week data information in the CLDR is provided for territories (countries). If the locale of this
      * LocaleData doesn't contain country information (e.g. if it contains only a language), then the "likelySubtag"
      * information of the CLDR is taken into account to guess the "most likely" territory for the locale.
      *
      * @returns first day of week
      */
    def getFirstDayOfWeek(): int = js.native
    
    /**
      * @since 1.17.0
      *
      * Returns the interval format with the given Id (see CLDR documentation for valid Ids) or the fallback
      * format if no interval format with that Id is known.
      *
      * The empty Id ("") might be used to retrieve the interval format fallback.
      *
      * @returns interval format string with placeholders {0} and {1}
      */
    def getIntervalPattern(/**
      * Id of the interval format, e.g. "d-d"
      */
    sId: String): String = js.native
    def getIntervalPattern(
      /**
      * Id of the interval format, e.g. "d-d"
      */
    sId: String,
      /**
      * the type of calendar. If it's not set, it falls back to the calendar type either set in configuration
      * or calculated from locale.
      */
    sCalendarType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarType * / any */ String
    ): String = js.native
    def getIntervalPattern(
      /**
      * Id of the interval format, e.g. "d-d"
      */
    sId: String,
      /**
      * the type of calendar. If it's not set, it falls back to the calendar type either set in configuration
      * or calculated from locale.
      */
    sCalendarType: CalendarType
    ): String = js.native
    
    /**
      * Get locale specific language names.
      *
      * @returns map of locale specific language names
      */
    def getLanguages(): Record[String, String] = js.native
    
    /**
      * Get lenient number symbols for "plusSign" or "minusSign".
      *
      * @returns the selected lenient number symbols, e.g. "-‒⁻₋−➖﹣"
      */
    def getLenientNumberSymbols(/**
      * the required type of symbol
      */
    sType: String): String = js.native
    
    /**
      * Returns the required minimal number of days for the first week of a year.
      *
      * This is the minimal number of days of the week which must be contained in the new year for the week to
      * become the first week of the year. Depending on the country, this is just a single day (in the US) or
      * at least 4 days (in most of Europe).
      *
      * All week data information in the CLDR is provided for territories (countries). If the locale of this
      * LocaleData doesn't contain country information (e.g. if it contains only a language), then the "likelySubtag"
      * information of the CLDR is taken into account to guess the "most likely" territory for the locale.
      *
      * @returns minimal number of days
      */
    def getMinimalDaysInFirstWeek(): int = js.native
    
    /**
      * Get miscellaneous pattern.
      *
      * @returns The pattern
      */
    def getMiscPattern(
      /**
      * the name of the misc pattern, can be "approximately", "atLeast", "atMost" or "range"
      */
    sName: String
    ): String = js.native
    
    /**
      * Get month names in width "narrow", "abbreviated" or "wide".
      *
      * @returns array of month names (starting with January)
      */
    def getMonths(/**
      * the required width for the month names
      */
    sWidth: String): js.Array[Any] = js.native
    def getMonths(
      /**
      * the required width for the month names
      */
    sWidth: String,
      /**
      * the type of calendar. If it's not set, it falls back to the calendar type either set in configuration
      * or calculated from locale.
      */
    sCalendarType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarType * / any */ String
    ): js.Array[Any] = js.native
    def getMonths(
      /**
      * the required width for the month names
      */
    sWidth: String,
      /**
      * the type of calendar. If it's not set, it falls back to the calendar type either set in configuration
      * or calculated from locale.
      */
    sCalendarType: CalendarType
    ): js.Array[Any] = js.native
    
    /**
      * Get standalone month names in width "narrow", "abbreviated" or "wide".
      *
      * @returns array of month names (starting with January)
      */
    def getMonthsStandAlone(/**
      * the required width for the month names
      */
    sWidth: String): js.Array[Any] = js.native
    def getMonthsStandAlone(
      /**
      * the required width for the month names
      */
    sWidth: String,
      /**
      * the type of calendar. If it's not set, it falls back to the calendar type either set in configuration
      * or calculated from locale.
      */
    sCalendarType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarType * / any */ String
    ): js.Array[Any] = js.native
    def getMonthsStandAlone(
      /**
      * the required width for the month names
      */
    sWidth: String,
      /**
      * the type of calendar. If it's not set, it falls back to the calendar type either set in configuration
      * or calculated from locale.
      */
    sCalendarType: CalendarType
    ): js.Array[Any] = js.native
    
    /**
      * Get number symbol "decimal", "group", "plusSign", "minusSign", "percentSign".
      *
      * @returns the selected number symbol
      */
    def getNumberSymbol(/**
      * the required type of symbol
      */
    sType: String): String = js.native
    
    /**
      * Get orientation (left-to-right or right-to-left).
      *
      * @returns character orientation for this locale
      */
    def getOrientation(): String = js.native
    
    /**
      * Get percent format pattern.
      *
      * @returns The pattern
      */
    def getPercentPattern(): String = js.native
    
    /**
      * @since 1.50
      *
      * Returns an array of all plural categories available in this language.
      *
      * @returns The array of plural categories
      */
    def getPluralCategories(): js.Array[Any] = js.native
    
    /**
      * @since 1.50
      *
      * Returns the plural category (zero, one, two, few, many or other) for the given number value. The number
      * must be passed as an unformatted number string with dot as decimal separator (for example "12345.67").
      * To determine the correct plural category, it is also necessary to keep the same number of decimal digits
      * as given in the formatted output string. For example "1" and "1.0" could be in different plural categories
      * as the number of decimal digits is different.
      *
      * Compact numbers (for example in "short" format) must be provided in the locale-independent CLDR compact
      * notation. This notation uses the plural rule operand "c" for the compact decimal exponent, for example
      * "1.2c3" for "1.2K" (1200) or "4c6" for "4M" (4000000).
      *
      * Note that the operand "e" is deprecated, but is a synonym corresponding to the CLDR specification for
      * "c" and may be redefined in the future.
      *
      * @returns The plural category
      */
    def getPluralCategory(/**
      * The number to find the plural category for
      */
    vNumber: String): String = js.native
    def getPluralCategory(/**
      * The number to find the plural category for
      */
    vNumber: Double): String = js.native
    
    /**
      * @since 1.28.6
      *
      * Returns the preferred calendar type for the current locale which exists in {@link sap.ui.core.CalendarType}
      *
      * @returns the preferred calendar type
      */
    def getPreferredCalendarType(): CalendarType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarType * / any */ String) = js.native
    
    /**
      * @since 1.34
      *
      * Returns the preferred hour pattern symbol (h for 12, H for 24 hours) for the current locale.
      *
      * @returns the preferred hour symbol
      */
    def getPreferredHourSymbol(): String = js.native
    
    /**
      * Get quarter names in width "narrow", "abbreviated" or "wide".
      *
      * @returns array of quarters
      */
    def getQuarters(/**
      * the required width for the quarter names
      */
    sWidth: String): js.Array[Any] = js.native
    def getQuarters(
      /**
      * the required width for the quarter names
      */
    sWidth: String,
      /**
      * the type of calendar. If it's not set, it falls back to the calendar type either set in configuration
      * or calculated from locale.
      */
    sCalendarType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarType * / any */ String
    ): js.Array[Any] = js.native
    def getQuarters(
      /**
      * the required width for the quarter names
      */
    sWidth: String,
      /**
      * the type of calendar. If it's not set, it falls back to the calendar type either set in configuration
      * or calculated from locale.
      */
    sCalendarType: CalendarType
    ): js.Array[Any] = js.native
    
    /**
      * Get standalone quarter names in width "narrow", "abbreviated" or "wide".
      *
      * @returns array of quarters
      */
    def getQuartersStandAlone(/**
      * the required width for the quarter names
      */
    sWidth: String): js.Array[Any] = js.native
    def getQuartersStandAlone(
      /**
      * the required width for the quarter names
      */
    sWidth: String,
      /**
      * the type of calendar. If it's not set, it falls back to the calendar type either set in configuration
      * or calculated from locale.
      */
    sCalendarType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarType * / any */ String
    ): js.Array[Any] = js.native
    def getQuartersStandAlone(
      /**
      * the required width for the quarter names
      */
    sWidth: String,
      /**
      * the type of calendar. If it's not set, it falls back to the calendar type either set in configuration
      * or calculated from locale.
      */
    sCalendarType: CalendarType
    ): js.Array[Any] = js.native
    
    /**
      * @since 1.25.0
      *
      * Returns the relative day resource pattern (like "Today", "Yesterday", "{0} days ago") based on the given
      * difference of days (0 means today, 1 means tomorrow, -1 means yesterday, ...).
      *
      * @returns the relative day resource pattern
      */
    def getRelativeDay(/**
      * the difference in days
      */
    iDiff: int): String = js.native
    def getRelativeDay(
      /**
      * the difference in days
      */
    iDiff: int,
      /**
      * @since 1.32.10, 1.34.4 the style of the pattern. The valid values are "wide", "short" and "narrow"
      */
    sStyle: String
    ): String = js.native
    
    /**
      * @since 1.31.0
      *
      * Returns the relative resource pattern with unit 'hour' (like "in {0} hour(s)", "{0} hour(s) ago" under
      * locale 'en') based on the given difference value (positive value means in the future and negative value
      * means in the past).
      *
      * There's no pattern defined for 0 difference and the function returns null if 0 is given. In the 0 difference
      * case, you can use the getRelativeMinute or getRelativeSecond function to format the difference using
      * unit 'minute' or 'second'.
      *
      * @returns the relative resource pattern in unit 'hour'. The method returns null if 0 is given as parameter.
      */
    def getRelativeHour(/**
      * the difference in hours
      */
    iDiff: int): String | Null = js.native
    def getRelativeHour(
      /**
      * the difference in hours
      */
    iDiff: int,
      /**
      * @since 1.32.10, 1.34.4 the style of the pattern. The valid values are "wide", "short" and "narrow"
      */
    sStyle: String
    ): String | Null = js.native
    
    /**
      * @since 1.31.0
      *
      * Returns the relative resource pattern with unit 'minute' (like "in {0} minute(s)", "{0} minute(s) ago"
      * under locale 'en') based on the given difference value (positive value means in the future and negative
      * value means in the past).
      *
      * There's no pattern defined for 0 difference and the function returns null if 0 is given. In the 0 difference
      * case, you can use the getRelativeSecond function to format the difference using unit 'second'.
      *
      * @returns the relative resource pattern in unit 'minute'. The method returns null if 0 is given as parameter.
      */
    def getRelativeMinute(/**
      * the difference in minutes
      */
    iDiff: int): String | Null = js.native
    def getRelativeMinute(
      /**
      * the difference in minutes
      */
    iDiff: int,
      /**
      * @since 1.32.10, 1.34.4 the style of the pattern. The valid values are "wide", "short" and "narrow"
      */
    sStyle: String
    ): String | Null = js.native
    
    /**
      * @since 1.25.0
      *
      * Returns the relative month resource pattern (like "This month", "Last month", "{0} months ago") based
      * on the given difference of months (0 means this month, 1 means next month, -1 means last month, ...).
      *
      * @returns the relative month resource pattern
      */
    def getRelativeMonth(/**
      * the difference in months
      */
    iDiff: int): String = js.native
    def getRelativeMonth(
      /**
      * the difference in months
      */
    iDiff: int,
      /**
      * @since 1.32.10, 1.34.4 the style of the pattern. The valid values are "wide", "short" and "narrow"
      */
    sStyle: String
    ): String = js.native
    
    /**
      * @since 1.34
      *
      * Returns the relative format pattern with given scale (year, month, week, ...) and difference value.
      *
      * @returns the relative format pattern
      */
    def getRelativePattern(
      /**
      * the scale the relative pattern is needed for
      */
    sScale: String,
      /**
      * the difference in the given scale unit
      */
    iDiff: int
    ): String = js.native
    def getRelativePattern(
      /**
      * the scale the relative pattern is needed for
      */
    sScale: String,
      /**
      * the difference in the given scale unit
      */
    iDiff: int,
      /**
      * whether a future or past pattern should be used
      */
    bFuture: Boolean
    ): String = js.native
    def getRelativePattern(
      /**
      * the scale the relative pattern is needed for
      */
    sScale: String,
      /**
      * the difference in the given scale unit
      */
    iDiff: int,
      /**
      * whether a future or past pattern should be used
      */
    bFuture: Boolean,
      /**
      * @since 1.32.10, 1.34.4 the style of the pattern. The valid values are "wide", "short" and "narrow"
      */
    sStyle: String
    ): String = js.native
    def getRelativePattern(
      /**
      * the scale the relative pattern is needed for
      */
    sScale: String,
      /**
      * the difference in the given scale unit
      */
    iDiff: int,
      /**
      * whether a future or past pattern should be used
      */
    bFuture: Unit,
      /**
      * @since 1.32.10, 1.34.4 the style of the pattern. The valid values are "wide", "short" and "narrow"
      */
    sStyle: String
    ): String = js.native
    
    /**
      * @since 1.34
      *
      * Returns relative time patterns for the given scales as an array of objects containing scale, value and
      * pattern.
      *
      * The array may contain the following values: "year", "month", "week", "day", "hour", "minute" and "second".
      * If no scales are given, patterns for all available scales will be returned.
      *
      * The return array will contain objects looking like:
      * ```javascript
      *
      * {
      *     scale: "minute",
      *     sign: 1,
      *     pattern: "in {0} minutes"
      * }
      * ```
      *
      *
      * @returns An array of all relative time patterns
      */
    def getRelativePatterns(
      /**
      * The scales for which the available patterns should be returned
      */
    aScales: js.Array[String]
    ): js.Array[js.Object] = js.native
    def getRelativePatterns(
      /**
      * The scales for which the available patterns should be returned
      */
    aScales: js.Array[String],
      /**
      * @since 1.32.10, 1.34.4 The style of the scale patterns. The valid values are "wide", "short" and "narrow".
      */
    sStyle: String
    ): js.Array[js.Object] = js.native
    
    /**
      * @since 1.31.0
      *
      * Returns the relative resource pattern with unit 'second' (like now, "in {0} seconds", "{0} seconds ago"
      * under locale 'en') based on the given difference value (0 means now, positive value means in the future
      * and negative value means in the past).
      *
      * @returns the relative resource pattern in unit 'second'
      */
    def getRelativeSecond(/**
      * the difference in seconds
      */
    iDiff: int): String = js.native
    def getRelativeSecond(
      /**
      * the difference in seconds
      */
    iDiff: int,
      /**
      * @since 1.32.10, 1.34.4 the style of the pattern. The valid values are "wide", "short" and "narrow"
      */
    sStyle: String
    ): String = js.native
    
    /**
      * @since 1.31.0
      *
      * Returns the relative week resource pattern (like "This week", "Last week", "{0} weeks ago") based on
      * the given difference of weeks (0 means this week, 1 means next week, -1 means last week, ...).
      *
      * @returns the relative week resource pattern
      */
    def getRelativeWeek(/**
      * the difference in weeks
      */
    iDiff: int): String = js.native
    def getRelativeWeek(
      /**
      * the difference in weeks
      */
    iDiff: int,
      /**
      * @since 1.32.10, 1.34.4 the style of the pattern. The valid values are "wide", "short" and "narrow"
      */
    sStyle: String
    ): String = js.native
    
    /**
      * @since 1.25.0
      *
      * Returns the relative year resource pattern (like "This year", "Last year", "{0} year ago") based on the
      * given difference of years (0 means this year, 1 means next year, -1 means last year, ...).
      *
      * @returns the relative year resource pattern
      */
    def getRelativeYear(/**
      * the difference in years
      */
    iDiff: int): String = js.native
    def getRelativeYear(
      /**
      * the difference in years
      */
    iDiff: int,
      /**
      * @since 1.32.10, 1.34.4 the style of the pattern. The valid values are "wide", "short" and "narrow"
      */
    sStyle: String
    ): String = js.native
    
    /**
      * @since 1.54
      *
      * Retrieves the unit format pattern for a specific unit name considering the unit mappings.
      * See:
      * 	sap.ui.core.LocaleData#getUnitFromMapping
      *
      * @returns The unit format configuration for the given unit name
      */
    def getResolvedUnitFormat(/**
      * unit name, e.g. "duration-hour" or "my"
      */
    sUnit: String): js.Object = js.native
    
    /**
      * Get locale specific script names.
      *
      * @returns map of locale specific script names
      */
    def getScripts(): Record[String, String] = js.native
    
    /**
      * Get locale specific territory names.
      *
      * @returns map of locale specific territory names
      */
    def getTerritories(): Record[String, String] = js.native
    
    /**
      * Get time pattern in style "short", "medium", "long" or "full".
      *
      * @returns the selected time pattern
      */
    def getTimePattern(/**
      * the required style for the date pattern
      */
    sStyle: String): String = js.native
    def getTimePattern(
      /**
      * the required style for the date pattern
      */
    sStyle: String,
      /**
      * the type of calendar. If it's not set, it falls back to the calendar type either set in configuration
      * or calculated from locale.
      */
    sCalendarType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarType * / any */ String
    ): String = js.native
    def getTimePattern(
      /**
      * the required style for the date pattern
      */
    sStyle: String,
      /**
      * the type of calendar. If it's not set, it falls back to the calendar type either set in configuration
      * or calculated from locale.
      */
    sCalendarType: CalendarType
    ): String = js.native
    
    /**
      * @since 1.54
      *
      * Retrieves the localized display name of a unit by sUnit, e.g. "duration-hour".
      *
      * @returns The localized display name for the requested unit, e.g. `"Hour"`. Return empty string `""` if
      * not found
      */
    def getUnitDisplayName(/**
      * the unit key, e.g. "duration-hour"
      */
    sUnit: String): String = js.native
    
    /**
      * @since 1.54
      *
      * Retrieves the unit format pattern for a specific unit name.
      *
      * Note: Does not take unit mapping into consideration.
      *
      * @returns The unit format configuration for the given unit name
      */
    def getUnitFormat(/**
      * unit name, e.g. "duration-hour"
      */
    sUnit: String): js.Object = js.native
    
    /**
      * @since 1.54
      *
      * Retrieves all unit format patterns merged.
      *
      * Note: Does not take unit mapping into consideration.
      *
      * @returns The unit format patterns
      */
    def getUnitFormats(): js.Object = js.native
    
    /**
      * @since 1.54
      *
      * Looks up the unit from defined unit mapping. E.g. for defined unit mapping ` { "my": "my-custom-unit",
      * "cm": "length-centimeter" } `
      *
      * Call: `getUnitFromMapping("my")` would result in `"my-custom-unit"`
      *
      * @returns unit from the mapping
      */
    def getUnitFromMapping(/**
      * mapping identifier
      */
    sMapping: String): String = js.native
    
    /**
      * Returns the last day of a weekend for the given locale.
      *
      * Days are encoded in the same way as for {@link #getFirstDayOfWeek}.
      *
      * All week data information in the CLDR is provided for territories (countries). If the locale of this
      * LocaleData doesn't contain country information (e.g. if it contains only a language), then the "likelySubtag"
      * information of the CLDR is taken into account to guess the "most likely" territory for the locale.
      *
      * @returns last day of weekend
      */
    def getWeekendEnd(): int = js.native
    
    /**
      * Returns the first day of a weekend for the given locale.
      *
      * Days are encoded in the same way as for {@link #getFirstDayOfWeek}.
      *
      * All week data information in the CLDR is provided for territories (countries). If the locale of this
      * LocaleData doesn't contain country information (e.g. if it contains only a language), then the "likelySubtag"
      * information of the CLDR is taken into account to guess the "most likely" territory for the locale.
      *
      * @returns first day of weekend
      */
    def getWeekendStart(): int = js.native
  }
}
