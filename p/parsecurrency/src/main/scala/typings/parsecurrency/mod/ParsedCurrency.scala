package typings.parsecurrency.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParsedCurrency extends js.Object {
  
  var currency: String = js.native
  
  var decimalSeparator: String = js.native
  
  var decimals: String = js.native
  
  var groupSeparator: String = js.native
  
  var integer: String = js.native
  
  var raw: String = js.native
  
  var symbol: String = js.native
  
  var value: Double = js.native
}
object ParsedCurrency {
  
  @scala.inline
  def apply(
    currency: String,
    decimalSeparator: String,
    decimals: String,
    groupSeparator: String,
    integer: String,
    raw: String,
    symbol: String,
    value: Double
  ): ParsedCurrency = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], decimalSeparator = decimalSeparator.asInstanceOf[js.Any], decimals = decimals.asInstanceOf[js.Any], groupSeparator = groupSeparator.asInstanceOf[js.Any], integer = integer.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedCurrency]
  }
  
  @scala.inline
  implicit class ParsedCurrencyOps[Self <: ParsedCurrency] (val x: Self) extends AnyVal {
    
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
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecimalSeparator(value: String): Self = this.set("decimalSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecimals(value: String): Self = this.set("decimals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupSeparator(value: String): Self = this.set("groupSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInteger(value: String): Self = this.set("integer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRaw(value: String): Self = this.set("raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbol(value: String): Self = this.set("symbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
