package typings.nextAuth

import typings.nextAuth.providersOauthMod.OAuthConfig
import typings.nextAuth.providersOauthMod.OAuthUserConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object providersGoogleMod {
  
  @JSImport("next-auth/providers/google", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[P /* <: GoogleProfile */](options: OAuthUserConfig[P]): OAuthConfig[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[OAuthConfig[P]]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: any} */ trait GoogleProfile extends StObject {
    
    var aud: String
    
    var azp: String
    
    var email: String
    
    var email_verified: Boolean
    
    var exp: Double
    
    var family_name: String
    
    var given_name: String
    
    var hd: String
    
    var iat: Double
    
    var iss: String
    
    var jti: String
    
    var name: String
    
    var nbf: Double
    
    var picture: String
    
    var sub: String
  }
  object GoogleProfile {
    
    inline def apply(
      aud: String,
      azp: String,
      email: String,
      email_verified: Boolean,
      exp: Double,
      family_name: String,
      given_name: String,
      hd: String,
      iat: Double,
      iss: String,
      jti: String,
      name: String,
      nbf: Double,
      picture: String,
      sub: String
    ): GoogleProfile = {
      val __obj = js.Dynamic.literal(aud = aud.asInstanceOf[js.Any], azp = azp.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], email_verified = email_verified.asInstanceOf[js.Any], exp = exp.asInstanceOf[js.Any], family_name = family_name.asInstanceOf[js.Any], given_name = given_name.asInstanceOf[js.Any], hd = hd.asInstanceOf[js.Any], iat = iat.asInstanceOf[js.Any], iss = iss.asInstanceOf[js.Any], jti = jti.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nbf = nbf.asInstanceOf[js.Any], picture = picture.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any])
      __obj.asInstanceOf[GoogleProfile]
    }
    
    extension [Self <: GoogleProfile](x: Self) {
      
      inline def setAud(value: String): Self = StObject.set(x, "aud", value.asInstanceOf[js.Any])
      
      inline def setAzp(value: String): Self = StObject.set(x, "azp", value.asInstanceOf[js.Any])
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmail_verified(value: Boolean): Self = StObject.set(x, "email_verified", value.asInstanceOf[js.Any])
      
      inline def setExp(value: Double): Self = StObject.set(x, "exp", value.asInstanceOf[js.Any])
      
      inline def setFamily_name(value: String): Self = StObject.set(x, "family_name", value.asInstanceOf[js.Any])
      
      inline def setGiven_name(value: String): Self = StObject.set(x, "given_name", value.asInstanceOf[js.Any])
      
      inline def setHd(value: String): Self = StObject.set(x, "hd", value.asInstanceOf[js.Any])
      
      inline def setIat(value: Double): Self = StObject.set(x, "iat", value.asInstanceOf[js.Any])
      
      inline def setIss(value: String): Self = StObject.set(x, "iss", value.asInstanceOf[js.Any])
      
      inline def setJti(value: String): Self = StObject.set(x, "jti", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNbf(value: Double): Self = StObject.set(x, "nbf", value.asInstanceOf[js.Any])
      
      inline def setPicture(value: String): Self = StObject.set(x, "picture", value.asInstanceOf[js.Any])
      
      inline def setSub(value: String): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
    }
  }
}
