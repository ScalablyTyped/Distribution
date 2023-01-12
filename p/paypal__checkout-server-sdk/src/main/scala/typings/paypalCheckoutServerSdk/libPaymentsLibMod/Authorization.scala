package typings.paypalCheckoutServerSdk.libPaymentsLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Authorization
  extends StObject
     with ActivityTimestamps
     with AuthorizationStatus {
  
  var amount: Money
  
  var custom_id: String
  
  var expiration_time: String
  
  var id: String
  
  var invoice_id: String
  
  var links: js.Array[LinkDescription]
  
  var seller_protection: SellerProtection
}
object Authorization {
  
  inline def apply(
    amount: Money,
    create_time: String,
    custom_id: String,
    expiration_time: String,
    id: String,
    invoice_id: String,
    links: js.Array[LinkDescription],
    seller_protection: SellerProtection,
    status: Status,
    status_details: AuthorizationStatusDetails,
    update_time: String
  ): Authorization = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], create_time = create_time.asInstanceOf[js.Any], custom_id = custom_id.asInstanceOf[js.Any], expiration_time = expiration_time.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], invoice_id = invoice_id.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], seller_protection = seller_protection.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], status_details = status_details.asInstanceOf[js.Any], update_time = update_time.asInstanceOf[js.Any])
    __obj.asInstanceOf[Authorization]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Authorization] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: Money): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setCustom_id(value: String): Self = StObject.set(x, "custom_id", value.asInstanceOf[js.Any])
    
    inline def setExpiration_time(value: String): Self = StObject.set(x, "expiration_time", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInvoice_id(value: String): Self = StObject.set(x, "invoice_id", value.asInstanceOf[js.Any])
    
    inline def setLinks(value: js.Array[LinkDescription]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setLinksVarargs(value: LinkDescription*): Self = StObject.set(x, "links", js.Array(value*))
    
    inline def setSeller_protection(value: SellerProtection): Self = StObject.set(x, "seller_protection", value.asInstanceOf[js.Any])
  }
}
