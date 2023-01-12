package typings.passportTwitchLatest

import typings.express.mod.Request_
import typings.node.httpMod.OutgoingHttpHeaders
import typings.passportOauth2.mod.StateStore
import typings.passportOauth2.mod.VerifyCallback
import typings.passportOauth2.mod.^
import typings.passportTwitchLatest.passportTwitchLatestBooleans.`false`
import typings.passportTwitchLatest.passportTwitchLatestBooleans.`true`
import typings.std.Omit
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("passport-twitch-latest", "OAuth2Strategy")
  @js.native
  open class OAuth2Strategy protected () extends Strategy {
    // Disabling this tslint rule as unifying the signatures makes the callback function default to inferring the
    // longest callback which breaks the example config. See: https://github.com/Microsoft/TypeScript/issues/16867
    def this(options: StrategyOptionsWithRequest, verify: VerifyFunctionWithRequest) = this()
    // tslint:disable-next-line unified-signatures
    def this(options: StrategyOptionsWithRequest, verify: VerifyFunctionWithRequestResults) = this()
    def this(options: StrategyOptions, verify: VerifyFunction) = this()
    // tslint:disable-next-line unified-signatures
    def this(options: StrategyOptions, verify: VerifyFunctionWithResults) = this()
  }
  
  @JSImport("passport-twitch-latest", "Strategy")
  @js.native
  open class Strategy protected () extends ^ {
    // Disabling this tslint rule as unifying the signatures makes the callback function default to inferring the
    // longest callback which breaks the example config. See: https://github.com/Microsoft/TypeScript/issues/16867
    def this(options: StrategyOptionsWithRequest, verify: VerifyFunctionWithRequest) = this()
    // tslint:disable-next-line unified-signatures
    def this(options: StrategyOptionsWithRequest, verify: VerifyFunctionWithRequestResults) = this()
    def this(options: StrategyOptions, verify: VerifyFunction) = this()
    // tslint:disable-next-line unified-signatures
    def this(options: StrategyOptions, verify: VerifyFunctionWithResults) = this()
    
    def authenticate(
      req: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ]
    ): Unit = js.native
    def authenticate(
      req: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ],
      options: AuthenticateOptions
    ): Unit = js.native
    
    def authorize(strategy: String): AuthenticateRet = js.native
    def authorize(strategy: String, callback: js.Function1[/* repeated */ Any, Any]): AuthenticateRet = js.native
    def authorize(strategy: String, options: AuthenticateOptions): AuthenticateRet = js.native
    def authorize(strategy: String, options: AuthenticateOptions, callback: js.Function1[/* repeated */ Any, Any]): AuthenticateRet = js.native
    def authorize(strategy: js.Array[String]): AuthenticateRet = js.native
    def authorize(strategy: js.Array[String], callback: js.Function1[/* repeated */ Any, Any]): AuthenticateRet = js.native
    def authorize(strategy: js.Array[String], options: AuthenticateOptions): AuthenticateRet = js.native
    def authorize(
      strategy: js.Array[String],
      options: AuthenticateOptions,
      callback: js.Function1[/* repeated */ Any, Any]
    ): AuthenticateRet = js.native
    
    def userProfile(
      accessToken: String,
      done: js.Function2[/* err */ js.UndefOr[js.Error | Null], /* profile */ js.UndefOr[TwitchProfile], Unit]
    ): Unit = js.native
  }
  
  trait AuthenticateOptions
    extends StObject
       with typings.passport.mod.AuthenticateOptions {
    
    var forceVerify: js.UndefOr[Boolean] = js.undefined
  }
  object AuthenticateOptions {
    
    inline def apply(): AuthenticateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AuthenticateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AuthenticateOptions] (val x: Self) extends AnyVal {
      
      inline def setForceVerify(value: Boolean): Self = StObject.set(x, "forceVerify", value.asInstanceOf[js.Any])
      
      inline def setForceVerifyUndefined: Self = StObject.set(x, "forceVerify", js.undefined)
    }
  }
  
  trait AuthenticateRet extends StObject {
    
    var force_verify: js.UndefOr[Boolean] = js.undefined
  }
  object AuthenticateRet {
    
    inline def apply(): AuthenticateRet = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AuthenticateRet]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AuthenticateRet] (val x: Self) extends AnyVal {
      
      inline def setForce_verify(value: Boolean): Self = StObject.set(x, "force_verify", value.asInstanceOf[js.Any])
      
      inline def setForce_verifyUndefined: Self = StObject.set(x, "force_verify", js.undefined)
    }
  }
  
  type Optional[T, K /* <: /* keyof T */ String */] = (Omit[T, K]) & Partial[T]
  
  /* Inlined passport-twitch-latest.passport-twitch-latest.Optional<passport-oauth2.passport-oauth2.StrategyOptions, 'authorizationURL' | 'tokenURL'> */
  trait StrategyOptions extends StObject {
    
    var authorizationURL: js.UndefOr[String] = js.undefined
    
    var callbackURL: js.UndefOr[String] = js.undefined
    
    var clientID: String
    
    var clientSecret: String
    
    var customHeaders: js.UndefOr[OutgoingHttpHeaders] = js.undefined
    
    var passReqToCallback: js.UndefOr[`false`] = js.undefined
    
    var pkce: js.UndefOr[Boolean] = js.undefined
    
    var proxy: js.UndefOr[Any] = js.undefined
    
    var scope: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var scopeSeparator: js.UndefOr[String] = js.undefined
    
    var sessionKey: js.UndefOr[String] = js.undefined
    
    var skipUserProfile: js.UndefOr[Any] = js.undefined
    
    var state: js.UndefOr[Any] = js.undefined
    
    var store: js.UndefOr[StateStore] = js.undefined
    
    var tokenURL: js.UndefOr[String] = js.undefined
  }
  object StrategyOptions {
    
    inline def apply(clientID: String, clientSecret: String): StrategyOptions = {
      val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any])
      __obj.asInstanceOf[StrategyOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StrategyOptions] (val x: Self) extends AnyVal {
      
      inline def setAuthorizationURL(value: String): Self = StObject.set(x, "authorizationURL", value.asInstanceOf[js.Any])
      
      inline def setAuthorizationURLUndefined: Self = StObject.set(x, "authorizationURL", js.undefined)
      
      inline def setCallbackURL(value: String): Self = StObject.set(x, "callbackURL", value.asInstanceOf[js.Any])
      
      inline def setCallbackURLUndefined: Self = StObject.set(x, "callbackURL", js.undefined)
      
      inline def setClientID(value: String): Self = StObject.set(x, "clientID", value.asInstanceOf[js.Any])
      
      inline def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
      
      inline def setCustomHeaders(value: OutgoingHttpHeaders): Self = StObject.set(x, "customHeaders", value.asInstanceOf[js.Any])
      
      inline def setCustomHeadersUndefined: Self = StObject.set(x, "customHeaders", js.undefined)
      
      inline def setPassReqToCallback(value: `false`): Self = StObject.set(x, "passReqToCallback", value.asInstanceOf[js.Any])
      
      inline def setPassReqToCallbackUndefined: Self = StObject.set(x, "passReqToCallback", js.undefined)
      
      inline def setPkce(value: Boolean): Self = StObject.set(x, "pkce", value.asInstanceOf[js.Any])
      
      inline def setPkceUndefined: Self = StObject.set(x, "pkce", js.undefined)
      
      inline def setProxy(value: Any): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
      
      inline def setScope(value: String | js.Array[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeSeparator(value: String): Self = StObject.set(x, "scopeSeparator", value.asInstanceOf[js.Any])
      
      inline def setScopeSeparatorUndefined: Self = StObject.set(x, "scopeSeparator", js.undefined)
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setScopeVarargs(value: String*): Self = StObject.set(x, "scope", js.Array(value*))
      
      inline def setSessionKey(value: String): Self = StObject.set(x, "sessionKey", value.asInstanceOf[js.Any])
      
      inline def setSessionKeyUndefined: Self = StObject.set(x, "sessionKey", js.undefined)
      
      inline def setSkipUserProfile(value: Any): Self = StObject.set(x, "skipUserProfile", value.asInstanceOf[js.Any])
      
      inline def setSkipUserProfileUndefined: Self = StObject.set(x, "skipUserProfile", js.undefined)
      
      inline def setState(value: Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setStore(value: StateStore): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      inline def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
      
      inline def setTokenURL(value: String): Self = StObject.set(x, "tokenURL", value.asInstanceOf[js.Any])
      
      inline def setTokenURLUndefined: Self = StObject.set(x, "tokenURL", js.undefined)
    }
  }
  
  /* Inlined passport-twitch-latest.passport-twitch-latest.Optional<passport-oauth2.passport-oauth2.StrategyOptionsWithRequest, 'authorizationURL' | 'tokenURL'> */
  trait StrategyOptionsWithRequest extends StObject {
    
    var authorizationURL: js.UndefOr[String] = js.undefined
    
    var callbackURL: js.UndefOr[String] = js.undefined
    
    var clientID: String
    
    var clientSecret: String
    
    var customHeaders: js.UndefOr[OutgoingHttpHeaders] = js.undefined
    
    var passReqToCallback: `true`
    
    var pkce: js.UndefOr[Boolean] = js.undefined
    
    var proxy: js.UndefOr[Any] = js.undefined
    
    var scope: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var scopeSeparator: js.UndefOr[String] = js.undefined
    
    var sessionKey: js.UndefOr[String] = js.undefined
    
    var skipUserProfile: js.UndefOr[Any] = js.undefined
    
    var state: js.UndefOr[Any] = js.undefined
    
    var store: js.UndefOr[StateStore] = js.undefined
    
    var tokenURL: js.UndefOr[String] = js.undefined
  }
  object StrategyOptionsWithRequest {
    
    inline def apply(clientID: String, clientSecret: String): StrategyOptionsWithRequest = {
      val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], passReqToCallback = true)
      __obj.asInstanceOf[StrategyOptionsWithRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StrategyOptionsWithRequest] (val x: Self) extends AnyVal {
      
      inline def setAuthorizationURL(value: String): Self = StObject.set(x, "authorizationURL", value.asInstanceOf[js.Any])
      
      inline def setAuthorizationURLUndefined: Self = StObject.set(x, "authorizationURL", js.undefined)
      
      inline def setCallbackURL(value: String): Self = StObject.set(x, "callbackURL", value.asInstanceOf[js.Any])
      
      inline def setCallbackURLUndefined: Self = StObject.set(x, "callbackURL", js.undefined)
      
      inline def setClientID(value: String): Self = StObject.set(x, "clientID", value.asInstanceOf[js.Any])
      
      inline def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
      
      inline def setCustomHeaders(value: OutgoingHttpHeaders): Self = StObject.set(x, "customHeaders", value.asInstanceOf[js.Any])
      
      inline def setCustomHeadersUndefined: Self = StObject.set(x, "customHeaders", js.undefined)
      
      inline def setPassReqToCallback(value: `true`): Self = StObject.set(x, "passReqToCallback", value.asInstanceOf[js.Any])
      
      inline def setPkce(value: Boolean): Self = StObject.set(x, "pkce", value.asInstanceOf[js.Any])
      
      inline def setPkceUndefined: Self = StObject.set(x, "pkce", js.undefined)
      
      inline def setProxy(value: Any): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
      
      inline def setScope(value: String | js.Array[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeSeparator(value: String): Self = StObject.set(x, "scopeSeparator", value.asInstanceOf[js.Any])
      
      inline def setScopeSeparatorUndefined: Self = StObject.set(x, "scopeSeparator", js.undefined)
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setScopeVarargs(value: String*): Self = StObject.set(x, "scope", js.Array(value*))
      
      inline def setSessionKey(value: String): Self = StObject.set(x, "sessionKey", value.asInstanceOf[js.Any])
      
      inline def setSessionKeyUndefined: Self = StObject.set(x, "sessionKey", js.undefined)
      
      inline def setSkipUserProfile(value: Any): Self = StObject.set(x, "skipUserProfile", value.asInstanceOf[js.Any])
      
      inline def setSkipUserProfileUndefined: Self = StObject.set(x, "skipUserProfile", js.undefined)
      
      inline def setState(value: Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setStore(value: StateStore): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      inline def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
      
      inline def setTokenURL(value: String): Self = StObject.set(x, "tokenURL", value.asInstanceOf[js.Any])
      
      inline def setTokenURLUndefined: Self = StObject.set(x, "tokenURL", js.undefined)
    }
  }
  
  trait TwitchProfile extends StObject {
    
    var broadcaster_type: String
    
    var description: String
    
    var display_name: String
    
    var id: String
    
    var login: String
    
    var offline_image_url: String
    
    var profile_image_url: String
    
    var provider: String
    
    var `type`: String
    
    var view_count: Double
  }
  object TwitchProfile {
    
    inline def apply(
      broadcaster_type: String,
      description: String,
      display_name: String,
      id: String,
      login: String,
      offline_image_url: String,
      profile_image_url: String,
      provider: String,
      `type`: String,
      view_count: Double
    ): TwitchProfile = {
      val __obj = js.Dynamic.literal(broadcaster_type = broadcaster_type.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], display_name = display_name.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], login = login.asInstanceOf[js.Any], offline_image_url = offline_image_url.asInstanceOf[js.Any], profile_image_url = profile_image_url.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], view_count = view_count.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TwitchProfile]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TwitchProfile] (val x: Self) extends AnyVal {
      
      inline def setBroadcaster_type(value: String): Self = StObject.set(x, "broadcaster_type", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDisplay_name(value: String): Self = StObject.set(x, "display_name", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLogin(value: String): Self = StObject.set(x, "login", value.asInstanceOf[js.Any])
      
      inline def setOffline_image_url(value: String): Self = StObject.set(x, "offline_image_url", value.asInstanceOf[js.Any])
      
      inline def setProfile_image_url(value: String): Self = StObject.set(x, "profile_image_url", value.asInstanceOf[js.Any])
      
      inline def setProvider(value: String): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setView_count(value: Double): Self = StObject.set(x, "view_count", value.asInstanceOf[js.Any])
    }
  }
  
  type VerifyFunction = js.Function4[
    /* accessToken */ String, 
    /* refreshToken */ String, 
    /* profile */ TwitchProfile, 
    /* verified */ VerifyCallback, 
    Unit
  ]
  
  type VerifyFunctionWithRequest = js.Function5[
    /* req */ Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ], 
    /* accessToken */ String, 
    /* refreshToken */ String, 
    /* profile */ TwitchProfile, 
    /* verified */ VerifyCallback, 
    Unit
  ]
  
  type VerifyFunctionWithRequestResults = js.Function6[
    /* req */ Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ], 
    /* accessToken */ String, 
    /* refreshToken */ String, 
    /* results */ Any, 
    /* profile */ TwitchProfile, 
    /* verified */ VerifyCallback, 
    Unit
  ]
  
  type VerifyFunctionWithResults = js.Function5[
    /* accessToken */ String, 
    /* refreshToken */ String, 
    /* results */ Any, 
    /* profile */ TwitchProfile, 
    /* verified */ VerifyCallback, 
    Unit
  ]
}
