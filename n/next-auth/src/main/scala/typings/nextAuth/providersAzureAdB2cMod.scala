package typings.nextAuth

import typings.nextAuth.anon.PrimaryUserFlow
import typings.nextAuth.providersOauthMod.OAuthConfig
import typings.nextAuth.providersOauthMod.OAuthUserConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object providersAzureAdB2cMod {
  
  @JSImport("next-auth/providers/azure-ad-b2c", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[P /* <: AzureB2CProfile */](options: OAuthUserConfig[P] & PrimaryUserFlow): OAuthConfig[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[OAuthConfig[P]]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: any} */ trait AzureB2CProfile extends StObject {
    
    var aud: String
    
    var auth_time: Double
    
    var country: String
    
    var emails: js.Array[String]
    
    var exp: Double
    
    var iat: Double
    
    var iss: String
    
    var name: String
    
    var nbf: Double
    
    var oid: String
    
    var postalCode: String
    
    var sub: String
    
    var tfp: String
    
    var ver: String
  }
  object AzureB2CProfile {
    
    inline def apply(
      aud: String,
      auth_time: Double,
      country: String,
      emails: js.Array[String],
      exp: Double,
      iat: Double,
      iss: String,
      name: String,
      nbf: Double,
      oid: String,
      postalCode: String,
      sub: String,
      tfp: String,
      ver: String
    ): AzureB2CProfile = {
      val __obj = js.Dynamic.literal(aud = aud.asInstanceOf[js.Any], auth_time = auth_time.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], emails = emails.asInstanceOf[js.Any], exp = exp.asInstanceOf[js.Any], iat = iat.asInstanceOf[js.Any], iss = iss.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nbf = nbf.asInstanceOf[js.Any], oid = oid.asInstanceOf[js.Any], postalCode = postalCode.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any], tfp = tfp.asInstanceOf[js.Any], ver = ver.asInstanceOf[js.Any])
      __obj.asInstanceOf[AzureB2CProfile]
    }
    
    extension [Self <: AzureB2CProfile](x: Self) {
      
      inline def setAud(value: String): Self = StObject.set(x, "aud", value.asInstanceOf[js.Any])
      
      inline def setAuth_time(value: Double): Self = StObject.set(x, "auth_time", value.asInstanceOf[js.Any])
      
      inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      inline def setEmails(value: js.Array[String]): Self = StObject.set(x, "emails", value.asInstanceOf[js.Any])
      
      inline def setEmailsVarargs(value: String*): Self = StObject.set(x, "emails", js.Array(value*))
      
      inline def setExp(value: Double): Self = StObject.set(x, "exp", value.asInstanceOf[js.Any])
      
      inline def setIat(value: Double): Self = StObject.set(x, "iat", value.asInstanceOf[js.Any])
      
      inline def setIss(value: String): Self = StObject.set(x, "iss", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNbf(value: Double): Self = StObject.set(x, "nbf", value.asInstanceOf[js.Any])
      
      inline def setOid(value: String): Self = StObject.set(x, "oid", value.asInstanceOf[js.Any])
      
      inline def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
      
      inline def setSub(value: String): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
      
      inline def setTfp(value: String): Self = StObject.set(x, "tfp", value.asInstanceOf[js.Any])
      
      inline def setVer(value: String): Self = StObject.set(x, "ver", value.asInstanceOf[js.Any])
    }
  }
}
