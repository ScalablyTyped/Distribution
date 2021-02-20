package typings.powerappsComponentFramework.ComponentFramework

import typings.powerappsComponentFramework.ComponentFramework.UserSettingApi.Types.DayOfWeek
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Helper of UserSettings API interface
  */
object UserSettingApi {
  
  /**
    * The interface for the Calendar exposed in DateFormattingInfo
    */
  @js.native
  trait Calendar extends StObject {
    
    /**
      * @example 1
      */
    var algorithmType: Double = js.native
    
    /**
      * @example 1
      */
    var calendarType: Double = js.native
    
    /**
      * @example "/Date(253402300799999)/"
      */
    var maxSupportedDateTime: Date = js.native
    
    /**
      * @example "/Date(-62135568000000)/"
      */
    var minSupportedDateTime: Date = js.native
    
    /**
      * @example  2029
      */
    var twoDigitYearMax: Double = js.native
  }
  object Calendar {
    
    @scala.inline
    def apply(
      algorithmType: Double,
      calendarType: Double,
      maxSupportedDateTime: Date,
      minSupportedDateTime: Date,
      twoDigitYearMax: Double
    ): Calendar = {
      val __obj = js.Dynamic.literal(algorithmType = algorithmType.asInstanceOf[js.Any], calendarType = calendarType.asInstanceOf[js.Any], maxSupportedDateTime = maxSupportedDateTime.asInstanceOf[js.Any], minSupportedDateTime = minSupportedDateTime.asInstanceOf[js.Any], twoDigitYearMax = twoDigitYearMax.asInstanceOf[js.Any])
      __obj.asInstanceOf[Calendar]
    }
    
