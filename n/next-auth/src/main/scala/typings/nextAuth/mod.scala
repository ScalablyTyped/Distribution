package typings.nextAuth

import org.scalablytyped.runtime.StringDictionary
import typings.nextAuth.adaptersMod.Adapter
import typings.nextAuth.clientMod.SessionProvider
import typings.nextAuth.jwtMod.JWTDecodeParams
import typings.nextAuth.jwtMod.JWTEncodeParams
import typings.nextAuth.nextAuthBooleans.`true`
import typings.nextAuth.nextAuthStrings.`verify-request`
import typings.nextAuth.nextAuthStrings.callback
import typings.nextAuth.nextAuthStrings.csrf
import typings.nextAuth.nextAuthStrings.error
import typings.nextAuth.nextAuthStrings.lax
import typings.nextAuth.nextAuthStrings.none
import typings.nextAuth.nextAuthStrings.providers
import typings.nextAuth.nextAuthStrings.session
import typings.nextAuth.nextAuthStrings.signin
import typings.nextAuth.nextAuthStrings.signout
import typings.nextAuth.nextAuthStrings.strict
import typings.nextAuth.providersMod.PossibleProviders
import typings.nextAuth.utilsMod.GenericObject
import typings.nextAuth.utilsMod.NextApiRequest
import typings.nextAuth.utilsMod.NextApiResponse
import typings.nextAuth.utilsMod.SessionBase
import typings.std.ReturnType
import typings.typeorm.connectionConnectionOptionsMod.ConnectionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("next-auth", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(req: NextApiRequest, res: NextApiResponse[js.Any]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(req.asInstanceOf[js.Any], res.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def default(req: NextApiRequest, res: NextApiResponse[js.Any], options: InitOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(req.asInstanceOf[js.Any], res.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  trait AppOptions extends StObject {
    
    var action: providers | session | csrf | signin | signout | callback | `verify-request` | error
    
    var adapter: Adapter[js.Any, js.Any, js.Any, js.Any]
    
    var basePath: String
    
    var baseUrl: String
    
    var callbackUrl: String
    
    var callbacks: Callbacks
    
    var cookies: Cookies
    
    var csrfToken: String
    
    var debug: Boolean
    
    var events: Events
    
    var jwt: JWTOptions
    
    var pages: PageOptions
    
    var provider: js.UndefOr[String] = js.undefined
    
    var providers: StringDictionary[SessionProvider]
    
    var secret: String
    
    var session: Session
  }
  object AppOptions {
    
    @scala.inline
    def apply(
      action: providers | session | csrf | signin | signout | callback | `verify-request` | error,
      adapter: Adapter[js.Any, js.Any, js.Any, js.Any],
      basePath: String,
      baseUrl: String,
      callbackUrl: String,
      callbacks: Callbacks,
      cookies: Cookies,
      csrfToken: String,
      debug: Boolean,
      events: Events,
      jwt: JWTOptions,
      pages: PageOptions,
      providers: StringDictionary[SessionProvider],
      secret: String,
      session: Session
    ): AppOptions = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], adapter = adapter.asInstanceOf[js.Any], basePath = basePath.asInstanceOf[js.Any], baseUrl = baseUrl.asInstanceOf[js.Any], callbackUrl = callbackUrl.asInstanceOf[js.Any], callbacks = callbacks.asInstanceOf[js.Any], cookies = cookies.asInstanceOf[js.Any], csrfToken = csrfToken.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], jwt = jwt.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], providers = providers.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppOptions]
    }
    
    @scala.inline
    implicit class AppOptionsMutableBuilder[Self <: AppOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: providers | session | csrf | signin | signout | callback | `verify-request` | error): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdapter(value: Adapter[js.Any, js.Any, js.Any, js.Any]): Self = StObject.set(x, "adapter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallbackUrl(value: String): Self = StObject.set(x, "callbackUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallbacks(value: Callbacks): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookies(value: Cookies): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCsrfToken(value: String): Self = StObject.set(x, "csrfToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvents(value: Events): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJwt(value: JWTOptions): Self = StObject.set(x, "jwt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPages(value: PageOptions): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvider(value: String): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
      
      @scala.inline
      def setProviders(value: StringDictionary[SessionProvider]): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSession(value: Session): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    }
  }
  
  // TODO: Improve callback typings
  trait Callbacks extends StObject {
    
    var jwt: js.UndefOr[
        js.Function5[
          /* token */ GenericObject, 
          /* user */ User, 
          /* account */ GenericObject, 
          /* profile */ GenericObject, 
          /* isNewUser */ Boolean, 
          js.Promise[GenericObject]
        ]
      ] = js.undefined
    
    var redirect: js.UndefOr[js.Function2[/* url */ String, /* baseUrl */ String, js.Promise[String]]] = js.undefined
    
    var session: js.UndefOr[
        js.Function2[/* session */ SessionBase, /* user */ User, js.Promise[GenericObject]]
      ] = js.undefined
    
    var signIn: js.UndefOr[
        js.Function3[
          /* user */ User, 
          /* account */ GenericObject, 
          /* profile */ GenericObject, 
          js.Promise[Boolean]
        ]
      ] = js.undefined
  }
  object Callbacks {
    
    @scala.inline
    def apply(): Callbacks = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Callbacks]
    }
    
    @scala.inline
    implicit class CallbacksMutableBuilder[Self <: Callbacks] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setJwt(
        value: (/* token */ GenericObject, /* user */ User, /* account */ GenericObject, /* profile */ GenericObject, /* isNewUser */ Boolean) => js.Promise[GenericObject]
      ): Self = StObject.set(x, "jwt", js.Any.fromFunction5(value))
      
      @scala.inline
      def setJwtUndefined: Self = StObject.set(x, "jwt", js.undefined)
      
      @scala.inline
      def setRedirect(value: (/* url */ String, /* baseUrl */ String) => js.Promise[String]): Self = StObject.set(x, "redirect", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
      
      @scala.inline
      def setSession(value: (/* session */ SessionBase, /* user */ User) => js.Promise[GenericObject]): Self = StObject.set(x, "session", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
      
      @scala.inline
      def setSignIn(
        value: (/* user */ User, /* account */ GenericObject, /* profile */ GenericObject) => js.Promise[Boolean]
      ): Self = StObject.set(x, "signIn", js.Any.fromFunction3(value))
      
      @scala.inline
      def setSignInUndefined: Self = StObject.set(x, "signIn", js.undefined)
    }
  }
  
  trait Cookie extends StObject {
    
    var name: String
    
    var options: js.UndefOr[CookieOptions] = js.undefined
  }
  object Cookie {
    
    @scala.inline
    def apply(name: String): Cookie = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cookie]
    }
    
    @scala.inline
    implicit class CookieMutableBuilder[Self <: Cookie] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: CookieOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
  
  trait CookieOptions extends StObject {
    
    var httpOnly: js.UndefOr[Boolean] = js.undefined
    
    var maxAge: js.UndefOr[Double] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var sameSite: js.UndefOr[`true` | strict | lax | none] = js.undefined
    
    var secure: js.UndefOr[Boolean] = js.undefined
  }
  object CookieOptions {
    
    @scala.inline
    def apply(): CookieOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CookieOptions]
    }
    
    @scala.inline
    implicit class CookieOptionsMutableBuilder[Self <: CookieOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHttpOnly(value: Boolean): Self = StObject.set(x, "httpOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpOnlyUndefined: Self = StObject.set(x, "httpOnly", js.undefined)
      
      @scala.inline
      def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setSameSite(value: `true` | strict | lax | none): Self = StObject.set(x, "sameSite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSameSiteUndefined: Self = StObject.set(x, "sameSite", js.undefined)
      
      @scala.inline
      def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
    }
  }
  
  type Cookies = StringDictionary[Cookie]
  
  trait Events extends StObject {
    
    var createUser: js.UndefOr[js.Function1[/* message */ js.Any, js.Promise[Unit]]] = js.undefined
    
    var error: js.UndefOr[js.Function1[/* message */ js.Any, js.Promise[Unit]]] = js.undefined
    
    var linkAccount: js.UndefOr[js.Function1[/* message */ js.Any, js.Promise[Unit]]] = js.undefined
    
    var session: js.UndefOr[js.Function1[/* message */ js.Any, js.Promise[Unit]]] = js.undefined
    
    var signIn: js.UndefOr[js.Function1[/* message */ js.Any, js.Promise[Unit]]] = js.undefined
    
    var signOut: js.UndefOr[js.Function1[/* message */ js.Any, js.Promise[Unit]]] = js.undefined
    
    var updateUser: js.UndefOr[js.Function1[/* message */ js.Any, js.Promise[Unit]]] = js.undefined
  }
  object Events {
    
    @scala.inline
    def apply(): Events = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Events]
    }
    
    @scala.inline
    implicit class EventsMutableBuilder[Self <: Events] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreateUser(value: /* message */ js.Any => js.Promise[Unit]): Self = StObject.set(x, "createUser", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCreateUserUndefined: Self = StObject.set(x, "createUser", js.undefined)
      
      @scala.inline
      def setError(value: /* message */ js.Any => js.Promise[Unit]): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setLinkAccount(value: /* message */ js.Any => js.Promise[Unit]): Self = StObject.set(x, "linkAccount", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLinkAccountUndefined: Self = StObject.set(x, "linkAccount", js.undefined)
      
      @scala.inline
      def setSession(value: /* message */ js.Any => js.Promise[Unit]): Self = StObject.set(x, "session", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
      
      @scala.inline
      def setSignIn(value: /* message */ js.Any => js.Promise[Unit]): Self = StObject.set(x, "signIn", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSignInUndefined: Self = StObject.set(x, "signIn", js.undefined)
      
      @scala.inline
      def setSignOut(value: /* message */ js.Any => js.Promise[Unit]): Self = StObject.set(x, "signOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSignOutUndefined: Self = StObject.set(x, "signOut", js.undefined)
      
      @scala.inline
      def setUpdateUser(value: /* message */ js.Any => js.Promise[Unit]): Self = StObject.set(x, "updateUser", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUpdateUserUndefined: Self = StObject.set(x, "updateUser", js.undefined)
    }
  }
  
  trait InitOptions extends StObject {
    
    var adapter: js.UndefOr[Adapter[js.Any, js.Any, js.Any, js.Any]] = js.undefined
    
    var callbacks: js.UndefOr[Callbacks] = js.undefined
    
    var cookies: js.UndefOr[Cookies] = js.undefined
    
    var database: js.UndefOr[String | ConnectionOptions] = js.undefined
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var events: js.UndefOr[Events] = js.undefined
    
    var jwt: js.UndefOr[JWTOptions] = js.undefined
    
    var pages: js.UndefOr[PageOptions] = js.undefined
    
    var providers: js.Array[ReturnType[PossibleProviders]]
    
    var secret: js.UndefOr[String] = js.undefined
    
    var session: js.UndefOr[Session] = js.undefined
    
    var useSecureCookies: js.UndefOr[Boolean] = js.undefined
  }
  object InitOptions {
    
    @scala.inline
    def apply(providers: js.Array[ReturnType[PossibleProviders]]): InitOptions = {
      val __obj = js.Dynamic.literal(providers = providers.asInstanceOf[js.Any])
      __obj.asInstanceOf[InitOptions]
    }
    
    @scala.inline
    implicit class InitOptionsMutableBuilder[Self <: InitOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdapter(value: Adapter[js.Any, js.Any, js.Any, js.Any]): Self = StObject.set(x, "adapter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdapterUndefined: Self = StObject.set(x, "adapter", js.undefined)
      
      @scala.inline
      def setCallbacks(value: Callbacks): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallbacksUndefined: Self = StObject.set(x, "callbacks", js.undefined)
      
      @scala.inline
      def setCookies(value: Cookies): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookiesUndefined: Self = StObject.set(x, "cookies", js.undefined)
      
      @scala.inline
      def setDatabase(value: String | ConnectionOptions): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setEvents(value: Events): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      @scala.inline
      def setJwt(value: JWTOptions): Self = StObject.set(x, "jwt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJwtUndefined: Self = StObject.set(x, "jwt", js.undefined)
      
      @scala.inline
      def setPages(value: PageOptions): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPagesUndefined: Self = StObject.set(x, "pages", js.undefined)
      
      @scala.inline
      def setProviders(value: js.Array[ReturnType[PossibleProviders]]): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvidersVarargs(value: ReturnType[PossibleProviders]*): Self = StObject.set(x, "providers", js.Array(value :_*))
      
      @scala.inline
      def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
      
      @scala.inline
      def setSession(value: Session): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
      
      @scala.inline
      def setUseSecureCookies(value: Boolean): Self = StObject.set(x, "useSecureCookies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseSecureCookiesUndefined: Self = StObject.set(x, "useSecureCookies", js.undefined)
    }
  }
  
  trait JWTOptions extends StObject {
    
    var decode: js.UndefOr[js.Function1[/* options */ JWTDecodeParams, js.Promise[String]]] = js.undefined
    
    var encode: js.UndefOr[js.Function1[/* options */ JWTEncodeParams, js.Promise[String]]] = js.undefined
    
    var encryption: js.UndefOr[Boolean] = js.undefined
    
    var maxAge: js.UndefOr[Double] = js.undefined
    
    var secret: js.UndefOr[String] = js.undefined
  }
  object JWTOptions {
    
    @scala.inline
    def apply(): JWTOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JWTOptions]
    }
    
    @scala.inline
    implicit class JWTOptionsMutableBuilder[Self <: JWTOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDecode(value: /* options */ JWTDecodeParams => js.Promise[String]): Self = StObject.set(x, "decode", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDecodeUndefined: Self = StObject.set(x, "decode", js.undefined)
      
      @scala.inline
      def setEncode(value: /* options */ JWTEncodeParams => js.Promise[String]): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEncodeUndefined: Self = StObject.set(x, "encode", js.undefined)
      
      @scala.inline
      def setEncryption(value: Boolean): Self = StObject.set(x, "encryption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncryptionUndefined: Self = StObject.set(x, "encryption", js.undefined)
      
      @scala.inline
      def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      @scala.inline
      def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
    }
  }
  
  trait PageOptions extends StObject {
    
    var error: js.UndefOr[String] = js.undefined
    
    var newUser: js.UndefOr[String | Null] = js.undefined
    
    var signIn: js.UndefOr[String] = js.undefined
    
    var signOut: js.UndefOr[String] = js.undefined
    
    var verifyRequest: js.UndefOr[String] = js.undefined
  }
  object PageOptions {
    
    @scala.inline
    def apply(): PageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PageOptions]
    }
    
    @scala.inline
    implicit class PageOptionsMutableBuilder[Self <: PageOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setNewUser(value: String): Self = StObject.set(x, "newUser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewUserNull: Self = StObject.set(x, "newUser", null)
      
      @scala.inline
      def setNewUserUndefined: Self = StObject.set(x, "newUser", js.undefined)
      
      @scala.inline
      def setSignIn(value: String): Self = StObject.set(x, "signIn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignInUndefined: Self = StObject.set(x, "signIn", js.undefined)
      
      @scala.inline
      def setSignOut(value: String): Self = StObject.set(x, "signOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignOutUndefined: Self = StObject.set(x, "signOut", js.undefined)
      
      @scala.inline
      def setVerifyRequest(value: String): Self = StObject.set(x, "verifyRequest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerifyRequestUndefined: Self = StObject.set(x, "verifyRequest", js.undefined)
    }
  }
  
  trait Session extends StObject {
    
    var jwt: js.UndefOr[Boolean] = js.undefined
    
    var maxAge: js.UndefOr[Double] = js.undefined
    
    var updateAge: js.UndefOr[Double] = js.undefined
  }
  object Session {
    
    @scala.inline
    def apply(): Session = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Session]
    }
    
    @scala.inline
    implicit class SessionMutableBuilder[Self <: Session] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setJwt(value: Boolean): Self = StObject.set(x, "jwt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJwtUndefined: Self = StObject.set(x, "jwt", js.undefined)
      
      @scala.inline
      def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      @scala.inline
      def setUpdateAge(value: Double): Self = StObject.set(x, "updateAge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateAgeUndefined: Self = StObject.set(x, "updateAge", js.undefined)
    }
  }
  
  trait User extends StObject {
    
    var email: js.UndefOr[String | Null] = js.undefined
    
    var image: js.UndefOr[String | Null] = js.undefined
    
    var name: js.UndefOr[String | Null] = js.undefined
  }
  object User {
    
    @scala.inline
    def apply(): User = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[User]
    }
    
    @scala.inline
    implicit class UserMutableBuilder[Self <: User] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailNull: Self = StObject.set(x, "email", null)
      
      @scala.inline
      def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      @scala.inline
      def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageNull: Self = StObject.set(x, "image", null)
      
      @scala.inline
      def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameNull: Self = StObject.set(x, "name", null)
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
}
