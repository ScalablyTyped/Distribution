package typings.nextAuth

import typings.nextAuth.anon.ProfilePhotoSize
import typings.nextAuth.providersOauthMod.OAuthConfig
import typings.nextAuth.providersOauthMod.OAuthUserConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object providersAzureAdMod {
  
  @JSImport("next-auth/providers/azure-ad", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[P /* <: AzureADProfile */](options: OAuthUserConfig[P] & ProfilePhotoSize): OAuthConfig[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[OAuthConfig[P]]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: any} */ trait AzureADProfile extends StObject {
    
    var email: String
    
    var nickname: String
    
    var picture: String
    
    var sub: String
  }
  object AzureADProfile {
    
    inline def apply(email: String, nickname: String, picture: String, sub: String): AzureADProfile = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], nickname = nickname.asInstanceOf[js.Any], picture = picture.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any])
      __obj.asInstanceOf[AzureADProfile]
    }
    
    extension [Self <: AzureADProfile](x: Self) {
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setNickname(value: String): Self = StObject.set(x, "nickname", value.asInstanceOf[js.Any])
      
      inline def setPicture(value: String): Self = StObject.set(x, "picture", value.asInstanceOf[js.Any])
      
      inline def setSub(value: String): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
    }
  }
}
