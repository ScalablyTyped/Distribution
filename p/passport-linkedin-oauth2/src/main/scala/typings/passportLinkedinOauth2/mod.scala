package typings.passportLinkedinOauth2

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.passportLinkedinOauth2.passportLinkedinOauth2Booleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("passport-linkedin-oauth2", "Strategy")
  @js.native
  class Strategy protected ()
    extends typings.passport.mod.Strategy {
    def this(options: StrategyOptionWithRequest, verify: VerifyFunctionWithRequest) = this()
    def this(options: StrategyOption, verify: VerifyFunction) = this()
    
    def authenticate(req: Request_[ParamsDictionary, _, _, Query], options: js.Object): Unit = js.native
  }
  
  @js.native
  trait AuthenticateOptions
    extends typings.passport.mod.AuthenticateOptions {
    
    var authType: js.UndefOr[String] = js.native
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
  
  @js.native
  trait Profile
    extends typings.passport.mod.Profile {
    
    var _json: js.Any = js.native
    
    var _raw: String = js.native
  }
  object Profile {
    
    @scala.inline
    def apply(_json: js.Any, _raw: String, displayName: String, id: String, provider: String): Profile = {
      val __obj = js.Dynamic.literal(_json = _json.asInstanceOf[js.Any], _raw = _raw.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
      __obj.asInstanceOf[Profile]
    }
    
    @scala.inline
    implicit class ProfileMutableBuilder[Self <: Profile] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set_json(value: js.Any): Self = StObject.set(x, "_json", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_raw(value: String): Self = StObject.set(x, "_raw", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StrategyOption extends StObject {
    
    var callbackURL: String = js.native
    
    var clientID: String = js.native
    
    var clientSecret: String = js.native
    
    var enableProof: js.UndefOr[Boolean] = js.native
    
    var profileFields: js.UndefOr[js.Array[String]] = js.native
    
    var scopeSeparator: js.UndefOr[String] = js.native
  }
  object StrategyOption {
    
    @scala.inline
    def apply(callbackURL: String, clientID: String, clientSecret: String): StrategyOption = {
      val __obj = js.Dynamic.literal(callbackURL = callbackURL.asInstanceOf[js.Any], clientID = clientID.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any])
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
    }
  }
  
  @js.native
  trait StrategyOptionWithRequest extends StrategyOption {
    
    var passReqToCallback: `true` = js.native
  }
  object StrategyOptionWithRequest {
    
    @scala.inline
    def apply(callbackURL: String, clientID: String, clientSecret: String, passReqToCallback: `true`): StrategyOptionWithRequest = {
      val __obj = js.Dynamic.literal(callbackURL = callbackURL.asInstanceOf[js.Any], clientID = clientID.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], passReqToCallback = passReqToCallback.asInstanceOf[js.Any])
      __obj.asInstanceOf[StrategyOptionWithRequest]
    }
    
    @scala.inline
    implicit class StrategyOptionWithRequestMutableBuilder[Self <: StrategyOptionWithRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPassReqToCallback(value: `true`): Self = StObject.set(x, "passReqToCallback", value.asInstanceOf[js.Any])
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
