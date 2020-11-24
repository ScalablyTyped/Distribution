package typings.openui5.sap.ui.core

import typings.openui5.sap.ui.base.Object
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("sap.ui.core.format")
@js.native
object format extends js.Object {
  
  @js.native
  trait DateFormat extends js.Object {
    
    /**
      * Format a date according to the given format options.
      * @param oDate the value to format
      * @param bUTC whether to use UTC
      * @returns the formatted output value. If an invalid date is given, an empty string is returned.
      */
    def format(oDate: Date, bUTC: Boolean): String = js.native
    
    /**
      * Get a date instance of the DateFormat, which can be used for formatting.
      * @param oFormatOptions Object which defines the format options
      * @param oLocale Locale to ask for locale specific texts/settings
      * @returns date instance of the DateFormat
      */
    def getDateInstance(oFormatOptions: js.Any): DateFormat = js.native
    def getDateInstance(oFormatOptions: js.Any, oLocale: Locale): DateFormat = js.native
    
    /**
      * Get a datetime instance of the DateFormat, which can be used for formatting.
      * @param oFormatOptions Object which defines the format options
      * @param oLocale Locale to ask for locale specific texts/settings
      * @returns datetime instance of the DateFormat
      */
    def getDateTimeInstance(oFormatOptions: js.Any): DateFormat = js.native
    def getDateTimeInstance(oFormatOptions: js.Any, oLocale: Locale): DateFormat = js.native
    
    /**
      * Get a time instance of the DateFormat, which can be used for formatting.
      * @param oFormatOptions Object which defines the format options
      * @param oLocale Locale to ask for locale specific texts/settings
      * @returns time instance of the DateFormat
      */
    def getTimeInstance(oFormatOptions: js.Any): DateFormat = js.native
    def getTimeInstance(oFormatOptions: js.Any, oLocale: Locale): DateFormat = js.native
    
    /**
      * Parse a string which is formatted according to the given format options.
      * @param sValue the string containing a formatted date/time value
      * @param bUTC whether to use UTC, if no timezone is contained
      * @param bStrict to use strict value check
      * @returns the parsed value
      */
    def parse(sValue: String, bUTC: Boolean, bStrict: Boolean): Date = js.native
  }
  
  @js.native
  trait FileSizeFormat extends Object {
    
    def format(oValue: String): String = js.native
    /**
      * Format a filesize (in bytes) according to the given format options.
      * @param oValue the number (or hex string) to format
      * @returns the formatted output value
      */
    def format(oValue: Double): String = js.native
    
    /**
      * Get an instance of the FileSizeFormat, which can be used for formatting.If no locale is given, the
      * currently configured{@link sap.ui.core.Configuration.FormatSettings#getFormatLocale formatLocale}
      * will be used.
      * @param oFormatOptions Object which defines the format options
      * @param oLocale Locale to get the formatter for
      * @returns instance of the FileSizeFormat
      */
    def getInstance(oFormatOptions: js.Any): FileSizeFormat = js.native
    def getInstance(oFormatOptions: js.Any, oLocale: Locale): FileSizeFormat = js.native
    
    /**
      * Parse a string which is formatted according to the given format options.
      * @param sValue the string containing a formatted filesize value
      * @returns the parsed value in bytes
      */
    def parse(sValue: String): Double = js.native
  }
  
  @js.native
  trait NumberFormat extends Object {
    
    def format(oValue: js.Array[_]): String = js.native
    def format(oValue: js.Array[_], sMeasure: String): String = js.native
    /**
      * Format a number according to the given format options.
      * @param oValue the number to format or an array which contains the number to format and the sMeasure
      * parameter
      * @param sMeasure a measure which has an impact on the formatting
      * @returns the formatted output value
      */
    def format(oValue: Double): String = js.native
    def format(oValue: Double, sMeasure: String): String = js.native
    
