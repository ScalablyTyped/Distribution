package typings.nodeRedRuntime.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UsernamePermissions
  extends StObject
     with User {
  
  var permissions: Permission | js.Array[Permission]
  
  var username: String
}
object UsernamePermissions {
  
  inline def apply(permissions: Permission | js.Array[Permission], username: String): UsernamePermissions = {
    val __obj = js.Dynamic.literal(permissions = permissions.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsernamePermissions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UsernamePermissions] (val x: Self) extends AnyVal {
    
    inline def setPermissions(value: Permission | js.Array[Permission]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsVarargs(value: Permission*): Self = StObject.set(x, "permissions", js.Array(value*))
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
