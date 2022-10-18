package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Permission extends StObject {
  
  var permission: String
  
  var user: Avatarurl | Null
}
object Permission {
  
  inline def apply(permission: String): Permission = {
    val __obj = js.Dynamic.literal(permission = permission.asInstanceOf[js.Any], user = null)
    __obj.asInstanceOf[Permission]
  }
  
  extension [Self <: Permission](x: Self) {
    
    inline def setPermission(value: String): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
    
    inline def setUser(value: Avatarurl): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserNull: Self = StObject.set(x, "user", null)
  }
}
