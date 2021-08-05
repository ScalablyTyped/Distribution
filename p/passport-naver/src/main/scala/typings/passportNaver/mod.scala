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
    
    inline def apply(_json: Age, displayName: String, id: String, provider: String): Profile = {
      val __obj = js.Dynamic.literal(_json = _json.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
      __obj.asInstanceOf[Profile]
    }
    
    extension [Self <: Profile](x: Self) {
      
      inline def set_json(value: Age): Self = StObject.set(x, "_json", value.asInstanceOf[js.Any])
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
    
    inline def apply(callbackURL: String, clientID: String, clientSecret: String): StrategyOption = {
      val __obj = js.Dynamic.literal(callbackURL = callbackURL.asInstanceOf[js.Any], clientID = clientID.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any])
      __obj.asInstanceOf[StrategyOption]
    }
    
    extension [Self <: StrategyOption](x: Self) {
      
      inline def setAuthType(value: String): Self = StObject.set(x, "authType", value.asInstanceOf[js.Any])
      
      inline def setAuthTypeUndefined: Self = StObject.set(x, "authType", js.undefined)
      
      inline def setAuthorizationURL(value: String): Self = StObject.set(x, "authorizationURL", value.asInstanceOf[js.Any])
      
      inline def setAuthorizationURLUndefined: Self = StObject.set(x, "authorizationURL", js.undefined)
      
      inline def setCallbackURL(value: String): Self = StObject.set(x, "callbackURL", value.asInstanceOf[js.Any])
      
      inline def setClientID(value: String): Self = StObject.set(x, "clientID", value.asInstanceOf[js.Any])
      
      inline def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
      
      inline def setProfileURL(value: String): Self = StObject.set(x, "profileURL", value.asInstanceOf[js.Any])
      
      inline def setProfileURLUndefined: Self = StObject.set(x, "profileURL", js.undefined)
      
      inline def setSvcType(value: Double): Self = StObject.set(x, "svcType", value.asInstanceOf[js.Any])
      
      inline def setSvcTypeUndefined: Self = StObject.set(x, "svcType", js.undefined)
      
      inline def setTokenURL(value: String): Self = StObject.set(x, "tokenURL", value.asInstanceOf[js.Any])
      
      inline def setTokenURLUndefined: Self = StObject.set(x, "tokenURL", js.undefined)
    }
  }
  
  trait StrategyOptionWithRequest
    extends StObject
       with StrategyOption {
    
    var passReqToCallback: Boolean
  }
  object StrategyOptionWithRequest {
    
    inline def apply(callbackURL: String, clientID: String, clientSecret: String, passReqToCallback: Boolean): StrategyOptionWithRequest = {
      val __obj = js.Dynamic.literal(callbackURL = callbackURL.asInstanceOf[js.Any], clientID = clientID.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], passReqToCallback = passReqToCallback.asInstanceOf[js.Any])
      __obj.asInstanceOf[StrategyOptionWithRequest]
    }
    
    extension [Self <: StrategyOptionWithRequest](x: Self) {
      
      inline def setPassReqToCallback(value: Boolean): Self = StObject.set(x, "passReqToCallback", value.asInstanceOf[js.Any])
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
