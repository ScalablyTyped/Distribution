package typings.nextAuth

import typings.nextAuth.nextAuthStrings.BUSINESS
import typings.nextAuth.nextAuthStrings.PINNER
import typings.nextAuth.providersOauthMod.OAuthConfig
import typings.nextAuth.providersOauthMod.OAuthUserConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object providersPinterestMod {
  
  @JSImport("next-auth/providers/pinterest", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[P /* <: PinterestProfile */](options: OAuthUserConfig[P]): OAuthConfig[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[OAuthConfig[P]]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: any} */ trait PinterestProfile extends StObject {
    
    var account_type: BUSINESS | PINNER
    
    var profile_image: String
    
    var username: String
    
    var website_url: String
  }
  object PinterestProfile {
    
    inline def apply(account_type: BUSINESS | PINNER, profile_image: String, username: String, website_url: String): PinterestProfile = {
      val __obj = js.Dynamic.literal(account_type = account_type.asInstanceOf[js.Any], profile_image = profile_image.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any], website_url = website_url.asInstanceOf[js.Any])
      __obj.asInstanceOf[PinterestProfile]
    }
    
    extension [Self <: PinterestProfile](x: Self) {
      
      inline def setAccount_type(value: BUSINESS | PINNER): Self = StObject.set(x, "account_type", value.asInstanceOf[js.Any])
      
      inline def setProfile_image(value: String): Self = StObject.set(x, "profile_image", value.asInstanceOf[js.Any])
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def setWebsite_url(value: String): Self = StObject.set(x, "website_url", value.asInstanceOf[js.Any])
    }
  }
}
