package typings.passportTwitchLatest

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.node.httpMod.OutgoingHttpHeaders
import typings.passportOauth2.mod.StateStore
import typings.passportOauth2.mod.VerifyCallback
import typings.passportOauth2.mod.^
import typings.passportTwitchLatest.passportTwitchLatestBooleans.`false`
import typings.passportTwitchLatest.passportTwitchLatestBooleans.`true`
import typings.std.Error
import typings.std.Omit
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("passport-twitch-latest", "OAuth2Strategy")
  @js.native
  class OAuth2Strategy protected () extends Strategy {
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
  class Strategy protected () extends ^ {
    // Disabling this tslint rule as unifying the signatures makes the callback function default to inferring the
    // longest callback which breaks the example config. See: https://github.com/Microsoft/TypeScript/issues/16867
    def this(options: StrategyOptionsWithRequest, verify: VerifyFunctionWithRequest) = this()
    // tslint:disable-next-line unified-signatures
    def this(options: StrategyOptionsWithRequest, verify: VerifyFunctionWithRequestResults) = this()
    def this(options: StrategyOptions, verify: VerifyFunction) = this()
    // tslint:disable-next-line unified-signatures
    def this(options: StrategyOptions, verify: VerifyFunctionWithResults) = this()
    
    def authenticate(req: Request_[ParamsDictionary, js.Any, js.Any, Query]): Unit = js.native
    def authenticate(req: Request_[ParamsDictionary, js.Any, js.Any, Query], options: AuthenticateOptions): Unit = js.native
    
    def authorize(strategy: String): AuthenticateRet = js.native
    def authorize(strategy: String, callback: js.Function1[/* repeated */ js.Any, js.Any]): AuthenticateRet = js.native
    def authorize(strategy: String, options: AuthenticateOptions): AuthenticateRet = js.native
    def authorize(
      strategy: String,
      options: AuthenticateOptions,
      callback: js.Function1[/* repeated */ js.Any, js.Any]
    ): AuthenticateRet = js.native
    def authorize(strategy: js.Array[String]): AuthenticateRet = js.native
    def authorize(strategy: js.Array[String], callback: js.Function1[/* repeated */ js.Any, js.Any]): AuthenticateRet = js.native
    def authorize(strategy: js.Array[String], options: AuthenticateOptions): AuthenticateRet = js.native
    def authorize(
      strategy: js.Array[String],
      options: AuthenticateOptions,
      callback: js.Function1[/* repeated */ js.Any, js.Any]
    ): AuthenticateRet = js.native
    
    def userProfile(
      accessToken: String,
      done: js.Function2[/* err */ js.UndefOr[Error | Null], /* profile */ js.UndefOr[TwitchProfile], Unit]
    ): Unit = js.native
  }
  
  trait AuthenticateOptions
    extends StObject
       with typings.passport.mod.AuthenticateOptions {
    
    var forceVerify: js.UndefOr[Boolean] = js.undefined
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
      def setForceVerify(value: Boolean): Self = StObject.set(x, "forceVerify", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceVerifyUndefined: Self = StObject.set(x, "forceVerify", js.undefined)
    }
  }
  
  trait AuthenticateRet extends StObject {
    
    var force_verify: js.UndefOr[Boolean] = js.undefined
  }
  object AuthenticateRet {
    
    @scala.inline
    def apply(): AuthenticateRet = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AuthenticateRet]
    }
    
    @scala.inline
    implicit class AuthenticateRetMutableBuilder[Self <: AuthenticateRet] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setForce_verify(value: Boolean): Self = StObject.set(x, "force_verify", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForce_verifyUndefined: Self = StObject.set(x, "force_verify", js.undefined)
    }
  }
  
  type Optional[T, K /* <: /* keyof T */ String */] = (Omit[T, K]) & Partial[T]
  
  /* Inlined passport-twitch-latest.passport-twitch-latest.Optional<passport-oauth2.passport-oauth2.StrategyOptions, 'authorizationURL' | 'tokenURL'> */
  trait StrategyOptions extends StObject {
    
    var authorizationURL: js.UndefOr[String] = js.undefined
    
    var callbackURL: js.UndefOr[String] = js.undefined
    
    var clientID: String & js.UndefOr[String]
    
    var clientSecret: String & js.UndefOr[String]
    
    var customHeaders: js.UndefOr[OutgoingHttpHeaders] = js.undefined
    
    var passReqToCallback: js.UndefOr[`false`] = js.undefined
    
    var pkce: js.UndefOr[Boolean] = js.undefined
    
    var proxy: js.UndefOr[js.Any] = js.undefined
    
    var scope: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var scopeSeparator: js.UndefOr[String] = js.undefined
    
    var sessionKey: js.UndefOr[String] = js.undefined
    
    var skipUserProfile: js.UndefOr[js.Any] = js.undefined
    
    var state: js.UndefOr[js.Any] = js.undefined
    
    var store: js.UndefOr[StateStore] = js.undefined
    
    var tokenURL: js.UndefOr[String] = js.undefined
  }
  object StrategyOptions {
    
    @scala.inline
    def apply(clientID: String & js.UndefOr[String], clientSecret: String & js.UndefOr[String]): StrategyOptions = {
      val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any])
      __obj.asInstanceOf[StrategyOptions]
    }
    
    @scala.inline
    implicit class StrategyOptionsMutableBuilder[Self <: StrategyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthorizationURL(value: String): Self = StObject.set(x, "authorizationURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorizationURLUndefined: Self = StObject.set(x, "authorizationURL", js.undefined)
      
      @scala.inline
      def setCallbackURL(value: String): Self = StObject.set(x, "callbackURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallbackURLUndefined: Self = StObject.set(x, "callbackURL", js.undefined)
      
      @scala.inline
      def setClientID(value: String & js.UndefOr[String]): Self = StObject.set(x, "clientID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientSecret(value: String & js.UndefOr[String]): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomHeaders(value: OutgoingHttpHeaders): Self = StObject.set(x, "customHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomHeadersUndefined: Self = StObject.set(x, "customHeaders", js.undefined)
      
      @scala.inline
      def setPassReqToCallback(value: `false`): Self = StObject.set(x, "passReqToCallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassReqToCallbackUndefined: Self = StObject.set(x, "passReqToCallback", js.undefined)
      
      @scala.inline
      def setPkce(value: Boolean): Self = StObject.set(x, "pkce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPkceUndefined: Self = StObject.set(x, "pkce", js.undefined)
      
      @scala.inline
      def setProxy(value: js.Any): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
      
      @scala.inline
      def setScope(value: String | js.Array[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeSeparator(value: String): Self = StObject.set(x, "scopeSeparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeSeparatorUndefined: Self = StObject.set(x, "scopeSeparator", js.undefined)
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      @scala.inline
      def setScopeVarargs(value: String*): Self = StObject.set(x, "scope", js.Array(value :_*))
      
      @scala.inline
      def setSessionKey(value: String): Self = StObject.set(x, "sessionKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionKeyUndefined: Self = StObject.set(x, "sessionKey", js.undefined)
      
      @scala.inline
      def setSkipUserProfile(value: js.Any): Self = StObject.set(x, "skipUserProfile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipUserProfileUndefined: Self = StObject.set(x, "skipUserProfile", js.undefined)
      
      @scala.inline
      def setState(value: js.Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      @scala.inline
      def setStore(value: StateStore): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
      
      @scala.inline
      def setTokenURL(value: String): Self = StObject.set(x, "tokenURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenURLUndefined: Self = StObject.set(x, "tokenURL", js.undefined)
    }
  }
  
  /* Inlined passport-twitch-latest.passport-twitch-latest.Optional<passport-oauth2.passport-oauth2.StrategyOptionsWithRequest, 'authorizationURL' | 'tokenURL'> */
  trait StrategyOptionsWithRequest extends StObject {
    
    var authorizationURL: js.UndefOr[String] = js.undefined
    
    var callbackURL: js.UndefOr[String] = js.undefined
    
    var clientID: String & js.UndefOr[String]
    
    var clientSecret: String & js.UndefOr[String]
    
    var customHeaders: js.UndefOr[OutgoingHttpHeaders] = js.undefined
    
    var passReqToCallback: `true` & js.UndefOr[`true`]
    
    var pkce: js.UndefOr[Boolean] = js.undefined
    
    var proxy: js.UndefOr[js.Any] = js.undefined
    
    var scope: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var scopeSeparator: js.UndefOr[String] = js.undefined
    
    var sessionKey: js.UndefOr[String] = js.undefined
    
    var skipUserProfile: js.UndefOr[js.Any] = js.undefined
    
    var state: js.UndefOr[js.Any] = js.undefined
    
    var store: js.UndefOr[StateStore] = js.undefined
    
    var tokenURL: js.UndefOr[String] = js.undefined
  }
  object StrategyOptionsWithRequest {
    
    @scala.inline
    def apply(
      clientID: String & js.UndefOr[String],
      clientSecret: String & js.UndefOr[String],
      passReqToCallback: `true` & js.UndefOr[`true`]
    ): StrategyOptionsWithRequest = {
      val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], passReqToCallback = passReqToCallback.asInstanceOf[js.Any])
      __obj.asInstanceOf[StrategyOptionsWithRequest]
    }
    
    @scala.inline
    implicit class StrategyOptionsWithRequestMutableBuilder[Self <: StrategyOptionsWithRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthorizationURL(value: String): Self = StObject.set(x, "authorizationURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorizationURLUndefined: Self = StObject.set(x, "authorizationURL", js.undefined)
      
      @scala.inline
      def setCallbackURL(value: String): Self = StObject.set(x, "callbackURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallbackURLUndefined: Self = StObject.set(x, "callbackURL", js.undefined)
      
      @scala.inline
      def setClientID(value: String & js.UndefOr[String]): Self = StObject.set(x, "clientID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientSecret(value: String & js.UndefOr[String]): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomHeaders(value: OutgoingHttpHeaders): Self = StObject.set(x, "customHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomHeadersUndefined: Self = StObject.set(x, "customHeaders", js.undefined)
      
      @scala.inline
      def setPassReqToCallback(value: `true` & js.UndefOr[`true`]): Self = StObject.set(x, "passReqToCallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPkce(value: Boolean): Self = StObject.set(x, "pkce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPkceUndefined: Self = StObject.set(x, "pkce", js.undefined)
      
      @scala.inline
      def setProxy(value: js.Any): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
      
      @scala.inline
      def setScope(value: String | js.Array[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeSeparator(value: String): Self = StObject.set(x, "scopeSeparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeSeparatorUndefined: Self = StObject.set(x, "scopeSeparator", js.undefined)
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      @scala.inline
      def setScopeVarargs(value: String*): Self = StObject.set(x, "scope", js.Array(value :_*))
      
      @scala.inline
      def setSessionKey(value: String): Self = StObject.set(x, "sessionKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionKeyUndefined: Self = StObject.set(x, "sessionKey", js.undefined)
      
      @scala.inline
      def setSkipUserProfile(value: js.Any): Self = StObject.set(x, "skipUserProfile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipUserProfileUndefined: Self = StObject.set(x, "skipUserProfile", js.undefined)
      
      @scala.inline
      def setState(value: js.Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      @scala.inline
      def setStore(value: StateStore): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
      
      @scala.inline
      def setTokenURL(value: String): Self = StObject.set(x, "tokenURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenURLUndefined: Self = StObject.set(x, "tokenURL", js.undefined)
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
    
    @scala.inline
    def apply(
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
    implicit class TwitchProfileMutableBuilder[Self <: TwitchProfile] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBroadcaster_type(value: String): Self = StObject.set(x, "broadcaster_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplay_name(value: String): Self = StObject.set(x, "display_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogin(value: String): Self = StObject.set(x, "login", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffline_image_url(value: String): Self = StObject.set(x, "offline_image_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfile_image_url(value: String): Self = StObject.set(x, "profile_image_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvider(value: String): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setView_count(value: Double): Self = StObject.set(x, "view_count", value.asInstanceOf[js.Any])
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
    /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* accessToken */ String, 
    /* refreshToken */ String, 
    /* profile */ TwitchProfile, 
    /* verified */ VerifyCallback, 
    Unit
  ]
  
  type VerifyFunctionWithRequestResults = js.Function6[
    /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* accessToken */ String, 
    /* refreshToken */ String, 
    /* results */ js.Any, 
    /* profile */ TwitchProfile, 
    /* verified */ VerifyCallback, 
    Unit
  ]
  
  type VerifyFunctionWithResults = js.Function5[
    /* accessToken */ String, 
    /* refreshToken */ String, 
    /* results */ js.Any, 
    /* profile */ TwitchProfile, 
    /* verified */ VerifyCallback, 
    Unit
  ]
}
