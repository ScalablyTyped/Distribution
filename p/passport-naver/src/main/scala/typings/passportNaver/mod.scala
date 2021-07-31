package typings.passportNaver

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.passportNaver.anon.Age
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("passport-naver", "Strategy")
  @js.native
  class Strategy protected ()
    extends StObject
       with typings.passport.mod.Strategy {
    def this(options: StrategyOptionWithRequest, verify: VerifyFunctionWithRequest) = this()
    def this(options: StrategyOption, verify: VerifyFunction) = this()
    
    def authorizationParams(options: js.Any): js.Any = js.native
    
    def userProfile(accessToken: String, done: js.Function2[/* error */ js.Any, /* user */ js.UndefOr[js.Any], Unit]): Unit = js.native
  }
  
  trait Profile
    extends StObject
       with typings.passport.mod.Profile {
    
    var _json: Age
  }
  object Profile {
    
    @scala.inline
    def apply(_json: Age, displayName: String, id: String, provider: String): Profile = {
      val __obj = js.Dynamic.literal(_json = _json.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
      __obj.asInstanceOf[Profile]
    }
    
    @scala.inline
    implicit class ProfileMutableBuilder[Self <: Profile] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set_json(value: Age): Self = StObject.set(x, "_json", value.asInstanceOf[js.Any])
    }
  }
  
  trait StrategyOption extends StObject {
    
    var authType: js.UndefOr[String] = js.undefined
    
    var authorizationURL: js.UndefOr[String] = js.undefined
    
    var callbackURL: String
    
    var clientID: String
    
    var clientSecret: String
    
    var profileURL: js.UndefOr[String] = js.undefined
    
    var svcType: js.UndefOr[Double] = js.undefined
    
    var tokenURL: js.UndefOr[String] = js.undefined
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
      def setAuthType(value: String): Self = StObject.set(x, "authType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthTypeUndefined: Self = StObject.set(x, "authType", js.undefined)
      
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
      def setProfileURL(value: String): Self = StObject.set(x, "profileURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfileURLUndefined: Self = StObject.set(x, "profileURL", js.undefined)
      
      @scala.inline
      def setSvcType(value: Double): Self = StObject.set(x, "svcType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSvcTypeUndefined: Self = StObject.set(x, "svcType", js.undefined)
      
      @scala.inline
      def setTokenURL(value: String): Self = StObject.set(x, "tokenURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenURLUndefined: Self = StObject.set(x, "tokenURL", js.undefined)
    }
  }
  
  trait StrategyOptionWithRequest
    extends StObject
       with StrategyOption {
    
    var passReqToCallback: Boolean
  }
  object StrategyOptionWithRequest {
    
    @scala.inline
    def apply(callbackURL: String, clientID: String, clientSecret: String, passReqToCallback: Boolean): StrategyOptionWithRequest = {
      val __obj = js.Dynamic.literal(callbackURL = callbackURL.asInstanceOf[js.Any], clientID = clientID.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], passReqToCallback = passReqToCallback.asInstanceOf[js.Any])
      __obj.asInstanceOf[StrategyOptionWithRequest]
    }
    
    @scala.inline
    implicit class StrategyOptionWithRequestMutableBuilder[Self <: StrategyOptionWithRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPassReqToCallback(value: Boolean): Self = StObject.set(x, "passReqToCallback", value.asInstanceOf[js.Any])
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
