package typings.nextAuth

import typings.nextAuth.providersOauthMod.OAuthConfig
import typings.nextAuth.providersOauthMod.OAuthUserConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object providersHubspotMod {
  
  @JSImport("next-auth/providers/hubspot", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[P /* <: HubSpotProfile */](options: OAuthUserConfig[P]): OAuthConfig[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[OAuthConfig[P]]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: any} */ trait HubSpotProfile extends StObject {
    
    var hub_domain: String
    
    var hub_id: String
    
    var user: String
    
    var user_id: String
  }
  object HubSpotProfile {
    
    inline def apply(hub_domain: String, hub_id: String, user: String, user_id: String): HubSpotProfile = {
      val __obj = js.Dynamic.literal(hub_domain = hub_domain.asInstanceOf[js.Any], hub_id = hub_id.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[HubSpotProfile]
    }
    
    extension [Self <: HubSpotProfile](x: Self) {
      
      inline def setHub_domain(value: String): Self = StObject.set(x, "hub_domain", value.asInstanceOf[js.Any])
      
      inline def setHub_id(value: String): Self = StObject.set(x, "hub_id", value.asInstanceOf[js.Any])
      
      inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def setUser_id(value: String): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
    }
  }
}
