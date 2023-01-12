package typings.passportOauth2

import org.scalablytyped.runtime.Instantiable2
import typings.express.mod.Request_
import typings.node.httpMod.OutgoingHttpHeaders
import typings.oauth.mod.OAuth2
import typings.passport.mod.global.Express.User
import typings.passportOauth2.passportOauth2Booleans.`false`
import typings.passportOauth2.passportOauth2Booleans.`true`
import typings.std.Error
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("passport-oauth2", JSImport.Namespace)
  @js.native
  open class ^ protected () extends StObject {
    def this(options: StrategyOptionsWithRequest, verify: VerifyFunctionWithRequest) = this()
    def this(options: StrategyOptions, verify: VerifyFunction) = this()
  }
  
  @JSImport("passport-oauth2", "AuthorizationError")
  @js.native
  open class AuthorizationError protected ()
    extends StObject
       with Error {
    def this(message: String, code: String) = this()
    def this(message: Unit, code: String) = this()
    def this(message: String, code: String, uri: String) = this()
    def this(message: Unit, code: String, uri: String) = this()
    def this(message: String, code: String, uri: String, status: Double) = this()
    def this(message: String, code: String, uri: Unit, status: Double) = this()
    def this(message: Unit, code: String, uri: String, status: Double) = this()
    def this(message: Unit, code: String, uri: Unit, status: Double) = this()
    
    var code: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    var status: Double = js.native
    
    var uri: js.UndefOr[String] = js.native
  }
  
  @JSImport("passport-oauth2", "InternalOAuthError")
  @js.native
  open class InternalOAuthError protected ()
    extends StObject
       with Error {
    def this(message: String, err: Any) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    var oauthError: Any = js.native
  }
  
  @JSImport("passport-oauth2", "Strategy")
  @js.native
  val Strategy: Instantiable2[/* options */ StrategyOptions, /* verify */ VerifyFunction, OAuth2Strategy] = js.native
  type Strategy = OAuth2Strategy
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("passport-oauth2", "Strategy")
  @js.native
  open class StrategyCls protected () extends StObject {
    def this(options: StrategyOptions, verify: VerifyFunction) = this()
  }
  
  @JSImport("passport-oauth2", "TokenError")
  @js.native
  open class TokenError protected ()
    extends StObject
       with Error {
    def this(message: String, code: String) = this()
    def this(message: Unit, code: String) = this()
    def this(message: String, code: String, uri: String) = this()
    def this(message: Unit, code: String, uri: String) = this()
    def this(message: String, code: String, uri: String, status: Double) = this()
    def this(message: String, code: String, uri: Unit, status: Double) = this()
    def this(message: Unit, code: String, uri: String, status: Double) = this()
    def this(message: Unit, code: String, uri: Unit, status: Double) = this()
    
    var code: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    var status: Double = js.native
    
    var uri: js.UndefOr[String] = js.native
  }
  
  trait Metadata extends StObject {
    
    var authorizationURL: String
    
    var clientID: String
    
    var tokenURL: String
  }
  object Metadata {
    
    inline def apply(authorizationURL: String, clientID: String, tokenURL: String): Metadata = {
      val __obj = js.Dynamic.literal(authorizationURL = authorizationURL.asInstanceOf[js.Any], clientID = clientID.asInstanceOf[js.Any], tokenURL = tokenURL.asInstanceOf[js.Any])
      __obj.asInstanceOf[Metadata]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Metadata] (val x: Self) extends AnyVal {
      
      inline def setAuthorizationURL(value: String): Self = StObject.set(x, "authorizationURL", value.asInstanceOf[js.Any])
      
      inline def setClientID(value: String): Self = StObject.set(x, "clientID", value.asInstanceOf[js.Any])
      
      inline def setTokenURL(value: String): Self = StObject.set(x, "tokenURL", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OAuth2Strategy extends StObject {
    
    /**
      *   NOTE: The _oauth2 property is considered "protected".  Subclasses are
      *         allowed to use it when making protected resource requests to retrieve
      *         the user profile.
      */
    /* protected */ var _oauth2: OAuth2 = js.native
    
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
      options: Any
    ): Unit = js.native
    
    def authorizationParams(options: Any): js.Object = js.native
    
    var name: String = js.native
    
    def parseErrorResponse(body: Any, status: Double): js.Error | Null = js.native
    
    def tokenParams(options: Any): js.Object = js.native
    
    def userProfile(
      accessToken: String,
      done: js.Function2[/* err */ js.UndefOr[js.Error | Null], /* profile */ js.UndefOr[Any], Unit]
    ): Unit = js.native
  }
  
  @js.native
  trait StateStore extends StObject {
    
    def store(
      req: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ],
      callback: StateStoreStoreCallback
    ): Unit = js.native
    def store(
      req: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ],
      meta: Metadata,
      callback: StateStoreStoreCallback
    ): Unit = js.native
    
    def verify(
      req: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ],
      state: String,
      callback: StateStoreVerifyCallback
    ): Unit = js.native
    def verify(
      req: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ],
      state: String,
      meta: Metadata,
      callback: StateStoreVerifyCallback
    ): Unit = js.native
  }
  
  type StateStoreStoreCallback = js.Function2[/* err */ js.Error | Null, /* state */ Any, Unit]
  
  type StateStoreVerifyCallback = js.Function3[/* err */ js.Error, /* ok */ Boolean, /* state */ Any, Unit]
  
  trait StrategyOptions
    extends StObject
       with StrategyOptionsBase {
    
    var passReqToCallback: js.UndefOr[`false`] = js.undefined
  }
  object StrategyOptions {
    
    inline def apply(authorizationURL: String, clientID: String, clientSecret: String, tokenURL: String): StrategyOptions = {
      val __obj = js.Dynamic.literal(authorizationURL = authorizationURL.asInstanceOf[js.Any], clientID = clientID.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], tokenURL = tokenURL.asInstanceOf[js.Any])
      __obj.asInstanceOf[StrategyOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StrategyOptions] (val x: Self) extends AnyVal {
      
      inline def setPassReqToCallback(value: `false`): Self = StObject.set(x, "passReqToCallback", value.asInstanceOf[js.Any])
      
      inline def setPassReqToCallbackUndefined: Self = StObject.set(x, "passReqToCallback", js.undefined)
    }
  }
  
  trait StrategyOptionsBase extends StObject {
    
    var authorizationURL: String
    
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
    
    var tokenURL: String
  }
  object StrategyOptionsBase {
    
    inline def apply(authorizationURL: String, clientID: String, clientSecret: String, tokenURL: String): StrategyOptionsBase = {
      val __obj = js.Dynamic.literal(authorizationURL = authorizationURL.asInstanceOf[js.Any], clientID = clientID.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], tokenURL = tokenURL.asInstanceOf[js.Any])
      __obj.asInstanceOf[StrategyOptionsBase]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StrategyOptionsBase] (val x: Self) extends AnyVal {
      
      inline def setAuthorizationURL(value: String): Self = StObject.set(x, "authorizationURL", value.asInstanceOf[js.Any])
      
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
      
      inline def setTokenURL(value: String): Self = StObject.set(x, "tokenURL", value.asInstanceOf[js.Any])
    }
  }
  
  trait StrategyOptionsWithRequest
    extends StObject
       with StrategyOptionsBase {
    
    var passReqToCallback: `true`
  }
  object StrategyOptionsWithRequest {
    
    inline def apply(authorizationURL: String, clientID: String, clientSecret: String, tokenURL: String): StrategyOptionsWithRequest = {
      val __obj = js.Dynamic.literal(authorizationURL = authorizationURL.asInstanceOf[js.Any], clientID = clientID.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], passReqToCallback = true, tokenURL = tokenURL.asInstanceOf[js.Any])
      __obj.asInstanceOf[StrategyOptionsWithRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StrategyOptionsWithRequest] (val x: Self) extends AnyVal {
      
      inline def setPassReqToCallback(value: `true`): Self = StObject.set(x, "passReqToCallback", value.asInstanceOf[js.Any])
    }
  }
  
  type VerifyCallback = js.Function3[
    /* err */ js.UndefOr[js.Error | Null], 
    /* user */ js.UndefOr[User], 
    /* info */ js.UndefOr[js.Object], 
    Unit
  ]
  
  type VerifyFunction = (js.Function4[
    /* accessToken */ String, 
    /* refreshToken */ String, 
    /* profile */ Any, 
    /* verified */ VerifyCallback, 
    Unit
  ]) | (js.Function5[
    /* accessToken */ String, 
    /* refreshToken */ String, 
    /* results */ Any, 
    /* profile */ Any, 
    /* verified */ VerifyCallback, 
    Unit
  ])
  
  type VerifyFunctionWithRequest = (js.Function5[
    /* req */ Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ], 
    /* accessToken */ String, 
    /* refreshToken */ String, 
    /* profile */ Any, 
    /* verified */ VerifyCallback, 
    Unit
  ]) | (js.Function6[
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
    /* profile */ Any, 
    /* verified */ VerifyCallback, 
    Unit
  ])
}
