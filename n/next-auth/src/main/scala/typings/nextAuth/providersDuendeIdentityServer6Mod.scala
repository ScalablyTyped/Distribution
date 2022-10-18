package typings.nextAuth

import typings.nextAuth.providersOauthMod.OAuthConfig
import typings.nextAuth.providersOauthMod.OAuthUserConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object providersDuendeIdentityServer6Mod {
  
  @JSImport("next-auth/providers/duende-identity-server6", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[P /* <: DuendeISUser */](options: OAuthUserConfig[P]): OAuthConfig[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[OAuthConfig[P]]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: any} */ trait DuendeISUser extends StObject {
    
    var email: String
    
    var id: String
    
    var name: String
    
    var verified: Boolean
  }
  object DuendeISUser {
    
    inline def apply(email: String, id: String, name: String, verified: Boolean): DuendeISUser = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], verified = verified.asInstanceOf[js.Any])
      __obj.asInstanceOf[DuendeISUser]
    }
    
    extension [Self <: DuendeISUser](x: Self) {
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setVerified(value: Boolean): Self = StObject.set(x, "verified", value.asInstanceOf[js.Any])
    }
  }
}
