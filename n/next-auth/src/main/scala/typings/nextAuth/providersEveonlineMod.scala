package typings.nextAuth

import typings.nextAuth.providersOauthMod.OAuthConfig
import typings.nextAuth.providersOauthMod.OAuthUserConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object providersEveonlineMod {
  
  @JSImport("next-auth/providers/eveonline", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[P /* <: EVEOnlineProfile */](options: OAuthUserConfig[P]): OAuthConfig[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[OAuthConfig[P]]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: any} */ trait EVEOnlineProfile extends StObject {
    
    var CharacterID: Double
    
    var CharacterName: String
    
    var CharacterOwnerHash: String
    
    var ExpiresOn: String
    
    var IntellectualProperty: String
    
    var Scopes: String
    
    var TokenType: String
  }
  object EVEOnlineProfile {
    
    inline def apply(
      CharacterID: Double,
      CharacterName: String,
      CharacterOwnerHash: String,
      ExpiresOn: String,
      IntellectualProperty: String,
      Scopes: String,
      TokenType: String
    ): EVEOnlineProfile = {
      val __obj = js.Dynamic.literal(CharacterID = CharacterID.asInstanceOf[js.Any], CharacterName = CharacterName.asInstanceOf[js.Any], CharacterOwnerHash = CharacterOwnerHash.asInstanceOf[js.Any], ExpiresOn = ExpiresOn.asInstanceOf[js.Any], IntellectualProperty = IntellectualProperty.asInstanceOf[js.Any], Scopes = Scopes.asInstanceOf[js.Any], TokenType = TokenType.asInstanceOf[js.Any])
      __obj.asInstanceOf[EVEOnlineProfile]
    }
    
    extension [Self <: EVEOnlineProfile](x: Self) {
      
      inline def setCharacterID(value: Double): Self = StObject.set(x, "CharacterID", value.asInstanceOf[js.Any])
      
      inline def setCharacterName(value: String): Self = StObject.set(x, "CharacterName", value.asInstanceOf[js.Any])
      
      inline def setCharacterOwnerHash(value: String): Self = StObject.set(x, "CharacterOwnerHash", value.asInstanceOf[js.Any])
      
      inline def setExpiresOn(value: String): Self = StObject.set(x, "ExpiresOn", value.asInstanceOf[js.Any])
      
      inline def setIntellectualProperty(value: String): Self = StObject.set(x, "IntellectualProperty", value.asInstanceOf[js.Any])
      
      inline def setScopes(value: String): Self = StObject.set(x, "Scopes", value.asInstanceOf[js.Any])
      
      inline def setTokenType(value: String): Self = StObject.set(x, "TokenType", value.asInstanceOf[js.Any])
    }
  }
}
