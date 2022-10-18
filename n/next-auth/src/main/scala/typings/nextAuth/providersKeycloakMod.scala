package typings.nextAuth

import typings.nextAuth.providersOauthMod.OAuthConfig
import typings.nextAuth.providersOauthMod.OAuthUserConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object providersKeycloakMod {
  
  @JSImport("next-auth/providers/keycloak", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[P /* <: KeycloakProfile */](options: OAuthUserConfig[P]): OAuthConfig[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[OAuthConfig[P]]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: any} */ trait KeycloakProfile extends StObject {
    
    var acr: String
    
    var at_hash: String
    
    var aud: String
    
    var auth_time: Double
    
    var azp: String
    
    var email: String
    
    var email_verified: Boolean
    
    var exp: Double
    
    var family_name: String
    
    var given_name: String
    
    var iat: Double
    
    var iss: String
    
    var jti: String
    
    var name: String
    
    var picture: String
    
    var preferred_username: String
    
    var session_state: String
    
    var sid: String
    
    var sub: String
    
    var typ: String
    
    var user: Any
  }
  object KeycloakProfile {
    
    inline def apply(
      acr: String,
      at_hash: String,
      aud: String,
      auth_time: Double,
      azp: String,
      email: String,
      email_verified: Boolean,
      exp: Double,
      family_name: String,
      given_name: String,
      iat: Double,
      iss: String,
      jti: String,
      name: String,
      picture: String,
      preferred_username: String,
      session_state: String,
      sid: String,
      sub: String,
      typ: String,
      user: Any
    ): KeycloakProfile = {
      val __obj = js.Dynamic.literal(acr = acr.asInstanceOf[js.Any], at_hash = at_hash.asInstanceOf[js.Any], aud = aud.asInstanceOf[js.Any], auth_time = auth_time.asInstanceOf[js.Any], azp = azp.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], email_verified = email_verified.asInstanceOf[js.Any], exp = exp.asInstanceOf[js.Any], family_name = family_name.asInstanceOf[js.Any], given_name = given_name.asInstanceOf[js.Any], iat = iat.asInstanceOf[js.Any], iss = iss.asInstanceOf[js.Any], jti = jti.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], picture = picture.asInstanceOf[js.Any], preferred_username = preferred_username.asInstanceOf[js.Any], session_state = session_state.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any], typ = typ.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeycloakProfile]
    }
    
    extension [Self <: KeycloakProfile](x: Self) {
      
      inline def setAcr(value: String): Self = StObject.set(x, "acr", value.asInstanceOf[js.Any])
      
      inline def setAt_hash(value: String): Self = StObject.set(x, "at_hash", value.asInstanceOf[js.Any])
      
      inline def setAud(value: String): Self = StObject.set(x, "aud", value.asInstanceOf[js.Any])
      
      inline def setAuth_time(value: Double): Self = StObject.set(x, "auth_time", value.asInstanceOf[js.Any])
      
      inline def setAzp(value: String): Self = StObject.set(x, "azp", value.asInstanceOf[js.Any])
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmail_verified(value: Boolean): Self = StObject.set(x, "email_verified", value.asInstanceOf[js.Any])
      
      inline def setExp(value: Double): Self = StObject.set(x, "exp", value.asInstanceOf[js.Any])
      
      inline def setFamily_name(value: String): Self = StObject.set(x, "family_name", value.asInstanceOf[js.Any])
      
      inline def setGiven_name(value: String): Self = StObject.set(x, "given_name", value.asInstanceOf[js.Any])
      
      inline def setIat(value: Double): Self = StObject.set(x, "iat", value.asInstanceOf[js.Any])
      
      inline def setIss(value: String): Self = StObject.set(x, "iss", value.asInstanceOf[js.Any])
      
      inline def setJti(value: String): Self = StObject.set(x, "jti", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPicture(value: String): Self = StObject.set(x, "picture", value.asInstanceOf[js.Any])
      
      inline def setPreferred_username(value: String): Self = StObject.set(x, "preferred_username", value.asInstanceOf[js.Any])
      
      inline def setSession_state(value: String): Self = StObject.set(x, "session_state", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setSub(value: String): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
      
      inline def setTyp(value: String): Self = StObject.set(x, "typ", value.asInstanceOf[js.Any])
      
      inline def setUser(value: Any): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
}
