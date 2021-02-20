package typings.passportOauth2

import org.scalablytyped.runtime.Instantiable2
import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.node.httpMod.OutgoingHttpHeaders
import typings.oauth.mod.OAuth2
import typings.passportOauth2.passportOauth2Booleans.`false`
import typings.passportOauth2.passportOauth2Booleans.`true`
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("passport-oauth2", JSImport.Namespace)
  @js.native
  class ^ protected () extends StObject {
    def this(options: StrategyOptionsWithRequest, verify: VerifyFunctionWithRequest) = this()
    def this(options: StrategyOptions, verify: VerifyFunction) = this()
  }
  
  @JSImport("passport-oauth2", "AuthorizationError")
  @js.native
  class AuthorizationError protected () extends Error {
    def this(message: js.UndefOr[scala.Nothing], code: String) = this()
    def this(message: String, code: String) = this()
    def this(message: js.UndefOr[scala.Nothing], code: String, uri: String) = this()
    def this(message: String, code: String, uri: String) = this()
    def this(message: js.UndefOr[scala.Nothing], code: String, uri: js.UndefOr[scala.Nothing], status: Double) = this()
    def this(message: js.UndefOr[scala.Nothing], code: String, uri: String, status: Double) = this()
    def this(message: String, code: String, uri: js.UndefOr[scala.Nothing], status: Double) = this()
    def this(message: String, code: String, uri: String, status: Double) = this()
    
    var code: String = js.native
    
    var status: Double = js.native
    
    var uri: js.UndefOr[String] = js.native
  }
  
  @JSImport("passport-oauth2", "InternalOAuthError")
  @js.native
  class InternalOAuthError protected () extends Error {
    def this(message: String, err: js.Any) = this()
    
    var oauthError: js.Any = js.native
  }
  
  @JSImport("passport-oauth2", "Strategy")
  @js.native
  val Strategy: Instantiable2[/* options */ StrategyOptions, /* verify */ VerifyFunction, OAuth2Strategy] = js.native
  type Strategy = OAuth2Strategy
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("passport-oauth2", "Strategy")
  @js.native
  class StrategyCls protected () extends StObject {
    def this(options: StrategyOptions, verify: VerifyFunction) = this()
  }
  
  @JSImport("passport-oauth2", "TokenError")
  @js.native
  class TokenError protected () extends Error {
    def this(message: js.UndefOr[scala.Nothing], code: String) = this()
    def this(message: String, code: String) = this()
    def this(message: js.UndefOr[scala.Nothing], code: String, uri: String) = this()
    def this(message: String, code: String, uri: String) = this()
    def this(message: js.UndefOr[scala.Nothing], code: String, uri: js.UndefOr[scala.Nothing], status: Double) = this()
    def this(message: js.UndefOr[scala.Nothing], code: String, uri: String, status: Double) = this()
    def this(message: String, code: String, uri: js.UndefOr[scala.Nothing], status: Double) = this()
    def this(message: String, code: String, uri: String, status: Double) = this()
    
    var code: String = js.native
    
    var status: Double = js.native
    
    var uri: js.UndefOr[String] = js.native
  }
  
  @js.native
  trait Metadata extends StObject {
    
    var authorizationURL: String = js.native
    
    var clientID: String = js.native
    
    var tokenURL: String = js.native
  }
  object Metadata {
    
    @scala.inline
    def apply(authorizationURL: String, clientID: String, tokenURL: String): Metadata = {
      val __obj = js.Dynamic.literal(authorizationURL = authorizationURL.asInstanceOf[js.Any], clientID = clientID.asInstanceOf[js.Any], tokenURL = tokenURL.asInstanceOf[js.Any])
      __obj.asInstanceOf[Metadata]
    }
    
    @scala.inline
    implicit class MetadataMutableBuilder[Self <: Metadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthorizationURL(value: String): Self = StObject.set(x, "authorizationURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientID(value: String): Self = StObject.set(x, "clientID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenURL(value: String): Self = StObject.set(x, "tokenURL", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OAuth2Strategy extends StObject {
    
    /**
      *   NOTE: The _oauth2 property is considered "protected".  Subclasses are
      *         allowed to use it when making protected resource requests to retrieve
      *         the user profile.
      */
    var _oauth2: OAuth2 = js.native
    
    def authenticate(req: Request_[ParamsDictionary, _, _, Query]): Unit = js.native
    def authenticate(req: Request_[ParamsDictionary, _, _, Query], options: js.Any): Unit = js.native
    
    def authorizationParams(options: js.Any): js.Object = js.native
    
    var name: String = js.native
    
    def parseErrorResponse(body: js.Any, status: Double): Error | Null = js.native
    
    def tokenParams(options: js.Any): js.Object = js.native
    
    def userProfile(
      accessToken: String,
      done: js.Function2[/* err */ js.UndefOr[Error | Null], /* profile */ js.UndefOr[js.Any], Unit]
    ): Unit = js.native
  }
  
  @js.native
  trait StateStore extends StObject {
    
    def store(req: Request_[ParamsDictionary, _, _, Query], callback: StateStoreStoreCallback): Unit = js.native
    def store(req: Request_[ParamsDictionary, _, _, Query], meta: Metadata, callback: StateStoreStoreCallback): Unit = js.native
    
    def verify(req: Request_[ParamsDictionary, _, _, Query], state: String, callback: StateStoreVerifyCallback): Unit = js.native
    def verify(
      req: Request_[ParamsDictionary, _, _, Query],
      state: String,
      meta: Metadata,
      callback: StateStoreVerifyCallback
    ): Unit = js.native
  }
  
  type StateStoreStoreCallback = js.Function2[/* err */ Error | Null, /* state */ js.Any, Unit]
  
  type StateStoreVerifyCallback = js.Function3[/* err */ Error, /* ok */ Boolean, /* state */ js.Any, Unit]
  
  @js.native
  trait StrategyOptions extends StrategyOptionsBase {
    
    var passReqToCallback: js.UndefOr[`false`] = js.native
  }
  object StrategyOptions {
    
    @scala.inline
    def apply(authorizationURL: String, clientID: String, clientSecret: String, tokenURL: String): StrategyOptions = {
      val __obj = js.Dynamic.literal(authorizationURL = authorizationURL.asInstanceOf[js.Any], clientID = clientID.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], tokenURL = tokenURL.asInstanceOf[js.Any])
      __obj.asInstanceOf[StrategyOptions]
    }
    
    @scala.inline
    implicit class StrategyOptionsMutableBuilder[Self <: StrategyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPassReqToCallback(value: `false`): Self = StObject.set(x, "passReqToCallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassReqToCallbackUndefined: Self = StObject.set(x, "passReqToCallback", js.undefined)
    }
  }
  
  @js.native
  trait StrategyOptionsBase extends StObject {
    
    var authorizationURL: String = js.native
    
    var callbackURL: js.UndefOr[String] = js.native
    
    var clientID: String = js.native
    
    var clientSecret: String = js.native
    
    var customHeaders: js.UndefOr[OutgoingHttpHeaders] = js.native
    
    var pkce: js.UndefOr[Boolean] = js.native
    
    var proxy: js.UndefOr[js.Any] = js.native
    
    var scope: js.UndefOr[String | js.Array[String]] = js.native
    
    var scopeSeparator: js.UndefOr[String] = js.native
    
    var sessionKey: js.UndefOr[String] = js.native
    
    var skipUserProfile: js.UndefOr[js.Any] = js.native
    
    var state: js.UndefOr[js.Any] = js.native
    
    var store: js.UndefOr[StateStore] = js.native
    
    var tokenURL: String = js.native
  }
  object StrategyOptionsBase {
    
    @scala.inline
    def apply(authorizationURL: String, clientID: String, clientSecret: String, tokenURL: String): StrategyOptionsBase = {
      val __obj = js.Dynamic.literal(authorizationURL = authorizationURL.asInstanceOf[js.Any], clientID = clientID.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], tokenURL = tokenURL.asInstanceOf[js.Any])
      __obj.asInstanceOf[StrategyOptionsBase]
    }
    
    @scala.inline
    implicit class StrategyOptionsBaseMutableBuilder[Self <: StrategyOptionsBase] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthorizationURL(value: String): Self = StObject.set(x, "authorizationURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallbackURL(value: String): Self = StObject.set(x, "callbackURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallbackURLUndefined: Self = StObject.set(x, "callbackURL", js.undefined)
      
      @scala.inline
      def setClientID(value: String): Self = StObject.set(x, "clientID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomHeaders(value: OutgoingHttpHeaders): Self = StObject.set(x, "customHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomHeadersUndefined: Self = StObject.set(x, "customHeaders", js.undefined)
      
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
    }
  }
  
  @js.native
  trait StrategyOptionsWithRequest extends StrategyOptionsBase {
    
    var passReqToCallback: `true` = js.native
  }
  object StrategyOptionsWithRequest {
    
    @scala.inline
    def apply(
      authorizationURL: String,
      clientID: String,
      clientSecret: String,
      passReqToCallback: `true`,
      tokenURL: String
    ): StrategyOptionsWithRequest = {
      val __obj = js.Dynamic.literal(authorizationURL = authorizationURL.asInstanceOf[js.Any], clientID = clientID.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], passReqToCallback = passReqToCallback.asInstanceOf[js.Any], tokenURL = tokenURL.asInstanceOf[js.Any])
      __obj.asInstanceOf[StrategyOptionsWithRequest]
    }
    
    @scala.inline
    implicit class StrategyOptionsWithRequestMutableBuilder[Self <: StrategyOptionsWithRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPassReqToCallback(value: `true`): Self = StObject.set(x, "passReqToCallback", value.asInstanceOf[js.Any])
    }
  }
  
  type VerifyCallback = js.Function3[
    /* err */ js.UndefOr[Error | Null], 
    /* user */ js.UndefOr[js.Object], 
    /* info */ js.UndefOr[js.Object], 
    Unit
  ]
  
  type VerifyFunction = (js.Function4[
    /* accessToken */ String, 
    /* refreshToken */ String, 
    /* profile */ js.Any, 
    /* verified */ VerifyCallback, 
    Unit
  ]) | (js.Function5[
    /* accessToken */ String, 
    /* refreshToken */ String, 
    /* results */ js.Any, 
    /* profile */ js.Any, 
    /* verified */ VerifyCallback, 
    Unit
  ])
  
  type VerifyFunctionWithRequest = (js.Function5[
    /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* accessToken */ String, 
    /* refreshToken */ String, 
    /* profile */ js.Any, 
    /* verified */ VerifyCallback, 
    Unit
  ]) | (js.Function6[
    /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* accessToken */ String, 
    /* refreshToken */ String, 
    /* results */ js.Any, 
    /* profile */ js.Any, 
    /* verified */ VerifyCallback, 
    Unit
  ])
}
