package typings.nextAuth

import org.scalablytyped.runtime.StringDictionary
import typings.nextAuth.anon.CallbackUrl
import typings.nextAuth.anon.GenericObjectcallbackUrls
import typings.nextAuth.anon.NextContexttriggerEventbo
import typings.nextAuth.anon.Req
import typings.nextAuth.mod.User
import typings.nextAuth.utilsMod.GenericObject
import typings.nextAuth.utilsMod.SessionBase
import typings.node.httpMod.IncomingMessage
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clientMod {
  
  @JSImport("next-auth/client", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("next-auth/client", "Provider")
  @js.native
  val Provider: ContextProvider = js.native
  
  inline def csrfToken(): js.Promise[String | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("csrfToken")().asInstanceOf[js.Promise[String | Null]]
  inline def csrfToken(context: NextContext): js.Promise[String | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("csrfToken")(context.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String | Null]]
  
  /* was `typeof csrfToken` */
  inline def getCsrfToken(): js.Promise[String | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCsrfToken")().asInstanceOf[js.Promise[String | Null]]
  inline def getCsrfToken(context: NextContext): js.Promise[String | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCsrfToken")(context.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String | Null]]
  
  /* was `typeof providers` */
  inline def getProviders(): js.Promise[GetProvidersResponse | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("getProviders")().asInstanceOf[js.Promise[GetProvidersResponse | Null]]
  
  /* was `typeof session` */
  inline def getSession(): js.Promise[Session_ | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSession")().asInstanceOf[js.Promise[Session_ | Null]]
  inline def getSession(context: NextContexttriggerEventbo): js.Promise[Session_ | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSession")(context.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Session_ | Null]]
  
  inline def options(options: SetOptionsParams): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("options")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def providers(): js.Promise[GetProvidersResponse | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("providers")().asInstanceOf[js.Promise[GetProvidersResponse | Null]]
  
  inline def session(): js.Promise[Session_ | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("session")().asInstanceOf[js.Promise[Session_ | Null]]
  inline def session(context: NextContexttriggerEventbo): js.Promise[Session_ | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("session")(context.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Session_ | Null]]
  
  /* was `typeof options` */
  inline def setOptions(options: SetOptionsParams): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setOptions")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /* was `typeof signin` */
  inline def signIn_(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("signIn")().asInstanceOf[js.Promise[Unit]]
  inline def signIn_(provider: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("signIn")(provider.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def signIn_(provider: String, data: GenericObjectcallbackUrls): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("signIn")(provider.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def signIn_(provider: Unit, data: GenericObjectcallbackUrls): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("signIn")(provider.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /* was `typeof signout` */
  inline def signOut_(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("signOut")().asInstanceOf[js.Promise[Unit]]
  inline def signOut_(data: CallbackUrl): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("signOut")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def signin(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("signin")().asInstanceOf[js.Promise[Unit]]
  inline def signin(provider: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("signin")(provider.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def signin(provider: String, data: GenericObjectcallbackUrls): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("signin")(provider.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def signin(provider: Unit, data: GenericObjectcallbackUrls): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("signin")(provider.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def signout(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("signout")().asInstanceOf[js.Promise[Unit]]
  inline def signout(data: CallbackUrl): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("signout")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def useSession(): js.Tuple2[js.UndefOr[Session_ | Null], Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useSession")().asInstanceOf[js.Tuple2[js.UndefOr[Session_ | Null], Boolean]]
  
  type ContextProvider = FC[ContextProviderProps]
  
  trait ContextProviderProps extends StObject {
    
    var options: js.UndefOr[SetOptionsParams] = js.undefined
    
    var session: js.UndefOr[Session_ | Null] = js.undefined
  }
  object ContextProviderProps {
    
    inline def apply(): ContextProviderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContextProviderProps]
    }
    
    extension [Self <: ContextProviderProps](x: Self) {
      
      inline def setOptions(value: SetOptionsParams): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setSession(value: Session_): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      inline def setSessionNull: Self = StObject.set(x, "session", null)
      
      inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
    }
  }
  
  type GetProvidersResponse = StringDictionary[SessionProvider]
  
  trait NextContext extends StObject {
    
    var ctx: js.UndefOr[Req] = js.undefined
    
    var req: js.UndefOr[IncomingMessage] = js.undefined
  }
  object NextContext {
    
    inline def apply(): NextContext = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NextContext]
    }
    
    extension [Self <: NextContext](x: Self) {
      
      inline def setCtx(value: Req): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
      
      inline def setCtxUndefined: Self = StObject.set(x, "ctx", js.undefined)
      
      inline def setReq(value: IncomingMessage): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
      
      inline def setReqUndefined: Self = StObject.set(x, "req", js.undefined)
    }
  }
  
  trait SessionProvider
    extends StObject
       with GenericObject {
    
    var callbackUrl: String
    
    var id: String
    
    var name: String
    
    var signinUrl: String
    
    var `type`: String
  }
  object SessionProvider {
    
    inline def apply(callbackUrl: String, id: String, name: String, signinUrl: String, `type`: String): SessionProvider = {
      val __obj = js.Dynamic.literal(callbackUrl = callbackUrl.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], signinUrl = signinUrl.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SessionProvider]
    }
    
    extension [Self <: SessionProvider](x: Self) {
      
      inline def setCallbackUrl(value: String): Self = StObject.set(x, "callbackUrl", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSigninUrl(value: String): Self = StObject.set(x, "signinUrl", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Session_
    extends StObject
       with SessionBase
       with GenericObject
  object Session_ {
    
    inline def apply(expires: String, user: User): Session_ = {
      val __obj = js.Dynamic.literal(expires = expires.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[Session_]
    }
  }
  
  trait SetOptionsParams extends StObject {
    
    var basePath: js.UndefOr[String] = js.undefined
    
    var baseUrl: js.UndefOr[String] = js.undefined
    
    var clientMaxAge: js.UndefOr[Double] = js.undefined
    
    var keepAlive: js.UndefOr[Double] = js.undefined
  }
  object SetOptionsParams {
    
    inline def apply(): SetOptionsParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SetOptionsParams]
    }
    
    extension [Self <: SetOptionsParams](x: Self) {
      
      inline def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
      
      inline def setBasePathUndefined: Self = StObject.set(x, "basePath", js.undefined)
      
      inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      inline def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      inline def setClientMaxAge(value: Double): Self = StObject.set(x, "clientMaxAge", value.asInstanceOf[js.Any])
      
      inline def setClientMaxAgeUndefined: Self = StObject.set(x, "clientMaxAge", js.undefined)
      
      inline def setKeepAlive(value: Double): Self = StObject.set(x, "keepAlive", value.asInstanceOf[js.Any])
      
      inline def setKeepAliveUndefined: Self = StObject.set(x, "keepAlive", js.undefined)
    }
  }
}
