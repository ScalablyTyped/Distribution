package typings.openidClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Address[ExtendedAddress /* <: js.Object */] extends StObject {
  
  var address: js.UndefOr[typings.openidClient.mod.Address[ExtendedAddress]] = js.undefined
  
  var birthdate: js.UndefOr[String] = js.undefined
  
  var email: js.UndefOr[String] = js.undefined
  
  var email_verified: js.UndefOr[Boolean] = js.undefined
  
  var family_name: js.UndefOr[String] = js.undefined
  
  var gender: js.UndefOr[String] = js.undefined
  
  var given_name: js.UndefOr[String] = js.undefined
  
  var locale: js.UndefOr[String] = js.undefined
  
  var middle_name: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var nickname: js.UndefOr[String] = js.undefined
  
  var phone_number: js.UndefOr[String] = js.undefined
  
  var picture: js.UndefOr[String] = js.undefined
  
  var preferred_username: js.UndefOr[String] = js.undefined
  
  var profile: js.UndefOr[String] = js.undefined
  
  var sub: String
  
  var updated_at: js.UndefOr[Double] = js.undefined
  
  var website: js.UndefOr[String] = js.undefined
  
  var zoneinfo: js.UndefOr[String] = js.undefined
}
object Address {
  
  inline def apply[ExtendedAddress /* <: js.Object */](sub: String): Address[ExtendedAddress] = {
    val __obj = js.Dynamic.literal(sub = sub.asInstanceOf[js.Any])
    __obj.asInstanceOf[Address[ExtendedAddress]]
  }
  
  extension [Self <: Address[?], ExtendedAddress /* <: js.Object */](x: Self & Address[ExtendedAddress]) {
    
    inline def setAddress(value: typings.openidClient.mod.Address[ExtendedAddress]): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setBirthdate(value: String): Self = StObject.set(x, "birthdate", value.asInstanceOf[js.Any])
    
    inline def setBirthdateUndefined: Self = StObject.set(x, "birthdate", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setEmail_verified(value: Boolean): Self = StObject.set(x, "email_verified", value.asInstanceOf[js.Any])
    
    inline def setEmail_verifiedUndefined: Self = StObject.set(x, "email_verified", js.undefined)
    
    inline def setFamily_name(value: String): Self = StObject.set(x, "family_name", value.asInstanceOf[js.Any])
    
    inline def setFamily_nameUndefined: Self = StObject.set(x, "family_name", js.undefined)
    
    inline def setGender(value: String): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
    
    inline def setGenderUndefined: Self = StObject.set(x, "gender", js.undefined)
    
    inline def setGiven_name(value: String): Self = StObject.set(x, "given_name", value.asInstanceOf[js.Any])
    
    inline def setGiven_nameUndefined: Self = StObject.set(x, "given_name", js.undefined)
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setMiddle_name(value: String): Self = StObject.set(x, "middle_name", value.asInstanceOf[js.Any])
    
    inline def setMiddle_nameUndefined: Self = StObject.set(x, "middle_name", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNickname(value: String): Self = StObject.set(x, "nickname", value.asInstanceOf[js.Any])
    
    inline def setNicknameUndefined: Self = StObject.set(x, "nickname", js.undefined)
    
    inline def setPhone_number(value: String): Self = StObject.set(x, "phone_number", value.asInstanceOf[js.Any])
    
    inline def setPhone_numberUndefined: Self = StObject.set(x, "phone_number", js.undefined)
    
    inline def setPicture(value: String): Self = StObject.set(x, "picture", value.asInstanceOf[js.Any])
    
    inline def setPictureUndefined: Self = StObject.set(x, "picture", js.undefined)
    
    inline def setPreferred_username(value: String): Self = StObject.set(x, "preferred_username", value.asInstanceOf[js.Any])
    
    inline def setPreferred_usernameUndefined: Self = StObject.set(x, "preferred_username", js.undefined)
    
    inline def setProfile(value: String): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
    
    inline def setSub(value: String): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
    
    inline def setUpdated_at(value: Double): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUpdated_atUndefined: Self = StObject.set(x, "updated_at", js.undefined)
    
    inline def setWebsite(value: String): Self = StObject.set(x, "website", value.asInstanceOf[js.Any])
    
    inline def setWebsiteUndefined: Self = StObject.set(x, "website", js.undefined)
    
    inline def setZoneinfo(value: String): Self = StObject.set(x, "zoneinfo", value.asInstanceOf[js.Any])
    
    inline def setZoneinfoUndefined: Self = StObject.set(x, "zoneinfo", js.undefined)
  }
}
