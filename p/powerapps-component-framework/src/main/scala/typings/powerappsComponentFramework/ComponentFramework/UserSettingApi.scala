package typings.powerappsComponentFramework.ComponentFramework

import typings.powerappsComponentFramework.ComponentFramework.UserSettingApi.Types.DayOfWeek
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Helper of UserSettings API interface
  */
object UserSettingApi {
  
  /**
    * The interface for the Calendar exposed in DateFormattingInfo
    */
  trait Calendar extends StObject {
    
    /**
      * @example 1
      */
    var algorithmType: Double
    
    /**
      * @example 1
      */
    var calendarType: Double
    
    /**
      * @example "/Date(253402300799999)/"
      */
    var maxSupportedDateTime: js.Date
    
    /**
      * @example "/Date(-62135568000000)/"
      */
    var minSupportedDateTime: js.Date
    
    /**
      * @example  2029
      */
    var twoDigitYearMax: Double
  }
  object Calendar {
    
    inline def apply(
      algorithmType: Double,
      calendarType: Double,
      maxSupportedDateTime: js.Date,
      minSupportedDateTime: js.Date,
      twoDigitYearMax: Double
    ): Calendar = {
      val __obj = js.Dynamic.literal(algorithmType = algorithmType.asInstanceOf[js.Any], calendarType = calendarType.asInstanceOf[js.Any], maxSupportedDateTime = maxSupportedDateTime.asInstanceOf[js.Any], minSupportedDateTime = minSupportedDateTime.asInstanceOf[js.Any], twoDigitYearMax = twoDigitYearMax.asInstanceOf[js.Any])
      __obj.asInstanceOf[Calendar]
    }
    
    extension [Self <: Calendar](x: Self) {
      
      inline def setAlgorithmType(value: Double): Self = StObject.set(x, "algorithmType", value.asInstanceOf[js.Any])
      
      inline def setCalendarType(value: Double): Self = StObject.set(x, "calendarType", value.asInstanceOf[js.Any])
      
      inline def setMaxSupportedDateTime(value: js.Date): Self = StObject.set(x, "maxSupportedDateTime", value.asInstanceOf[js.Any])
      
      inline def setMinSupportedDateTime(value: js.Date): Self = StObject.set(x, "minSupportedDateTime", value.asInstanceOf[js.Any])
      
