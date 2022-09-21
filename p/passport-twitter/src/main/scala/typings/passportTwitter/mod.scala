package typings.passportTwitter

import typings.express.mod.Request_
import typings.passportTwitter.passportTwitterBooleans.`false`
import typings.passportTwitter.passportTwitterBooleans.`true`
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("passport-twitter", "Strategy")
  @js.native
  open class Strategy protected ()
    extends StObject
       with typings.passport.mod.Strategy {
    def this(
      options: IStrategyOptionWithRequest,
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
            /* done */ js.Function2[/* error */ Any, /* user */ js.UndefOr[Any], Unit], 
            Unit
          ]
    ) = this()
    def this(
      options: IStrategyOption,
      verify: js.Function4[
            /* accessToken */ String, 
            /* refreshToken */ String, 
            /* profile */ Profile, 
            /* done */ js.Function2[/* error */ Any, /* user */ js.UndefOr[Any], Unit], 
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
  }
  
  trait IStrategyOption
    extends StObject
       with IStrategyOptionBase {
    
    var passReqToCallback: js.UndefOr[`false`] = js.undefined
  }
  object IStrategyOption {
    
    inline def apply(callbackURL: String, consumerKey: String, consumerSecret: String): IStrategyOption = {
      val __obj = js.Dynamic.literal(callbackURL = callbackURL.asInstanceOf[js.Any], consumerKey = consumerKey.asInstanceOf[js.Any], consumerSecret = consumerSecret.asInstanceOf[js.Any])
      __obj.asInstanceOf[IStrategyOption]
    }
    
    extension [Self <: IStrategyOption](x: Self) {
      
      inline def setPassReqToCallback(value: `false`): Self = StObject.set(x, "passReqToCallback", value.asInstanceOf[js.Any])
      
      inline def setPassReqToCallbackUndefined: Self = StObject.set(x, "passReqToCallback", js.undefined)
    }
  }
  
  trait IStrategyOptionBase extends StObject {
    
    var accessTokenURL: js.UndefOr[String] = js.undefined
    
    var callbackURL: String
    
    var consumerKey: String
    
    var consumerSecret: String
    
    var forceLogin: js.UndefOr[Boolean] = js.undefined
    
    var includeEmail: js.UndefOr[Boolean] = js.undefined
    
    var includeEntities: js.UndefOr[Boolean] = js.undefined
    
    var includeStatus: js.UndefOr[Boolean] = js.undefined
    
    var requestTokenURL: js.UndefOr[String] = js.undefined
    
    var screenName: js.UndefOr[String] = js.undefined
    
    var sessionKey: js.UndefOr[String] = js.undefined
    
    var skipExtendedUserProfile: js.UndefOr[Boolean] = js.undefined
    
    var userAuthorizationURL: js.UndefOr[String] = js.undefined
    
    var userProfileURL: js.UndefOr[String] = js.undefined
  }
  object IStrategyOptionBase {
    
    inline def apply(callbackURL: String, consumerKey: String, consumerSecret: String): IStrategyOptionBase = {
      val __obj = js.Dynamic.literal(callbackURL = callbackURL.asInstanceOf[js.Any], consumerKey = consumerKey.asInstanceOf[js.Any], consumerSecret = consumerSecret.asInstanceOf[js.Any])
      __obj.asInstanceOf[IStrategyOptionBase]
    }
    
    extension [Self <: IStrategyOptionBase](x: Self) {
      
      inline def setAccessTokenURL(value: String): Self = StObject.set(x, "accessTokenURL", value.asInstanceOf[js.Any])
      
      inline def setAccessTokenURLUndefined: Self = StObject.set(x, "accessTokenURL", js.undefined)
      
      inline def setCallbackURL(value: String): Self = StObject.set(x, "callbackURL", value.asInstanceOf[js.Any])
      
      inline def setConsumerKey(value: String): Self = StObject.set(x, "consumerKey", value.asInstanceOf[js.Any])
      
      inline def setConsumerSecret(value: String): Self = StObject.set(x, "consumerSecret", value.asInstanceOf[js.Any])
      
      inline def setForceLogin(value: Boolean): Self = StObject.set(x, "forceLogin", value.asInstanceOf[js.Any])
      
      inline def setForceLoginUndefined: Self = StObject.set(x, "forceLogin", js.undefined)
      
      inline def setIncludeEmail(value: Boolean): Self = StObject.set(x, "includeEmail", value.asInstanceOf[js.Any])
      
      inline def setIncludeEmailUndefined: Self = StObject.set(x, "includeEmail", js.undefined)
      
      inline def setIncludeEntities(value: Boolean): Self = StObject.set(x, "includeEntities", value.asInstanceOf[js.Any])
      
      inline def setIncludeEntitiesUndefined: Self = StObject.set(x, "includeEntities", js.undefined)
      
      inline def setIncludeStatus(value: Boolean): Self = StObject.set(x, "includeStatus", value.asInstanceOf[js.Any])
      
      inline def setIncludeStatusUndefined: Self = StObject.set(x, "includeStatus", js.undefined)
      
      inline def setRequestTokenURL(value: String): Self = StObject.set(x, "requestTokenURL", value.asInstanceOf[js.Any])
      
      inline def setRequestTokenURLUndefined: Self = StObject.set(x, "requestTokenURL", js.undefined)
      
      inline def setScreenName(value: String): Self = StObject.set(x, "screenName", value.asInstanceOf[js.Any])
      
      inline def setScreenNameUndefined: Self = StObject.set(x, "screenName", js.undefined)
      
      inline def setSessionKey(value: String): Self = StObject.set(x, "sessionKey", value.asInstanceOf[js.Any])
      
      inline def setSessionKeyUndefined: Self = StObject.set(x, "sessionKey", js.undefined)
      
      inline def setSkipExtendedUserProfile(value: Boolean): Self = StObject.set(x, "skipExtendedUserProfile", value.asInstanceOf[js.Any])
      
      inline def setSkipExtendedUserProfileUndefined: Self = StObject.set(x, "skipExtendedUserProfile", js.undefined)
      
      inline def setUserAuthorizationURL(value: String): Self = StObject.set(x, "userAuthorizationURL", value.asInstanceOf[js.Any])
      
      inline def setUserAuthorizationURLUndefined: Self = StObject.set(x, "userAuthorizationURL", js.undefined)
      
      inline def setUserProfileURL(value: String): Self = StObject.set(x, "userProfileURL", value.asInstanceOf[js.Any])
      
      inline def setUserProfileURLUndefined: Self = StObject.set(x, "userProfileURL", js.undefined)
    }
  }
  
  trait IStrategyOptionWithRequest
    extends StObject
       with IStrategyOptionBase {
    
    var passReqToCallback: `true`
  }
  object IStrategyOptionWithRequest {
    
    inline def apply(callbackURL: String, consumerKey: String, consumerSecret: String): IStrategyOptionWithRequest = {
      val __obj = js.Dynamic.literal(callbackURL = callbackURL.asInstanceOf[js.Any], consumerKey = consumerKey.asInstanceOf[js.Any], consumerSecret = consumerSecret.asInstanceOf[js.Any], passReqToCallback = true)
      __obj.asInstanceOf[IStrategyOptionWithRequest]
    }
    
    extension [Self <: IStrategyOptionWithRequest](x: Self) {
      
      inline def setPassReqToCallback(value: `true`): Self = StObject.set(x, "passReqToCallback", value.asInstanceOf[js.Any])
    }
  }
  
  trait Profile
    extends StObject
       with typings.passport.mod.Profile {
    
    var _accessLevel: String
    
    var _json: Any
    
    var _raw: String
    
    var gender: String
  }
  object Profile {
    
    inline def apply(
      _accessLevel: String,
      _json: Any,
      _raw: String,
      displayName: String,
      gender: String,
      id: String,
      provider: String
    ): Profile = {
      val __obj = js.Dynamic.literal(_accessLevel = _accessLevel.asInstanceOf[js.Any], _json = _json.asInstanceOf[js.Any], _raw = _raw.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], gender = gender.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
      __obj.asInstanceOf[Profile]
    }
    
    extension [Self <: Profile](x: Self) {
      
      inline def setGender(value: String): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
      
      inline def set_accessLevel(value: String): Self = StObject.set(x, "_accessLevel", value.asInstanceOf[js.Any])
      
      inline def set_json(value: Any): Self = StObject.set(x, "_json", value.asInstanceOf[js.Any])
      
      inline def set_raw(value: String): Self = StObject.set(x, "_raw", value.asInstanceOf[js.Any])
    }
  }
}
