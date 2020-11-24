package typings.nextAuth.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Events extends js.Object {
  
  var createUser: js.UndefOr[js.Function1[/* message */ js.Any, js.Promise[Unit]]] = js.native
  
  var error: js.UndefOr[js.Function1[/* message */ js.Any, js.Promise[Unit]]] = js.native
  
  var linkAccount: js.UndefOr[js.Function1[/* message */ js.Any, js.Promise[Unit]]] = js.native
  
  var session: js.UndefOr[js.Function1[/* message */ js.Any, js.Promise[Unit]]] = js.native
  
  var signIn: js.UndefOr[js.Function1[/* message */ js.Any, js.Promise[Unit]]] = js.native
  
  var signOut: js.UndefOr[js.Function1[/* message */ js.Any, js.Promise[Unit]]] = js.native
  
  var updateUser: js.UndefOr[js.Function1[/* message */ js.Any, js.Promise[Unit]]] = js.native
}
object Events {
  
  @scala.inline
  def apply(): Events = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Events]
  }
  
  @scala.inline
  implicit class EventsOps[Self <: Events] (val x: Self) extends AnyVal {
    
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
    def setCreateUser(value: /* message */ js.Any => js.Promise[Unit]): Self = this.set("createUser", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCreateUser: Self = this.set("createUser", js.undefined)
    
    @scala.inline
    def setError(value: /* message */ js.Any => js.Promise[Unit]): Self = this.set("error", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setLinkAccount(value: /* message */ js.Any => js.Promise[Unit]): Self = this.set("linkAccount", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteLinkAccount: Self = this.set("linkAccount", js.undefined)
    
    @scala.inline
    def setSession(value: /* message */ js.Any => js.Promise[Unit]): Self = this.set("session", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSession: Self = this.set("session", js.undefined)
    
    @scala.inline
    def setSignIn(value: /* message */ js.Any => js.Promise[Unit]): Self = this.set("signIn", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSignIn: Self = this.set("signIn", js.undefined)
    
    @scala.inline
    def setSignOut(value: /* message */ js.Any => js.Promise[Unit]): Self = this.set("signOut", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSignOut: Self = this.set("signOut", js.undefined)
    
    @scala.inline
    def setUpdateUser(value: /* message */ js.Any => js.Promise[Unit]): Self = this.set("updateUser", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteUpdateUser: Self = this.set("updateUser", js.undefined)
  }
}
