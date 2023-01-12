package typings.passportGoogleOauth20

import typings.express.mod.Request_
import typings.node.httpMod.OutgoingHttpHeaders
import typings.passport.mod.AuthenticateOptions
import typings.passport.mod.global.Express.User
import typings.passportGoogleOauth20.anon.Athash
import typings.passportGoogleOauth20.passportGoogleOauth20Booleans.`false`
import typings.passportGoogleOauth20.passportGoogleOauth20Booleans.`true`
import typings.passportGoogleOauth20.passportGoogleOauth20Strings.google
import typings.passportGoogleOauth20.passportGoogleOauth20Strings.offline
import typings.passportGoogleOauth20.passportGoogleOauth20Strings.online
import typings.passportOauth2.mod.OAuth2Strategy
import typings.passportOauth2.mod.StateStore
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("passport-google-oauth20", "Strategy")
  @js.native
  open class Strategy protected ()
    extends StObject
       with OAuth2Strategy {
    def this(
      options: StrategyOptionsWithRequest,
      verify: js.Function5[
            /* req */ Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ], 
            /* accessToken */ String, 
            /* refreshToken */ String, 
            /* profile */ Profile, 
            /* done */ VerifyCallback, 
            Unit
          ]
    ) = this()
    def this(
      options: StrategyOptionsWithRequest,
      verify: js.Function6[
            /* req */ Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ], 
            /* accessToken */ String, 
            /* refreshToken */ String, 
            /* params */ GoogleCallbackParameters, 
            /* profile */ Profile, 
            /* done */ VerifyCallback, 
            Unit
          ]
    ) = this()
    def this(
      options: StrategyOptions,
      verify: js.Function4[
            /* accessToken */ String, 
            /* refreshToken */ String, 
            /* profile */ Profile, 
            /* done */ VerifyCallback, 
            Unit
          ]
    ) = this()
    def this(
      options: StrategyOptions,
      verify: js.Function5[
            /* accessToken */ String, 
            /* refreshToken */ String, 
            /* params */ GoogleCallbackParameters, 
            /* profile */ Profile, 
            /* done */ VerifyCallback, 
            Unit
          ]
    ) = this()
  }
  
  trait AuthenticateOptionsGoogle
    extends StObject
       with AuthenticateOptions {
    
    var accessType: js.UndefOr[offline | online] = js.undefined
    
    var display: js.UndefOr[String] = js.undefined
    
    var hd: js.UndefOr[String] = js.undefined
    
    var hostedDomain: js.UndefOr[String] = js.undefined
    
    var includeGrantedScopes: js.UndefOr[Boolean] = js.undefined
    
    var loginHint: js.UndefOr[String] = js.undefined
    
    var openIDRealm: js.UndefOr[Any] = js.undefined
    
    var requestVisibleActions: js.UndefOr[Any] = js.undefined
  }
  object AuthenticateOptionsGoogle {
    
    inline def apply(): AuthenticateOptionsGoogle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AuthenticateOptionsGoogle]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AuthenticateOptionsGoogle] (val x: Self) extends AnyVal {
      
      inline def setAccessType(value: offline | online): Self = StObject.set(x, "accessType", value.asInstanceOf[js.Any])
      
      inline def setAccessTypeUndefined: Self = StObject.set(x, "accessType", js.undefined)
      
      inline def setDisplay(value: String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      inline def setHd(value: String): Self = StObject.set(x, "hd", value.asInstanceOf[js.Any])
      
      inline def setHdUndefined: Self = StObject.set(x, "hd", js.undefined)
      
      inline def setHostedDomain(value: String): Self = StObject.set(x, "hostedDomain", value.asInstanceOf[js.Any])
      
      inline def setHostedDomainUndefined: Self = StObject.set(x, "hostedDomain", js.undefined)
      
      inline def setIncludeGrantedScopes(value: Boolean): Self = StObject.set(x, "includeGrantedScopes", value.asInstanceOf[js.Any])
      
      inline def setIncludeGrantedScopesUndefined: Self = StObject.set(x, "includeGrantedScopes", js.undefined)
      
      inline def setLoginHint(value: String): Self = StObject.set(x, "loginHint", value.asInstanceOf[js.Any])
      
      inline def setLoginHintUndefined: Self = StObject.set(x, "loginHint", js.undefined)
      
      inline def setOpenIDRealm(value: Any): Self = StObject.set(x, "openIDRealm", value.asInstanceOf[js.Any])
      
      inline def setOpenIDRealmUndefined: Self = StObject.set(x, "openIDRealm", js.undefined)
      
      inline def setRequestVisibleActions(value: Any): Self = StObject.set(x, "requestVisibleActions", value.asInstanceOf[js.Any])
      
      inline def setRequestVisibleActionsUndefined: Self = StObject.set(x, "requestVisibleActions", js.undefined)
    }
  }
  
  trait GoogleCallbackParameters extends StObject {
    
    var access_token: String
    
    var expires_in: Double
    
    var id_token: js.UndefOr[String] = js.undefined
    
    var refresh_token: js.UndefOr[String] = js.undefined
    
    var scope: String
    
    var token_type: String
  }
  object GoogleCallbackParameters {
    
    inline def apply(access_token: String, expires_in: Double, scope: String, token_type: String): GoogleCallbackParameters = {
      val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], expires_in = expires_in.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], token_type = token_type.asInstanceOf[js.Any])
      __obj.asInstanceOf[GoogleCallbackParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GoogleCallbackParameters] (val x: Self) extends AnyVal {
      
      inline def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
      
      inline def setExpires_in(value: Double): Self = StObject.set(x, "expires_in", value.asInstanceOf[js.Any])
      
      inline def setId_token(value: String): Self = StObject.set(x, "id_token", value.asInstanceOf[js.Any])
      
      inline def setId_tokenUndefined: Self = StObject.set(x, "id_token", js.undefined)
      
      inline def setRefresh_token(value: String): Self = StObject.set(x, "refresh_token", value.asInstanceOf[js.Any])
      
      inline def setRefresh_tokenUndefined: Self = StObject.set(x, "refresh_token", js.undefined)
      
      inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setToken_type(value: String): Self = StObject.set(x, "token_type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Pick<passport-oauth2.passport-oauth2._StrategyOptionsBase, std.Exclude<keyof passport-oauth2.passport-oauth2._StrategyOptionsBase, 'authorizationURL' | 'tokenURL'>> */
  trait OAuth2StrategyOptionsWithoutRequiredURLs extends StObject {
    
    var callbackURL: js.UndefOr[String] = js.undefined
    
    var clientID: String
    
    var clientSecret: String
    
    var customHeaders: js.UndefOr[OutgoingHttpHeaders] = js.undefined
    
    var pkce: js.UndefOr[Boolean] = js.undefined
    
    var proxy: js.UndefOr[Any] = js.undefined
    
    var scope: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var scopeSeparator: js.UndefOr[String] = js.undefined
    
    var sessionKey: js.UndefOr[String] = js.undefined
    
    var skipUserProfile: js.UndefOr[Any] = js.undefined
    
    var state: js.UndefOr[Any] = js.undefined
    
    var store: js.UndefOr[StateStore] = js.undefined
  }
  object OAuth2StrategyOptionsWithoutRequiredURLs {
    
    inline def apply(clientID: String, clientSecret: String): OAuth2StrategyOptionsWithoutRequiredURLs = {
      val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any])
      __obj.asInstanceOf[OAuth2StrategyOptionsWithoutRequiredURLs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OAuth2StrategyOptionsWithoutRequiredURLs] (val x: Self) extends AnyVal {
      
      inline def setCallbackURL(value: String): Self = StObject.set(x, "callbackURL", value.asInstanceOf[js.Any])
      
      inline def setCallbackURLUndefined: Self = StObject.set(x, "callbackURL", js.undefined)
      
      inline def setClientID(value: String): Self = StObject.set(x, "clientID", value.asInstanceOf[js.Any])
      
      inline def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
      
      inline def setCustomHeaders(value: OutgoingHttpHeaders): Self = StObject.set(x, "customHeaders", value.asInstanceOf[js.Any])
      
      inline def setCustomHeadersUndefined: Self = StObject.set(x, "customHeaders", js.undefined)
      
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
    }
  }
  
  trait Profile
    extends StObject
       with typings.passport.mod.Profile {
    
    /**
      * ID Token payload, adhering to Google's implementation of the OpenID
      * Connect standard See
      * [documentation](https://developers.google.com/identity/protocols/oauth2/openid-connect#an-id-tokens-payload)
      *
      * An ID token is a JSON object containing a set of name/value pairs. Here's an example, formatted for readability:
      * ```json
      * {
      *   "iss": "https://accounts.google.com",
      *   "azp": "1234987819200.apps.googleusercontent.com",
      *   "aud": "1234987819200.apps.googleusercontent.com",
      *   "sub": "10769150350006150715113082367",
      *   "at_hash": "HK6E_P6Dh8Y93mRNtsDB1Q",
      *   "hd": "example.com",
      *   "email": "jsmith@example.com",
      *   "email_verified": "true",
      *   "iat": 1353601026,
      *   "exp": 1353604926,
      *   "nonce": "0394852-3190485-2490358"
      * }
      * ```
      */
    var _json: Athash
    
    var _raw: String
    
    var profileUrl: String
  }
  object Profile {
    
    inline def apply(_json: Athash, _raw: String, displayName: String, id: String, profileUrl: String, provider: String): Profile = {
      val __obj = js.Dynamic.literal(_json = _json.asInstanceOf[js.Any], _raw = _raw.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], profileUrl = profileUrl.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
      __obj.asInstanceOf[Profile]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Profile] (val x: Self) extends AnyVal {
      
      inline def setProfileUrl(value: String): Self = StObject.set(x, "profileUrl", value.asInstanceOf[js.Any])
      
      inline def set_json(value: Athash): Self = StObject.set(x, "_json", value.asInstanceOf[js.Any])
      
      inline def set_raw(value: String): Self = StObject.set(x, "_raw", value.asInstanceOf[js.Any])
    }
  }
  
  trait StrategyOptions
    extends StObject
       with StrategyOptionsBase {
    
    var passReqToCallback: js.UndefOr[`false`] = js.undefined
  }
  object StrategyOptions {
    
    inline def apply(clientID: String, clientSecret: String): StrategyOptions = {
      val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any])
      __obj.asInstanceOf[StrategyOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StrategyOptions] (val x: Self) extends AnyVal {
      
      inline def setPassReqToCallback(value: `false`): Self = StObject.set(x, "passReqToCallback", value.asInstanceOf[js.Any])
      
      inline def setPassReqToCallbackUndefined: Self = StObject.set(x, "passReqToCallback", js.undefined)
    }
  }
  
  trait StrategyOptionsBase
    extends StObject
       with OAuth2StrategyOptionsWithoutRequiredURLs {
    
    var authorizationURL: js.UndefOr[String] = js.undefined
    
    var tokenURL: js.UndefOr[String] = js.undefined
    
    var userProfileURL: js.UndefOr[String] = js.undefined
  }
  object StrategyOptionsBase {
    
    inline def apply(clientID: String, clientSecret: String): StrategyOptionsBase = {
      val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any])
      __obj.asInstanceOf[StrategyOptionsBase]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StrategyOptionsBase] (val x: Self) extends AnyVal {
      
      inline def setAuthorizationURL(value: String): Self = StObject.set(x, "authorizationURL", value.asInstanceOf[js.Any])
      
      inline def setAuthorizationURLUndefined: Self = StObject.set(x, "authorizationURL", js.undefined)
      
      inline def setTokenURL(value: String): Self = StObject.set(x, "tokenURL", value.asInstanceOf[js.Any])
      
      inline def setTokenURLUndefined: Self = StObject.set(x, "tokenURL", js.undefined)
      
      inline def setUserProfileURL(value: String): Self = StObject.set(x, "userProfileURL", value.asInstanceOf[js.Any])
      
      inline def setUserProfileURLUndefined: Self = StObject.set(x, "userProfileURL", js.undefined)
    }
  }
  
  trait StrategyOptionsWithRequest
    extends StObject
       with StrategyOptionsBase {
    
    var passReqToCallback: `true`
  }
  object StrategyOptionsWithRequest {
    
    inline def apply(clientID: String, clientSecret: String): StrategyOptionsWithRequest = {
      val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], passReqToCallback = true)
      __obj.asInstanceOf[StrategyOptionsWithRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StrategyOptionsWithRequest] (val x: Self) extends AnyVal {
      
      inline def setPassReqToCallback(value: `true`): Self = StObject.set(x, "passReqToCallback", value.asInstanceOf[js.Any])
    }
  }
  
  type VerifyCallback = js.Function3[
    /* err */ js.UndefOr[String | js.Error | Null], 
    /* user */ js.UndefOr[User], 
    /* info */ js.UndefOr[Any], 
    Unit
  ]
  
  // allow Google-specific options when using "google" strategy
  /* augmented module */
  object passportAugmentingMod {
    
    @js.native
    trait Authenticator[InitializeRet, AuthenticateRet, AuthorizeRet, AuthorizeOptions] extends StObject {
      
      @JSName("authenticate")
      def authenticate_google(strategy: google, options: AuthenticateOptionsGoogle): AuthenticateRet = js.native
      @JSName("authenticate")
      def authenticate_google(
        strategy: google,
        options: AuthenticateOptionsGoogle,
        callback: js.Function1[/* repeated */ Any, Any]
      ): AuthenticateRet = js.native
      
      @JSName("authorize")
      def authorize_google(strategy: google, options: AuthenticateOptionsGoogle): AuthorizeRet = js.native
      @JSName("authorize")
      def authorize_google(
        strategy: google,
        options: AuthenticateOptionsGoogle,
        callback: js.Function1[/* repeated */ Any, Any]
      ): AuthorizeRet = js.native
    }
  }
}