    @scala.inline
    implicit class CalendarMutableBuilder[Self <: Calendar] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlgorithmType(value: Double): Self = StObject.set(x, "algorithmType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCalendarType(value: Double): Self = StObject.set(x, "calendarType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxSupportedDateTime(value: Date): Self = StObject.set(x, "maxSupportedDateTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinSupportedDateTime(value: Date): Self = StObject.set(x, "minSupportedDateTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTwoDigitYearMax(value: Double): Self = StObject.set(x, "twoDigitYearMax", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * The interface for Org Date Format Info exposed to a custom control
    * Result pattern is based on culture,examples are for 'USA' area
    */
  @js.native
  trait DateFormattingInfo extends StObject {
    
    /**
      * @example { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" }
      */
    var abbreviatedDayNames: js.Array[String] = js.native
    
    /**
      * @example { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec", "" }
      */
    var abbreviatedMonthGenitiveNames: js.Array[String] = js.native
    
    /**
      * @example { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec", "" }
      */
    var abbreviatedMonthNames: js.Array[String] = js.native
    
    /**
      * @example "AM"
      */
    var amDesignator: String = js.native
    
    /**
      * @example See interface Calendar
      */
    var calendar: Calendar = js.native
    
    /**
      * @example 0
      */
    var calendarWeekRule: Double = js.native
    
    /**
      * @example "/"
      */
    var dateSeparator: String = js.native
    
    /**
      * @example { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" }
      */
    var dayNames: js.Array[String] = js.native
    
    /**
      * @example See interface DayOfWeek
      */
    var firstDayOfWeek: DayOfWeek = js.native
    
    /**
      * @example "dddd, MMMM d, yyyy h:mm:ss tt"
      */
    var fullDateTimePattern: String = js.native
    
    /**
      * @example "dddd, MMMM d, yyyy"
      */
    var longDatePattern: String = js.native
    
    /**
      * @example "hh:mm:ss tt"
      */
    var longTimePattern: String = js.native
    
    /**
      * @example "MMMM dd"
      */
    var monthDayPattern: String = js.native
    
    /**
      * @example { "January", "February", "March", ...  "December", "" }
      */
    var monthGenitiveNames: js.Array[String] = js.native
    
    /**
      * @example { "January", "February", "March", ...  "December", "" }
      */
    var monthNames: js.Array[String] = js.native
    
    /**
      * @example "PM"
      */
    var pmDesignator: String = js.native
    
    /**
      * @example "M/d/yyyy"
      */
    var shortDatePattern: String = js.native
    
    /**
      * @example "h:mm tt"
      */
    var shortTimePattern: String = js.native
    
    /**
      * @example { "Su", "Mo", "Tu", "We", "Th", "Fr", "Sa" }
      */
    var shortestDayNames: js.Array[String] = js.native
    
    /**
      * @example "yyyy'-'MM'-'dd'T'HH':'mm':'ss"
      */
    var sortableDateTimePattern: String = js.native
    
    /**
      * @example ":"
      */
    var timeSeparator: String = js.native
    
    /**
      * @example "yyyy'-'MM'-'dd HH':'mm':'ss'Z'"
      */
    var universalSortableDateTimePattern: String = js.native
    
    /**
      * @example "MMMM yyyy"
      */
    var yearMonthPattern: String = js.native
  }
  object DateFormattingInfo {
    
    @scala.inline
    def apply(
      abbreviatedDayNames: js.Array[String],
      abbreviatedMonthGenitiveNames: js.Array[String],
      abbreviatedMonthNames: js.Array[String],
      amDesignator: String,
      calendar: Calendar,
      calendarWeekRule: Double,
      dateSeparator: String,
      dayNames: js.Array[String],
      firstDayOfWeek: DayOfWeek,
      fullDateTimePattern: String,
      longDatePattern: String,
      longTimePattern: String,
      monthDayPattern: String,
      monthGenitiveNames: js.Array[String],
      monthNames: js.Array[String],
      pmDesignator: String,
      shortDatePattern: String,
      shortTimePattern: String,
      shortestDayNames: js.Array[String],
      sortableDateTimePattern: String,
      timeSeparator: String,
      universalSortableDateTimePattern: String,
      yearMonthPattern: String
    ): DateFormattingInfo = {
      val __obj = js.Dynamic.literal(abbreviatedDayNames = abbreviatedDayNames.asInstanceOf[js.Any], abbreviatedMonthGenitiveNames = abbreviatedMonthGenitiveNames.asInstanceOf[js.Any], abbreviatedMonthNames = abbreviatedMonthNames.asInstanceOf[js.Any], amDesignator = amDesignator.asInstanceOf[js.Any], calendar = calendar.asInstanceOf[js.Any], calendarWeekRule = calendarWeekRule.asInstanceOf[js.Any], dateSeparator = dateSeparator.asInstanceOf[js.Any], dayNames = dayNames.asInstanceOf[js.Any], firstDayOfWeek = firstDayOfWeek.asInstanceOf[js.Any], fullDateTimePattern = fullDateTimePattern.asInstanceOf[js.Any], longDatePattern = longDatePattern.asInstanceOf[js.Any], longTimePattern = longTimePattern.asInstanceOf[js.Any], monthDayPattern = monthDayPattern.asInstanceOf[js.Any], monthGenitiveNames = monthGenitiveNames.asInstanceOf[js.Any], monthNames = monthNames.asInstanceOf[js.Any], pmDesignator = pmDesignator.asInstanceOf[js.Any], shortDatePattern = shortDatePattern.asInstanceOf[js.Any], shortTimePattern = shortTimePattern.asInstanceOf[js.Any], shortestDayNames = shortestDayNames.asInstanceOf[js.Any], sortableDateTimePattern = sortableDateTimePattern.asInstanceOf[js.Any], timeSeparator = timeSeparator.asInstanceOf[js.Any], universalSortableDateTimePattern = universalSortableDateTimePattern.asInstanceOf[js.Any], yearMonthPattern = yearMonthPattern.asInstanceOf[js.Any])
      __obj.asInstanceOf[DateFormattingInfo]
    }
    
    @scala.inline
    implicit class DateFormattingInfoMutableBuilder[Self <: DateFormattingInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbbreviatedDayNames(value: js.Array[String]): Self = StObject.set(x, "abbreviatedDayNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAbbreviatedDayNamesVarargs(value: String*): Self = StObject.set(x, "abbreviatedDayNames", js.Array(value :_*))
      
      @scala.inline
      def setAbbreviatedMonthGenitiveNames(value: js.Array[String]): Self = StObject.set(x, "abbreviatedMonthGenitiveNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAbbreviatedMonthGenitiveNamesVarargs(value: String*): Self = StObject.set(x, "abbreviatedMonthGenitiveNames", js.Array(value :_*))
      
      @scala.inline
      def setAbbreviatedMonthNames(value: js.Array[String]): Self = StObject.set(x, "abbreviatedMonthNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAbbreviatedMonthNamesVarargs(value: String*): Self = StObject.set(x, "abbreviatedMonthNames", js.Array(value :_*))
      
      @scala.inline
      def setAmDesignator(value: String): Self = StObject.set(x, "amDesignator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCalendar(value: Calendar): Self = StObject.set(x, "calendar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCalendarWeekRule(value: Double): Self = StObject.set(x, "calendarWeekRule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateSeparator(value: String): Self = StObject.set(x, "dateSeparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDayNames(value: js.Array[String]): Self = StObject.set(x, "dayNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDayNamesVarargs(value: String*): Self = StObject.set(x, "dayNames", js.Array(value :_*))
      
      @scala.inline
      def setFirstDayOfWeek(value: DayOfWeek): Self = StObject.set(x, "firstDayOfWeek", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullDateTimePattern(value: String): Self = StObject.set(x, "fullDateTimePattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLongDatePattern(value: String): Self = StObject.set(x, "longDatePattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLongTimePattern(value: String): Self = StObject.set(x, "longTimePattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthDayPattern(value: String): Self = StObject.set(x, "monthDayPattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthGenitiveNames(value: js.Array[String]): Self = StObject.set(x, "monthGenitiveNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthGenitiveNamesVarargs(value: String*): Self = StObject.set(x, "monthGenitiveNames", js.Array(value :_*))
      
      @scala.inline
      def setMonthNames(value: js.Array[String]): Self = StObject.set(x, "monthNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthNamesVarargs(value: String*): Self = StObject.set(x, "monthNames", js.Array(value :_*))
      
      @scala.inline
      def setPmDesignator(value: String): Self = StObject.set(x, "pmDesignator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShortDatePattern(value: String): Self = StObject.set(x, "shortDatePattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShortTimePattern(value: String): Self = StObject.set(x, "shortTimePattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShortestDayNames(value: js.Array[String]): Self = StObject.set(x, "shortestDayNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShortestDayNamesVarargs(value: String*): Self = StObject.set(x, "shortestDayNames", js.Array(value :_*))
      
      @scala.inline
      def setSortableDateTimePattern(value: String): Self = StObject.set(x, "sortableDateTimePattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeSeparator(value: String): Self = StObject.set(x, "timeSeparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUniversalSortableDateTimePattern(value: String): Self = StObject.set(x, "universalSortableDateTimePattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYearMonthPattern(value: String): Self = StObject.set(x, "yearMonthPattern", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * The interface for the Org System Settings Number Format Info exposed to a custom control
    * Comments indicate example values
    */
  @js.native
  trait NumberFormattingInfo extends StObject {
    
    /**
      * @example 2
      */
    var currencyDecimalDigits: Double = js.native
    
    /**
      * @example "."
      */
    var currencyDecimalSeparator: String = js.native
    
    /**
      * @example ","
      */
    var currencyGroupSeparator: String = js.native
    
    /**
      * @example [ 3 ]
      */
    var currencyGroupSizes: js.Array[Double] = js.native
    
    /**
      * @example 0
      */
    var currencyNegativePattern: Double = js.native
    
    /**
      * @example 0
      */
    var currencyPositivePattern: Double = js.native
    
    /**
      * @example "$"
      */
    var currencySymbol: String = js.native
    
    /**
      * @example "NaN"
      */
    var nanSymbol: String = js.native
    
    /**
      * @example { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"}
      */
    var nativeDigits: js.Array[String] = js.native
    
    /**
      * @example "-Infinity"
      */
    var negativeInfinitySymbol: String = js.native
    
    /**
      * @example "-"
      */
    var negativeSign: String = js.native
    
    /**
      * @example 2
      */
    var numberDecimalDigits: Double = js.native
    
    /**
      * @example "."
      */
    var numberDecimalSeparator: String = js.native
    
    /**
      * @example ","
      */
    var numberGroupSeparator: String = js.native
    
    /**
      * @example [3]
      */
    var numberGroupSizes: js.Array[Double] = js.native
    
    /**
      * @example 1
      */
    var numberNegativePattern: Double = js.native
    
    /**
      * @example ""
      */
    var perMilleSymbol: String = js.native
    
    /**
      * @example 2
      */
    var percentDecimalDigits: Double = js.native
    
    /**
      * @example "."
      */
    var percentDecimalSeparator: String = js.native
    
    /**
      * @example ","
      */
    var percentGroupSeparator: String = js.native
    
    /**
      * @example [3]
      */
    var percentGroupSizes: js.Array[Double] = js.native
    
    /**
      * @example 0
      */
    var percentNegativePattern: Double = js.native
    
    /**
      * @example 0
      */
    var percentPositivePattern: Double = js.native
    
    /**
      * @example "%"
      */
    var percentSymbol: String = js.native
    
    /**
      * @example "Infinity"
      */
    var positiveInfinitySymbol: String = js.native
    
    /**
      * @example "+"
      */
    var positiveSign: String = js.native
  }
  object NumberFormattingInfo {
    
    @scala.inline
    def apply(
      currencyDecimalDigits: Double,
      currencyDecimalSeparator: String,
      currencyGroupSeparator: String,
      currencyGroupSizes: js.Array[Double],
      currencyNegativePattern: Double,
      currencyPositivePattern: Double,
      currencySymbol: String,
      nanSymbol: String,
      nativeDigits: js.Array[String],
      negativeInfinitySymbol: String,
      negativeSign: String,
      numberDecimalDigits: Double,
      numberDecimalSeparator: String,
      numberGroupSeparator: String,
      numberGroupSizes: js.Array[Double],
      numberNegativePattern: Double,
      perMilleSymbol: String,
      percentDecimalDigits: Double,
      percentDecimalSeparator: String,
      percentGroupSeparator: String,
      percentGroupSizes: js.Array[Double],
      percentNegativePattern: Double,
      percentPositivePattern: Double,
      percentSymbol: String,
      positiveInfinitySymbol: String,
      positiveSign: String
    ): NumberFormattingInfo = {
      val __obj = js.Dynamic.literal(currencyDecimalDigits = currencyDecimalDigits.asInstanceOf[js.Any], currencyDecimalSeparator = currencyDecimalSeparator.asInstanceOf[js.Any], currencyGroupSeparator = currencyGroupSeparator.asInstanceOf[js.Any], currencyGroupSizes = currencyGroupSizes.asInstanceOf[js.Any], currencyNegativePattern = currencyNegativePattern.asInstanceOf[js.Any], currencyPositivePattern = currencyPositivePattern.asInstanceOf[js.Any], currencySymbol = currencySymbol.asInstanceOf[js.Any], nanSymbol = nanSymbol.asInstanceOf[js.Any], nativeDigits = nativeDigits.asInstanceOf[js.Any], negativeInfinitySymbol = negativeInfinitySymbol.asInstanceOf[js.Any], negativeSign = negativeSign.asInstanceOf[js.Any], numberDecimalDigits = numberDecimalDigits.asInstanceOf[js.Any], numberDecimalSeparator = numberDecimalSeparator.asInstanceOf[js.Any], numberGroupSeparator = numberGroupSeparator.asInstanceOf[js.Any], numberGroupSizes = numberGroupSizes.asInstanceOf[js.Any], numberNegativePattern = numberNegativePattern.asInstanceOf[js.Any], perMilleSymbol = perMilleSymbol.asInstanceOf[js.Any], percentDecimalDigits = percentDecimalDigits.asInstanceOf[js.Any], percentDecimalSeparator = percentDecimalSeparator.asInstanceOf[js.Any], percentGroupSeparator = percentGroupSeparator.asInstanceOf[js.Any], percentGroupSizes = percentGroupSizes.asInstanceOf[js.Any], percentNegativePattern = percentNegativePattern.asInstanceOf[js.Any], percentPositivePattern = percentPositivePattern.asInstanceOf[js.Any], percentSymbol = percentSymbol.asInstanceOf[js.Any], positiveInfinitySymbol = positiveInfinitySymbol.asInstanceOf[js.Any], positiveSign = positiveSign.asInstanceOf[js.Any])
      __obj.asInstanceOf[NumberFormattingInfo]
    }
    
    @scala.inline
    implicit class NumberFormattingInfoMutableBuilder[Self <: NumberFormattingInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrencyDecimalDigits(value: Double): Self = StObject.set(x, "currencyDecimalDigits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrencyDecimalSeparator(value: String): Self = StObject.set(x, "currencyDecimalSeparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrencyGroupSeparator(value: String): Self = StObject.set(x, "currencyGroupSeparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrencyGroupSizes(value: js.Array[Double]): Self = StObject.set(x, "currencyGroupSizes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrencyGroupSizesVarargs(value: Double*): Self = StObject.set(x, "currencyGroupSizes", js.Array(value :_*))
      
      @scala.inline
      def setCurrencyNegativePattern(value: Double): Self = StObject.set(x, "currencyNegativePattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrencyPositivePattern(value: Double): Self = StObject.set(x, "currencyPositivePattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrencySymbol(value: String): Self = StObject.set(x, "currencySymbol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNanSymbol(value: String): Self = StObject.set(x, "nanSymbol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNativeDigits(value: js.Array[String]): Self = StObject.set(x, "nativeDigits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNativeDigitsVarargs(value: String*): Self = StObject.set(x, "nativeDigits", js.Array(value :_*))
      
      @scala.inline
      def setNegativeInfinitySymbol(value: String): Self = StObject.set(x, "negativeInfinitySymbol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNegativeSign(value: String): Self = StObject.set(x, "negativeSign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberDecimalDigits(value: Double): Self = StObject.set(x, "numberDecimalDigits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberDecimalSeparator(value: String): Self = StObject.set(x, "numberDecimalSeparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberGroupSeparator(value: String): Self = StObject.set(x, "numberGroupSeparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberGroupSizes(value: js.Array[Double]): Self = StObject.set(x, "numberGroupSizes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberGroupSizesVarargs(value: Double*): Self = StObject.set(x, "numberGroupSizes", js.Array(value :_*))
      
      @scala.inline
      def setNumberNegativePattern(value: Double): Self = StObject.set(x, "numberNegativePattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPerMilleSymbol(value: String): Self = StObject.set(x, "perMilleSymbol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPercentDecimalDigits(value: Double): Self = StObject.set(x, "percentDecimalDigits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPercentDecimalSeparator(value: String): Self = StObject.set(x, "percentDecimalSeparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPercentGroupSeparator(value: String): Self = StObject.set(x, "percentGroupSeparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPercentGroupSizes(value: js.Array[Double]): Self = StObject.set(x, "percentGroupSizes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPercentGroupSizesVarargs(value: Double*): Self = StObject.set(x, "percentGroupSizes", js.Array(value :_*))
      
      @scala.inline
      def setPercentNegativePattern(value: Double): Self = StObject.set(x, "percentNegativePattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPercentPositivePattern(value: Double): Self = StObject.set(x, "percentPositivePattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPercentSymbol(value: String): Self = StObject.set(x, "percentSymbol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositiveInfinitySymbol(value: String): Self = StObject.set(x, "positiveInfinitySymbol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositiveSign(value: String): Self = StObject.set(x, "positiveSign", value.asInstanceOf[js.Any])
    }
  }
  
  object Types {
    
    /**
      * Day Of Week Enum
      * 0 - Sunday,
      * 1 - Monday,
      * 2 - Tuesday,
      * 3 - Wednesday,
      * 4 - Thursday,
      * 5 - Friday,
      * 6 - Saturday
      */
    /* Rewritten from type alias, can be one of: 
      - typings.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`0`
      - typings.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`1`
      - typings.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`2`
      - typings.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`3`
      - typings.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`4`
      - typings.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`5`
      - typings.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`6`
    */
    trait DayOfWeek extends StObject
    object DayOfWeek {
      
      @scala.inline
      def `0`: typings.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`0` = 0.asInstanceOf[typings.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`0`]
      
      @scala.inline
      def `1`: typings.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`1` = 1.asInstanceOf[typings.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`1`]
      
      @scala.inline
      def `2`: typings.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`2` = 2.asInstanceOf[typings.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`2`]
      
      @scala.inline
      def `3`: typings.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`3` = 3.asInstanceOf[typings.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`3`]
      
      @scala.inline
      def `4`: typings.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`4` = 4.asInstanceOf[typings.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`4`]
      
      @scala.inline
      def `5`: typings.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`5` = 5.asInstanceOf[typings.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`5`]
      
      @scala.inline
      def `6`: typings.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`6` = 6.asInstanceOf[typings.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`6`]
    }
  }
}
