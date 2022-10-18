package typings.nextAuth

import typings.nextAuth.anon.TenantId
import typings.nextAuth.providersOauthMod.OAuthConfig
import typings.nextAuth.providersOauthMod.OAuthUserConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object providersFusionauthMod {
  
  @JSImport("next-auth/providers/fusionauth", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[P /* <: FusionAuthProfile */](options: OAuthUserConfig[P] & TenantId): OAuthConfig[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[OAuthConfig[P]]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: any} */ trait FusionAuthProfile extends StObject {
    
    var at_hash: String
    
    var aud: String
    
    var authenticationType: String
    
    var c_hash: String
    
    var email: String
    
    var email_verified: Boolean
    
    var exp: Double
    
    var iat: Double
    
    var iss: String
    
    var jti: String
    
    var preferred_username: String
    
    var scope: String
    
    var sid: String
    
    var sub: String
  }
  object FusionAuthProfile {
    
    inline def apply(
      at_hash: String,
      aud: String,
      authenticationType: String,
      c_hash: String,
      email: String,
      email_verified: Boolean,
      exp: Double,
      iat: Double,
      iss: String,
      jti: String,
      preferred_username: String,
      scope: String,
      sid: String,
      sub: String
    ): FusionAuthProfile = {
      val __obj = js.Dynamic.literal(at_hash = at_hash.asInstanceOf[js.Any], aud = aud.asInstanceOf[js.Any], authenticationType = authenticationType.asInstanceOf[js.Any], c_hash = c_hash.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], email_verified = email_verified.asInstanceOf[js.Any], exp = exp.asInstanceOf[js.Any], iat = iat.asInstanceOf[js.Any], iss = iss.asInstanceOf[js.Any], jti = jti.asInstanceOf[js.Any], preferred_username = preferred_username.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any])
      __obj.asInstanceOf[FusionAuthProfile]
    }
    
    extension [Self <: FusionAuthProfile](x: Self) {
      
      inline def setAt_hash(value: String): Self = StObject.set(x, "at_hash", value.asInstanceOf[js.Any])
      
      inline def setAud(value: String): Self = StObject.set(x, "aud", value.asInstanceOf[js.Any])
      
      inline def setAuthenticationType(value: String): Self = StObject.set(x, "authenticationType", value.asInstanceOf[js.Any])
      
      inline def setC_hash(value: String): Self = StObject.set(x, "c_hash", value.asInstanceOf[js.Any])
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmail_verified(value: Boolean): Self = StObject.set(x, "email_verified", value.asInstanceOf[js.Any])
      
      inline def setExp(value: Double): Self = StObject.set(x, "exp", value.asInstanceOf[js.Any])
      
      inline def setIat(value: Double): Self = StObject.set(x, "iat", value.asInstanceOf[js.Any])
      
      inline def setIss(value: String): Self = StObject.set(x, "iss", value.asInstanceOf[js.Any])
      
      inline def setJti(value: String): Self = StObject.set(x, "jti", value.asInstanceOf[js.Any])
      
      inline def setPreferred_username(value: String): Self = StObject.set(x, "preferred_username", value.asInstanceOf[js.Any])
      
      inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setSub(value: String): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
    }
  }
}
