package typings.momentTimezone

import typings.moment.mod.DurationInputArg1
import typings.moment.mod.DurationInputArg2
import typings.moment.mod.Duration_
import typings.moment.mod.LocaleSpecification
import typings.moment.mod.Locale_
import typings.moment.mod.Moment
import typings.moment.mod.MomentBuiltinFormat
import typings.moment.mod.MomentFormatSpecification
import typings.moment.mod.MomentInput
import typings.moment.mod.MomentParsingFlagsOpt
import typings.moment.mod.unitOfTime.All
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object momentTimezoneUtilsMod {
  
  @JSImport("moment-timezone/moment-timezone-utils", JSImport.Namespace)
  @js.native
  def apply(): Moment = js.native
  @JSImport("moment-timezone/moment-timezone-utils", JSImport.Namespace)
  @js.native
  def apply(
    inp: js.UndefOr[MomentInput],
    format: js.UndefOr[MomentFormatSpecification],
    language: js.UndefOr[scala.Nothing],
    strict: Boolean
  ): Moment = js.native
  @JSImport("moment-timezone/moment-timezone-utils", JSImport.Namespace)
  @js.native
  def apply(inp: js.UndefOr[MomentInput], format: js.UndefOr[MomentFormatSpecification], language: String): Moment = js.native
  @JSImport("moment-timezone/moment-timezone-utils", JSImport.Namespace)
  @js.native
  def apply(
    inp: js.UndefOr[MomentInput],
    format: js.UndefOr[MomentFormatSpecification],
    language: String,
    strict: Boolean
  ): Moment = js.native
  @JSImport("moment-timezone/moment-timezone-utils", JSImport.Namespace)
  @js.native
  def apply(inp: js.UndefOr[MomentInput], format: js.UndefOr[MomentFormatSpecification], strict: Boolean): Moment = js.native
  @JSImport("moment-timezone/moment-timezone-utils", JSImport.Namespace)
  @js.native
  def apply(inp: js.UndefOr[MomentInput], format: MomentFormatSpecification): Moment = js.native
  @JSImport("moment-timezone/moment-timezone-utils", JSImport.Namespace)
  @js.native
  def apply(inp: js.UndefOr[MomentInput], strict: Boolean): Moment = js.native
  @JSImport("moment-timezone/moment-timezone-utils", JSImport.Namespace)
  @js.native
  def apply(inp: MomentInput): Moment = js.native
  
  @JSImport("moment-timezone/moment-timezone-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object HTML5_FMT {
    
    @JSImport("moment-timezone/moment-timezone-utils", "HTML5_FMT")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("moment-timezone/moment-timezone-utils", "HTML5_FMT.DATE")
    @js.native
    def DATE: String = js.native
    
    @JSImport("moment-timezone/moment-timezone-utils", "HTML5_FMT.DATETIME_LOCAL")
    @js.native
    def DATETIME_LOCAL: String = js.native
    @scala.inline
    def DATETIME_LOCAL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DATETIME_LOCAL")(x.asInstanceOf[js.Any])
    
    @JSImport("moment-timezone/moment-timezone-utils", "HTML5_FMT.DATETIME_LOCAL_MS")
    @js.native
    def DATETIME_LOCAL_MS: String = js.native
    @scala.inline
    def DATETIME_LOCAL_MS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DATETIME_LOCAL_MS")(x.asInstanceOf[js.Any])
    
    @JSImport("moment-timezone/moment-timezone-utils", "HTML5_FMT.DATETIME_LOCAL_SECONDS")
    @js.native
    def DATETIME_LOCAL_SECONDS: String = js.native
    @scala.inline
    def DATETIME_LOCAL_SECONDS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DATETIME_LOCAL_SECONDS")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def DATE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DATE")(x.asInstanceOf[js.Any])
    
    @JSImport("moment-timezone/moment-timezone-utils", "HTML5_FMT.MONTH")
    @js.native
    def MONTH: String = js.native
    @scala.inline
    def MONTH_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MONTH")(x.asInstanceOf[js.Any])
    
    @JSImport("moment-timezone/moment-timezone-utils", "HTML5_FMT.TIME")
    @js.native
    def TIME: String = js.native
    @scala.inline
    def TIME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TIME")(x.asInstanceOf[js.Any])
    
    @JSImport("moment-timezone/moment-timezone-utils", "HTML5_FMT.TIME_MS")
    @js.native
    def TIME_MS: String = js.native
    @scala.inline
    def TIME_MS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TIME_MS")(x.asInstanceOf[js.Any])
    
    @JSImport("moment-timezone/moment-timezone-utils", "HTML5_FMT.TIME_SECONDS")
    @js.native
    def TIME_SECONDS: String = js.native
    @scala.inline
    def TIME_SECONDS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TIME_SECONDS")(x.asInstanceOf[js.Any])
    
    @JSImport("moment-timezone/moment-timezone-utils", "HTML5_FMT.WEEK")
    @js.native
    def WEEK: String = js.native
    @scala.inline
    def WEEK_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WEEK")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("moment-timezone/moment-timezone-utils", "ISO_8601")
  @js.native
  def ISO_8601: MomentBuiltinFormat = js.native
  @scala.inline
  def ISO_8601_=(x: MomentBuiltinFormat): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ISO_8601")(x.asInstanceOf[js.Any])
  
  @JSImport("moment-timezone/moment-timezone-utils", "RFC_2822")
  @js.native
  def RFC_2822: MomentBuiltinFormat = js.native
  @scala.inline
  def RFC_2822_=(x: MomentBuiltinFormat): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RFC_2822")(x.asInstanceOf[js.Any])
  
  @JSImport("moment-timezone/moment-timezone-utils", "calendarFormat")
  @js.native
  def calendarFormat(m: Moment, now: Moment): String = js.native
  
  @JSImport("moment-timezone/moment-timezone-utils", "defaultFormat")
  @js.native
  def defaultFormat: String = js.native
  
  @JSImport("moment-timezone/moment-timezone-utils", "defaultFormatUtc")
  @js.native
  def defaultFormatUtc: String = js.native
  @scala.inline
  def defaultFormatUtc_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultFormatUtc")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def defaultFormat_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultFormat")(x.asInstanceOf[js.Any])
  
  @JSImport("moment-timezone/moment-timezone-utils", "defineLocale")
  @js.native
  def defineLocale(language: String, localeSpec: Unit): Locale_ = js.native
  @JSImport("moment-timezone/moment-timezone-utils", "defineLocale")
  @js.native
  def defineLocale(language: String, localeSpec: LocaleSpecification): Locale_ = js.native
  
  @JSImport("moment-timezone/moment-timezone-utils", "deprecationHandler")
  @js.native
  def deprecationHandler: (js.Function2[/* name */ String | Unit, /* msg */ String, Unit]) | Unit = js.native
  @scala.inline
  def deprecationHandler_=(x: (js.Function2[/* name */ String | Unit, /* msg */ String, Unit]) | Unit): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deprecationHandler")(x.asInstanceOf[js.Any])
  
  @JSImport("moment-timezone/moment-timezone-utils", "duration")
  @js.native
  def duration(): Duration_ = js.native
  @JSImport("moment-timezone/moment-timezone-utils", "duration")
  @js.native
  def duration(inp: js.UndefOr[DurationInputArg1], unit: DurationInputArg2): Duration_ = js.native
  @JSImport("moment-timezone/moment-timezone-utils", "duration")
  @js.native
  def duration(inp: DurationInputArg1): Duration_ = js.native
  
  @JSImport("moment-timezone/moment-timezone-utils", "fn")
  @js.native
  def fn: Moment = js.native
  @scala.inline
  def fn_=(x: Moment): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
  
  @JSImport("moment-timezone/moment-timezone-utils", "invalid")
  @js.native
  def invalid(): Moment = js.native
  @JSImport("moment-timezone/moment-timezone-utils", "invalid")
  @js.native
  def invalid(flags: MomentParsingFlagsOpt): Moment = js.native
  
  @JSImport("moment-timezone/moment-timezone-utils", "isDate")
  @js.native
  def isDate(m: js.Any): /* is std.Date */ Boolean = js.native
  
  @JSImport("moment-timezone/moment-timezone-utils", "isDuration")
  @js.native
  def isDuration(d: js.Any): /* is moment.moment.Duration */ Boolean = js.native
  
  @JSImport("moment-timezone/moment-timezone-utils", "isMoment")
  @js.native
  def isMoment(m: js.Any): /* is moment.moment.Moment */ Boolean = js.native
  
  @JSImport("moment-timezone/moment-timezone-utils", "lang")
  @js.native
  def lang(): String = js.native
  @JSImport("moment-timezone/moment-timezone-utils", "lang")
  @js.native
  def lang(language: js.UndefOr[scala.Nothing], definition: Locale_): String = js.native
  @JSImport("moment-timezone/moment-timezone-utils", "lang")
  @js.native
  def lang(language: String): String = js.native
  @JSImport("moment-timezone/moment-timezone-utils", "lang")
  @js.native
  def lang(language: String, definition: Locale_): String = js.native
  
  @JSImport("moment-timezone/moment-timezone-utils", "locale")
  @js.native
  def locale(): String = js.native
  @JSImport("moment-timezone/moment-timezone-utils", "locale")
  @js.native
  def locale(language: js.UndefOr[scala.Nothing], definition: Unit): String = js.native
  @JSImport("moment-timezone/moment-timezone-utils", "locale")
  @js.native
  def locale(language: js.UndefOr[scala.Nothing], definition: LocaleSpecification): String = js.native
  @JSImport("moment-timezone/moment-timezone-utils", "locale")
  @js.native
  def locale(language: String): String = js.native
  @JSImport("moment-timezone/moment-timezone-utils", "locale")
  @js.native
  def locale(language: String, definition: Unit): String = js.native
  @JSImport("moment-timezone/moment-timezone-utils", "locale")
  @js.native
  def locale(language: String, definition: LocaleSpecification): String = js.native
  @JSImport("moment-timezone/moment-timezone-utils", "locale")
  @js.native
  def locale(language: js.Array[String]): String = js.native
  
  @JSImport("moment-timezone/moment-timezone-utils", "localeData")
  @js.native
  def localeData(): Locale_ = js.native
  @JSImport("moment-timezone/moment-timezone-utils", "localeData")
  @js.native
  def localeData(key: String): Locale_ = js.native
  @JSImport("moment-timezone/moment-timezone-utils", "localeData")
  @js.native
  def localeData(key: js.Array[String]): Locale_ = js.native
  
  @JSImport("moment-timezone/moment-timezone-utils", "locales")
  @js.native
  def locales(): js.Array[String] = js.native
  
  @JSImport("moment-timezone/moment-timezone-utils", "max")
  @js.native
  def max(moments: Moment*): Moment = js.native
  @JSImport("moment-timezone/moment-timezone-utils", "max")
  @js.native
  def max(moments: js.Array[Moment]): Moment = js.native
  
  @JSImport("moment-timezone/moment-timezone-utils", "min")
  @js.native
  def min(moments: Moment*): Moment = js.native
  @JSImport("moment-timezone/moment-timezone-utils", "min")
  @js.native
  def min(moments: js.Array[Moment]): Moment = js.native
  
  @JSImport("moment-timezone/moment-timezone-utils", "months")
  @js.native
  def months(): js.Array[String] = js.native
  @JSImport("moment-timezone/moment-timezone-utils", "months")
  @js.native
  def months(format: String): js.Array[String] = js.native
  @JSImport("moment-timezone/moment-timezone-utils", "months")
  @js.native
  def months(format: String, index: Double): String = js.native
  @JSImport("moment-timezone/moment-timezone-utils", "months")
  @js.native
  def months(index: Double): String = js.native
  
  @JSImport("moment-timezone/moment-timezone-utils", "monthsShort")
  @js.native
  def monthsShort(): js.Array[String] = js.native
  @JSImport("moment-timezone/moment-timezone-utils", "monthsShort")
  @js.native
  def monthsShort(format: String): js.Array[String] = js.native
  @JSImport("moment-timezone/moment-timezone-utils", "monthsShort")
  @js.native
  def monthsShort(format: String, index: Double): String = js.native
  @JSImport("moment-timezone/moment-timezone-utils", "monthsShort")
  @js.native
  def monthsShort(index: Double): String = js.native
  
  @JSImport("moment-timezone/moment-timezone-utils", "normalizeUnits")
  @js.native
  def normalizeUnits(unit: All): String = js.native
  
  @JSImport("moment-timezone/moment-timezone-utils", "now")
  @js.native
  def now(): Double = js.native
  
  @JSImport("moment-timezone/moment-timezone-utils", "parseTwoDigitYear")
  @js.native
  def parseTwoDigitYear(input: String): Double = js.native
  
  @JSImport("moment-timezone/moment-timezone-utils", "parseZone")
  @js.native
  def parseZone(): Moment = js.native
  @JSImport("moment-timezone/moment-timezone-utils", "parseZone")
  @js.native
  def parseZone(
    inp: js.UndefOr[MomentInput],
    format: js.UndefOr[MomentFormatSpecification],
    language: js.UndefOr[scala.Nothing],
    strict: Boolean
  ): Moment = js.native
  @JSImport("moment-timezone/moment-timezone-utils", "parseZone")
  @js.native
  def parseZone(inp: js.UndefOr[MomentInput], format: js.UndefOr[MomentFormatSpecification], language: String): Moment = js.native
  @JSImport("moment-timezone/moment-timezone-utils", "parseZone")
  @js.native
  def parseZone(
    inp: js.UndefOr[MomentInput],
    format: js.UndefOr[MomentFormatSpecification],
    language: String,
    strict: Boolean
  ): Moment = js.native
  @JSImport("moment-timezone/moment-timezone-utils", "parseZone")
  @js.native
  def parseZone(inp: js.UndefOr[MomentInput], format: js.UndefOr[MomentFormatSpecification], strict: Boolean): Moment = js.native
  @JSImport("moment-timezone/moment-timezone-utils", "parseZone")
  @js.native
  def parseZone(inp: js.UndefOr[MomentInput], format: MomentFormatSpecification): Moment = js.native
  @JSImport("moment-timezone/moment-timezone-utils", "parseZone")
  @js.native
  def parseZone(inp: MomentInput): Moment = js.native
  
  @JSImport("moment-timezone/moment-timezone-utils", "relativeTimeRounding")
  @js.native
  def relativeTimeRounding(): js.Function1[/* num */ Double, Double] = js.native
  @JSImport("moment-timezone/moment-timezone-utils", "relativeTimeRounding")
  @js.native
  def relativeTimeRounding(fn: js.Function1[/* num */ Double, Double]): Boolean = js.native
  
  @JSImport("moment-timezone/moment-timezone-utils", "relativeTimeThreshold")
  @js.native
  def relativeTimeThreshold(threshold: String): Double | Boolean = js.native
  @JSImport("moment-timezone/moment-timezone-utils", "relativeTimeThreshold")
  @js.native
  def relativeTimeThreshold(threshold: String, limit: Double): Boolean = js.native
  
  @JSImport("moment-timezone/moment-timezone-utils", "suppressDeprecationWarnings")
  @js.native
  def suppressDeprecationWarnings: Boolean = js.native
  @scala.inline
  def suppressDeprecationWarnings_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("suppressDeprecationWarnings")(x.asInstanceOf[js.Any])
  
  @JSImport("moment-timezone/moment-timezone-utils", "unix")
  @js.native
  def unix(timestamp: Double): Moment = js.native
  
  @JSImport("moment-timezone/moment-timezone-utils", "updateLocale")
  @js.native
  def updateLocale(language: String, localeSpec: Unit): Locale_ = js.native
  @JSImport("moment-timezone/moment-timezone-utils", "updateLocale")
  @js.native
  def updateLocale(language: String, localeSpec: LocaleSpecification): Locale_ = js.native
  
  @JSImport("moment-timezone/moment-timezone-utils", "utc")
  @js.native
  def utc(): Moment = js.native
  @JSImport("moment-timezone/moment-timezone-utils", "utc")
  @js.native
  def utc(
    inp: js.UndefOr[MomentInput],
    format: js.UndefOr[MomentFormatSpecification],
    language: js.UndefOr[scala.Nothing],
    strict: Boolean
  ): Moment = js.native
  @JSImport("moment-timezone/moment-timezone-utils", "utc")
  @js.native
  def utc(inp: js.UndefOr[MomentInput], format: js.UndefOr[MomentFormatSpecification], language: String): Moment = js.native
  @JSImport("moment-timezone/moment-timezone-utils", "utc")
  @js.native
  def utc(
    inp: js.UndefOr[MomentInput],
    format: js.UndefOr[MomentFormatSpecification],
    language: String,
    strict: Boolean
  ): Moment = js.native
  @JSImport("moment-timezone/moment-timezone-utils", "utc")
  @js.native
  def utc(inp: js.UndefOr[MomentInput], format: js.UndefOr[MomentFormatSpecification], strict: Boolean): Moment = js.native
  @JSImport("moment-timezone/moment-timezone-utils", "utc")
  @js.native
  def utc(inp: js.UndefOr[MomentInput], format: MomentFormatSpecification): Moment = js.native
  @JSImport("moment-timezone/moment-timezone-utils", "utc")
  @js.native
  def utc(inp: js.UndefOr[MomentInput], strict: Boolean): Moment = js.native
  @JSImport("moment-timezone/moment-timezone-utils", "utc")
  @js.native
  def utc(inp: MomentInput): Moment = js.native
  
  @JSImport("moment-timezone/moment-timezone-utils", "version")
  @js.native
  def version: String = js.native
  @scala.inline
  def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  
  @JSImport("moment-timezone/moment-timezone-utils", "weekdays")
  @js.native
  def weekdays(): js.Array[String] = js.native
  @JSImport("moment-timezone/moment-timezone-utils", "weekdays")
  @js.native
  def weekdays(format: String): js.Array[String] = js.native
  @JSImport("moment-timezone/moment-timezone-utils", "weekdays")
  @js.native
  def weekdays(format: String, index: Double): String = js.native
  @JSImport("moment-timezone/moment-timezone-utils", "weekdays")
  @js.native
  def weekdays(index: Double): String = js.native
  @JSImport("moment-timezone/moment-timezone-utils", "weekdays")
  @js.native
  def weekdays(localeSorted: Boolean): js.Array[String] = js.native
  @JSImport("moment-timezone/moment-timezone-utils", "weekdays")
  @js.native
  def weekdays(localeSorted: Boolean, format: String): js.Array[String] = js.native
  @JSImport("moment-timezone/moment-timezone-utils", "weekdays")
  @js.native
  def weekdays(localeSorted: Boolean, format: String, index: Double): String = js.native
  @JSImport("moment-timezone/moment-timezone-utils", "weekdays")
  @js.native
  def weekdays(localeSorted: Boolean, index: Double): String = js.native
  
  @JSImport("moment-timezone/moment-timezone-utils", "weekdaysMin")
  @js.native
  def weekdaysMin(): js.Array[String] = js.native
  @JSImport("moment-timezone/moment-timezone-utils", "weekdaysMin")
  @js.native
  def weekdaysMin(format: String): js.Array[String] = js.native
  @JSImport("moment-timezone/moment-timezone-utils", "weekdaysMin")
  @js.native
  def weekdaysMin(format: String, index: Double): String = js.native
  @JSImport("moment-timezone/moment-timezone-utils", "weekdaysMin")
  @js.native
  def weekdaysMin(index: Double): String = js.native
  @JSImport("moment-timezone/moment-timezone-utils", "weekdaysMin")
  @js.native
  def weekdaysMin(localeSorted: Boolean): js.Array[String] = js.native
  @JSImport("moment-timezone/moment-timezone-utils", "weekdaysMin")
  @js.native
  def weekdaysMin(localeSorted: Boolean, format: String): js.Array[String] = js.native
  @JSImport("moment-timezone/moment-timezone-utils", "weekdaysMin")
  @js.native
  def weekdaysMin(localeSorted: Boolean, format: String, index: Double): String = js.native
  @JSImport("moment-timezone/moment-timezone-utils", "weekdaysMin")
  @js.native
  def weekdaysMin(localeSorted: Boolean, index: Double): String = js.native
  
  @JSImport("moment-timezone/moment-timezone-utils", "weekdaysShort")
  @js.native
  def weekdaysShort(): js.Array[String] = js.native
  @JSImport("moment-timezone/moment-timezone-utils", "weekdaysShort")
  @js.native
  def weekdaysShort(format: String): js.Array[String] = js.native
  @JSImport("moment-timezone/moment-timezone-utils", "weekdaysShort")
  @js.native
  def weekdaysShort(format: String, index: Double): String = js.native
  @JSImport("moment-timezone/moment-timezone-utils", "weekdaysShort")
  @js.native
  def weekdaysShort(index: Double): String = js.native
  @JSImport("moment-timezone/moment-timezone-utils", "weekdaysShort")
  @js.native
  def weekdaysShort(localeSorted: Boolean): js.Array[String] = js.native
  @JSImport("moment-timezone/moment-timezone-utils", "weekdaysShort")
  @js.native
  def weekdaysShort(localeSorted: Boolean, format: String): js.Array[String] = js.native
  @JSImport("moment-timezone/moment-timezone-utils", "weekdaysShort")
  @js.native
  def weekdaysShort(localeSorted: Boolean, format: String, index: Double): String = js.native
  @JSImport("moment-timezone/moment-timezone-utils", "weekdaysShort")
  @js.native
  def weekdaysShort(localeSorted: Boolean, index: Double): String = js.native
  
  /* augmented module */
  object momentAugmentingMod {
    
    /** extends MomentTimezone declared in index */
    @js.native
    trait MomentTimezone extends StObject {
      
      /** Create links out of two zones that share data.
        * @returns A new ZoneBundle with duplicate zone data replaced by links
        */
      def createLinks(unlinked: UnpackedZoneBundle): PackedZoneBundle = js.native
      
      /**
        * Combines packing, link creation, and subsetting of years into one simple interface.
        * Pass in an unpacked bundle, start year, and end year and get a filtered, linked, packed bundle back.
        */
      def filterLinkPack(unpackedBundle: UnpackedZoneBundle, startAndEndYear: Double): PackedZoneBundle = js.native
      /**
        * Combines packing, link creation, and subsetting of years into one simple interface.
        * Pass in an unpacked bundle, start year, and end year and get a filtered, linked, packed bundle back.
        */
      def filterLinkPack(unpackedBundle: UnpackedZoneBundle, startYear: Double, endYear: Double): PackedZoneBundle = js.native
      
      /**
        * Filter out data for years outside a certain range.
        * @return a new, filtered UnPackedZone object
        */
      def filterYears(unpackedZone: UnpackedZone, startAndEndYear: Double): UnpackedZone = js.native
      /**
        * Filter out data for years outside a certain range.
        * @return a new, filtered UnPackedZone object
        */
      def filterYears(unpackedZone: UnpackedZone, startYear: Double, endYear: Double): UnpackedZone = js.native
      
      /** Converts zone data in the unpacked format to the packed format. */
      def pack(unpackedObject: UnpackedZone): String = js.native
      
      /** Convert a base 10 number to a base 60 string. */
      def packBase60(input: Double): String = js.native
      def packBase60(input: Double, precision: Double): String = js.native
    }
    
    /** Bundle of zone data and links for multiple timezones */
    @js.native
    trait PackedZoneBundle extends StObject {
      
      var links: js.Array[String] = js.native
      
      var version: String = js.native
      
      var zones: js.Array[String] = js.native
    }
    object PackedZoneBundle {
      
      @scala.inline
      def apply(links: js.Array[String], version: String, zones: js.Array[String]): PackedZoneBundle = {
        val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], zones = zones.asInstanceOf[js.Any])
        __obj.asInstanceOf[PackedZoneBundle]
      }
      
      @scala.inline
      implicit class PackedZoneBundleMutableBuilder[Self <: PackedZoneBundle] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setLinks(value: js.Array[String]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLinksVarargs(value: String*): Self = StObject.set(x, "links", js.Array(value :_*))
        
        @scala.inline
        def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setZones(value: js.Array[String]): Self = StObject.set(x, "zones", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setZonesVarargs(value: String*): Self = StObject.set(x, "zones", js.Array(value :_*))
      }
    }
    
    /** Parsed / unpacked zone data. */
    @js.native
    trait UnpackedZone extends StObject {
      
      /** zone abbreviations */
      var abbrs: js.Array[String] = js.native
      
      /** The uniquely identifying name of the time zone. */
      var name: String = js.native
      
      /** (measured in minutes) */
      var offsets: js.Array[Double] = js.native
      
      /** (measured in milliseconds) */
      var untils: js.Array[Double | Null] = js.native
    }
    object UnpackedZone {
      
      @scala.inline
      def apply(abbrs: js.Array[String], name: String, offsets: js.Array[Double], untils: js.Array[Double | Null]): UnpackedZone = {
        val __obj = js.Dynamic.literal(abbrs = abbrs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], offsets = offsets.asInstanceOf[js.Any], untils = untils.asInstanceOf[js.Any])
        __obj.asInstanceOf[UnpackedZone]
      }
      
      @scala.inline
      implicit class UnpackedZoneMutableBuilder[Self <: UnpackedZone] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAbbrs(value: js.Array[String]): Self = StObject.set(x, "abbrs", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAbbrsVarargs(value: String*): Self = StObject.set(x, "abbrs", js.Array(value :_*))
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOffsets(value: js.Array[Double]): Self = StObject.set(x, "offsets", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOffsetsVarargs(value: Double*): Self = StObject.set(x, "offsets", js.Array(value :_*))
        
        @scala.inline
        def setUntils(value: js.Array[Double | Null]): Self = StObject.set(x, "untils", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUntilsVarargs(value: (Double | Null)*): Self = StObject.set(x, "untils", js.Array(value :_*))
      }
    }
    
    /** Bundle of zone data and links for multiple timezones */
    @js.native
    trait UnpackedZoneBundle extends StObject {
      
      var links: js.Array[String] = js.native
      
      var version: String = js.native
      
      var zones: js.Array[UnpackedZone] = js.native
    }
    object UnpackedZoneBundle {
      
      @scala.inline
      def apply(links: js.Array[String], version: String, zones: js.Array[UnpackedZone]): UnpackedZoneBundle = {
        val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], zones = zones.asInstanceOf[js.Any])
        __obj.asInstanceOf[UnpackedZoneBundle]
      }
      
      @scala.inline
      implicit class UnpackedZoneBundleMutableBuilder[Self <: UnpackedZoneBundle] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setLinks(value: js.Array[String]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLinksVarargs(value: String*): Self = StObject.set(x, "links", js.Array(value :_*))
        
        @scala.inline
        def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setZones(value: js.Array[UnpackedZone]): Self = StObject.set(x, "zones", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setZonesVarargs(value: UnpackedZone*): Self = StObject.set(x, "zones", js.Array(value :_*))
      }
    }
  }
}
