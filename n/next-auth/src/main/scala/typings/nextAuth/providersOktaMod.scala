package typings.nextAuth

import typings.nextAuth.providersOauthMod.OAuthConfig
import typings.nextAuth.providersOauthMod.OAuthUserConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object providersOktaMod {
  
  @JSImport("next-auth/providers/okta", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[P /* <: OktaProfile */](options: OAuthUserConfig[P]): OAuthConfig[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[OAuthConfig[P]]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: any} */ trait OktaProfile extends StObject {
    
    var address: String
    
    var amr: String
    
    var at_hash: String
    
    var aud: String
    
    var auth_time: String
    
    var birthdate: String
    
    var c_hash: String
    
    var email: String
    
    var email_verified: String
    
    var exp: String
    
    var family_name: String
    
    var gender: String
    
    var given_name: String
    
    var iat: String
    
    var idp: String
    
    var iss: String
    
    var jti: String
    
    var locale: String
    
    var middle_name: String
    
    var name: String
    
    var nickname: String
    
    var nonce: String
    
    var phone_number: String
    
    var picture: String
    
    var preferred_username: String
    
    var profile: String
    
    var sub: String
    
    var updated_at: String
    
    var ver: String
    
    var website: String
    
    var zoneinfo: String
  }
  object OktaProfile {
    
    inline def apply(
      address: String,
      amr: String,
      at_hash: String,
      aud: String,
      auth_time: String,
      birthdate: String,
      c_hash: String,
      email: String,
      email_verified: String,
      exp: String,
      family_name: String,
      gender: String,
      given_name: String,
      iat: String,
      idp: String,
      iss: String,
      jti: String,
      locale: String,
      middle_name: String,
      name: String,
      nickname: String,
      nonce: String,
      phone_number: String,
      picture: String,
      preferred_username: String,
      profile: String,
      sub: String,
      updated_at: String,
      ver: String,
      website: String,
      zoneinfo: String
    ): OktaProfile = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], amr = amr.asInstanceOf[js.Any], at_hash = at_hash.asInstanceOf[js.Any], aud = aud.asInstanceOf[js.Any], auth_time = auth_time.asInstanceOf[js.Any], birthdate = birthdate.asInstanceOf[js.Any], c_hash = c_hash.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], email_verified = email_verified.asInstanceOf[js.Any], exp = exp.asInstanceOf[js.Any], family_name = family_name.asInstanceOf[js.Any], gender = gender.asInstanceOf[js.Any], given_name = given_name.asInstanceOf[js.Any], iat = iat.asInstanceOf[js.Any], idp = idp.asInstanceOf[js.Any], iss = iss.asInstanceOf[js.Any], jti = jti.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], middle_name = middle_name.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nickname = nickname.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], phone_number = phone_number.asInstanceOf[js.Any], picture = picture.asInstanceOf[js.Any], preferred_username = preferred_username.asInstanceOf[js.Any], profile = profile.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], ver = ver.asInstanceOf[js.Any], website = website.asInstanceOf[js.Any], zoneinfo = zoneinfo.asInstanceOf[js.Any])
      __obj.asInstanceOf[OktaProfile]
    }
    
    extension [Self <: OktaProfile](x: Self) {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setAmr(value: String): Self = StObject.set(x, "amr", value.asInstanceOf[js.Any])
      
      inline def setAt_hash(value: String): Self = StObject.set(x, "at_hash", value.asInstanceOf[js.Any])
      
      inline def setAud(value: String): Self = StObject.set(x, "aud", value.asInstanceOf[js.Any])
      
      inline def setAuth_time(value: String): Self = StObject.set(x, "auth_time", value.asInstanceOf[js.Any])
      
      inline def setBirthdate(value: String): Self = StObject.set(x, "birthdate", value.asInstanceOf[js.Any])
      
      inline def setC_hash(value: String): Self = StObject.set(x, "c_hash", value.asInstanceOf[js.Any])
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmail_verified(value: String): Self = StObject.set(x, "email_verified", value.asInstanceOf[js.Any])
      
      inline def setExp(value: String): Self = StObject.set(x, "exp", value.asInstanceOf[js.Any])
      
      inline def setFamily_name(value: String): Self = StObject.set(x, "family_name", value.asInstanceOf[js.Any])
      
      inline def setGender(value: String): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
      
      inline def setGiven_name(value: String): Self = StObject.set(x, "given_name", value.asInstanceOf[js.Any])
      
      inline def setIat(value: String): Self = StObject.set(x, "iat", value.asInstanceOf[js.Any])
      
      inline def setIdp(value: String): Self = StObject.set(x, "idp", value.asInstanceOf[js.Any])
      
      inline def setIss(value: String): Self = StObject.set(x, "iss", value.asInstanceOf[js.Any])
      
      inline def setJti(value: String): Self = StObject.set(x, "jti", value.asInstanceOf[js.Any])
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setMiddle_name(value: String): Self = StObject.set(x, "middle_name", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNickname(value: String): Self = StObject.set(x, "nickname", value.asInstanceOf[js.Any])
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setPhone_number(value: String): Self = StObject.set(x, "phone_number", value.asInstanceOf[js.Any])
      
      inline def setPicture(value: String): Self = StObject.set(x, "picture", value.asInstanceOf[js.Any])
      
      inline def setPreferred_username(value: String): Self = StObject.set(x, "preferred_username", value.asInstanceOf[js.Any])
      
      inline def setProfile(value: String): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
      
      inline def setSub(value: String): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
      
      inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
      
      inline def setVer(value: String): Self = StObject.set(x, "ver", value.asInstanceOf[js.Any])
      
      inline def setWebsite(value: String): Self = StObject.set(x, "website", value.asInstanceOf[js.Any])
      
      inline def setZoneinfo(value: String): Self = StObject.set(x, "zoneinfo", value.asInstanceOf[js.Any])
    }
  }
}
