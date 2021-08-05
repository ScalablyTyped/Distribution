package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Login extends StObject {
  
  var email: String
  
  var id: Double
  
  var login: String
  
  var marketplace_pending_change: Effectivedate
  
  var marketplace_purchase: Billingcycle
  
  var organization_billing_email: String
  
  var `type`: String
  
  var url: String
}
object Login {
  
  inline def apply(
    email: String,
    id: Double,
    login: String,
    marketplace_pending_change: Effectivedate,
    marketplace_purchase: Billingcycle,
    organization_billing_email: String,
    `type`: String,
    url: String
  ): Login = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], login = login.asInstanceOf[js.Any], marketplace_pending_change = marketplace_pending_change.asInstanceOf[js.Any], marketplace_purchase = marketplace_purchase.asInstanceOf[js.Any], organization_billing_email = organization_billing_email.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Login]
  }
  
  extension [Self <: Login](x: Self) {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLogin(value: String): Self = StObject.set(x, "login", value.asInstanceOf[js.Any])
    
    inline def setMarketplace_pending_change(value: Effectivedate): Self = StObject.set(x, "marketplace_pending_change", value.asInstanceOf[js.Any])
    
    inline def setMarketplace_purchase(value: Billingcycle): Self = StObject.set(x, "marketplace_purchase", value.asInstanceOf[js.Any])
    
    inline def setOrganization_billing_email(value: String): Self = StObject.set(x, "organization_billing_email", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
