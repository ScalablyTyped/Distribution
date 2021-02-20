package typings.nextAuth

import org.scalablytyped.runtime.StringDictionary
import typings.nextAuth.anon.CallbackUrl
import typings.nextAuth.anon.GenericObjectcallbackUrls
import typings.nextAuth.anon.NextContexttriggerEventbo
import typings.nextAuth.anon.Req
import typings.nextAuth.utilsMod.GenericObject
import typings.nextAuth.utilsMod.SessionBase
import typings.node.httpMod.IncomingMessage
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clientMod {
  
  @JSImport("next-auth/client", "Provider")
  @js.native
  val Provider: ContextProvider = js.native
  
  @JSImport("next-auth/client", "csrfToken")
  @js.native
  def csrfToken(): js.Promise[String | Null] = js.native
  @JSImport("next-auth/client", "csrfToken")
  @js.native
  def csrfToken(context: NextContext): js.Promise[String | Null] = js.native
  
  /* was `typeof csrfToken` */
  @JSImport("next-auth/client", "getCsrfToken")
  @js.native
  def getCsrfToken(): js.Promise[String | Null] = js.native
  @JSImport("next-auth/client", "getCsrfToken")
  @js.native
  def getCsrfToken(context: NextContext): js.Promise[String | Null] = js.native
  
  /* was `typeof providers` */
  @JSImport("next-auth/client", "getProviders")
  @js.native
  def getProviders(): js.Promise[GetProvidersResponse | Null] = js.native
  
  /* was `typeof session` */
  @JSImport("next-auth/client", "getSession")
  @js.native
  def getSession(): js.Promise[Session_ | Null] = js.native
  @JSImport("next-auth/client", "getSession")
  @js.native
  def getSession(context: NextContexttriggerEventbo): js.Promise[Session_ | Null] = js.native
  
  @JSImport("next-auth/client", "options")
  @js.native
  def options(options: SetOptionsParams): Unit = js.native
  
  @JSImport("next-auth/client", "providers")
  @js.native
  def providers(): js.Promise[GetProvidersResponse | Null] = js.native
  
  @JSImport("next-auth/client", "session")
  @js.native
  def session(): js.Promise[Session_ | Null] = js.native
  @JSImport("next-auth/client", "session")
  @js.native
  def session(context: NextContexttriggerEventbo): js.Promise[Session_ | Null] = js.native
  
  /* was `typeof options` */
  @JSImport("next-auth/client", "setOptions")
  @js.native
  def setOptions(options: SetOptionsParams): Unit = js.native
  
  /* was `typeof signin` */
  @JSImport("next-auth/client", "signIn")
  @js.native
  def signIn_(): js.Promise[Unit] = js.native
  @JSImport("next-auth/client", "signIn")
  @js.native
  def signIn_(provider: js.UndefOr[scala.Nothing], data: GenericObjectcallbackUrls): js.Promise[Unit] = js.native
  @JSImport("next-auth/client", "signIn")
  @js.native
  def signIn_(provider: String): js.Promise[Unit] = js.native
  @JSImport("next-auth/client", "signIn")
  @js.native
  def signIn_(provider: String, data: GenericObjectcallbackUrls): js.Promise[Unit] = js.native
  
  /* was `typeof signout` */
  @JSImport("next-auth/client", "signOut")
  @js.native
  def signOut_(): js.Promise[Unit] = js.native
  @JSImport("next-auth/client", "signOut")
  @js.native
  def signOut_(data: CallbackUrl): js.Promise[Unit] = js.native
  
  @JSImport("next-auth/client", "signin")
  @js.native
  def signin(): js.Promise[Unit] = js.native
  @JSImport("next-auth/client", "signin")
  @js.native
  def signin(provider: js.UndefOr[scala.Nothing], data: GenericObjectcallbackUrls): js.Promise[Unit] = js.native
  @JSImport("next-auth/client", "signin")
  @js.native
  def signin(provider: String): js.Promise[Unit] = js.native
  @JSImport("next-auth/client", "signin")
  @js.native
  def signin(provider: String, data: GenericObjectcallbackUrls): js.Promise[Unit] = js.native
  
  @JSImport("next-auth/client", "signout")
  @js.native
  def signout(): js.Promise[Unit] = js.native
  @JSImport("next-auth/client", "signout")
  @js.native
  def signout(data: CallbackUrl): js.Promise[Unit] = js.native
  
  @JSImport("next-auth/client", "useSession")
  @js.native
  def useSession(): js.Tuple2[js.UndefOr[Session_ | Null], Boolean] = js.native
  
  type ContextProvider = FC[ContextProviderProps]
  
  @js.native
  trait ContextProviderProps extends StObject {
    
    var options: js.UndefOr[SetOptionsParams] = js.native
    
    var session: js.UndefOr[Session_ | Null] = js.native
  }
  object ContextProviderProps {
    
    @scala.inline
    def apply(): ContextProviderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContextProviderProps]
    }
    
    @scala.inline
    implicit class ContextProviderPropsMutableBuilder[Self <: ContextProviderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOptions(value: SetOptionsParams): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setSession(value: Session_): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionNull: Self = StObject.set(x, "session", null)
      
      @scala.inline
      def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
    }
  }
  
  type GetProvidersResponse = StringDictionary[SessionProvider]
  
  @js.native
  trait NextContext extends StObject {
    
    var ctx: js.UndefOr[Req] = js.native
    
    var req: js.UndefOr[IncomingMessage] = js.native
  }
  object NextContext {
    
    @scala.inline
    def apply(): NextContext = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NextContext]
    }
    
    @scala.inline
    implicit class NextContextMutableBuilder[Self <: NextContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCtx(value: Req): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCtxUndefined: Self = StObject.set(x, "ctx", js.undefined)
      
      @scala.inline
      def setReq(value: IncomingMessage): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReqUndefined: Self = StObject.set(x, "req", js.undefined)
    }
  }
  
  @js.native
  trait SessionProvider extends GenericObject {
    
    var callbackUrl: String = js.native
    
    var id: String = js.native
    
    var name: String = js.native
    
    var signinUrl: String = js.native
    
    var `type`: String = js.native
  }
  object SessionProvider {
    
    @scala.inline
    def apply(callbackUrl: String, id: String, name: String, signinUrl: String, `type`: String): SessionProvider = {
      val __obj = js.Dynamic.literal(callbackUrl = callbackUrl.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], signinUrl = signinUrl.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SessionProvider]
    }
    
    @scala.inline
    implicit class SessionProviderMutableBuilder[Self <: SessionProvider] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallbackUrl(value: String): Self = StObject.set(x, "callbackUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSigninUrl(value: String): Self = StObject.set(x, "signinUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type Session_ = SessionBase with GenericObject
  
  @js.native
  trait SetOptionsParams extends StObject {
    
    var basePath: js.UndefOr[String] = js.native
    
    var baseUrl: js.UndefOr[String] = js.native
    
    var clientMaxAge: js.UndefOr[Double] = js.native
    
    var keepAlive: js.UndefOr[Double] = js.native
  }
  object SetOptionsParams {
    
    @scala.inline
    def apply(): SetOptionsParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SetOptionsParams]
    }
    
    @scala.inline
    implicit class SetOptionsParamsMutableBuilder[Self <: SetOptionsParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBasePathUndefined: Self = StObject.set(x, "basePath", js.undefined)
      
      @scala.inline
      def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      @scala.inline
      def setClientMaxAge(value: Double): Self = StObject.set(x, "clientMaxAge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientMaxAgeUndefined: Self = StObject.set(x, "clientMaxAge", js.undefined)
      
      @scala.inline
      def setKeepAlive(value: Double): Self = StObject.set(x, "keepAlive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepAliveUndefined: Self = StObject.set(x, "keepAlive", js.undefined)
    }
  }
}
