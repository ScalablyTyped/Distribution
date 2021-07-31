package typings.miniprogramWxs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/////////////////////////////
/// ECMAScript Internationalization API
/////////////////////////////
object Intl {
  
  trait Collator extends StObject {
    
    def compare(x: java.lang.String, y: java.lang.String): Double
    
    def resolvedOptions(): ResolvedCollatorOptions
  }
  object Collator {
    
    @scala.inline
    def apply(
      compare: (java.lang.String, java.lang.String) => Double,
      resolvedOptions: () => ResolvedCollatorOptions
    ): Collator = {
      val __obj = js.Dynamic.literal(compare = js.Any.fromFunction2(compare), resolvedOptions = js.Any.fromFunction0(resolvedOptions))
      __obj.asInstanceOf[Collator]
    }
    
    @scala.inline
    implicit class CollatorMutableBuilder[Self <: Collator] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompare(value: (java.lang.String, java.lang.String) => Double): Self = StObject.set(x, "compare", js.Any.fromFunction2(value))
      
      @scala.inline
      def setResolvedOptions(value: () => ResolvedCollatorOptions): Self = StObject.set(x, "resolvedOptions", js.Any.fromFunction0(value))
    }
  }
  
  trait CollatorOptions extends StObject {
    
    var caseFirst: js.UndefOr[java.lang.String] = js.undefined
    
    var ignorePunctuation: js.UndefOr[scala.Boolean] = js.undefined
    
    var localeMatcher: js.UndefOr[java.lang.String] = js.undefined
    
    var numeric: js.UndefOr[scala.Boolean] = js.undefined
    
    var sensitivity: js.UndefOr[java.lang.String] = js.undefined
    
    var usage: js.UndefOr[java.lang.String] = js.undefined
  }
  object CollatorOptions {
    
    @scala.inline
    def apply(): CollatorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CollatorOptions]
    }
    
    @scala.inline
    implicit class CollatorOptionsMutableBuilder[Self <: CollatorOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCaseFirst(value: java.lang.String): Self = StObject.set(x, "caseFirst", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaseFirstUndefined: Self = StObject.set(x, "caseFirst", js.undefined)
      
      @scala.inline
      def setIgnorePunctuation(value: scala.Boolean): Self = StObject.set(x, "ignorePunctuation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnorePunctuationUndefined: Self = StObject.set(x, "ignorePunctuation", js.undefined)
      
      @scala.inline
      def setLocaleMatcher(value: java.lang.String): Self = StObject.set(x, "localeMatcher", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleMatcherUndefined: Self = StObject.set(x, "localeMatcher", js.undefined)
      
      @scala.inline
      def setNumeric(value: scala.Boolean): Self = StObject.set(x, "numeric", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumericUndefined: Self = StObject.set(x, "numeric", js.undefined)
      
      @scala.inline
      def setSensitivity(value: java.lang.String): Self = StObject.set(x, "sensitivity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSensitivityUndefined: Self = StObject.set(x, "sensitivity", js.undefined)
      
      @scala.inline
      def setUsage(value: java.lang.String): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsageUndefined: Self = StObject.set(x, "usage", js.undefined)
    }
  }
  
  @js.native
  trait DateTimeFormat extends StObject {
    
    def format(): java.lang.String = js.native
    def format(date: Double): java.lang.String = js.native
    def format(date: Date): java.lang.String = js.native
    
    def resolvedOptions(): ResolvedDateTimeFormatOptions = js.native
  }
  
  trait DateTimeFormatOptions extends StObject {
    
    var day: js.UndefOr[java.lang.String] = js.undefined
    
    var era: js.UndefOr[java.lang.String] = js.undefined
    
    var formatMatcher: js.UndefOr[java.lang.String] = js.undefined
    
    var hour: js.UndefOr[java.lang.String] = js.undefined
    
    var hour12: js.UndefOr[scala.Boolean] = js.undefined
    
    var localeMatcher: js.UndefOr[java.lang.String] = js.undefined
    
    var minute: js.UndefOr[java.lang.String] = js.undefined
    
    var month: js.UndefOr[java.lang.String] = js.undefined
    
    var second: js.UndefOr[java.lang.String] = js.undefined
    
    var timeZone: js.UndefOr[java.lang.String] = js.undefined
    
    var timeZoneName: js.UndefOr[java.lang.String] = js.undefined
    
    var weekday: js.UndefOr[java.lang.String] = js.undefined
    
    var year: js.UndefOr[java.lang.String] = js.undefined
  }
  object DateTimeFormatOptions {
    
    @scala.inline
    def apply(): DateTimeFormatOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DateTimeFormatOptions]
    }
    
    @scala.inline
    implicit class DateTimeFormatOptionsMutableBuilder[Self <: DateTimeFormatOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDay(value: java.lang.String): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
      
      @scala.inline
      def setEra(value: java.lang.String): Self = StObject.set(x, "era", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEraUndefined: Self = StObject.set(x, "era", js.undefined)
      
      @scala.inline
      def setFormatMatcher(value: java.lang.String): Self = StObject.set(x, "formatMatcher", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatMatcherUndefined: Self = StObject.set(x, "formatMatcher", js.undefined)
      
      @scala.inline
      def setHour(value: java.lang.String): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHour12(value: scala.Boolean): Self = StObject.set(x, "hour12", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHour12Undefined: Self = StObject.set(x, "hour12", js.undefined)
      
      @scala.inline
      def setHourUndefined: Self = StObject.set(x, "hour", js.undefined)
      
      @scala.inline
      def setLocaleMatcher(value: java.lang.String): Self = StObject.set(x, "localeMatcher", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleMatcherUndefined: Self = StObject.set(x, "localeMatcher", js.undefined)
      
      @scala.inline
      def setMinute(value: java.lang.String): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinuteUndefined: Self = StObject.set(x, "minute", js.undefined)
      
      @scala.inline
      def setMonth(value: java.lang.String): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
      
      @scala.inline
      def setSecond(value: java.lang.String): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondUndefined: Self = StObject.set(x, "second", js.undefined)
      
      @scala.inline
      def setTimeZone(value: java.lang.String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeZoneName(value: java.lang.String): Self = StObject.set(x, "timeZoneName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeZoneNameUndefined: Self = StObject.set(x, "timeZoneName", js.undefined)
      
      @scala.inline
      def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
      
      @scala.inline
      def setWeekday(value: java.lang.String): Self = StObject.set(x, "weekday", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeekdayUndefined: Self = StObject.set(x, "weekday", js.undefined)
      
      @scala.inline
      def setYear(value: java.lang.String): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
    }
  }
  
  trait NumberFormat extends StObject {
    
    def format(value: Double): java.lang.String
    
    def resolvedOptions(): ResolvedNumberFormatOptions
  }
  object NumberFormat {
    
    @scala.inline
    def apply(format: Double => java.lang.String, resolvedOptions: () => ResolvedNumberFormatOptions): NumberFormat = {
      val __obj = js.Dynamic.literal(format = js.Any.fromFunction1(format), resolvedOptions = js.Any.fromFunction0(resolvedOptions))
      __obj.asInstanceOf[NumberFormat]
    }
    
    @scala.inline
    implicit class NumberFormatMutableBuilder[Self <: NumberFormat] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormat(value: Double => java.lang.String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
      
      @scala.inline
      def setResolvedOptions(value: () => ResolvedNumberFormatOptions): Self = StObject.set(x, "resolvedOptions", js.Any.fromFunction0(value))
    }
  }
  
  trait NumberFormatOptions extends StObject {
    
    var currency: js.UndefOr[java.lang.String] = js.undefined
    
    var currencyDisplay: js.UndefOr[java.lang.String] = js.undefined
    
    var localeMatcher: js.UndefOr[java.lang.String] = js.undefined
    
    var maximumFractionDigits: js.UndefOr[Double] = js.undefined
    
    var maximumSignificantDigits: js.UndefOr[Double] = js.undefined
    
    var minimumFractionDigits: js.UndefOr[Double] = js.undefined
    
    var minimumIntegerDigits: js.UndefOr[Double] = js.undefined
    
    var minimumSignificantDigits: js.UndefOr[Double] = js.undefined
    
    var style: js.UndefOr[java.lang.String] = js.undefined
    
    var useGrouping: js.UndefOr[scala.Boolean] = js.undefined
  }
  object NumberFormatOptions {
    
    @scala.inline
    def apply(): NumberFormatOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NumberFormatOptions]
    }
    
    @scala.inline
    implicit class NumberFormatOptionsMutableBuilder[Self <: NumberFormatOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrency(value: java.lang.String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrencyDisplay(value: java.lang.String): Self = StObject.set(x, "currencyDisplay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrencyDisplayUndefined: Self = StObject.set(x, "currencyDisplay", js.undefined)
      
      @scala.inline
      def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
      
      @scala.inline
      def setLocaleMatcher(value: java.lang.String): Self = StObject.set(x, "localeMatcher", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleMatcherUndefined: Self = StObject.set(x, "localeMatcher", js.undefined)
      
      @scala.inline
      def setMaximumFractionDigits(value: Double): Self = StObject.set(x, "maximumFractionDigits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumFractionDigitsUndefined: Self = StObject.set(x, "maximumFractionDigits", js.undefined)
      
      @scala.inline
      def setMaximumSignificantDigits(value: Double): Self = StObject.set(x, "maximumSignificantDigits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumSignificantDigitsUndefined: Self = StObject.set(x, "maximumSignificantDigits", js.undefined)
      
      @scala.inline
      def setMinimumFractionDigits(value: Double): Self = StObject.set(x, "minimumFractionDigits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimumFractionDigitsUndefined: Self = StObject.set(x, "minimumFractionDigits", js.undefined)
      
      @scala.inline
      def setMinimumIntegerDigits(value: Double): Self = StObject.set(x, "minimumIntegerDigits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimumIntegerDigitsUndefined: Self = StObject.set(x, "minimumIntegerDigits", js.undefined)
      
      @scala.inline
      def setMinimumSignificantDigits(value: Double): Self = StObject.set(x, "minimumSignificantDigits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimumSignificantDigitsUndefined: Self = StObject.set(x, "minimumSignificantDigits", js.undefined)
      
      @scala.inline
      def setStyle(value: java.lang.String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setUseGrouping(value: scala.Boolean): Self = StObject.set(x, "useGrouping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseGroupingUndefined: Self = StObject.set(x, "useGrouping", js.undefined)
    }
  }
  
  trait ResolvedCollatorOptions extends StObject {
    
    var caseFirst: java.lang.String
    
    var collation: java.lang.String
    
    var ignorePunctuation: scala.Boolean
    
    var locale: java.lang.String
    
    var numeric: scala.Boolean
    
    var sensitivity: java.lang.String
    
    var usage: java.lang.String
  }
  object ResolvedCollatorOptions {
    
    @scala.inline
    def apply(
      caseFirst: java.lang.String,
      collation: java.lang.String,
      ignorePunctuation: scala.Boolean,
      locale: java.lang.String,
      numeric: scala.Boolean,
      sensitivity: java.lang.String,
      usage: java.lang.String
    ): ResolvedCollatorOptions = {
      val __obj = js.Dynamic.literal(caseFirst = caseFirst.asInstanceOf[js.Any], collation = collation.asInstanceOf[js.Any], ignorePunctuation = ignorePunctuation.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], numeric = numeric.asInstanceOf[js.Any], sensitivity = sensitivity.asInstanceOf[js.Any], usage = usage.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolvedCollatorOptions]
    }
    
    @scala.inline
    implicit class ResolvedCollatorOptionsMutableBuilder[Self <: ResolvedCollatorOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCaseFirst(value: java.lang.String): Self = StObject.set(x, "caseFirst", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollation(value: java.lang.String): Self = StObject.set(x, "collation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnorePunctuation(value: scala.Boolean): Self = StObject.set(x, "ignorePunctuation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocale(value: java.lang.String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumeric(value: scala.Boolean): Self = StObject.set(x, "numeric", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSensitivity(value: java.lang.String): Self = StObject.set(x, "sensitivity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsage(value: java.lang.String): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResolvedDateTimeFormatOptions extends StObject {
    
    var calendar: java.lang.String
    
    var day: js.UndefOr[java.lang.String] = js.undefined
    
    var era: js.UndefOr[java.lang.String] = js.undefined
    
    var hour: js.UndefOr[java.lang.String] = js.undefined
    
    var hour12: js.UndefOr[scala.Boolean] = js.undefined
    
    var locale: java.lang.String
    
    var minute: js.UndefOr[java.lang.String] = js.undefined
    
    var month: js.UndefOr[java.lang.String] = js.undefined
    
    var numberingSystem: java.lang.String
    
    var second: js.UndefOr[java.lang.String] = js.undefined
    
    var timeZone: java.lang.String
    
    var timeZoneName: js.UndefOr[java.lang.String] = js.undefined
    
    var weekday: js.UndefOr[java.lang.String] = js.undefined
    
    var year: js.UndefOr[java.lang.String] = js.undefined
  }
  object ResolvedDateTimeFormatOptions {
    
    @scala.inline
    def apply(
      calendar: java.lang.String,
      locale: java.lang.String,
      numberingSystem: java.lang.String,
      timeZone: java.lang.String
    ): ResolvedDateTimeFormatOptions = {
      val __obj = js.Dynamic.literal(calendar = calendar.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], numberingSystem = numberingSystem.asInstanceOf[js.Any], timeZone = timeZone.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolvedDateTimeFormatOptions]
    }
    
    @scala.inline
    implicit class ResolvedDateTimeFormatOptionsMutableBuilder[Self <: ResolvedDateTimeFormatOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCalendar(value: java.lang.String): Self = StObject.set(x, "calendar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDay(value: java.lang.String): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
      
      @scala.inline
      def setEra(value: java.lang.String): Self = StObject.set(x, "era", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEraUndefined: Self = StObject.set(x, "era", js.undefined)
      
      @scala.inline
      def setHour(value: java.lang.String): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHour12(value: scala.Boolean): Self = StObject.set(x, "hour12", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHour12Undefined: Self = StObject.set(x, "hour12", js.undefined)
      
      @scala.inline
      def setHourUndefined: Self = StObject.set(x, "hour", js.undefined)
      
      @scala.inline
      def setLocale(value: java.lang.String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinute(value: java.lang.String): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinuteUndefined: Self = StObject.set(x, "minute", js.undefined)
      
      @scala.inline
      def setMonth(value: java.lang.String): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
      
      @scala.inline
      def setNumberingSystem(value: java.lang.String): Self = StObject.set(x, "numberingSystem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecond(value: java.lang.String): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondUndefined: Self = StObject.set(x, "second", js.undefined)
      
      @scala.inline
      def setTimeZone(value: java.lang.String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeZoneName(value: java.lang.String): Self = StObject.set(x, "timeZoneName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeZoneNameUndefined: Self = StObject.set(x, "timeZoneName", js.undefined)
      
      @scala.inline
      def setWeekday(value: java.lang.String): Self = StObject.set(x, "weekday", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeekdayUndefined: Self = StObject.set(x, "weekday", js.undefined)
      
      @scala.inline
      def setYear(value: java.lang.String): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
    }
  }
  
  trait ResolvedNumberFormatOptions extends StObject {
    
    var currency: js.UndefOr[java.lang.String] = js.undefined
    
    var currencyDisplay: js.UndefOr[java.lang.String] = js.undefined
    
    var locale: java.lang.String
    
    var maximumFractionDigits: Double
    
    var maximumSignificantDigits: js.UndefOr[Double] = js.undefined
    
    var minimumFractionDigits: Double
    
    var minimumIntegerDigits: Double
    
    var minimumSignificantDigits: js.UndefOr[Double] = js.undefined
    
    var numberingSystem: java.lang.String
    
    var style: java.lang.String
    
    var useGrouping: scala.Boolean
  }
  object ResolvedNumberFormatOptions {
    
    @scala.inline
    def apply(
      locale: java.lang.String,
      maximumFractionDigits: Double,
      minimumFractionDigits: Double,
      minimumIntegerDigits: Double,
      numberingSystem: java.lang.String,
      style: java.lang.String,
      useGrouping: scala.Boolean
    ): ResolvedNumberFormatOptions = {
      val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], maximumFractionDigits = maximumFractionDigits.asInstanceOf[js.Any], minimumFractionDigits = minimumFractionDigits.asInstanceOf[js.Any], minimumIntegerDigits = minimumIntegerDigits.asInstanceOf[js.Any], numberingSystem = numberingSystem.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], useGrouping = useGrouping.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolvedNumberFormatOptions]
    }
    
    @scala.inline
    implicit class ResolvedNumberFormatOptionsMutableBuilder[Self <: ResolvedNumberFormatOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrency(value: java.lang.String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrencyDisplay(value: java.lang.String): Self = StObject.set(x, "currencyDisplay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrencyDisplayUndefined: Self = StObject.set(x, "currencyDisplay", js.undefined)
      
      @scala.inline
      def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
      
      @scala.inline
      def setLocale(value: java.lang.String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumFractionDigits(value: Double): Self = StObject.set(x, "maximumFractionDigits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumSignificantDigits(value: Double): Self = StObject.set(x, "maximumSignificantDigits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumSignificantDigitsUndefined: Self = StObject.set(x, "maximumSignificantDigits", js.undefined)
      
      @scala.inline
      def setMinimumFractionDigits(value: Double): Self = StObject.set(x, "minimumFractionDigits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimumIntegerDigits(value: Double): Self = StObject.set(x, "minimumIntegerDigits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimumSignificantDigits(value: Double): Self = StObject.set(x, "minimumSignificantDigits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimumSignificantDigitsUndefined: Self = StObject.set(x, "minimumSignificantDigits", js.undefined)
      
      @scala.inline
      def setNumberingSystem(value: java.lang.String): Self = StObject.set(x, "numberingSystem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyle(value: java.lang.String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseGrouping(value: scala.Boolean): Self = StObject.set(x, "useGrouping", value.asInstanceOf[js.Any])
    }
  }
}
