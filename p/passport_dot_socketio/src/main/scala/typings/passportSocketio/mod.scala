package typings.passportSocketio

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.NextFunction
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.expressServeStaticCore.mod.Request
import typings.expressServeStaticCore.mod.Response
import typings.expressSession.mod.Store
import typings.passport.mod.PassportStatic
import typings.socketIo.mod.Server
import typings.socketIo.mod.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("passport.socketio", "authorize")
  @js.native
  def authorize(options: PassportSocketIoOptions): js.Function2[/* socket */ Socket, /* fn */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], Unit] = js.native
  
  @JSImport("passport.socketio", "filterSocketsByUser")
  @js.native
  def filterSocketsByUser(io: Server, filter: js.Function1[/* user */ js.Any, Boolean]): js.Array[Socket] = js.native
  
  @js.native
  trait PassportSocketIoOptions extends StObject {
    
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
    implicit class PassportSocketIoOptionsMutableBuilder[Self <: PassportSocketIoOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCookieParser(
        value: (/* req */ Request[ParamsDictionary, _, _, Query], /* res */ Response[_, Double], /* next */ NextFunction) => js.Any
      ): Self = StObject.set(x, "cookieParser", js.Any.fromFunction3(value))
      
      @scala.inline
      def setCookieParserUndefined: Self = StObject.set(x, "cookieParser", js.undefined)
      
      @scala.inline
      def setFail(
        value: (/* data */ js.Any, /* message */ String, /* critical */ Boolean, /* accept */ js.Function2[/* err */ js.UndefOr[js.Any], /* accepted */ js.UndefOr[Boolean], Unit]) => Unit
      ): Self = StObject.set(x, "fail", js.Any.fromFunction4(value))
      
      @scala.inline
      def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setPassport(value: PassportStatic): Self = StObject.set(x, "passport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassportUndefined: Self = StObject.set(x, "passport", js.undefined)
      
      @scala.inline
      def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
      
      @scala.inline
      def setStore(value: Store): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccess(
        value: (/* data */ js.Any, /* accept */ js.Function2[/* err */ js.UndefOr[js.Any], /* accepted */ js.UndefOr[Boolean], Unit]) => Unit
      ): Self = StObject.set(x, "success", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    }
  }
}
