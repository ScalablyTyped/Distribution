package typings.nextAuth

import typings.nextAuth.providersOauthMod.OAuthConfig
import typings.nextAuth.providersOauthMod.OAuthUserConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object providersAuthentikMod {
  
  @JSImport("next-auth/providers/authentik", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[P /* <: AuthentikProfile */](options: OAuthUserConfig[P]): OAuthConfig[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[OAuthConfig[P]]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: any} */ trait AuthentikProfile extends StObject {
    
    var acr: String
    
    var at_hash: String
    
    var aud: String
    
    var auth_time: Double
    
    var c_hash: String
    
    var email: String
    
    var email_verified: Boolean
    
    var exp: Double
    
    var family_name: String
    
    var given_name: String
    
    var groups: js.Array[String]
    
    var iat: Double
    
    var iss: String
    
    var name: String
    
    var nickname: String
    
    var nonce: String
    
    var preferred_username: String
    
    var sub: String
  }
  object AuthentikProfile {
    
    inline def apply(
      acr: String,
      at_hash: String,
      aud: String,
      auth_time: Double,
      c_hash: String,
      email: String,
      email_verified: Boolean,
      exp: Double,
      family_name: String,
      given_name: String,
      groups: js.Array[String],
      iat: Double,
      iss: String,
      name: String,
      nickname: String,
      nonce: String,
      preferred_username: String,
      sub: String
    ): AuthentikProfile = {
      val __obj = js.Dynamic.literal(acr = acr.asInstanceOf[js.Any], at_hash = at_hash.asInstanceOf[js.Any], aud = aud.asInstanceOf[js.Any], auth_time = auth_time.asInstanceOf[js.Any], c_hash = c_hash.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], email_verified = email_verified.asInstanceOf[js.Any], exp = exp.asInstanceOf[js.Any], family_name = family_name.asInstanceOf[js.Any], given_name = given_name.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], iat = iat.asInstanceOf[js.Any], iss = iss.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nickname = nickname.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], preferred_username = preferred_username.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthentikProfile]
    }
    
    extension [Self <: AuthentikProfile](x: Self) {
      
      inline def setAcr(value: String): Self = StObject.set(x, "acr", value.asInstanceOf[js.Any])
      
      inline def setAt_hash(value: String): Self = StObject.set(x, "at_hash", value.asInstanceOf[js.Any])
      
      inline def setAud(value: String): Self = StObject.set(x, "aud", value.asInstanceOf[js.Any])
      
      inline def setAuth_time(value: Double): Self = StObject.set(x, "auth_time", value.asInstanceOf[js.Any])
      
      inline def setC_hash(value: String): Self = StObject.set(x, "c_hash", value.asInstanceOf[js.Any])
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmail_verified(value: Boolean): Self = StObject.set(x, "email_verified", value.asInstanceOf[js.Any])
      
      inline def setExp(value: Double): Self = StObject.set(x, "exp", value.asInstanceOf[js.Any])
      
      inline def setFamily_name(value: String): Self = StObject.set(x, "family_name", value.asInstanceOf[js.Any])
      
      inline def setGiven_name(value: String): Self = StObject.set(x, "given_name", value.asInstanceOf[js.Any])
      
      inline def setGroups(value: js.Array[String]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
      
      inline def setGroupsVarargs(value: String*): Self = StObject.set(x, "groups", js.Array(value*))
      
      inline def setIat(value: Double): Self = StObject.set(x, "iat", value.asInstanceOf[js.Any])
      
      inline def setIss(value: String): Self = StObject.set(x, "iss", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNickname(value: String): Self = StObject.set(x, "nickname", value.asInstanceOf[js.Any])
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setPreferred_username(value: String): Self = StObject.set(x, "preferred_username", value.asInstanceOf[js.Any])
      
      inline def setSub(value: String): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
    }
  }
}
