package typings.openui5.sapNs.uiNs.coreNs.formatNs

import typings.openui5.sapNs.uiNs.baseNs.Object
import typings.openui5.sapNs.uiNs.coreNs.Locale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.core.format.NumberFormat")
@js.native
class NumberFormat protected () extends Object {
  /**
    * Constructor for NumberFormat - must not be used: To get a NumberFormat instance, please use
    * getInstance, getFloatInstance or getIntegerInstance.
    * @param oFormatOptions The option object which support the following parameters. If no options is
    * given, default values according to the type and locale settings are used.
    */
  def this(oFormatOptions: js.Any) = this()
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

