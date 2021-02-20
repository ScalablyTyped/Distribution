package typings.passportBeam

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.passportBeam.mod.Strategy.IStrategyOption
import typings.passportBeam.mod.Strategy.Profile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("passport-beam", "Strategy")
  @js.native
  class Strategy protected ()
    extends typings.passport.mod.Strategy {
    def this(
      options: IStrategyOption,
      verify: js.Function4[
            /* accessToken */ String, 
            /* refreshToken */ String, 
            /* profile */ Profile, 
            /* done */ js.Function2[/* error */ js.Any, /* user */ js.UndefOr[js.Any], Unit], 
            Unit
          ]
    ) = this()
    
    def authenticate(req: Request_[ParamsDictionary, _, _, Query], options: js.Object): Unit = js.native
  }
  object Strategy {
    
    @js.native
    trait IStrategyOption extends StObject {
      
      var callbackURL: String = js.native
      
      var clientID: String = js.native
      
      var clientSecret: String = js.native
    }
    object IStrategyOption {
      
      @scala.inline
      def apply(callbackURL: String, clientID: String, clientSecret: String): IStrategyOption = {
        val __obj = js.Dynamic.literal(callbackURL = callbackURL.asInstanceOf[js.Any], clientID = clientID.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any])
        __obj.asInstanceOf[IStrategyOption]
      }
      
      @scala.inline
      implicit class IStrategyOptionMutableBuilder[Self <: IStrategyOption] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCallbackURL(value: String): Self = StObject.set(x, "callbackURL", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClientID(value: String): Self = StObject.set(x, "clientID", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait Profile
      extends typings.passport.mod.Profile {
      
      var _json: js.Any = js.native
      
      var _raw: js.Any = js.native
      
      var email: String = js.native
      
      var profileUrl: String = js.native
    }
    object Profile {
      
      @scala.inline
      def apply(
        _json: js.Any,
        _raw: js.Any,
        displayName: String,
        email: String,
        id: String,
        profileUrl: String,
        provider: String
      ): Profile = {
        val __obj = js.Dynamic.literal(_json = _json.asInstanceOf[js.Any], _raw = _raw.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], profileUrl = profileUrl.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
        __obj.asInstanceOf[Profile]
      }
      
      @scala.inline
      implicit class ProfileMutableBuilder[Self <: Profile] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setProfileUrl(value: String): Self = StObject.set(x, "profileUrl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def set_json(value: js.Any): Self = StObject.set(x, "_json", value.asInstanceOf[js.Any])
        
        @scala.inline
        def set_raw(value: js.Any): Self = StObject.set(x, "_raw", value.asInstanceOf[js.Any])
      }
    }
  }
}
