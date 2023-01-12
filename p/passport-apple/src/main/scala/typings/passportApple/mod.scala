package typings.passportApple

import org.scalablytyped.runtime.StringDictionary
import typings.express.mod.Request_
import typings.node.httpMod.OutgoingHttpHeaders
import typings.passportApple.passportAppleBooleans.`false`
import typings.passportApple.passportAppleBooleans.`true`
import typings.passportApple.passportAppleStrings.`name email`
import typings.passportApple.passportAppleStrings.apple
import typings.passportApple.passportAppleStrings.form_post
import typings.passportOauth2.mod.StateStore
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("passport-apple", JSImport.Namespace)
  @js.native
  open class ^ protected () extends AppleStrategy {
    def this(options: AuthenticateOptionsWithRequest, verify: VerifyFunctionWithRequest) = this()
    def this(options: AuthenticateOptions, verify: VerifyFunction) = this()
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped object */ trait AppleAuthorizationParams extends StObject {
    
    var response_mode: form_post
    
    var response_type: `name email`
    
    var scope: `name email`
    
    var state: js.UndefOr[String] = js.undefined
  }
  object AppleAuthorizationParams {
    
    inline def apply(): AppleAuthorizationParams = {
      val __obj = js.Dynamic.literal(response_mode = "form_post", response_type = "name email", scope = "name email")
      __obj.asInstanceOf[AppleAuthorizationParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AppleAuthorizationParams] (val x: Self) extends AnyVal {
      
      inline def setResponse_mode(value: form_post): Self = StObject.set(x, "response_mode", value.asInstanceOf[js.Any])
      
      inline def setResponse_type(value: `name email`): Self = StObject.set(x, "response_type", value.asInstanceOf[js.Any])
      
      inline def setScope(value: `name email`): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
  
  @js.native
  trait AppleStrategy
    extends typings.passportOauth2.mod.^ {
    
    def authorizationParams(options: js.Object): AppleAuthorizationParams = js.native
    
    var name: apple = js.native
  }
  
  trait AuthenticateOptions
    extends StObject
       with AuthenticateOptionsBase {
    
    var passReqToCallback: js.UndefOr[`false`] = js.undefined
  }
  object AuthenticateOptions {
    
    inline def apply(clientID: String, keyID: String, teamID: String): AuthenticateOptions = {
      val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], keyID = keyID.asInstanceOf[js.Any], teamID = teamID.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthenticateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AuthenticateOptions] (val x: Self) extends AnyVal {
      
      inline def setPassReqToCallback(value: `false`): Self = StObject.set(x, "passReqToCallback", value.asInstanceOf[js.Any])
      
      inline def setPassReqToCallbackUndefined: Self = StObject.set(x, "passReqToCallback", js.undefined)
    }
  }
  
  /* Inlined parent std.Partial<passport-oauth2.passport-oauth2._StrategyOptionsBase> */
  trait AuthenticateOptionsBase extends StObject {
    
    var authorizationURL: js.UndefOr[String] = js.undefined
    
    var callbackURL: js.UndefOr[String] = js.undefined
    
    var clientID: String
    
    var clientSecret: js.UndefOr[String] = js.undefined
    
    var customHeaders: js.UndefOr[OutgoingHttpHeaders] = js.undefined
    
    var keyID: String
    
    var pkce: js.UndefOr[Boolean] = js.undefined
    
    var privateKeyLocation: js.UndefOr[String] = js.undefined
    
    var privateKeyString: js.UndefOr[String] = js.undefined
    
    var proxy: js.UndefOr[Any] = js.undefined
    
    var scope: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var scopeSeparator: js.UndefOr[String] = js.undefined
    
    var sessionKey: js.UndefOr[String] = js.undefined
    
    var skipUserProfile: js.UndefOr[Any] = js.undefined
    
    var state: js.UndefOr[Any] = js.undefined
    
    var store: js.UndefOr[StateStore] = js.undefined
    
    var teamID: String
    
    var tokenURL: js.UndefOr[String] = js.undefined
  }
  object AuthenticateOptionsBase {
    
    inline def apply(clientID: String, keyID: String, teamID: String): AuthenticateOptionsBase = {
      val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], keyID = keyID.asInstanceOf[js.Any], teamID = teamID.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthenticateOptionsBase]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AuthenticateOptionsBase] (val x: Self) extends AnyVal {
      
      inline def setAuthorizationURL(value: String): Self = StObject.set(x, "authorizationURL", value.asInstanceOf[js.Any])
      
      inline def setAuthorizationURLUndefined: Self = StObject.set(x, "authorizationURL", js.undefined)
      
      inline def setCallbackURL(value: String): Self = StObject.set(x, "callbackURL", value.asInstanceOf[js.Any])
      
      inline def setCallbackURLUndefined: Self = StObject.set(x, "callbackURL", js.undefined)
      
      inline def setClientID(value: String): Self = StObject.set(x, "clientID", value.asInstanceOf[js.Any])
      
      inline def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
      
      inline def setClientSecretUndefined: Self = StObject.set(x, "clientSecret", js.undefined)
      
      inline def setCustomHeaders(value: OutgoingHttpHeaders): Self = StObject.set(x, "customHeaders", value.asInstanceOf[js.Any])
      
      inline def setCustomHeadersUndefined: Self = StObject.set(x, "customHeaders", js.undefined)
      
      inline def setKeyID(value: String): Self = StObject.set(x, "keyID", value.asInstanceOf[js.Any])
      
      inline def setPkce(value: Boolean): Self = StObject.set(x, "pkce", value.asInstanceOf[js.Any])
      
      inline def setPkceUndefined: Self = StObject.set(x, "pkce", js.undefined)
      
      inline def setPrivateKeyLocation(value: String): Self = StObject.set(x, "privateKeyLocation", value.asInstanceOf[js.Any])
      
      inline def setPrivateKeyLocationUndefined: Self = StObject.set(x, "privateKeyLocation", js.undefined)
      
      inline def setPrivateKeyString(value: String): Self = StObject.set(x, "privateKeyString", value.asInstanceOf[js.Any])
      
      inline def setPrivateKeyStringUndefined: Self = StObject.set(x, "privateKeyString", js.undefined)
      
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
      
      inline def setTeamID(value: String): Self = StObject.set(x, "teamID", value.asInstanceOf[js.Any])
      
      inline def setTokenURL(value: String): Self = StObject.set(x, "tokenURL", value.asInstanceOf[js.Any])
      
      inline def setTokenURLUndefined: Self = StObject.set(x, "tokenURL", js.undefined)
    }
  }
  
  trait AuthenticateOptionsWithRequest
    extends StObject
       with AuthenticateOptionsBase {
    
    var passReqToCallback: `true`
  }
  object AuthenticateOptionsWithRequest {
    
    inline def apply(clientID: String, keyID: String, teamID: String): AuthenticateOptionsWithRequest = {
      val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], keyID = keyID.asInstanceOf[js.Any], passReqToCallback = true, teamID = teamID.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthenticateOptionsWithRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AuthenticateOptionsWithRequest] (val x: Self) extends AnyVal {
      
      inline def setPassReqToCallback(value: `true`): Self = StObject.set(x, "passReqToCallback", value.asInstanceOf[js.Any])
    }
  }
  
  trait DecodedIdToken
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var sub: String
  }
  object DecodedIdToken {
    
    inline def apply(sub: String): DecodedIdToken = {
      val __obj = js.Dynamic.literal(sub = sub.asInstanceOf[js.Any])
      __obj.asInstanceOf[DecodedIdToken]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DecodedIdToken] (val x: Self) extends AnyVal {
      
      inline def setSub(value: String): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
    }
  }
  
  type Profile = StringDictionary[Any]
  
  type VerifyCallback = js.Function3[
    /* err */ js.UndefOr[js.Error | Null], 
    /* user */ js.UndefOr[js.Object], 
    /* info */ js.UndefOr[js.Object], 
    Unit
  ]
  
  type VerifyFunction = js.Function5[
    /* accessToken */ String, 
    /* refreshToken */ String, 
    /* decodedIdToken */ DecodedIdToken, 
    /* profile */ Profile, 
    /* verified */ VerifyCallback, 
    Unit
  ]
  
  type VerifyFunctionWithRequest = js.Function6[
    /* req */ Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ], 
    /* accessToken */ String, 
    /* refreshToken */ String, 
    /* decodedIdToken */ DecodedIdToken, 
    /* profile */ Profile, 
    /* verified */ VerifyCallback, 
    Unit
  ]
}
