package typings.miniprogram

import org.scalablytyped.runtime.StObject
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
  implicit class TradePayArgsMutableBuilder[Self <: TradePayArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrderStr(value: String): Self = StObject.set(x, "orderStr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderStrUndefined: Self = StObject.set(x, "orderStr", js.undefined)
    
    @scala.inline
    def setPaymentUrl(value: String): Self = StObject.set(x, "paymentUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaymentUrlUndefined: Self = StObject.set(x, "paymentUrl", js.undefined)
    
    @scala.inline
    def setTradeNO(value: String): Self = StObject.set(x, "tradeNO", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTradeNOUndefined: Self = StObject.set(x, "tradeNO", js.undefined)
  }
}
