package typings.nextAuth

import typings.nextAuth.providersOauthMod.OAuthConfig
import typings.nextAuth.providersOauthMod.OAuthUserConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object providersZitadelMod {
  
  @JSImport("next-auth/providers/zitadel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[P /* <: ZitadelProfile */](options: OAuthUserConfig[P]): OAuthConfig[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[OAuthConfig[P]]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: any} */ trait ZitadelProfile extends StObject {
    
    var amr: String
    
    var aud: String
    
    var auth_time: Double
    
    var azp: String
    
    var email: String
    
    var email_verified: Boolean
    
    var exp: Double
    
    var family_name: String
    
    var gender: String
    
    var given_name: String
    
    var iat: Double
    
    var iss: String
    
    var jti: String
    
    var locale: String
    
    var name: String
    
    var nbf: Double
    
    var phone: String
    
    var phone_verified: Boolean
    
    var picture: String
    
    var preferred_username: String
    
    var sub: String
  }
  object ZitadelProfile {
    
    inline def apply(
      amr: String,
      aud: String,
      auth_time: Double,
      azp: String,
      email: String,
      email_verified: Boolean,
      exp: Double,
      family_name: String,
      gender: String,
      given_name: String,
      iat: Double,
      iss: String,
      jti: String,
      locale: String,
      name: String,
      nbf: Double,
      phone: String,
      phone_verified: Boolean,
      picture: String,
      preferred_username: String,
      sub: String
    ): ZitadelProfile = {
      val __obj = js.Dynamic.literal(amr = amr.asInstanceOf[js.Any], aud = aud.asInstanceOf[js.Any], auth_time = auth_time.asInstanceOf[js.Any], azp = azp.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], email_verified = email_verified.asInstanceOf[js.Any], exp = exp.asInstanceOf[js.Any], family_name = family_name.asInstanceOf[js.Any], gender = gender.asInstanceOf[js.Any], given_name = given_name.asInstanceOf[js.Any], iat = iat.asInstanceOf[js.Any], iss = iss.asInstanceOf[js.Any], jti = jti.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nbf = nbf.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], phone_verified = phone_verified.asInstanceOf[js.Any], picture = picture.asInstanceOf[js.Any], preferred_username = preferred_username.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any])
      __obj.asInstanceOf[ZitadelProfile]
    }
    
    extension [Self <: ZitadelProfile](x: Self) {
      
      inline def setAmr(value: String): Self = StObject.set(x, "amr", value.asInstanceOf[js.Any])
      
      inline def setAud(value: String): Self = StObject.set(x, "aud", value.asInstanceOf[js.Any])
      
      inline def setAuth_time(value: Double): Self = StObject.set(x, "auth_time", value.asInstanceOf[js.Any])
      
      inline def setAzp(value: String): Self = StObject.set(x, "azp", value.asInstanceOf[js.Any])
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmail_verified(value: Boolean): Self = StObject.set(x, "email_verified", value.asInstanceOf[js.Any])
      
      inline def setExp(value: Double): Self = StObject.set(x, "exp", value.asInstanceOf[js.Any])
      
      inline def setFamily_name(value: String): Self = StObject.set(x, "family_name", value.asInstanceOf[js.Any])
      
      inline def setGender(value: String): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
      
      inline def setGiven_name(value: String): Self = StObject.set(x, "given_name", value.asInstanceOf[js.Any])
      
      inline def setIat(value: Double): Self = StObject.set(x, "iat", value.asInstanceOf[js.Any])
      
      inline def setIss(value: String): Self = StObject.set(x, "iss", value.asInstanceOf[js.Any])
      
      inline def setJti(value: String): Self = StObject.set(x, "jti", value.asInstanceOf[js.Any])
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNbf(value: Double): Self = StObject.set(x, "nbf", value.asInstanceOf[js.Any])
      
      inline def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
      
      inline def setPhone_verified(value: Boolean): Self = StObject.set(x, "phone_verified", value.asInstanceOf[js.Any])
      
      inline def setPicture(value: String): Self = StObject.set(x, "picture", value.asInstanceOf[js.Any])
      
      inline def setPreferred_username(value: String): Self = StObject.set(x, "preferred_username", value.asInstanceOf[js.Any])
      
      inline def setSub(value: String): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
    }
  }
}
