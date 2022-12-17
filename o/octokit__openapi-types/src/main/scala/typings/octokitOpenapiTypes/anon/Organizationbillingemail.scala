package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Organizationbillingemail extends StObject {
  
  /** Format: email */
  var email: js.UndefOr[String | Null] = js.undefined
  
  var id: Double
  
  var login: String
  
  var node_id: js.UndefOr[String] = js.undefined
  
  /** Format: email */
  var organization_billing_email: js.UndefOr[String | Null] = js.undefined
  
  var `type`: String
  
  /** Format: uri */
  var url: String
}
object Organizationbillingemail {
  
  inline def apply(id: Double, login: String, `type`: String, url: String): Organizationbillingemail = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], login = login.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Organizationbillingemail]
  }
  
  extension [Self <: Organizationbillingemail](x: Self) {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailNull: Self = StObject.set(x, "email", null)
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLogin(value: String): Self = StObject.set(x, "login", value.asInstanceOf[js.Any])
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setNode_idUndefined: Self = StObject.set(x, "node_id", js.undefined)
    
    inline def setOrganization_billing_email(value: String): Self = StObject.set(x, "organization_billing_email", value.asInstanceOf[js.Any])
    
    inline def setOrganization_billing_emailNull: Self = StObject.set(x, "organization_billing_email", null)
    
    inline def setOrganization_billing_emailUndefined: Self = StObject.set(x, "organization_billing_email", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
