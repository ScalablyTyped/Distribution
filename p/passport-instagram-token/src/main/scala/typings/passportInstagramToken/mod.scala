package typings.passportInstagramToken

import typings.express.mod.Request_
import typings.passportInstagramToken.passportInstagramTokenBooleans.`false`
import typings.passportInstagramToken.passportInstagramTokenBooleans.`true`
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("passport-instagram-token", "Strategy")
  @js.native
  open class Strategy protected ()
    extends StObject
       with typings.passport.mod.Strategy {
    def this(
      options: StrategyOptionWithRequest,
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
      options: StrategyOption,
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
  
  trait Profile
    extends StObject
       with typings.passport.mod.Profile {
    
    var _json: Any
    
    var _raw: String
  }
  object Profile {
    
    inline def apply(_json: Any, _raw: String, displayName: String, id: String, provider: String): Profile = {
      val __obj = js.Dynamic.literal(_json = _json.asInstanceOf[js.Any], _raw = _raw.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
      __obj.asInstanceOf[Profile]
    }
    
    extension [Self <: Profile](x: Self) {
      
      inline def set_json(value: Any): Self = StObject.set(x, "_json", value.asInstanceOf[js.Any])
      
      inline def set_raw(value: String): Self = StObject.set(x, "_raw", value.asInstanceOf[js.Any])
    }
  }
  
  trait StrategyOption
    extends StObject
       with StrategyOptionBase {
    
    var passReqToCallback: js.UndefOr[`false`] = js.undefined
  }
  object StrategyOption {
    
    inline def apply(callbackURL: String, clientID: String, clientSecret: String): StrategyOption = {
      val __obj = js.Dynamic.literal(callbackURL = callbackURL.asInstanceOf[js.Any], clientID = clientID.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any])
      __obj.asInstanceOf[StrategyOption]
    }
    
    extension [Self <: StrategyOption](x: Self) {
      
      inline def setPassReqToCallback(value: `false`): Self = StObject.set(x, "passReqToCallback", value.asInstanceOf[js.Any])
      
      inline def setPassReqToCallbackUndefined: Self = StObject.set(x, "passReqToCallback", js.undefined)
    }
  }
  
  trait StrategyOptionBase extends StObject {
    
    var authorizationURL: js.UndefOr[String] = js.undefined
    
    var callbackURL: String
    
    var clientID: String
    
    var clientSecret: String
    
    var tokenURL: js.UndefOr[String] = js.undefined
  }
  object StrategyOptionBase {
    
    inline def apply(callbackURL: String, clientID: String, clientSecret: String): StrategyOptionBase = {
      val __obj = js.Dynamic.literal(callbackURL = callbackURL.asInstanceOf[js.Any], clientID = clientID.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any])
      __obj.asInstanceOf[StrategyOptionBase]
    }
    
    extension [Self <: StrategyOptionBase](x: Self) {
      
      inline def setAuthorizationURL(value: String): Self = StObject.set(x, "authorizationURL", value.asInstanceOf[js.Any])
      
      inline def setAuthorizationURLUndefined: Self = StObject.set(x, "authorizationURL", js.undefined)
      
      inline def setCallbackURL(value: String): Self = StObject.set(x, "callbackURL", value.asInstanceOf[js.Any])
      
      inline def setClientID(value: String): Self = StObject.set(x, "clientID", value.asInstanceOf[js.Any])
      
      inline def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
      
      inline def setTokenURL(value: String): Self = StObject.set(x, "tokenURL", value.asInstanceOf[js.Any])
      
      inline def setTokenURLUndefined: Self = StObject.set(x, "tokenURL", js.undefined)
    }
  }
  
  trait StrategyOptionWithRequest
    extends StObject
       with StrategyOptionBase {
    
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
}
