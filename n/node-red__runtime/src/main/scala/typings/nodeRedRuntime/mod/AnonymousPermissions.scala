package typings.nodeRedRuntime.mod

import typings.nodeRedRuntime.nodeRedRuntimeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnonymousPermissions extends User {
  
  var anonymous: `true` = js.native
  
  var permissions: Permission | js.Array[Permission] = js.native
}
object AnonymousPermissions {
  
  @scala.inline
  def apply(anonymous: `true`, permissions: Permission | js.Array[Permission]): AnonymousPermissions = {
    val __obj = js.Dynamic.literal(anonymous = anonymous.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonymousPermissions]
  }
  
  @scala.inline
  implicit class AnonymousPermissionsMutableBuilder[Self <: AnonymousPermissions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnonymous(value: `true`): Self = StObject.set(x, "anonymous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissions(value: Permission | js.Array[Permission]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionsVarargs(value: Permission*): Self = StObject.set(x, "permissions", js.Array(value :_*))
  }
}
