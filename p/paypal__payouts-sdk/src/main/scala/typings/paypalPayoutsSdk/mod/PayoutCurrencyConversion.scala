package typings.paypalPayoutsSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PayoutCurrencyConversion extends js.Object {
  
  var exchange_rate: js.UndefOr[String] = js.native
  
  var from_amount: js.UndefOr[Currency] = js.native
  
  var to_amount: js.UndefOr[Currency] = js.native
}
object PayoutCurrencyConversion {
  
  @scala.inline
  def apply(): PayoutCurrencyConversion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PayoutCurrencyConversion]
  }
  
  @scala.inline
  implicit class PayoutCurrencyConversionOps[Self <: PayoutCurrencyConversion] (val x: Self) extends AnyVal {
    
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
    def setExchange_rate(value: String): Self = this.set("exchange_rate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExchange_rate: Self = this.set("exchange_rate", js.undefined)
    
    @scala.inline
    def setFrom_amount(value: Currency): Self = this.set("from_amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrom_amount: Self = this.set("from_amount", js.undefined)
    
    @scala.inline
    def setTo_amount(value: Currency): Self = this.set("to_amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTo_amount: Self = this.set("to_amount", js.undefined)
  }
}
