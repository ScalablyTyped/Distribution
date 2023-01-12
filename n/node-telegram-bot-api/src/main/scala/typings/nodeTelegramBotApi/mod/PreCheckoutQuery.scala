package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreCheckoutQuery extends StObject {
  
  var currency: String
  
  var from: User
  
  var id: String
  
  var invoice_payload: String
  
  var order_info: js.UndefOr[OrderInfo] = js.undefined
  
  var shipping_option_id: js.UndefOr[String] = js.undefined
  
  var total_amount: Double
}
object PreCheckoutQuery {
  
  inline def apply(currency: String, from: User, id: String, invoice_payload: String, total_amount: Double): PreCheckoutQuery = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], invoice_payload = invoice_payload.asInstanceOf[js.Any], total_amount = total_amount.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreCheckoutQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PreCheckoutQuery] (val x: Self) extends AnyVal {
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setFrom(value: User): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInvoice_payload(value: String): Self = StObject.set(x, "invoice_payload", value.asInstanceOf[js.Any])
    
    inline def setOrder_info(value: OrderInfo): Self = StObject.set(x, "order_info", value.asInstanceOf[js.Any])
    
    inline def setOrder_infoUndefined: Self = StObject.set(x, "order_info", js.undefined)
    
    inline def setShipping_option_id(value: String): Self = StObject.set(x, "shipping_option_id", value.asInstanceOf[js.Any])
    
    inline def setShipping_option_idUndefined: Self = StObject.set(x, "shipping_option_id", js.undefined)
    
    inline def setTotal_amount(value: Double): Self = StObject.set(x, "total_amount", value.asInstanceOf[js.Any])
  }
}