      inline def setTwoDigitYearMax(value: Double): Self = StObject.set(x, "twoDigitYearMax", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * The interface for Org Date Format Info exposed to a custom control
    * Result pattern is based on culture,examples are for 'USA' area
    */
  trait DateFormattingInfo extends StObject {
    
    /**
      * @example { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" }
      */
    var abbreviatedDayNames: js.Array[String]
    
    /**
      * @example { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec", "" }
      */
    var abbreviatedMonthGenitiveNames: js.Array[String]
    
    /**
      * @example { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec", "" }
      */
    var abbreviatedMonthNames: js.Array[String]
    
    /**
      * @example "AM"
      */
    var amDesignator: String
    
    /**
      * @example See interface Calendar
      */
    var calendar: Calendar
    
    /**
      * @example 0
      */
    var calendarWeekRule: Double
    
    /**
      * @example "/"
      */
    var dateSeparator: String
    
    /**
      * @example { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" }
      */
    var dayNames: js.Array[String]
    
    /**
      * @example See interface DayOfWeek
      */
    var firstDayOfWeek: DayOfWeek
    
    /**
      * @example "dddd, MMMM d, yyyy h:mm:ss tt"
      */
    var fullDateTimePattern: String
    
    /**
      * @example "dddd, MMMM d, yyyy"
      */
    var longDatePattern: String
    
    /**
      * @example "hh:mm:ss tt"
      */
    var longTimePattern: String
    
    /**
      * @example "MMMM dd"
      */
    var monthDayPattern: String
    
    /**
      * @example { "January", "February", "March", ...  "December", "" }
      */
    var monthGenitiveNames: js.Array[String]
    
    /**
      * @example { "January", "February", "March", ...  "December", "" }
      */
    var monthNames: js.Array[String]
    
    /**
      * @example "PM"
      */
    var pmDesignator: String
    
    /**
      * @example "M/d/yyyy"
      */
    var shortDatePattern: String
    
    /**
      * @example "h:mm tt"
      */
    var shortTimePattern: String
    
    /**
      * @example { "Su", "Mo", "Tu", "We", "Th", "Fr", "Sa" }
      */
    var shortestDayNames: js.Array[String]
    
    /**
      * @example "yyyy'-'MM'-'dd'T'HH':'mm':'ss"
      */
    var sortableDateTimePattern: String
    
    /**
      * @example ":"
      */
    var timeSeparator: String
    
    /**
      * @example "yyyy'-'MM'-'dd HH':'mm':'ss'Z'"
      */
    var universalSortableDateTimePattern: String
    
    /**
      * @example "MMMM yyyy"
      */
    var yearMonthPattern: String
  }
  object DateFormattingInfo {
    
    inline def apply(
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
    
    extension [Self <: DateFormattingInfo](x: Self) {
      
      inline def setAbbreviatedDayNames(value: js.Array[String]): Self = StObject.set(x, "abbreviatedDayNames", value.asInstanceOf[js.Any])
      
      inline def setAbbreviatedDayNamesVarargs(value: String*): Self = StObject.set(x, "abbreviatedDayNames", js.Array(value*))
      
      inline def setAbbreviatedMonthGenitiveNames(value: js.Array[String]): Self = StObject.set(x, "abbreviatedMonthGenitiveNames", value.asInstanceOf[js.Any])
      
      inline def setAbbreviatedMonthGenitiveNamesVarargs(value: String*): Self = StObject.set(x, "abbreviatedMonthGenitiveNames", js.Array(value*))
      
      inline def setAbbreviatedMonthNames(value: js.Array[String]): Self = StObject.set(x, "abbreviatedMonthNames", value.asInstanceOf[js.Any])
      
      inline def setAbbreviatedMonthNamesVarargs(value: String*): Self = StObject.set(x, "abbreviatedMonthNames", js.Array(value*))
      
      inline def setAmDesignator(value: String): Self = StObject.set(x, "amDesignator", value.asInstanceOf[js.Any])
      
      inline def setCalendar(value: Calendar): Self = StObject.set(x, "calendar", value.asInstanceOf[js.Any])
      
      inline def setCalendarWeekRule(value: Double): Self = StObject.set(x, "calendarWeekRule", value.asInstanceOf[js.Any])
      
      inline def setDateSeparator(value: String): Self = StObject.set(x, "dateSeparator", value.asInstanceOf[js.Any])
      
      inline def setDayNames(value: js.Array[String]): Self = StObject.set(x, "dayNames", value.asInstanceOf[js.Any])
      
      inline def setDayNamesVarargs(value: String*): Self = StObject.set(x, "dayNames", js.Array(value*))
      
      inline def setFirstDayOfWeek(value: DayOfWeek): Self = StObject.set(x, "firstDayOfWeek", value.asInstanceOf[js.Any])
      
      inline def setFullDateTimePattern(value: String): Self = StObject.set(x, "fullDateTimePattern", value.asInstanceOf[js.Any])
      
      inline def setLongDatePattern(value: String): Self = StObject.set(x, "longDatePattern", value.asInstanceOf[js.Any])
      
      inline def setLongTimePattern(value: String): Self = StObject.set(x, "longTimePattern", value.asInstanceOf[js.Any])
      
      inline def setMonthDayPattern(value: String): Self = StObject.set(x, "monthDayPattern", value.asInstanceOf[js.Any])
      
      inline def setMonthGenitiveNames(value: js.Array[String]): Self = StObject.set(x, "monthGenitiveNames", value.asInstanceOf[js.Any])
      
      inline def setMonthGenitiveNamesVarargs(value: String*): Self = StObject.set(x, "monthGenitiveNames", js.Array(value*))
      
      inline def setMonthNames(value: js.Array[String]): Self = StObject.set(x, "monthNames", value.asInstanceOf[js.Any])
      
      inline def setMonthNamesVarargs(value: String*): Self = StObject.set(x, "monthNames", js.Array(value*))
      
      inline def setPmDesignator(value: String): Self = StObject.set(x, "pmDesignator", value.asInstanceOf[js.Any])
      
      inline def setShortDatePattern(value: String): Self = StObject.set(x, "shortDatePattern", value.asInstanceOf[js.Any])
      
      inline def setShortTimePattern(value: String): Self = StObject.set(x, "shortTimePattern", value.asInstanceOf[js.Any])
      
      inline def setShortestDayNames(value: js.Array[String]): Self = StObject.set(x, "shortestDayNames", value.asInstanceOf[js.Any])
      
      inline def setShortestDayNamesVarargs(value: String*): Self = StObject.set(x, "shortestDayNames", js.Array(value*))
      
      inline def setSortableDateTimePattern(value: String): Self = StObject.set(x, "sortableDateTimePattern", value.asInstanceOf[js.Any])
      
      inline def setTimeSeparator(value: String): Self = StObject.set(x, "timeSeparator", value.asInstanceOf[js.Any])
      
      inline def setUniversalSortableDateTimePattern(value: String): Self = StObject.set(x, "universalSortableDateTimePattern", value.asInstanceOf[js.Any])
      
      inline def setYearMonthPattern(value: String): Self = StObject.set(x, "yearMonthPattern", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * The interface for the Org System Settings Number Format Info exposed to a custom control
    * Comments indicate example values
    */
  trait NumberFormattingInfo extends StObject {
    
    /**
      * @example 2
      */
    var currencyDecimalDigits: Double
    
    /**
      * @example "."
      */
    var currencyDecimalSeparator: String
    
    /**
      * @example ","
      */
    var currencyGroupSeparator: String
    
    /**
      * @example [ 3 ]
      */
    var currencyGroupSizes: js.Array[Double]
    
    /**
      * @example 0
      */
    var currencyNegativePattern: Double
    
    /**
      * @example 0
      */
    var currencyPositivePattern: Double
    
    /**
      * @example "$"
      */
    var currencySymbol: String
    
    /**
      * @example "NaN"
      */
    var nanSymbol: String
    
    /**
      * @example { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"}
      */
    var nativeDigits: js.Array[String]
    
    /**
      * @example "-Infinity"
      */
    var negativeInfinitySymbol: String
    
    /**
      * @example "-"
      */
    var negativeSign: String
    
    /**
      * @example 2
      */
    var numberDecimalDigits: Double
    
    /**
      * @example "."
      */
    var numberDecimalSeparator: String
    
    /**
      * @example ","
      */
    var numberGroupSeparator: String
    
    /**
      * @example [3]
      */
    var numberGroupSizes: js.Array[Double]
    
    /**
      * @example 1
      */
    var numberNegativePattern: Double
    
    /**
      * @example ""
      */
    var perMilleSymbol: String
    
    /**
      * @example 2
      */
    var percentDecimalDigits: Double
    
    /**
      * @example "."
      */
    var percentDecimalSeparator: String
    
    /**
      * @example ","
      */
    var percentGroupSeparator: String
    
    /**
      * @example [3]
      */
    var percentGroupSizes: js.Array[Double]
    
    /**
      * @example 0
      */
    var percentNegativePattern: Double
    
    /**
      * @example 0
      */
    var percentPositivePattern: Double
    
    /**
      * @example "%"
      */
    var percentSymbol: String
    
    /**
      * @example "Infinity"
      */
    var positiveInfinitySymbol: String
    
    /**
      * @example "+"
      */
    var positiveSign: String
  }
  object NumberFormattingInfo {
    
    inline def apply(
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
    
    extension [Self <: NumberFormattingInfo](x: Self) {
      
      inline def setCurrencyDecimalDigits(value: Double): Self = StObject.set(x, "currencyDecimalDigits", value.asInstanceOf[js.Any])
      
      inline def setCurrencyDecimalSeparator(value: String): Self = StObject.set(x, "currencyDecimalSeparator", value.asInstanceOf[js.Any])
      
      inline def setCurrencyGroupSeparator(value: String): Self = StObject.set(x, "currencyGroupSeparator", value.asInstanceOf[js.Any])
      
      inline def setCurrencyGroupSizes(value: js.Array[Double]): Self = StObject.set(x, "currencyGroupSizes", value.asInstanceOf[js.Any])
      
      inline def setCurrencyGroupSizesVarargs(value: Double*): Self = StObject.set(x, "currencyGroupSizes", js.Array(value*))
      
      inline def setCurrencyNegativePattern(value: Double): Self = StObject.set(x, "currencyNegativePattern", value.asInstanceOf[js.Any])
      
      inline def setCurrencyPositivePattern(value: Double): Self = StObject.set(x, "currencyPositivePattern", value.asInstanceOf[js.Any])
      
      inline def setCurrencySymbol(value: String): Self = StObject.set(x, "currencySymbol", value.asInstanceOf[js.Any])
      
      inline def setNanSymbol(value: String): Self = StObject.set(x, "nanSymbol", value.asInstanceOf[js.Any])
      
      inline def setNativeDigits(value: js.Array[String]): Self = StObject.set(x, "nativeDigits", value.asInstanceOf[js.Any])
      
      inline def setNativeDigitsVarargs(value: String*): Self = StObject.set(x, "nativeDigits", js.Array(value*))
      
      inline def setNegativeInfinitySymbol(value: String): Self = StObject.set(x, "negativeInfinitySymbol", value.asInstanceOf[js.Any])
      
      inline def setNegativeSign(value: String): Self = StObject.set(x, "negativeSign", value.asInstanceOf[js.Any])
      
      inline def setNumberDecimalDigits(value: Double): Self = StObject.set(x, "numberDecimalDigits", value.asInstanceOf[js.Any])
      
      inline def setNumberDecimalSeparator(value: String): Self = StObject.set(x, "numberDecimalSeparator", value.asInstanceOf[js.Any])
      
      inline def setNumberGroupSeparator(value: String): Self = StObject.set(x, "numberGroupSeparator", value.asInstanceOf[js.Any])
      
      inline def setNumberGroupSizes(value: js.Array[Double]): Self = StObject.set(x, "numberGroupSizes", value.asInstanceOf[js.Any])
      
      inline def setNumberGroupSizesVarargs(value: Double*): Self = StObject.set(x, "numberGroupSizes", js.Array(value*))
      
      inline def setNumberNegativePattern(value: Double): Self = StObject.set(x, "numberNegativePattern", value.asInstanceOf[js.Any])
      
      inline def setPerMilleSymbol(value: String): Self = StObject.set(x, "perMilleSymbol", value.asInstanceOf[js.Any])
      
      inline def setPercentDecimalDigits(value: Double): Self = StObject.set(x, "percentDecimalDigits", value.asInstanceOf[js.Any])
      
      inline def setPercentDecimalSeparator(value: String): Self = StObject.set(x, "percentDecimalSeparator", value.asInstanceOf[js.Any])
      
      inline def setPercentGroupSeparator(value: String): Self = StObject.set(x, "percentGroupSeparator", value.asInstanceOf[js.Any])
      
      inline def setPercentGroupSizes(value: js.Array[Double]): Self = StObject.set(x, "percentGroupSizes", value.asInstanceOf[js.Any])
      
      inline def setPercentGroupSizesVarargs(value: Double*): Self = StObject.set(x, "percentGroupSizes", js.Array(value*))
      
      inline def setPercentNegativePattern(value: Double): Self = StObject.set(x, "percentNegativePattern", value.asInstanceOf[js.Any])
      
      inline def setPercentPositivePattern(value: Double): Self = StObject.set(x, "percentPositivePattern", value.asInstanceOf[js.Any])
      
      inline def setPercentSymbol(value: String): Self = StObject.set(x, "percentSymbol", value.asInstanceOf[js.Any])
      
      inline def setPositiveInfinitySymbol(value: String): Self = StObject.set(x, "positiveInfinitySymbol", value.asInstanceOf[js.Any])
      
      inline def setPositiveSign(value: String): Self = StObject.set(x, "positiveSign", value.asInstanceOf[js.Any])
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
      
      inline def `0`: typings.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`0` = 0.asInstanceOf[typings.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`0`]
      
      inline def `1`: typings.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`1` = 1.asInstanceOf[typings.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`1`]
      
      inline def `2`: typings.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`2` = 2.asInstanceOf[typings.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`2`]
      
      inline def `3`: typings.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`3` = 3.asInstanceOf[typings.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`3`]
      
      inline def `4`: typings.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`4` = 4.asInstanceOf[typings.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`4`]
      
      inline def `5`: typings.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`5` = 5.asInstanceOf[typings.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`5`]
      
      inline def `6`: typings.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`6` = 6.asInstanceOf[typings.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`6`]
    }
  }
}
