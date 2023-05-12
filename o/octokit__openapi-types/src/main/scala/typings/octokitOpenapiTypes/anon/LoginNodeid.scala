package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoginNodeid extends StObject {
  
  var id: js.UndefOr[Double] = js.undefined
  
  var login: js.UndefOr[String] = js.undefined
  
  var node_id: js.UndefOr[String] = js.undefined
  
  var organization_billing_email: js.UndefOr[String | Null] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object LoginNodeid {
  
  inline def apply(): LoginNodeid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoginNodeid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LoginNodeid] (val x: Self) extends AnyVal {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLogin(value: String): Self = StObject.set(x, "login", value.asInstanceOf[js.Any])
    
    inline def setLoginUndefined: Self = StObject.set(x, "login", js.undefined)
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setNode_idUndefined: Self = StObject.set(x, "node_id", js.undefined)
    
    inline def setOrganization_billing_email(value: String): Self = StObject.set(x, "organization_billing_email", value.asInstanceOf[js.Any])
    
    inline def setOrganization_billing_emailNull: Self = StObject.set(x, "organization_billing_email", null)
    
    inline def setOrganization_billing_emailUndefined: Self = StObject.set(x, "organization_billing_email", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
