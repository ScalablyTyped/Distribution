package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrganizationurlRole extends StObject {
  
  /** Format: uri */
  var organization_url: String
  
  var role: String
  
  var state: String
  
  /** Format: uri */
  var url: String
  
  /** User */
  var user: Deleted | Null
}
object OrganizationurlRole {
  
  inline def apply(organization_url: String, role: String, state: String, url: String): OrganizationurlRole = {
    val __obj = js.Dynamic.literal(organization_url = organization_url.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], user = null)
    __obj.asInstanceOf[OrganizationurlRole]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OrganizationurlRole] (val x: Self) extends AnyVal {
    
    inline def setOrganization_url(value: String): Self = StObject.set(x, "organization_url", value.asInstanceOf[js.Any])
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUser(value: Deleted): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserNull: Self = StObject.set(x, "user", null)
  }
}
