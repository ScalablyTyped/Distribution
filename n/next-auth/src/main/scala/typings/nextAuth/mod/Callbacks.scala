package typings.nextAuth.mod

import typings.nextAuth.utilsMod.GenericObject
import typings.nextAuth.utilsMod.SessionBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// TODO: Improve callback typings
@js.native
trait Callbacks extends js.Object {
  
  var jwt: js.UndefOr[
    js.Function5[
      /* token */ GenericObject, 
      /* user */ User, 
      /* account */ GenericObject, 
      /* profile */ GenericObject, 
      /* isNewUser */ Boolean, 
      js.Promise[GenericObject]
    ]
  ] = js.native
  
  var redirect: js.UndefOr[js.Function2[/* url */ String, /* baseUrl */ String, js.Promise[String]]] = js.native
  
  var session: js.UndefOr[
    js.Function2[/* session */ SessionBase, /* user */ User, js.Promise[GenericObject]]
  ] = js.native
  
  var signIn: js.UndefOr[
    js.Function3[
      /* user */ User, 
      /* account */ GenericObject, 
      /* profile */ GenericObject, 
      js.Promise[Boolean]
    ]
  ] = js.native
}
object Callbacks {
  
  @scala.inline
  def apply(): Callbacks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Callbacks]
  }
  
  @scala.inline
  implicit class CallbacksOps[Self <: Callbacks] (val x: Self) extends AnyVal {
    
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
    def setJwt(
      value: (/* token */ GenericObject, /* user */ User, /* account */ GenericObject, /* profile */ GenericObject, /* isNewUser */ Boolean) => js.Promise[GenericObject]
    ): Self = this.set("jwt", js.Any.fromFunction5(value))
    
    @scala.inline
    def deleteJwt: Self = this.set("jwt", js.undefined)
    
    @scala.inline
    def setRedirect(value: (/* url */ String, /* baseUrl */ String) => js.Promise[String]): Self = this.set("redirect", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRedirect: Self = this.set("redirect", js.undefined)
    
    @scala.inline
    def setSession(value: (/* session */ SessionBase, /* user */ User) => js.Promise[GenericObject]): Self = this.set("session", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSession: Self = this.set("session", js.undefined)
    
    @scala.inline
    def setSignIn(
      value: (/* user */ User, /* account */ GenericObject, /* profile */ GenericObject) => js.Promise[Boolean]
    ): Self = this.set("signIn", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteSignIn: Self = this.set("signIn", js.undefined)
  }
}
