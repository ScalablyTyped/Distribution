package typings.nextAuth

import typings.nextAuth.providersOauthMod.OAuthConfig
import typings.nextAuth.providersOauthMod.OAuthUserConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object providersAtlassianMod {
  
  @JSImport("next-auth/providers/atlassian", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[P /* <: AtlassianProfile */](options: OAuthUserConfig[P]): OAuthConfig[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[OAuthConfig[P]]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: any} */ trait AtlassianProfile extends StObject {
    
    var account_id: String
    
    var email: String
    
    var name: String
    
    var picture: String
  }
  object AtlassianProfile {
    
    inline def apply(account_id: String, email: String, name: String, picture: String): AtlassianProfile = {
      val __obj = js.Dynamic.literal(account_id = account_id.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], picture = picture.asInstanceOf[js.Any])
      __obj.asInstanceOf[AtlassianProfile]
    }
    
    extension [Self <: AtlassianProfile](x: Self) {
      
      inline def setAccount_id(value: String): Self = StObject.set(x, "account_id", value.asInstanceOf[js.Any])
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPicture(value: String): Self = StObject.set(x, "picture", value.asInstanceOf[js.Any])
    }
  }
}
