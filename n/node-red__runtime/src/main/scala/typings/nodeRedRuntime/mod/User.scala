package typings.nodeRedRuntime.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.nodeRedRuntime.mod.UsernamePermissions
  - typings.nodeRedRuntime.mod.AnonymousPermissions
*/
trait User extends StObject
object User {
  
  @scala.inline
  def AnonymousPermissions(permissions: Permission | js.Array[Permission]): typings.nodeRedRuntime.mod.AnonymousPermissions = {
    val __obj = js.Dynamic.literal(anonymous = true, permissions = permissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.nodeRedRuntime.mod.AnonymousPermissions]
  }
  
  @scala.inline
  def UsernamePermissions(permissions: Permission | js.Array[Permission], username: String): typings.nodeRedRuntime.mod.UsernamePermissions = {
    val __obj = js.Dynamic.literal(permissions = permissions.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.nodeRedRuntime.mod.UsernamePermissions]
  }
}
