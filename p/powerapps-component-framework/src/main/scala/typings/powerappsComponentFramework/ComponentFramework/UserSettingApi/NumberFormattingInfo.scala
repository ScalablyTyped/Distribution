package typings.powerappsComponentFramework.ComponentFramework.UserSettingApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The interface for the Org System Settings Number Format Info exposed to a custom control
  * Comments indicate example values
  */
@js.native
trait NumberFormattingInfo extends js.Object {
  
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
  implicit class NumberFormattingInfoOps[Self <: NumberFormattingInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCurrencyDecimalDigits(value: Double): Self = this.set("currencyDecimalDigits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyDecimalSeparator(value: String): Self = this.set("currencyDecimalSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyGroupSeparator(value: String): Self = this.set("currencyGroupSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyGroupSizesVarargs(value: Double*): Self = this.set("currencyGroupSizes", js.Array(value :_*))
    
    @scala.inline
    def setCurrencyGroupSizes(value: js.Array[Double]): Self = this.set("currencyGroupSizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyNegativePattern(value: Double): Self = this.set("currencyNegativePattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyPositivePattern(value: Double): Self = this.set("currencyPositivePattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencySymbol(value: String): Self = this.set("currencySymbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNanSymbol(value: String): Self = this.set("nanSymbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNativeDigitsVarargs(value: String*): Self = this.set("nativeDigits", js.Array(value :_*))
    
    @scala.inline
    def setNativeDigits(value: js.Array[String]): Self = this.set("nativeDigits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNegativeInfinitySymbol(value: String): Self = this.set("negativeInfinitySymbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNegativeSign(value: String): Self = this.set("negativeSign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberDecimalDigits(value: Double): Self = this.set("numberDecimalDigits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberDecimalSeparator(value: String): Self = this.set("numberDecimalSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberGroupSeparator(value: String): Self = this.set("numberGroupSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberGroupSizesVarargs(value: Double*): Self = this.set("numberGroupSizes", js.Array(value :_*))
    
    @scala.inline
    def setNumberGroupSizes(value: js.Array[Double]): Self = this.set("numberGroupSizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberNegativePattern(value: Double): Self = this.set("numberNegativePattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerMilleSymbol(value: String): Self = this.set("perMilleSymbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercentDecimalDigits(value: Double): Self = this.set("percentDecimalDigits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercentDecimalSeparator(value: String): Self = this.set("percentDecimalSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercentGroupSeparator(value: String): Self = this.set("percentGroupSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercentGroupSizesVarargs(value: Double*): Self = this.set("percentGroupSizes", js.Array(value :_*))
    
    @scala.inline
    def setPercentGroupSizes(value: js.Array[Double]): Self = this.set("percentGroupSizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercentNegativePattern(value: Double): Self = this.set("percentNegativePattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercentPositivePattern(value: Double): Self = this.set("percentPositivePattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercentSymbol(value: String): Self = this.set("percentSymbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositiveInfinitySymbol(value: String): Self = this.set("positiveInfinitySymbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositiveSign(value: String): Self = this.set("positiveSign", value.asInstanceOf[js.Any])
  }
}
