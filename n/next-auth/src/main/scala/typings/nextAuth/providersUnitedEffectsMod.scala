package typings.nextAuth

import typings.nextAuth.anon.IssuerString
import typings.nextAuth.providersOauthMod.OAuthConfig
import typings.nextAuth.providersOauthMod.OAuthUserConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object providersUnitedEffectsMod {
  
  @JSImport("next-auth/providers/united-effects", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[P /* <: UnitedEffectsProfile */](options: OAuthUserConfig[P] & IssuerString): OAuthConfig[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[OAuthConfig[P]]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: any} */ trait UnitedEffectsProfile extends StObject {
    
    var email: String
    
    var sub: String
  }
  object UnitedEffectsProfile {
    
    inline def apply(email: String, sub: String): UnitedEffectsProfile = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnitedEffectsProfile]
    }
    
    extension [Self <: UnitedEffectsProfile](x: Self) {
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setSub(value: String): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
    }
  }
}
