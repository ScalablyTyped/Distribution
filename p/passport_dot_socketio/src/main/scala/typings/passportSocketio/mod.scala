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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("passport.socketio", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def authorize(options: PassportSocketIoOptions): js.Function2[/* socket */ Socket, /* fn */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("authorize")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* socket */ Socket, /* fn */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], Unit]]
  
  inline def filterSocketsByUser(io: Server, filter: js.Function1[/* user */ js.Any, Boolean]): js.Array[Socket] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterSocketsByUser")(io.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[js.Array[Socket]]
  
  trait PassportSocketIoOptions extends StObject {
    
    /**
      * the same middleware you registrer in express.
      */
    var cookieParser: js.UndefOr[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]] = js.undefined
    
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
      ] = js.undefined
    
    /**
      * the name of the cookie where express/connect stores its session_id.
      */
    var key: js.UndefOr[String] = js.undefined
    
    var passport: js.UndefOr[PassportStatic] = js.undefined
    
    /**
      * the session_secret to parse the cookie.
      */
    var secret: js.UndefOr[String] = js.undefined
    
    /**
      * we NEED to use a sessionstore. No MemoryStore please.
      */
    var store: Store
    
    /**
      * callback on success.
      */
    var success: js.UndefOr[
        js.Function2[
          /* data */ js.Any, 
          /* accept */ js.Function2[/* err */ js.UndefOr[js.Any], /* accepted */ js.UndefOr[Boolean], Unit], 
          Unit
        ]
      ] = js.undefined
  }
  object PassportSocketIoOptions {
    
    inline def apply(store: Store): PassportSocketIoOptions = {
      val __obj = js.Dynamic.literal(store = store.asInstanceOf[js.Any])
      __obj.asInstanceOf[PassportSocketIoOptions]
    }
    
    extension [Self <: PassportSocketIoOptions](x: Self) {
      
      inline def setCookieParser(
        value: (/* req */ Request[ParamsDictionary, js.Any, js.Any, Query], /* res */ Response[js.Any, Double], /* next */ NextFunction) => js.Any
      ): Self = StObject.set(x, "cookieParser", js.Any.fromFunction3(value))
      
      inline def setCookieParserUndefined: Self = StObject.set(x, "cookieParser", js.undefined)
      
      inline def setFail(
        value: (/* data */ js.Any, /* message */ String, /* critical */ Boolean, /* accept */ js.Function2[/* err */ js.UndefOr[js.Any], /* accepted */ js.UndefOr[Boolean], Unit]) => Unit
      ): Self = StObject.set(x, "fail", js.Any.fromFunction4(value))
      
      inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setPassport(value: PassportStatic): Self = StObject.set(x, "passport", value.asInstanceOf[js.Any])
      
      inline def setPassportUndefined: Self = StObject.set(x, "passport", js.undefined)
      
      inline def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
      
      inline def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
      
      inline def setStore(value: Store): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      inline def setSuccess(
        value: (/* data */ js.Any, /* accept */ js.Function2[/* err */ js.UndefOr[js.Any], /* accepted */ js.UndefOr[Boolean], Unit]) => Unit
      ): Self = StObject.set(x, "success", js.Any.fromFunction2(value))
      
      inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    }
  }
}
