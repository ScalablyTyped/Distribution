package typings.nextAuth

import typings.nextAuth.providersOauthMod.OAuthConfig
import typings.nextAuth.providersOauthMod.OAuthUserConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object providersStravaMod {
  
  @JSImport("next-auth/providers/strava", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[P /* <: StravaProfile */](options: OAuthUserConfig[P]): OAuthConfig[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[OAuthConfig[P]]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: any} */ trait StravaProfile extends StObject {
    
    var firstname: String
    
    var id: String
    
    var lastname: String
    
    var profile: String
  }
  object StravaProfile {
    
    inline def apply(firstname: String, id: String, lastname: String, profile: String): StravaProfile = {
      val __obj = js.Dynamic.literal(firstname = firstname.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastname = lastname.asInstanceOf[js.Any], profile = profile.asInstanceOf[js.Any])
      __obj.asInstanceOf[StravaProfile]
    }
    
    extension [Self <: StravaProfile](x: Self) {
      
      inline def setFirstname(value: String): Self = StObject.set(x, "firstname", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLastname(value: String): Self = StObject.set(x, "lastname", value.asInstanceOf[js.Any])
      
      inline def setProfile(value: String): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    }
  }
}
