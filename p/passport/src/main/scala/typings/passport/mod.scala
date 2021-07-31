package typings.passport

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.TopLevel
import typings.express.mod.Handler
import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.node.httpMod.IncomingMessage
import typings.passport.anon.FamilyName
import typings.passport.anon.Instantiable
import typings.passport.anon.PauseStream
import typings.passport.anon.Type
import typings.passport.anon.UserProperty
import typings.passport.anon.Value
import typings.passport.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("passport", JSImport.Namespace)
  @js.native
  val ^ : PassportStatic = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("passport", "Authenticator")
  @js.native
  class AuthenticatorCls ()
    extends StObject
       with Authenticator[Handler, js.Any, js.Any, AuthenticateOptions]
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("passport", "Passport")
  @js.native
  class Passport ()
    extends StObject
       with Authenticator[Handler, js.Any, js.Any, AuthenticateOptions]
  
  trait AuthenticateOptions extends StObject {
    
    var assignProperty: js.UndefOr[String] = js.undefined
    
    var authInfo: js.UndefOr[Boolean] = js.undefined
    
    var failWithError: js.UndefOr[Boolean] = js.undefined
    
    var failureFlash: js.UndefOr[String | Boolean] = js.undefined
    
    var failureMessage: js.UndefOr[Boolean | String] = js.undefined
    
    var failureRedirect: js.UndefOr[String] = js.undefined
    
    var passReqToCallback: js.UndefOr[Boolean] = js.undefined
    
    var pauseStream: js.UndefOr[Boolean] = js.undefined
    
    var prompt: js.UndefOr[String] = js.undefined
    
    var scope: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var session: js.UndefOr[Boolean] = js.undefined
    
    var state: js.UndefOr[String] = js.undefined
    
    var successFlash: js.UndefOr[String | Boolean] = js.undefined
    
    var successMessage: js.UndefOr[Boolean | String] = js.undefined
    
    var successRedirect: js.UndefOr[String] = js.undefined
    
    var successReturnToOrRedirect: js.UndefOr[String] = js.undefined
    
    var userProperty: js.UndefOr[String] = js.undefined
  }
  object AuthenticateOptions {
    
    @scala.inline
    def apply(): AuthenticateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AuthenticateOptions]
    }
    
    @scala.inline
    implicit class AuthenticateOptionsMutableBuilder[Self <: AuthenticateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAssignProperty(value: String): Self = StObject.set(x, "assignProperty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssignPropertyUndefined: Self = StObject.set(x, "assignProperty", js.undefined)
      
      @scala.inline
      def setAuthInfo(value: Boolean): Self = StObject.set(x, "authInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthInfoUndefined: Self = StObject.set(x, "authInfo", js.undefined)
      
      @scala.inline
      def setFailWithError(value: Boolean): Self = StObject.set(x, "failWithError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailWithErrorUndefined: Self = StObject.set(x, "failWithError", js.undefined)
      
      @scala.inline
      def setFailureFlash(value: String | Boolean): Self = StObject.set(x, "failureFlash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailureFlashUndefined: Self = StObject.set(x, "failureFlash", js.undefined)
      
      @scala.inline
      def setFailureMessage(value: Boolean | String): Self = StObject.set(x, "failureMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailureMessageUndefined: Self = StObject.set(x, "failureMessage", js.undefined)
      
      @scala.inline
      def setFailureRedirect(value: String): Self = StObject.set(x, "failureRedirect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailureRedirectUndefined: Self = StObject.set(x, "failureRedirect", js.undefined)
      
      @scala.inline
      def setPassReqToCallback(value: Boolean): Self = StObject.set(x, "passReqToCallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassReqToCallbackUndefined: Self = StObject.set(x, "passReqToCallback", js.undefined)
      
      @scala.inline
      def setPauseStream(value: Boolean): Self = StObject.set(x, "pauseStream", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPauseStreamUndefined: Self = StObject.set(x, "pauseStream", js.undefined)
      
      @scala.inline
      def setPrompt(value: String): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
      
      @scala.inline
      def setScope(value: String | js.Array[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      @scala.inline
      def setScopeVarargs(value: String*): Self = StObject.set(x, "scope", js.Array(value :_*))
      
      @scala.inline
      def setSession(value: Boolean): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      @scala.inline
      def setSuccessFlash(value: String | Boolean): Self = StObject.set(x, "successFlash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccessFlashUndefined: Self = StObject.set(x, "successFlash", js.undefined)
      
      @scala.inline
      def setSuccessMessage(value: Boolean | String): Self = StObject.set(x, "successMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccessMessageUndefined: Self = StObject.set(x, "successMessage", js.undefined)
      
      @scala.inline
      def setSuccessRedirect(value: String): Self = StObject.set(x, "successRedirect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccessRedirectUndefined: Self = StObject.set(x, "successRedirect", js.undefined)
      
      @scala.inline
      def setSuccessReturnToOrRedirect(value: String): Self = StObject.set(x, "successReturnToOrRedirect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccessReturnToOrRedirectUndefined: Self = StObject.set(x, "successReturnToOrRedirect", js.undefined)
      
      @scala.inline
      def setUserProperty(value: String): Self = StObject.set(x, "userProperty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserPropertyUndefined: Self = StObject.set(x, "userProperty", js.undefined)
    }
  }
  
  @js.native
  trait Authenticator[InitializeRet, AuthenticateRet, AuthorizeRet, AuthorizeOptions] extends StObject {
    
    def authenticate(strategy: String): AuthenticateRet = js.native
    def authenticate(strategy: String, callback: js.Function1[/* repeated */ js.Any, js.Any]): AuthenticateRet = js.native
    def authenticate(strategy: String, options: AuthenticateOptions): AuthenticateRet = js.native
    def authenticate(
      strategy: String,
      options: AuthenticateOptions,
      callback: js.Function1[/* repeated */ js.Any, js.Any]
    ): AuthenticateRet = js.native
    def authenticate(strategy: js.Array[String]): AuthenticateRet = js.native
    def authenticate(strategy: js.Array[String], callback: js.Function1[/* repeated */ js.Any, js.Any]): AuthenticateRet = js.native
    def authenticate(strategy: js.Array[String], options: AuthenticateOptions): AuthenticateRet = js.native
    def authenticate(
      strategy: js.Array[String],
      options: AuthenticateOptions,
      callback: js.Function1[/* repeated */ js.Any, js.Any]
    ): AuthenticateRet = js.native
    def authenticate(strategy: Strategy): AuthenticateRet = js.native
    def authenticate(strategy: Strategy, callback: js.Function1[/* repeated */ js.Any, js.Any]): AuthenticateRet = js.native
    def authenticate(strategy: Strategy, options: AuthenticateOptions): AuthenticateRet = js.native
    def authenticate(
      strategy: Strategy,
      options: AuthenticateOptions,
      callback: js.Function1[/* repeated */ js.Any, js.Any]
    ): AuthenticateRet = js.native
    
    def authorize(strategy: String): AuthorizeRet = js.native
    def authorize(strategy: String, callback: js.Function1[/* repeated */ js.Any, js.Any]): AuthorizeRet = js.native
    def authorize(strategy: String, options: AuthorizeOptions): AuthorizeRet = js.native
    def authorize(strategy: String, options: AuthorizeOptions, callback: js.Function1[/* repeated */ js.Any, js.Any]): AuthorizeRet = js.native
    def authorize(strategy: js.Array[String]): AuthorizeRet = js.native
    def authorize(strategy: js.Array[String], callback: js.Function1[/* repeated */ js.Any, js.Any]): AuthorizeRet = js.native
    def authorize(strategy: js.Array[String], options: AuthorizeOptions): AuthorizeRet = js.native
    def authorize(
      strategy: js.Array[String],
      options: AuthorizeOptions,
      callback: js.Function1[/* repeated */ js.Any, js.Any]
    ): AuthorizeRet = js.native
    
    def deserializeUser[TUser, TID](
      fn: js.Function2[
          /* id */ TID, 
          /* done */ js.Function2[/* err */ js.Any, /* user */ js.UndefOr[TUser], Unit], 
          Unit
        ]
    ): Unit = js.native
    def deserializeUser[TUser, TID, TR /* <: IncomingMessage */](
      fn: js.Function3[
          /* req */ TR, 
          /* id */ TID, 
          /* done */ js.Function2[/* err */ js.Any, /* user */ js.UndefOr[TUser], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    def framework[X, Y, Z](fw: Framework[X, Y, Z]): Authenticator[X, Y, Z, AuthenticateOptions] = js.native
    
    def initialize(): InitializeRet = js.native
    def initialize(options: UserProperty): InitializeRet = js.native
    
    def serializeUser[TUser, TID](
      fn: js.Function2[
          /* user */ TUser, 
          /* done */ js.Function2[/* err */ js.Any, /* id */ js.UndefOr[TID], Unit], 
          Unit
        ]
    ): Unit = js.native
    def serializeUser[TUser, TID, TR /* <: IncomingMessage */](
      fn: js.Function3[
          /* req */ TR, 
          /* user */ TUser, 
          /* done */ js.Function2[/* err */ js.Any, /* id */ js.UndefOr[TID], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    def session(): AuthenticateRet = js.native
    def session(options: PauseStream): AuthenticateRet = js.native
    
    def transformAuthInfo(
      fn: js.Function2[
          /* info */ js.Any, 
          /* done */ js.Function2[/* err */ js.Any, /* info */ js.Any, Unit], 
          Unit
        ]
    ): Unit = js.native
    
    def unuse(name: String): this.type = js.native
    
    def use(name: String, strategy: Strategy): this.type = js.native
    def use(strategy: Strategy): this.type = js.native
  }
  
  @js.native
  trait Framework[InitializeRet, AuthenticateRet, AuthorizeRet] extends StObject {
    
    def authenticate(
      passport: Authenticator[InitializeRet, AuthenticateRet, AuthorizeRet, AuthenticateOptions],
      name: String
    ): js.Function1[/* repeated */ js.Any, AuthenticateRet] = js.native
    def authenticate(
      passport: Authenticator[InitializeRet, AuthenticateRet, AuthorizeRet, AuthenticateOptions],
      name: String,
      options: js.Any
    ): js.Function1[/* repeated */ js.Any, AuthenticateRet] = js.native
    def authenticate(
      passport: Authenticator[InitializeRet, AuthenticateRet, AuthorizeRet, AuthenticateOptions],
      name: String,
      options: js.Any,
      callback: js.Function1[/* repeated */ js.Any, js.Any]
    ): js.Function1[/* repeated */ js.Any, AuthenticateRet] = js.native
    def authenticate(
      passport: Authenticator[InitializeRet, AuthenticateRet, AuthorizeRet, AuthenticateOptions],
      name: String,
      options: Unit,
      callback: js.Function1[/* repeated */ js.Any, js.Any]
    ): js.Function1[/* repeated */ js.Any, AuthenticateRet] = js.native
    
    var authorize: js.UndefOr[
        js.Function4[
          /* passport */ Authenticator[InitializeRet, AuthenticateRet, AuthorizeRet, AuthenticateOptions], 
          /* name */ String, 
          /* options */ js.UndefOr[js.Any], 
          /* callback */ js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]], 
          js.Function1[/* repeated */ js.Any, AuthorizeRet]
        ]
      ] = js.native
    
    def initialize(passport: Authenticator[InitializeRet, AuthenticateRet, AuthorizeRet, AuthenticateOptions]): js.Function1[/* repeated */ js.Any, InitializeRet] = js.native
    def initialize(
      passport: Authenticator[InitializeRet, AuthenticateRet, AuthorizeRet, AuthenticateOptions],
      options: js.Any
    ): js.Function1[/* repeated */ js.Any, InitializeRet] = js.native
  }
  
  @js.native
  trait PassportStatic
    extends StObject
       with Authenticator[Handler, js.Any, js.Any, AuthenticateOptions] {
    
    var Authenticator: Instantiable = js.native
    
    var Passport: Instantiable = js.native
    
    var Strategy: `0` = js.native
  }
  
  trait Profile extends StObject {
    
    var displayName: String
    
    var emails: js.UndefOr[js.Array[Type]] = js.undefined
    
    var id: String
    
    var name: js.UndefOr[FamilyName] = js.undefined
    
    var photos: js.UndefOr[js.Array[Value]] = js.undefined
    
    var provider: String
    
    var username: js.UndefOr[String] = js.undefined
  }
  object Profile {
    
    @scala.inline
    def apply(displayName: String, id: String, provider: String): Profile = {
      val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
      __obj.asInstanceOf[Profile]
    }
    
    @scala.inline
    implicit class ProfileMutableBuilder[Self <: Profile] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmails(value: js.Array[Type]): Self = StObject.set(x, "emails", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailsUndefined: Self = StObject.set(x, "emails", js.undefined)
      
      @scala.inline
      def setEmailsVarargs(value: Type*): Self = StObject.set(x, "emails", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: FamilyName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPhotos(value: js.Array[Value]): Self = StObject.set(x, "photos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhotosUndefined: Self = StObject.set(x, "photos", js.undefined)
      
      @scala.inline
      def setPhotosVarargs(value: Value*): Self = StObject.set(x, "photos", js.Array(value :_*))
      
      @scala.inline
      def setProvider(value: String): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
  
  @js.native
  trait Strategy extends StObject {
    
    def authenticate(req: Request_[ParamsDictionary, js.Any, js.Any, Query]): js.Any = js.native
    def authenticate(req: Request_[ParamsDictionary, js.Any, js.Any, Query], options: js.Any): js.Any = js.native
    
    var name: js.UndefOr[String] = js.native
  }
  
  type StrategyCreated[T, O] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof O ]: O[P]}
    */ typings.passport.passportStrings.StrategyCreated & TopLevel[O]
  
  @js.native
  trait StrategyCreatedStatic extends StObject {
    
    /**
      * Internal error while performing authentication.
      *
      * Strategies should call this function when an internal error occurs
      * during the process of performing authentication; for example, if the
      * user directory is not available.
      */
    def error(err: js.Any): Unit = js.native
    
    /**
      * Fail authentication, with optional `challenge` and `status`, defaulting
      * to 401.
      *
      * Strategies should call this function to fail an authentication attempt.
      */
    def fail(): Unit = js.native
    def fail(challenge: String): Unit = js.native
    def fail(challenge: String, status: Double): Unit = js.native
    def fail(challenge: Double): Unit = js.native
    def fail(challenge: Double, status: Double): Unit = js.native
    def fail(challenge: Unit, status: Double): Unit = js.native
    
    /**
      * Pass without making a success or fail decision.
      *
      * Under most circumstances, Strategies should not need to call this
      * function.  It exists primarily to allow previous authentication state
      * to be restored, for example from an HTTP session.
      */
    def pass(): Unit = js.native
    
    /**
      * Redirect to `url` with optional `status`, defaulting to 302.
      *
      * Strategies should call this function to redirect the user (via their
      * user agent) to a third-party website for authentication.
      */
    def redirect(url: String): Unit = js.native
    def redirect(url: String, status: Double): Unit = js.native
    
    /**
      * Authenticate `user`, with optional `info`.
      *
      * Strategies should call this function to successfully authenticate a
      * user.  `user` should be an object supplied by the application after it
      * has been given an opportunity to verify credentials.  `info` is an
      * optional argument containing additional user information.  This is
      * useful for third-party authentication strategies to pass profile
      * details.
      */
    def success(user: js.Object): Unit = js.native
    def success(user: js.Object, info: js.Object): Unit = js.native
  }
  
  type _To = PassportStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: PassportStatic = ^
  
  object global {
    
    object Express {
      
      // tslint:disable-next-line:no-empty-interface
      trait AuthInfo extends StObject
      
      @js.native
      trait Request extends StObject {
        
        var authInfo: js.UndefOr[AuthInfo] = js.native
        
        def isAuthenticated(): Boolean = js.native
        
        def isUnauthenticated(): Boolean = js.native
        
        def logIn(user: User, done: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
        def logIn(user: User, options: js.Any, done: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
        
        def logOut(): Unit = js.native
        
        // These declarations are merged into express's Request type
        def login(user: User, done: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
        def login(user: User, options: js.Any, done: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
        
        def logout(): Unit = js.native
        
        var user: js.UndefOr[User] = js.native
      }
      
      // tslint:disable-next-line:no-empty-interface
      trait User extends StObject
    }
  }
}
