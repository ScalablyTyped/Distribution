package typings.passportGoogleOauth

import typings.express.mod.Request_
import typings.passport.mod.Strategy
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("passport-google-oauth", "OAuth2Strategy")
  @js.native
  open class OAuth2Strategy protected ()
    extends StObject
       with Strategy {
    def this(
      options: IOAuth2StrategyOptionWithRequest,
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
            /* done */ VerifyFunction, 
            Unit
          ]
    ) = this()
    def this(
      options: IOAuth2StrategyOption,
      verify: js.Function4[
            /* accessToken */ String, 
            /* refreshToken */ String, 
            /* profile */ Profile, 
            /* done */ VerifyFunction, 
            Unit
          ]
    ) = this()
    
    def authenticate(
      req: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ],
      options: js.Object
    ): Unit = js.native
    
    @JSName("name")
    var name_OAuth2Strategy: String = js.native
  }
  
  @JSImport("passport-google-oauth", "OAuthStrategy")
  @js.native
  open class OAuthStrategy protected ()
    extends StObject
       with Strategy {
    def this(
      options: IOAuthStrategyOption,
      verify: js.Function4[
            /* accessToken */ String, 
            /* refreshToken */ String, 
            /* profile */ Profile, 
            /* done */ VerifyFunction, 
            Unit
          ]
    ) = this()
    
    def authenticate(
      req: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ],
      options: js.Object
    ): Unit = js.native
    
    @JSName("name")
    var name_OAuthStrategy: String = js.native
  }
  
  trait IOAuth2StrategyOption extends StObject {
    
    var accessType: js.UndefOr[String] = js.undefined
    
    var approval_prompt: js.UndefOr[String] = js.undefined
    
    var authorizationURL: js.UndefOr[String] = js.undefined
    
    var callbackURL: String
    
    var clientID: String
    
    var clientSecret: String
    
    var display: js.UndefOr[String] = js.undefined
    
    var hostedDomain: js.UndefOr[String] = js.undefined
    
    var loginHint: js.UndefOr[String] = js.undefined
    
    var openIDRealm: js.UndefOr[String] = js.undefined
    
    var prompt: js.UndefOr[String] = js.undefined
    
    var requestVisibleActions: js.UndefOr[String] = js.undefined
    
    var tokenURL: js.UndefOr[String] = js.undefined
    
    var userID: js.UndefOr[String] = js.undefined
    
    var userProfileURL: js.UndefOr[String] = js.undefined
  }
  object IOAuth2StrategyOption {
    
    inline def apply(callbackURL: String, clientID: String, clientSecret: String): IOAuth2StrategyOption = {
      val __obj = js.Dynamic.literal(callbackURL = callbackURL.asInstanceOf[js.Any], clientID = clientID.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any])
      __obj.asInstanceOf[IOAuth2StrategyOption]
    }
    
    extension [Self <: IOAuth2StrategyOption](x: Self) {
      
      inline def setAccessType(value: String): Self = StObject.set(x, "accessType", value.asInstanceOf[js.Any])
      
      inline def setAccessTypeUndefined: Self = StObject.set(x, "accessType", js.undefined)
      
      inline def setApproval_prompt(value: String): Self = StObject.set(x, "approval_prompt", value.asInstanceOf[js.Any])
      
      inline def setApproval_promptUndefined: Self = StObject.set(x, "approval_prompt", js.undefined)
      
      inline def setAuthorizationURL(value: String): Self = StObject.set(x, "authorizationURL", value.asInstanceOf[js.Any])
      
      inline def setAuthorizationURLUndefined: Self = StObject.set(x, "authorizationURL", js.undefined)
      
      inline def setCallbackURL(value: String): Self = StObject.set(x, "callbackURL", value.asInstanceOf[js.Any])
      
      inline def setClientID(value: String): Self = StObject.set(x, "clientID", value.asInstanceOf[js.Any])
      
      inline def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
      
      inline def setDisplay(value: String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      inline def setHostedDomain(value: String): Self = StObject.set(x, "hostedDomain", value.asInstanceOf[js.Any])
      
      inline def setHostedDomainUndefined: Self = StObject.set(x, "hostedDomain", js.undefined)
      
      inline def setLoginHint(value: String): Self = StObject.set(x, "loginHint", value.asInstanceOf[js.Any])
      
      inline def setLoginHintUndefined: Self = StObject.set(x, "loginHint", js.undefined)
      
      inline def setOpenIDRealm(value: String): Self = StObject.set(x, "openIDRealm", value.asInstanceOf[js.Any])
      
      inline def setOpenIDRealmUndefined: Self = StObject.set(x, "openIDRealm", js.undefined)
      
      inline def setPrompt(value: String): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
      
      inline def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
      
      inline def setRequestVisibleActions(value: String): Self = StObject.set(x, "requestVisibleActions", value.asInstanceOf[js.Any])
      
      inline def setRequestVisibleActionsUndefined: Self = StObject.set(x, "requestVisibleActions", js.undefined)
      
      inline def setTokenURL(value: String): Self = StObject.set(x, "tokenURL", value.asInstanceOf[js.Any])
      
      inline def setTokenURLUndefined: Self = StObject.set(x, "tokenURL", js.undefined)
      
      inline def setUserID(value: String): Self = StObject.set(x, "userID", value.asInstanceOf[js.Any])
      
      inline def setUserIDUndefined: Self = StObject.set(x, "userID", js.undefined)
      
      inline def setUserProfileURL(value: String): Self = StObject.set(x, "userProfileURL", value.asInstanceOf[js.Any])
      
      inline def setUserProfileURLUndefined: Self = StObject.set(x, "userProfileURL", js.undefined)
    }
  }
  
  trait IOAuth2StrategyOptionWithRequest
    extends StObject
       with IOAuth2StrategyOption {
    
    var passReqToCallback: Boolean
  }
  object IOAuth2StrategyOptionWithRequest {
    
    inline def apply(callbackURL: String, clientID: String, clientSecret: String, passReqToCallback: Boolean): IOAuth2StrategyOptionWithRequest = {
      val __obj = js.Dynamic.literal(callbackURL = callbackURL.asInstanceOf[js.Any], clientID = clientID.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], passReqToCallback = passReqToCallback.asInstanceOf[js.Any])
      __obj.asInstanceOf[IOAuth2StrategyOptionWithRequest]
    }
    
    extension [Self <: IOAuth2StrategyOptionWithRequest](x: Self) {
      
      inline def setPassReqToCallback(value: Boolean): Self = StObject.set(x, "passReqToCallback", value.asInstanceOf[js.Any])
    }
  }
  
  trait IOAuthStrategyOption extends StObject {
    
    var accessTokenURL: js.UndefOr[String] = js.undefined
    
    var callbackURL: String
    
    var consumerKey: String
    
    var consumerSecret: String
    
    var requestTokenURL: js.UndefOr[String] = js.undefined
    
    var sessionKey: js.UndefOr[String] = js.undefined
    
    var userAuthorizationURL: js.UndefOr[String] = js.undefined
  }
  object IOAuthStrategyOption {
    
    inline def apply(callbackURL: String, consumerKey: String, consumerSecret: String): IOAuthStrategyOption = {
      val __obj = js.Dynamic.literal(callbackURL = callbackURL.asInstanceOf[js.Any], consumerKey = consumerKey.asInstanceOf[js.Any], consumerSecret = consumerSecret.asInstanceOf[js.Any])
      __obj.asInstanceOf[IOAuthStrategyOption]
    }
    
    extension [Self <: IOAuthStrategyOption](x: Self) {
      
      inline def setAccessTokenURL(value: String): Self = StObject.set(x, "accessTokenURL", value.asInstanceOf[js.Any])
      
      inline def setAccessTokenURLUndefined: Self = StObject.set(x, "accessTokenURL", js.undefined)
      
      inline def setCallbackURL(value: String): Self = StObject.set(x, "callbackURL", value.asInstanceOf[js.Any])
      
      inline def setConsumerKey(value: String): Self = StObject.set(x, "consumerKey", value.asInstanceOf[js.Any])
      
      inline def setConsumerSecret(value: String): Self = StObject.set(x, "consumerSecret", value.asInstanceOf[js.Any])
      
      inline def setRequestTokenURL(value: String): Self = StObject.set(x, "requestTokenURL", value.asInstanceOf[js.Any])
      
      inline def setRequestTokenURLUndefined: Self = StObject.set(x, "requestTokenURL", js.undefined)
      
      inline def setSessionKey(value: String): Self = StObject.set(x, "sessionKey", value.asInstanceOf[js.Any])
      
      inline def setSessionKeyUndefined: Self = StObject.set(x, "sessionKey", js.undefined)
      
      inline def setUserAuthorizationURL(value: String): Self = StObject.set(x, "userAuthorizationURL", value.asInstanceOf[js.Any])
      
      inline def setUserAuthorizationURLUndefined: Self = StObject.set(x, "userAuthorizationURL", js.undefined)
    }
  }
  
  trait Profile
    extends StObject
       with typings.passport.mod.Profile {
    
    var _json: Any
    
    var _raw: String
    
    var gender: String
  }
  object Profile {
    
    inline def apply(_json: Any, _raw: String, displayName: String, gender: String, id: String, provider: String): Profile = {
      val __obj = js.Dynamic.literal(_json = _json.asInstanceOf[js.Any], _raw = _raw.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], gender = gender.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
      __obj.asInstanceOf[Profile]
    }
    
    extension [Self <: Profile](x: Self) {
      
      inline def setGender(value: String): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
      
      inline def set_json(value: Any): Self = StObject.set(x, "_json", value.asInstanceOf[js.Any])
      
      inline def set_raw(value: String): Self = StObject.set(x, "_raw", value.asInstanceOf[js.Any])
    }
  }
  
  type VerifyFunction = js.Function3[/* error */ Any, /* user */ js.UndefOr[Any], /* msg */ js.UndefOr[VerifyOptions], Unit]
  
  trait VerifyOptions extends StObject {
    
    var message: String
  }
  object VerifyOptions {
    
    inline def apply(message: String): VerifyOptions = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[VerifyOptions]
    }
    
    extension [Self <: VerifyOptions](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
}
