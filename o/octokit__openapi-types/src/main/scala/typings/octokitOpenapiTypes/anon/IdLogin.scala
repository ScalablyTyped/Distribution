package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdLogin extends StObject {
  
  var id: Double
  
  var login: String
  
  var node_id: String
  
  var organization_billing_email: String | Null
  
  var `type`: String
}
object IdLogin {
  
  inline def apply(id: Double, login: String, node_id: String, `type`: String): IdLogin = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], login = login.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], organization_billing_email = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdLogin]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IdLogin] (val x: Self) extends AnyVal {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLogin(value: String): Self = StObject.set(x, "login", value.asInstanceOf[js.Any])
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setOrganization_billing_email(value: String): Self = StObject.set(x, "organization_billing_email", value.asInstanceOf[js.Any])
    
    inline def setOrganization_billing_emailNull: Self = StObject.set(x, "organization_billing_email", null)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
