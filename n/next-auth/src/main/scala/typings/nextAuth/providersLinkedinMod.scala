package typings.nextAuth

import typings.nextAuth.anon.DisplayImage
import typings.nextAuth.providersOauthMod.OAuthConfig
import typings.nextAuth.providersOauthMod.OAuthUserConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object providersLinkedinMod {
  
  @JSImport("next-auth/providers/linkedin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[P /* <: LinkedInProfile */](options: OAuthUserConfig[P]): OAuthConfig[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[OAuthConfig[P]]
  
  trait Element extends StObject {
    
    var identifiers: js.UndefOr[js.Array[Identifier]] = js.undefined
  }
  object Element {
    
    inline def apply(): Element = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Element]
    }
    
    extension [Self <: Element](x: Self) {
      
      inline def setIdentifiers(value: js.Array[Identifier]): Self = StObject.set(x, "identifiers", value.asInstanceOf[js.Any])
      
      inline def setIdentifiersUndefined: Self = StObject.set(x, "identifiers", js.undefined)
      
      inline def setIdentifiersVarargs(value: Identifier*): Self = StObject.set(x, "identifiers", js.Array(value*))
    }
  }
  
  trait Identifier extends StObject {
    
    var identifier: String
  }
  object Identifier {
    
    inline def apply(identifier: String): Identifier = {
      val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
      __obj.asInstanceOf[Identifier]
    }
    
    extension [Self <: Identifier](x: Self) {
      
      inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: any} */ trait LinkedInProfile extends StObject {
    
    var id: String
    
    var localizedFirstName: String
    
    var localizedLastName: String
    
    var profilePicture: DisplayImage
  }
  object LinkedInProfile {
    
    inline def apply(id: String, localizedFirstName: String, localizedLastName: String, profilePicture: DisplayImage): LinkedInProfile = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], localizedFirstName = localizedFirstName.asInstanceOf[js.Any], localizedLastName = localizedLastName.asInstanceOf[js.Any], profilePicture = profilePicture.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinkedInProfile]
    }
    
    extension [Self <: LinkedInProfile](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLocalizedFirstName(value: String): Self = StObject.set(x, "localizedFirstName", value.asInstanceOf[js.Any])
      
      inline def setLocalizedLastName(value: String): Self = StObject.set(x, "localizedLastName", value.asInstanceOf[js.Any])
      
      inline def setProfilePicture(value: DisplayImage): Self = StObject.set(x, "profilePicture", value.asInstanceOf[js.Any])
    }
  }
}
