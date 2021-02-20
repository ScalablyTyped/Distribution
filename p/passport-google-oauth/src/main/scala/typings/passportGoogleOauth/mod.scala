package typings.passportGoogleOauth

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.passport.mod.Strategy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("passport-google-oauth", "OAuth2Strategy")
  @js.native
  class OAuth2Strategy protected () extends Strategy {
    def this(
      options: IOAuth2StrategyOptionWithRequest,
      verify: js.Function5[
            /* req */ Request_[ParamsDictionary, _, _, Query], 
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
    
    def authenticate(req: Request_[ParamsDictionary, _, _, Query], options: js.Object): Unit = js.native
    
    @JSName("name")
    var name_OAuth2Strategy: String = js.native
  }
  
  @JSImport("passport-google-oauth", "OAuthStrategy")
  @js.native
  class OAuthStrategy protected () extends Strategy {
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
    
    def authenticate(req: Request_[ParamsDictionary, _, _, Query], options: js.Object): Unit = js.native
    
    @JSName("name")
    var name_OAuthStrategy: String = js.native
  }
  
  @js.native
  trait IOAuth2StrategyOption extends StObject {
    
    var accessType: js.UndefOr[String] = js.native
    
    var approval_prompt: js.UndefOr[String] = js.native
    
    var authorizationURL: js.UndefOr[String] = js.native
    
    var callbackURL: String = js.native
    
    var clientID: String = js.native
    
    var clientSecret: String = js.native
    
    var display: js.UndefOr[String] = js.native
    
    var hostedDomain: js.UndefOr[String] = js.native
    
    var loginHint: js.UndefOr[String] = js.native
    
    var openIDRealm: js.UndefOr[String] = js.native
    
    var prompt: js.UndefOr[String] = js.native
    
    var requestVisibleActions: js.UndefOr[String] = js.native
    
    var tokenURL: js.UndefOr[String] = js.native
    
    var userID: js.UndefOr[String] = js.native
    
    var userProfileURL: js.UndefOr[String] = js.native
  }
  object IOAuth2StrategyOption {
    
    @scala.inline
    def apply(callbackURL: String, clientID: String, clientSecret: String): IOAuth2StrategyOption = {
      val __obj = js.Dynamic.literal(callbackURL = callbackURL.asInstanceOf[js.Any], clientID = clientID.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any])
      __obj.asInstanceOf[IOAuth2StrategyOption]
    }
    
    @scala.inline
    implicit class IOAuth2StrategyOptionMutableBuilder[Self <: IOAuth2StrategyOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessType(value: String): Self = StObject.set(x, "accessType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessTypeUndefined: Self = StObject.set(x, "accessType", js.undefined)
      
      @scala.inline
      def setApproval_prompt(value: String): Self = StObject.set(x, "approval_prompt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApproval_promptUndefined: Self = StObject.set(x, "approval_prompt", js.undefined)
      
      @scala.inline
      def setAuthorizationURL(value: String): Self = StObject.set(x, "authorizationURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorizationURLUndefined: Self = StObject.set(x, "authorizationURL", js.undefined)
      
      @scala.inline
      def setCallbackURL(value: String): Self = StObject.set(x, "callbackURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientID(value: String): Self = StObject.set(x, "clientID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplay(value: String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      @scala.inline
      def setHostedDomain(value: String): Self = StObject.set(x, "hostedDomain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostedDomainUndefined: Self = StObject.set(x, "hostedDomain", js.undefined)
      
      @scala.inline
      def setLoginHint(value: String): Self = StObject.set(x, "loginHint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoginHintUndefined: Self = StObject.set(x, "loginHint", js.undefined)
      
      @scala.inline
      def setOpenIDRealm(value: String): Self = StObject.set(x, "openIDRealm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenIDRealmUndefined: Self = StObject.set(x, "openIDRealm", js.undefined)
      
      @scala.inline
      def setPrompt(value: String): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
      
      @scala.inline
      def setRequestVisibleActions(value: String): Self = StObject.set(x, "requestVisibleActions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestVisibleActionsUndefined: Self = StObject.set(x, "requestVisibleActions", js.undefined)
      
      @scala.inline
      def setTokenURL(value: String): Self = StObject.set(x, "tokenURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenURLUndefined: Self = StObject.set(x, "tokenURL", js.undefined)
      
      @scala.inline
      def setUserID(value: String): Self = StObject.set(x, "userID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserIDUndefined: Self = StObject.set(x, "userID", js.undefined)
      
      @scala.inline
      def setUserProfileURL(value: String): Self = StObject.set(x, "userProfileURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserProfileURLUndefined: Self = StObject.set(x, "userProfileURL", js.undefined)
    }
  }
  
  @js.native
  trait IOAuth2StrategyOptionWithRequest extends IOAuth2StrategyOption {
    
    var passReqToCallback: Boolean = js.native
  }
  object IOAuth2StrategyOptionWithRequest {
    
    @scala.inline
    def apply(callbackURL: String, clientID: String, clientSecret: String, passReqToCallback: Boolean): IOAuth2StrategyOptionWithRequest = {
      val __obj = js.Dynamic.literal(callbackURL = callbackURL.asInstanceOf[js.Any], clientID = clientID.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], passReqToCallback = passReqToCallback.asInstanceOf[js.Any])
      __obj.asInstanceOf[IOAuth2StrategyOptionWithRequest]
    }
    
    @scala.inline
    implicit class IOAuth2StrategyOptionWithRequestMutableBuilder[Self <: IOAuth2StrategyOptionWithRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPassReqToCallback(value: Boolean): Self = StObject.set(x, "passReqToCallback", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IOAuthStrategyOption extends StObject {
    
    var accessTokenURL: js.UndefOr[String] = js.native
    
    var callbackURL: String = js.native
    
    var consumerKey: String = js.native
    
    var consumerSecret: String = js.native
    
    var requestTokenURL: js.UndefOr[String] = js.native
    
    var sessionKey: js.UndefOr[String] = js.native
    
    var userAuthorizationURL: js.UndefOr[String] = js.native
  }
  object IOAuthStrategyOption {
    
    @scala.inline
    def apply(callbackURL: String, consumerKey: String, consumerSecret: String): IOAuthStrategyOption = {
      val __obj = js.Dynamic.literal(callbackURL = callbackURL.asInstanceOf[js.Any], consumerKey = consumerKey.asInstanceOf[js.Any], consumerSecret = consumerSecret.asInstanceOf[js.Any])
      __obj.asInstanceOf[IOAuthStrategyOption]
    }
    
    @scala.inline
    implicit class IOAuthStrategyOptionMutableBuilder[Self <: IOAuthStrategyOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessTokenURL(value: String): Self = StObject.set(x, "accessTokenURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessTokenURLUndefined: Self = StObject.set(x, "accessTokenURL", js.undefined)
      
      @scala.inline
      def setCallbackURL(value: String): Self = StObject.set(x, "callbackURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConsumerKey(value: String): Self = StObject.set(x, "consumerKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConsumerSecret(value: String): Self = StObject.set(x, "consumerSecret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestTokenURL(value: String): Self = StObject.set(x, "requestTokenURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestTokenURLUndefined: Self = StObject.set(x, "requestTokenURL", js.undefined)
      
      @scala.inline
      def setSessionKey(value: String): Self = StObject.set(x, "sessionKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionKeyUndefined: Self = StObject.set(x, "sessionKey", js.undefined)
      
      @scala.inline
      def setUserAuthorizationURL(value: String): Self = StObject.set(x, "userAuthorizationURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserAuthorizationURLUndefined: Self = StObject.set(x, "userAuthorizationURL", js.undefined)
    }
  }
  
  @js.native
  trait Profile
    extends typings.passport.mod.Profile {
    
    var _json: js.Any = js.native
    
    var _raw: String = js.native
    
    var gender: String = js.native
  }
  object Profile {
    
    @scala.inline
    def apply(_json: js.Any, _raw: String, displayName: String, gender: String, id: String, provider: String): Profile = {
      val __obj = js.Dynamic.literal(_json = _json.asInstanceOf[js.Any], _raw = _raw.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], gender = gender.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
      __obj.asInstanceOf[Profile]
    }
    
    @scala.inline
    implicit class ProfileMutableBuilder[Self <: Profile] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGender(value: String): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_json(value: js.Any): Self = StObject.set(x, "_json", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_raw(value: String): Self = StObject.set(x, "_raw", value.asInstanceOf[js.Any])
    }
  }
  
  type VerifyFunction = js.Function3[
    /* error */ js.Any, 
    /* user */ js.UndefOr[js.Any], 
    /* msg */ js.UndefOr[VerifyOptions], 
    Unit
  ]
  
  @js.native
  trait VerifyOptions extends StObject {
    
    var message: String = js.native
  }
  object VerifyOptions {
    
    @scala.inline
    def apply(message: String): VerifyOptions = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[VerifyOptions]
    }
    
    @scala.inline
    implicit class VerifyOptionsMutableBuilder[Self <: VerifyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
}
