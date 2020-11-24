package typings.nodeRedRuntime.anon

import typings.nodeRedRuntime.mod.AnonymousPermissions
import typings.nodeRedRuntime.mod.UsernamePermissions
import typings.nodeRedRuntime.nodeRedRuntimeStrings.credentials
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Authenticate extends js.Object {
  
  def authenticate(username: String, password: String): js.Promise[UsernamePermissions | Null] = js.native
  
  def default(): js.Promise[AnonymousPermissions | Null] = js.native
  
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
  implicit class AuthenticateOps[Self <: Authenticate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAuthenticate(value: (String, String) => js.Promise[UsernamePermissions | Null]): Self = this.set("authenticate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDefault(value: () => js.Promise[AnonymousPermissions | Null]): Self = this.set("default", js.Any.fromFunction0(value))
    
    @scala.inline
    def setType(value: credentials): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsers(value: String => js.Promise[UsernamePermissions | Null]): Self = this.set("users", js.Any.fromFunction1(value))
  }
}
