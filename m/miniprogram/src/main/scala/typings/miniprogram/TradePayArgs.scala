package typings.miniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TradePayArgs
  extends StObject
     with AsyncCallback[String] {
  
  var orderStr: js.UndefOr[String] = js.undefined
  
  var paymentUrl: js.UndefOr[String] = js.undefined
  
  var tradeNO: js.UndefOr[String] = js.undefined
}
object TradePayArgs {
  
  inline def apply(): TradePayArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TradePayArgs]
  }
  
  extension [Self <: TradePayArgs](x: Self) {
    
    inline def setOrderStr(value: String): Self = StObject.set(x, "orderStr", value.asInstanceOf[js.Any])
    
    inline def setOrderStrUndefined: Self = StObject.set(x, "orderStr", js.undefined)
    
    inline def setPaymentUrl(value: String): Self = StObject.set(x, "paymentUrl", value.asInstanceOf[js.Any])
    
    inline def setPaymentUrlUndefined: Self = StObject.set(x, "paymentUrl", js.undefined)
    
    inline def setTradeNO(value: String): Self = StObject.set(x, "tradeNO", value.asInstanceOf[js.Any])
    
    inline def setTradeNOUndefined: Self = StObject.set(x, "tradeNO", js.undefined)
  }
}
