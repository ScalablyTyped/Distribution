package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShippingQuery extends StObject {
  
  var from: User
  
  var id: String
  
  var invoice_payload: String
  
  var shipping_address: ShippingAddress
}
object ShippingQuery {
  
  inline def apply(from: User, id: String, invoice_payload: String, shipping_address: ShippingAddress): ShippingQuery = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], invoice_payload = invoice_payload.asInstanceOf[js.Any], shipping_address = shipping_address.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShippingQuery]
  }
  
  extension [Self <: ShippingQuery](x: Self) {
    
    inline def setFrom(value: User): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInvoice_payload(value: String): Self = StObject.set(x, "invoice_payload", value.asInstanceOf[js.Any])
    
    inline def setShipping_address(value: ShippingAddress): Self = StObject.set(x, "shipping_address", value.asInstanceOf[js.Any])
  }
}