    /**
      * Get a currency instance of the NumberFormat, which can be used for formatting.If no locale is given,
      * the currently configured{@link sap.ui.core.Configuration.FormatSettings#getFormatLocale
      * formatLocale} will be used.<p>This instance has HALF_AWAY_FROM_ZERO set as default rounding
      * mode.Please set the roundingMode property in oFormatOptions to change thedefault value.</p>
      * @param oFormatOptions Object which defines the format options
      * @param oLocale Locale to get the formatter for
      * @returns integer instance of the NumberFormat
      */
    def getCurrencyInstance(oFormatOptions: js.Any): NumberFormat = js.native
    def getCurrencyInstance(oFormatOptions: js.Any, oLocale: Locale): NumberFormat = js.native
    
    /**
      * Get a float instance of the NumberFormat, which can be used for formatting.If no locale is given,
      * the currently configured{@link sap.ui.core.Configuration.FormatSettings#getFormatLocale
      * formatLocale} will be used.<p>This instance has HALF_AWAY_FROM_ZERO set as default rounding
      * mode.Please set the roundingMode property in oFormatOptions to change thedefault value.</p>
      * @param oFormatOptions Object which defines the format options
      * @param oLocale Locale to get the formatter for
      * @returns float instance of the NumberFormat
      */
    def getFloatInstance(oFormatOptions: js.Any): NumberFormat = js.native
    def getFloatInstance(oFormatOptions: js.Any, oLocale: Locale): NumberFormat = js.native
    
    /**
      * Get an integer instance of the NumberFormat, which can be used for formatting.If no locale is given,
      * the currently configured{@link sap.ui.core.Configuration.FormatSettings#getFormatLocale
      * formatLocale} will be used.<p>This instance has TOWARDS_ZERO set as default rounding mode.Please set
      * the roundingMode property in oFormatOptions to change thedefault value.</p>
      * @param oFormatOptions Object which defines the format options
      * @param oLocale Locale to get the formatter for
      * @returns integer instance of the NumberFormat
      */
    def getIntegerInstance(oFormatOptions: js.Any): NumberFormat = js.native
    def getIntegerInstance(oFormatOptions: js.Any, oLocale: Locale): NumberFormat = js.native
    
    /**
      * Get a percent instance of the NumberFormat, which can be used for formatting.If no locale is given,
      * the currently configured{@link sap.ui.core.Configuration.FormatSettings#getFormatLocale
      * formatLocale} will be used.<p>This instance has HALF_AWAY_FROM_ZERO set as default rounding
      * mode.Please set the roundingMode property in oFormatOptions to change thedefault value.</p>
      * @param oFormatOptions Object which defines the format options
      * @param oLocale Locale to get the formatter for
      * @returns integer instance of the NumberFormat
      */
    def getPercentInstance(oFormatOptions: js.Any): NumberFormat = js.native
    def getPercentInstance(oFormatOptions: js.Any, oLocale: Locale): NumberFormat = js.native
    
    /**
      * Parse a string which is formatted according to the given format options.
      * @param sValue the string containing a formatted numeric value
      * @returns the parsed value or an array which contains the parsed value and the currency code (symbol)
      * when the NumberFormat is a currency instance
      */
    def parse(sValue: String): Double | js.Array[_] = js.native
  }
  @js.native
  object NumberFormat extends js.Object {
    
    @js.native
    sealed trait RoundingMode extends js.Object
    /**
      * Specifies a rounding behavior for numerical operations capable of discarding precision. Each
      * rounding mode in this object indicates how the leastsignificant returned digits of rounded result is
      * to be calculated.
      */
    @js.native
    object RoundingMode extends js.Object {
      
      @js.native
      sealed trait AWAY_FROM_ZERO extends RoundingMode
      
      @js.native
      sealed trait CEILING extends RoundingMode
      
      @js.native
      sealed trait FLOOR extends RoundingMode
      
      @js.native
      sealed trait HALF_AWAY_FROM_ZERO extends RoundingMode
      
      @js.native
      sealed trait HALF_CEILING extends RoundingMode
      
      @js.native
      sealed trait HALF_FLOOR extends RoundingMode
      
      @js.native
      sealed trait HALF_TOWARDS_ZERO extends RoundingMode
      
      @js.native
      sealed trait TOWARDS_ZERO extends RoundingMode
    }
  }
}
