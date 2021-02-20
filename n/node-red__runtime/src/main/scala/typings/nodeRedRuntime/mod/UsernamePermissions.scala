package typings.nodeRedRuntime.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UsernamePermissions extends User {
  
  var permissions: Permission | js.Array[Permission] = js.native
  
  var username: String = js.native
}
object UsernamePermissions {
  
  @scala.inline
  def apply(permissions: Permission | js.Array[Permission], username: String): UsernamePermissions = {
    val __obj = js.Dynamic.literal(permissions = permissions.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsernamePermissions]
  }
  
  @scala.inline
  implicit class UsernamePermissionsMutableBuilder[Self <: UsernamePermissions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPermissions(value: Permission | js.Array[Permission]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionsVarargs(value: Permission*): Self = StObject.set(x, "permissions", js.Array(value :_*))
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
