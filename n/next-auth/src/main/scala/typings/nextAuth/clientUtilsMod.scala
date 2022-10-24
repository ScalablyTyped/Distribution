package typings.nextAuth

import typings.nextAuth.anon.Post
import typings.nextAuth.anon.Req
import typings.nextAuth.anon.Trigger
import typings.nextAuth.coreTypesMod.Session
import typings.nextAuth.nextAuthStrings.session
import typings.nextAuth.utilsLoggerMod.LoggerInstance
import typings.node.httpMod.IncomingMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clientUtilsMod {
  
  @JSImport("next-auth/client/_utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def BroadcastChannel(): Post = ^.asInstanceOf[js.Dynamic].applyDynamic("BroadcastChannel")().asInstanceOf[Post]
  inline def BroadcastChannel(name: String): Post = ^.asInstanceOf[js.Dynamic].applyDynamic("BroadcastChannel")(name.asInstanceOf[js.Any]).asInstanceOf[Post]
  
  inline def apiBaseUrl(__NEXTAUTH: NextAuthClientConfig): String = ^.asInstanceOf[js.Dynamic].applyDynamic("apiBaseUrl")(__NEXTAUTH.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def fetchData[T](path: String, __NEXTAUTH: NextAuthClientConfig, logger: LoggerInstance): js.Promise[T | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchData")(path.asInstanceOf[js.Any], __NEXTAUTH.asInstanceOf[js.Any], logger.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T | Null]]
  inline def fetchData[T](path: String, __NEXTAUTH: NextAuthClientConfig, logger: LoggerInstance, param3: CtxOrReq): js.Promise[T | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchData")(path.asInstanceOf[js.Any], __NEXTAUTH.asInstanceOf[js.Any], logger.asInstanceOf[js.Any], param3.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T | Null]]
  
  inline def now(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[Double]
  
  trait BroadcastMessage extends StObject {
    
    var clientId: String
    
    var data: js.UndefOr[Trigger] = js.undefined
    
    var event: js.UndefOr[session] = js.undefined
    
    var timestamp: Double
  }
  object BroadcastMessage {
    
    inline def apply(clientId: String, timestamp: Double): BroadcastMessage = {
      val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[BroadcastMessage]
    }
    
    extension [Self <: BroadcastMessage](x: Self) {
      
      inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      inline def setData(value: Trigger): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setEvent(value: session): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  trait CtxOrReq extends StObject {
    
    var ctx: js.UndefOr[Req] = js.undefined
    
    var req: js.UndefOr[IncomingMessage] = js.undefined
  }
  object CtxOrReq {
    
    inline def apply(): CtxOrReq = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CtxOrReq]
    }
    
    extension [Self <: CtxOrReq](x: Self) {
      
      inline def setCtx(value: Req): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
      
      inline def setCtxUndefined: Self = StObject.set(x, "ctx", js.undefined)
      
      inline def setReq(value: IncomingMessage): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
      
      inline def setReqUndefined: Self = StObject.set(x, "req", js.undefined)
    }
  }
  
  trait NextAuthClientConfig extends StObject {
    
    /**
      * Stores the `SessionProvider`'s session update method to be able to
      * trigger session updates from places like `signIn` or `signOut`
      */
    def _getSession(args: Any*): Any
    
    /** Used for timestamp since last sycned (in seconds) */
    var _lastSync: Double
    
    /** Stores last session response */
    var _session: js.UndefOr[Session | Null] = js.undefined
    
    var basePath: String
    
    var basePathServer: String
    
    var baseUrl: String
    
    var baseUrlServer: String
  }
  object NextAuthClientConfig {
    
    inline def apply(
      _getSession: /* repeated */ Any => Any,
      _lastSync: Double,
      basePath: String,
      basePathServer: String,
      baseUrl: String,
      baseUrlServer: String
    ): NextAuthClientConfig = {
      val __obj = js.Dynamic.literal(_getSession = js.Any.fromFunction1(_getSession), _lastSync = _lastSync.asInstanceOf[js.Any], basePath = basePath.asInstanceOf[js.Any], basePathServer = basePathServer.asInstanceOf[js.Any], baseUrl = baseUrl.asInstanceOf[js.Any], baseUrlServer = baseUrlServer.asInstanceOf[js.Any])
      __obj.asInstanceOf[NextAuthClientConfig]
    }
    
    extension [Self <: NextAuthClientConfig](x: Self) {
      
      inline def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
      
      inline def setBasePathServer(value: String): Self = StObject.set(x, "basePathServer", value.asInstanceOf[js.Any])
      
      inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      inline def setBaseUrlServer(value: String): Self = StObject.set(x, "baseUrlServer", value.asInstanceOf[js.Any])
      
      inline def set_getSession(value: /* repeated */ Any => Any): Self = StObject.set(x, "_getSession", js.Any.fromFunction1(value))
      
      inline def set_lastSync(value: Double): Self = StObject.set(x, "_lastSync", value.asInstanceOf[js.Any])
      
      inline def set_session(value: Session): Self = StObject.set(x, "_session", value.asInstanceOf[js.Any])
      
      inline def set_sessionNull: Self = StObject.set(x, "_session", null)
      
      inline def set_sessionUndefined: Self = StObject.set(x, "_session", js.undefined)
    }
  }
}
