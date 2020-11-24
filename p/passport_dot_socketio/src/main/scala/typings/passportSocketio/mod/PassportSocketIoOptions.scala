package typings.passportSocketio.mod

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.NextFunction
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.expressServeStaticCore.mod.Request
import typings.expressServeStaticCore.mod.Response
import typings.expressSession.mod.Store
import typings.passport.mod.PassportStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PassportSocketIoOptions extends js.Object {
  
  /**
    * the same middleware you registrer in express.
    */
  var cookieParser: js.UndefOr[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
  
  /**
    * callback on fail/error.
    */
  var fail: js.UndefOr[
    js.Function4[
      /* data */ js.Any, 
      /* message */ String, 
      /* critical */ Boolean, 
      /* accept */ js.Function2[/* err */ js.UndefOr[js.Any], /* accepted */ js.UndefOr[Boolean], Unit], 
      Unit
    ]
  ] = js.native
  
  /**
    * the name of the cookie where express/connect stores its session_id.
    */
  var key: js.UndefOr[String] = js.native
  
  var passport: js.UndefOr[PassportStatic] = js.native
  
  /**
    * the session_secret to parse the cookie.
    */
  var secret: js.UndefOr[String] = js.native
  
  /**
    * we NEED to use a sessionstore. No MemoryStore please.
    */
  var store: Store = js.native
  
  /**
    * callback on success.
    */
  var success: js.UndefOr[
    js.Function2[
      /* data */ js.Any, 
      /* accept */ js.Function2[/* err */ js.UndefOr[js.Any], /* accepted */ js.UndefOr[Boolean], Unit], 
      Unit
    ]
  ] = js.native
}
object PassportSocketIoOptions {
  
  @scala.inline
  def apply(store: Store): PassportSocketIoOptions = {
    val __obj = js.Dynamic.literal(store = store.asInstanceOf[js.Any])
    __obj.asInstanceOf[PassportSocketIoOptions]
  }
  
  @scala.inline
  implicit class PassportSocketIoOptionsOps[Self <: PassportSocketIoOptions] (val x: Self) extends AnyVal {
    
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
    def setStore(value: Store): Self = this.set("store", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCookieParser(
      value: (/* req */ Request[ParamsDictionary, _, _, Query], /* res */ Response[_, Double], /* next */ NextFunction) => js.Any
    ): Self = this.set("cookieParser", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteCookieParser: Self = this.set("cookieParser", js.undefined)
    
    @scala.inline
    def setFail(
      value: (/* data */ js.Any, /* message */ String, /* critical */ Boolean, /* accept */ js.Function2[/* err */ js.UndefOr[js.Any], /* accepted */ js.UndefOr[Boolean], Unit]) => Unit
    ): Self = this.set("fail", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setPassport(value: PassportStatic): Self = this.set("passport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassport: Self = this.set("passport", js.undefined)
    
    @scala.inline
    def setSecret(value: String): Self = this.set("secret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecret: Self = this.set("secret", js.undefined)
    
    @scala.inline
    def setSuccess(
      value: (/* data */ js.Any, /* accept */ js.Function2[/* err */ js.UndefOr[js.Any], /* accepted */ js.UndefOr[Boolean], Unit]) => Unit
    ): Self = this.set("success", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
}
