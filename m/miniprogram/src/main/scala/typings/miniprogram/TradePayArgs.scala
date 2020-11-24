package typings.miniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TradePayArgs extends AsyncCallback[String] {
  
  var orderStr: js.UndefOr[String] = js.native
  
  var paymentUrl: js.UndefOr[String] = js.native
  
  var tradeNO: js.UndefOr[String] = js.native
}
object TradePayArgs {
  
  @scala.inline
  def apply(): TradePayArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TradePayArgs]
  }
  
  @scala.inline
  implicit class TradePayArgsOps[Self <: TradePayArgs] (val x: Self) extends AnyVal {
    
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
    def setOrderStr(value: String): Self = this.set("orderStr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrderStr: Self = this.set("orderStr", js.undefined)
    
    @scala.inline
    def setPaymentUrl(value: String): Self = this.set("paymentUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaymentUrl: Self = this.set("paymentUrl", js.undefined)
    
    @scala.inline
    def setTradeNO(value: String): Self = this.set("tradeNO", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTradeNO: Self = this.set("tradeNO", js.undefined)
  }
}
