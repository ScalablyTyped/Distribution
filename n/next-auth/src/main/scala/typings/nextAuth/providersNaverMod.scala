package typings.nextAuth

import typings.nextAuth.anon.Age
import typings.nextAuth.providersOauthMod.OAuthConfig
import typings.nextAuth.providersOauthMod.OAuthUserConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object providersNaverMod {
  
  @JSImport("next-auth/providers/naver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[P /* <: NaverProfile */](options: OAuthUserConfig[P]): OAuthConfig[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[OAuthConfig[P]]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: any} */ trait NaverProfile extends StObject {
    
    var message: String
    
    var response: Age
    
    var resultcode: String
  }
  object NaverProfile {
    
    inline def apply(message: String, response: Age, resultcode: String): NaverProfile = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], resultcode = resultcode.asInstanceOf[js.Any])
      __obj.asInstanceOf[NaverProfile]
    }
    
    extension [Self <: NaverProfile](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setResponse(value: Age): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      inline def setResultcode(value: String): Self = StObject.set(x, "resultcode", value.asInstanceOf[js.Any])
    }
  }
}
