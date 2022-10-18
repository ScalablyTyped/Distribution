package typings.nextAuth

import typings.nextAuth.providersOauthMod.OAuthConfig
import typings.nextAuth.providersOauthMod.OAuthUserConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object providersBoxyhqSamlMod {
  
  @JSImport("next-auth/providers/boxyhq-saml", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[P /* <: BoxyHQSAMLProfile */](options: OAuthUserConfig[P]): OAuthConfig[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[OAuthConfig[P]]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: any} */ trait BoxyHQSAMLProfile extends StObject {
    
    var email: String
    
    var firstName: js.UndefOr[String] = js.undefined
    
    var id: String
    
    var lastName: js.UndefOr[String] = js.undefined
  }
  object BoxyHQSAMLProfile {
    
    inline def apply(email: String, id: String): BoxyHQSAMLProfile = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[BoxyHQSAMLProfile]
    }
    
    extension [Self <: BoxyHQSAMLProfile](x: Self) {
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setFirstName(value: String): Self = StObject.set(x, "firstName", value.asInstanceOf[js.Any])
      
      inline def setFirstNameUndefined: Self = StObject.set(x, "firstName", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLastName(value: String): Self = StObject.set(x, "lastName", value.asInstanceOf[js.Any])
      
      inline def setLastNameUndefined: Self = StObject.set(x, "lastName", js.undefined)
    }
  }
}
