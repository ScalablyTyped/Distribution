package typings.passportFacebook

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.passportFacebook.anon.Max
import typings.passportFacebook.passportFacebookBooleans.`true`
import typings.passportFacebook.passportFacebookStrings.page
import typings.passportFacebook.passportFacebookStrings.popup
import typings.passportFacebook.passportFacebookStrings.reauthenticate
import typings.passportFacebook.passportFacebookStrings.touch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("passport-facebook", "Strategy")
  @js.native
  class Strategy protected ()
    extends StObject
       with typings.passport.mod.Strategy {
    def this(options: StrategyOptionWithRequest, verify: VerifyFunctionWithRequest) = this()
    def this(options: StrategyOption, verify: VerifyFunction) = this()
    
    def authenticate(req: Request_[ParamsDictionary, js.Any, js.Any, Query], options: js.Object): Unit = js.native
  }
  
  trait AuthenticateOptions
    extends StObject
       with typings.passport.mod.AuthenticateOptions {
    
    var authType: js.UndefOr[String] = js.undefined
  }
  object AuthenticateOptions {
    
    inline def apply(): AuthenticateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AuthenticateOptions]
    }
    
    extension [Self <: AuthenticateOptions](x: Self) {
      
      inline def setAuthType(value: String): Self = StObject.set(x, "authType", value.asInstanceOf[js.Any])
      
      inline def setAuthTypeUndefined: Self = StObject.set(x, "authType", js.undefined)
    }
  }
  
  trait Profile
    extends StObject
       with typings.passport.mod.Profile {
    
    var _json: js.Any
    
    var _raw: String
    
    var ageRange: js.UndefOr[Max] = js.undefined
    
    var birthday: String
    
    var gender: js.UndefOr[String] = js.undefined
    
    var profileUrl: js.UndefOr[String] = js.undefined
  }
  object Profile {
    
    inline def apply(_json: js.Any, _raw: String, birthday: String, displayName: String, id: String, provider: String): Profile = {
      val __obj = js.Dynamic.literal(_json = _json.asInstanceOf[js.Any], _raw = _raw.asInstanceOf[js.Any], birthday = birthday.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
      __obj.asInstanceOf[Profile]
    }
    
    extension [Self <: Profile](x: Self) {
      
      inline def setAgeRange(value: Max): Self = StObject.set(x, "ageRange", value.asInstanceOf[js.Any])
      
      inline def setAgeRangeUndefined: Self = StObject.set(x, "ageRange", js.undefined)
      
      inline def setBirthday(value: String): Self = StObject.set(x, "birthday", value.asInstanceOf[js.Any])
      
      inline def setGender(value: String): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
      
      inline def setGenderUndefined: Self = StObject.set(x, "gender", js.undefined)
      
      inline def setProfileUrl(value: String): Self = StObject.set(x, "profileUrl", value.asInstanceOf[js.Any])
      
      inline def setProfileUrlUndefined: Self = StObject.set(x, "profileUrl", js.undefined)
      
      inline def set_json(value: js.Any): Self = StObject.set(x, "_json", value.asInstanceOf[js.Any])
      
      inline def set_raw(value: String): Self = StObject.set(x, "_raw", value.asInstanceOf[js.Any])
    }
  }
  
  trait StrategyOption extends StObject {
    
    var authNonce: js.UndefOr[String] = js.undefined
    
    var authType: js.UndefOr[reauthenticate] = js.undefined
    
    var authorizationURL: js.UndefOr[String] = js.undefined
    
    var callbackURL: String
    
    var clientID: String
    
    var clientSecret: String
    
    var display: js.UndefOr[page | popup | touch] = js.undefined
    
    var enableProof: js.UndefOr[Boolean] = js.undefined
    
    var graphAPIVersion: js.UndefOr[String] = js.undefined
    
    var profileFields: js.UndefOr[js.Array[String]] = js.undefined
    
    var profileURL: js.UndefOr[String] = js.undefined
    
    var scopeSeparator: js.UndefOr[String] = js.undefined
    
    var tokenURL: js.UndefOr[String] = js.undefined
  }
  object StrategyOption {
    
    inline def apply(callbackURL: String, clientID: String, clientSecret: String): StrategyOption = {
      val __obj = js.Dynamic.literal(callbackURL = callbackURL.asInstanceOf[js.Any], clientID = clientID.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any])
      __obj.asInstanceOf[StrategyOption]
    }
    
    extension [Self <: StrategyOption](x: Self) {
      
      inline def setAuthNonce(value: String): Self = StObject.set(x, "authNonce", value.asInstanceOf[js.Any])
      
      inline def setAuthNonceUndefined: Self = StObject.set(x, "authNonce", js.undefined)
      
      inline def setAuthType(value: reauthenticate): Self = StObject.set(x, "authType", value.asInstanceOf[js.Any])
      
      inline def setAuthTypeUndefined: Self = StObject.set(x, "authType", js.undefined)
      
      inline def setAuthorizationURL(value: String): Self = StObject.set(x, "authorizationURL", value.asInstanceOf[js.Any])
      
      inline def setAuthorizationURLUndefined: Self = StObject.set(x, "authorizationURL", js.undefined)
      
      inline def setCallbackURL(value: String): Self = StObject.set(x, "callbackURL", value.asInstanceOf[js.Any])
      
      inline def setClientID(value: String): Self = StObject.set(x, "clientID", value.asInstanceOf[js.Any])
      
      inline def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
      
      inline def setDisplay(value: page | popup | touch): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      inline def setEnableProof(value: Boolean): Self = StObject.set(x, "enableProof", value.asInstanceOf[js.Any])
      
      inline def setEnableProofUndefined: Self = StObject.set(x, "enableProof", js.undefined)
      
      inline def setGraphAPIVersion(value: String): Self = StObject.set(x, "graphAPIVersion", value.asInstanceOf[js.Any])
      
      inline def setGraphAPIVersionUndefined: Self = StObject.set(x, "graphAPIVersion", js.undefined)
      
      inline def setProfileFields(value: js.Array[String]): Self = StObject.set(x, "profileFields", value.asInstanceOf[js.Any])
      
      inline def setProfileFieldsUndefined: Self = StObject.set(x, "profileFields", js.undefined)
      
      inline def setProfileFieldsVarargs(value: String*): Self = StObject.set(x, "profileFields", js.Array(value :_*))
      
      inline def setProfileURL(value: String): Self = StObject.set(x, "profileURL", value.asInstanceOf[js.Any])
      
      inline def setProfileURLUndefined: Self = StObject.set(x, "profileURL", js.undefined)
      
      inline def setScopeSeparator(value: String): Self = StObject.set(x, "scopeSeparator", value.asInstanceOf[js.Any])
      
      inline def setScopeSeparatorUndefined: Self = StObject.set(x, "scopeSeparator", js.undefined)
      
      inline def setTokenURL(value: String): Self = StObject.set(x, "tokenURL", value.asInstanceOf[js.Any])
      
      inline def setTokenURLUndefined: Self = StObject.set(x, "tokenURL", js.undefined)
    }
  }
  
  trait StrategyOptionWithRequest
    extends StObject
       with StrategyOption {
    
    var passReqToCallback: `true`
  }
  object StrategyOptionWithRequest {
    
    inline def apply(callbackURL: String, clientID: String, clientSecret: String): StrategyOptionWithRequest = {
      val __obj = js.Dynamic.literal(callbackURL = callbackURL.asInstanceOf[js.Any], clientID = clientID.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], passReqToCallback = true)
      __obj.asInstanceOf[StrategyOptionWithRequest]
    }
    
    extension [Self <: StrategyOptionWithRequest](x: Self) {
      
      inline def setPassReqToCallback(value: `true`): Self = StObject.set(x, "passReqToCallback", value.asInstanceOf[js.Any])
    }
  }
  
  type VerifyFunction = js.Function4[
    /* accessToken */ String, 
    /* refreshToken */ String, 
    /* profile */ Profile, 
    /* done */ js.Function3[/* error */ js.Any, /* user */ js.UndefOr[js.Any], /* info */ js.UndefOr[js.Any], Unit], 
    Unit
  ]
  
  type VerifyFunctionWithRequest = js.Function5[
    /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* accessToken */ String, 
    /* refreshToken */ String, 
    /* profile */ Profile, 
    /* done */ js.Function3[/* error */ js.Any, /* user */ js.UndefOr[js.Any], /* info */ js.UndefOr[js.Any], Unit], 
    Unit
  ]
}
