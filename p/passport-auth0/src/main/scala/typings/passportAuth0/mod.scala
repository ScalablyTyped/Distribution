package typings.passportAuth0

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.passport.mod.Strategy
import typings.passportAuth0.anon.Max
import typings.passportAuth0.passportAuth0Booleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("passport-auth0", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with StrategyInternal {
    def this(options: StrategyOptionWithRequest, verify: VerifyFunctionWithRequest) = this()
    def this(options: StrategyOption, verify: VerifyFunction) = this()
  }
  
  trait AuthenticateOptions
    extends StObject
       with typings.passport.mod.AuthenticateOptions {
    
    var authType: js.UndefOr[String] = js.undefined
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
      def setAuthType(value: String): Self = StObject.set(x, "authType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthTypeUndefined: Self = StObject.set(x, "authType", js.undefined)
    }
  }
  
  trait ExtraVerificationParams extends StObject {
    
    var audience: js.UndefOr[String] = js.undefined
    
    var connection: js.UndefOr[String] = js.undefined
    
    var prompt: js.UndefOr[String] = js.undefined
  }
  object ExtraVerificationParams {
    
    @scala.inline
    def apply(): ExtraVerificationParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExtraVerificationParams]
    }
    
    @scala.inline
    implicit class ExtraVerificationParamsMutableBuilder[Self <: ExtraVerificationParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAudience(value: String): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
      
      @scala.inline
      def setConnection(value: String): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectionUndefined: Self = StObject.set(x, "connection", js.undefined)
      
      @scala.inline
      def setPrompt(value: String): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
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
    
    @scala.inline
    def apply(_json: js.Any, _raw: String, birthday: String, displayName: String, id: String, provider: String): Profile = {
      val __obj = js.Dynamic.literal(_json = _json.asInstanceOf[js.Any], _raw = _raw.asInstanceOf[js.Any], birthday = birthday.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
      __obj.asInstanceOf[Profile]
    }
    
    @scala.inline
    implicit class ProfileMutableBuilder[Self <: Profile] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAgeRange(value: Max): Self = StObject.set(x, "ageRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAgeRangeUndefined: Self = StObject.set(x, "ageRange", js.undefined)
      
      @scala.inline
      def setBirthday(value: String): Self = StObject.set(x, "birthday", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGender(value: String): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGenderUndefined: Self = StObject.set(x, "gender", js.undefined)
      
      @scala.inline
      def setProfileUrl(value: String): Self = StObject.set(x, "profileUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfileUrlUndefined: Self = StObject.set(x, "profileUrl", js.undefined)
      
      @scala.inline
      def set_json(value: js.Any): Self = StObject.set(x, "_json", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_raw(value: String): Self = StObject.set(x, "_raw", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StrategyInternal
    extends StObject
       with Strategy {
    
    def authenticate(req: Request_[ParamsDictionary, js.Any, js.Any, Query], options: js.Object): Unit = js.native
    
    @JSName("name")
    var name_StrategyInternal: String = js.native
  }
  
  trait StrategyOption extends StObject {
    
    var callbackURL: String
    
    var clientID: String
    
    var clientSecret: String
    
    var domain: String
    
    var enableProof: js.UndefOr[Boolean] = js.undefined
    
    var profileFields: js.UndefOr[js.Array[String]] = js.undefined
    
    var scopeSeparator: js.UndefOr[String] = js.undefined
    
    var state: js.UndefOr[Boolean] = js.undefined
  }
  object StrategyOption {
    
    @scala.inline
    def apply(callbackURL: String, clientID: String, clientSecret: String, domain: String): StrategyOption = {
      val __obj = js.Dynamic.literal(callbackURL = callbackURL.asInstanceOf[js.Any], clientID = clientID.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any])
      __obj.asInstanceOf[StrategyOption]
    }
    
    @scala.inline
    implicit class StrategyOptionMutableBuilder[Self <: StrategyOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallbackURL(value: String): Self = StObject.set(x, "callbackURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientID(value: String): Self = StObject.set(x, "clientID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableProof(value: Boolean): Self = StObject.set(x, "enableProof", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableProofUndefined: Self = StObject.set(x, "enableProof", js.undefined)
      
      @scala.inline
      def setProfileFields(value: js.Array[String]): Self = StObject.set(x, "profileFields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfileFieldsUndefined: Self = StObject.set(x, "profileFields", js.undefined)
      
      @scala.inline
      def setProfileFieldsVarargs(value: String*): Self = StObject.set(x, "profileFields", js.Array(value :_*))
      
      @scala.inline
      def setScopeSeparator(value: String): Self = StObject.set(x, "scopeSeparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeSeparatorUndefined: Self = StObject.set(x, "scopeSeparator", js.undefined)
      
      @scala.inline
      def setState(value: Boolean): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
  
  trait StrategyOptionWithRequest
    extends StObject
       with StrategyOption {
    
    var passReqToCallback: `true`
  }
  object StrategyOptionWithRequest {
    
    @scala.inline
    def apply(callbackURL: String, clientID: String, clientSecret: String, domain: String): StrategyOptionWithRequest = {
      val __obj = js.Dynamic.literal(callbackURL = callbackURL.asInstanceOf[js.Any], clientID = clientID.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], passReqToCallback = true)
      __obj.asInstanceOf[StrategyOptionWithRequest]
    }
    
    @scala.inline
    implicit class StrategyOptionWithRequestMutableBuilder[Self <: StrategyOptionWithRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPassReqToCallback(value: `true`): Self = StObject.set(x, "passReqToCallback", value.asInstanceOf[js.Any])
    }
  }
  
  type VerifyFunction = js.Function5[
    /* accessToken */ String, 
    /* refreshToken */ String, 
    /* extraParams */ ExtraVerificationParams, 
    /* profile */ Profile, 
    /* done */ js.Function3[/* error */ js.Any, /* user */ js.UndefOr[js.Any], /* info */ js.UndefOr[js.Any], Unit], 
    Unit
  ]
  
  type VerifyFunctionWithRequest = js.Function6[
    /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* accessToken */ String, 
    /* refreshToken */ String, 
    /* extraParams */ ExtraVerificationParams, 
    /* profile */ Profile, 
    /* done */ js.Function3[/* error */ js.Any, /* user */ js.UndefOr[js.Any], /* info */ js.UndefOr[js.Any], Unit], 
    Unit
  ]
}
