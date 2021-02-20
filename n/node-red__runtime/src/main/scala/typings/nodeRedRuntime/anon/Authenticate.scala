package typings.nodeRedRuntime.anon

import typings.nodeRedRuntime.mod.AnonymousPermissions
import typings.nodeRedRuntime.mod.UsernamePermissions
import typings.nodeRedRuntime.nodeRedRuntimeStrings.credentials
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Authenticate extends StObject {
  
  def default(): js.Promise[AnonymousPermissions | Null] = js.native
  
  def authenticate(username: String, password: String): js.Promise[UsernamePermissions | Null] = js.native
  
  var `type`: credentials = js.native
  
  def users(username: String): js.Promise[UsernamePermissions | Null] = js.native
}
object Authenticate {
  
  @scala.inline
  def apply(
    authenticate: (String, String) => js.Promise[UsernamePermissions | Null],
    default: () => js.Promise[AnonymousPermissions | Null],
    `type`: credentials,
    users: String => js.Promise[UsernamePermissions | Null]
  ): Authenticate = {
    val __obj = js.Dynamic.literal(authenticate = js.Any.fromFunction2(authenticate), default = js.Any.fromFunction0(default), users = js.Any.fromFunction1(users))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Authenticate]
  }
  
  @scala.inline
  implicit class AuthenticateMutableBuilder[Self <: Authenticate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthenticate(value: (String, String) => js.Promise[UsernamePermissions | Null]): Self = StObject.set(x, "authenticate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDefault(value: () => js.Promise[AnonymousPermissions | Null]): Self = StObject.set(x, "default", js.Any.fromFunction0(value))
    
    @scala.inline
    def setType(value: credentials): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsers(value: String => js.Promise[UsernamePermissions | Null]): Self = StObject.set(x, "users", js.Any.fromFunction1(value))
  }
}
