package typings
package powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.UserSettingApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * The interface for the Org System Settings Number Format Info exposed to a custom control
		 * Comments indicate example values
		 */
trait NumberFormattingInfo extends js.Object {
  /**
  			 * @example 2
  			 */
  var currencyDecimalDigits: scala.Double
  /**
  			 * @example "."
  			 */
  var currencyDecimalSeparator: java.lang.String
  /**
  			 * @example ","
  			 */
  var currencyGroupSeparator: java.lang.String
  /**
  			 * @example [ 3 ]
  			 */
  var currencyGroupSizes: js.Array[scala.Double]
  /**
  			 * @example 0
  			 */
  var currencyNegativePattern: scala.Double
  /**
  			 * @example 0
  			 */
  var currencyPositivePattern: scala.Double
  /**
  			 * @example "$"
  			 */
  var currencySymbol: java.lang.String
  /**
  			 * @example "NaN"
  			 */
  var nanSymbol: java.lang.String
  /**
  			 * @example { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"}
  			 */
  var nativeDigits: js.Array[java.lang.String]
  /**
  			 * @example "-Infinity"
  			 */
  var negativeInfinitySymbol: java.lang.String
  /**
  			 * @example "-"
  			 */
  var negativeSign: java.lang.String
  /**
  			 * @example 2
  			 */
  var numberDecimalDigits: scala.Double
  /**
  			 * @example "."
  			 */
  var numberDecimalSeparator: java.lang.String
  /**
  			 * @example ","
  			 */
  var numberGroupSeparator: java.lang.String
  /**
  			 * @example [3]
  			 */
  var numberGroupSizes: js.Array[scala.Double]
  /**
  			 * @example 1
  			 */
  var numberNegativePattern: scala.Double
  /**
  			 * @example ""
  			 */
  var perMilleSymbol: java.lang.String
  /**
  			 * @example 2
  			 */
  var percentDecimalDigits: scala.Double
  /**
  			 * @example "."
  			 */
  var percentDecimalSeparator: java.lang.String
  /**
  			 * @example ","
  			 */
  var percentGroupSeparator: java.lang.String
  /**
  			 * @example [3]
  			 */
  var percentGroupSizes: js.Array[scala.Double]
  /**
  			 * @example 0
  			 */
  var percentNegativePattern: scala.Double
  /**
  			 * @example 0
  			 */
  var percentPositivePattern: scala.Double
  /**
  			 * @example "%"
  			 */
  var percentSymbol: java.lang.String
  /**
  			 * @example "Infinity"
  			 */
  var positiveInfinitySymbol: java.lang.String
  /**
  			 * @example "+"
  			 */
  var positiveSign: java.lang.String
}

object NumberFormattingInfo {
  @scala.inline
  def apply(
    currencyDecimalDigits: scala.Double,
    currencyDecimalSeparator: java.lang.String,
    currencyGroupSeparator: java.lang.String,
    currencyGroupSizes: js.Array[scala.Double],
    currencyNegativePattern: scala.Double,
    currencyPositivePattern: scala.Double,
    currencySymbol: java.lang.String,
    nanSymbol: java.lang.String,
    nativeDigits: js.Array[java.lang.String],
    negativeInfinitySymbol: java.lang.String,
    negativeSign: java.lang.String,
    numberDecimalDigits: scala.Double,
    numberDecimalSeparator: java.lang.String,
    numberGroupSeparator: java.lang.String,
    numberGroupSizes: js.Array[scala.Double],
    numberNegativePattern: scala.Double,
    perMilleSymbol: java.lang.String,
    percentDecimalDigits: scala.Double,
    percentDecimalSeparator: java.lang.String,
    percentGroupSeparator: java.lang.String,
    percentGroupSizes: js.Array[scala.Double],
    percentNegativePattern: scala.Double,
    percentPositivePattern: scala.Double,
    percentSymbol: java.lang.String,
    positiveInfinitySymbol: java.lang.String,
    positiveSign: java.lang.String
  ): NumberFormattingInfo = {
    val __obj = js.Dynamic.literal(currencyDecimalDigits = currencyDecimalDigits, currencyDecimalSeparator = currencyDecimalSeparator, currencyGroupSeparator = currencyGroupSeparator, currencyGroupSizes = currencyGroupSizes, currencyNegativePattern = currencyNegativePattern, currencyPositivePattern = currencyPositivePattern, currencySymbol = currencySymbol, nanSymbol = nanSymbol, nativeDigits = nativeDigits, negativeInfinitySymbol = negativeInfinitySymbol, negativeSign = negativeSign, numberDecimalDigits = numberDecimalDigits, numberDecimalSeparator = numberDecimalSeparator, numberGroupSeparator = numberGroupSeparator, numberGroupSizes = numberGroupSizes, numberNegativePattern = numberNegativePattern, perMilleSymbol = perMilleSymbol, percentDecimalDigits = percentDecimalDigits, percentDecimalSeparator = percentDecimalSeparator, percentGroupSeparator = percentGroupSeparator, percentGroupSizes = percentGroupSizes, percentNegativePattern = percentNegativePattern, percentPositivePattern = percentPositivePattern, percentSymbol = percentSymbol, positiveInfinitySymbol = positiveInfinitySymbol, positiveSign = positiveSign)
  
    __obj.asInstanceOf[NumberFormattingInfo]
  }
}

