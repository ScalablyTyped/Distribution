package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rolename extends StObject {
  
  var permission: String
  
  /** @example admin */
  var role_name: String
  
  var user: Followingurl | Null
}
object Rolename {
  
  inline def apply(permission: String, role_name: String): Rolename = {
    val __obj = js.Dynamic.literal(permission = permission.asInstanceOf[js.Any], role_name = role_name.asInstanceOf[js.Any], user = null)
    __obj.asInstanceOf[Rolename]
  }
  
  extension [Self <: Rolename](x: Self) {
    
    inline def setPermission(value: String): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
    
    inline def setRole_name(value: String): Self = StObject.set(x, "role_name", value.asInstanceOf[js.Any])
    
    inline def setUser(value: Followingurl): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserNull: Self = StObject.set(x, "user", null)
  }
}
