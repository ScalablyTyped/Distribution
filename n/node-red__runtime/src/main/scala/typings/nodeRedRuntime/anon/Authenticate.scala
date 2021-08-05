package typings.nodeRedRuntime.anon

import typings.nodeRedRuntime.mod.AnonymousPermissions
import typings.nodeRedRuntime.mod.UsernamePermissions
import typings.nodeRedRuntime.nodeRedRuntimeStrings.credentials
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Authenticate extends StObject {
  
  def default(): js.Promise[AnonymousPermissions | Null]
  
  def authenticate(username: String, password: String): js.Promise[UsernamePermissions | Null]
  
  var `type`: credentials
  
  def users(username: String): js.Promise[UsernamePermissions | Null]
}
object Authenticate {
  
  inline def apply(
    authenticate: (String, String) => js.Promise[UsernamePermissions | Null],
    default: () => js.Promise[AnonymousPermissions | Null],
    users: String => js.Promise[UsernamePermissions | Null]
  ): Authenticate = {
    val __obj = js.Dynamic.literal(authenticate = js.Any.fromFunction2(authenticate), default = js.Any.fromFunction0(default), users = js.Any.fromFunction1(users))
    __obj.updateDynamic("type")("credentials")
    __obj.asInstanceOf[Authenticate]
  }
  
  extension [Self <: Authenticate](x: Self) {
    
    inline def setAuthenticate(value: (String, String) => js.Promise[UsernamePermissions | Null]): Self = StObject.set(x, "authenticate", js.Any.fromFunction2(value))
    
    inline def setDefault(value: () => js.Promise[AnonymousPermissions | Null]): Self = StObject.set(x, "default", js.Any.fromFunction0(value))
    
    inline def setType(value: credentials): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUsers(value: String => js.Promise[UsernamePermissions | Null]): Self = StObject.set(x, "users", js.Any.fromFunction1(value))
  }
}
