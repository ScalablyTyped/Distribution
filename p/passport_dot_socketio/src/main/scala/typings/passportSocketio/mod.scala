package typings.passportSocketio

import typings.express.mod.RequestHandler
import typings.expressSession.mod.Store
import typings.passport.mod.PassportStatic
import typings.socketIo.distTypedEventsMod.DefaultEventsMap
import typings.socketIo.mod.Server
import typings.socketIo.mod.Socket
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("passport.socketio", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def authorize(options: PassportSocketIoOptions): js.Function2[
    /* socket */ Socket[DefaultEventsMap, DefaultEventsMap, DefaultEventsMap, Any], 
    /* fn */ js.Function1[/* err */ js.UndefOr[Any], Unit], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("authorize")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* socket */ Socket[DefaultEventsMap, DefaultEventsMap, DefaultEventsMap, Any], 
    /* fn */ js.Function1[/* err */ js.UndefOr[Any], Unit], 
    Unit
  ]]
  
  inline def filterSocketsByUser(
    io: Server[DefaultEventsMap, DefaultEventsMap, DefaultEventsMap, Any],
    filter: js.Function1[/* user */ Any, Boolean]
  ): js.Array[Socket[DefaultEventsMap, DefaultEventsMap, DefaultEventsMap, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterSocketsByUser")(io.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[js.Array[Socket[DefaultEventsMap, DefaultEventsMap, DefaultEventsMap, Any]]]
  
  trait PassportSocketIoOptions extends StObject {
    
    /**
      * the same middleware you registrer in express.
      */
    var cookieParser: js.UndefOr[
        RequestHandler[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ]
      ] = js.undefined
    
    /**
      * callback on fail/error.
      */
    var fail: js.UndefOr[
        js.Function4[
          /* data */ Any, 
          /* message */ String, 
          /* critical */ Boolean, 
          /* accept */ js.Function2[/* err */ js.UndefOr[Any], /* accepted */ js.UndefOr[Boolean], Unit], 
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
          /* data */ Any, 
          /* accept */ js.Function2[/* err */ js.UndefOr[Any], /* accepted */ js.UndefOr[Boolean], Unit], 
          Unit
        ]
      ] = js.undefined
  }
  object PassportSocketIoOptions {
    
    inline def apply(store: Store): PassportSocketIoOptions = {
      val __obj = js.Dynamic.literal(store = store.asInstanceOf[js.Any])
      __obj.asInstanceOf[PassportSocketIoOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PassportSocketIoOptions] (val x: Self) extends AnyVal {
      
      inline def setCookieParser(
        value: RequestHandler[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ]
      ): Self = StObject.set(x, "cookieParser", value.asInstanceOf[js.Any])
      
      inline def setCookieParserUndefined: Self = StObject.set(x, "cookieParser", js.undefined)
      
      inline def setFail(
        value: (/* data */ Any, /* message */ String, /* critical */ Boolean, /* accept */ js.Function2[/* err */ js.UndefOr[Any], /* accepted */ js.UndefOr[Boolean], Unit]) => Unit
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
        value: (/* data */ Any, /* accept */ js.Function2[/* err */ js.UndefOr[Any], /* accepted */ js.UndefOr[Boolean], Unit]) => Unit
      ): Self = StObject.set(x, "success", js.Any.fromFunction2(value))
      
      inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    }
  }
}
