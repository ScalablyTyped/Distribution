package typings.nextAuth.anon

import typings.nextAuth.providersKakaoMod.AgeRange
import typings.nextAuth.providersKakaoMod.DateTime
import typings.nextAuth.providersKakaoMod.Gender
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Agerange extends StObject {
  
  var age_range: js.UndefOr[AgeRange] = js.undefined
  
  var age_range_needs_agreement: js.UndefOr[Boolean] = js.undefined
  
  var birthday: js.UndefOr[String] = js.undefined
  
  var birthday_needs_agreement: js.UndefOr[Boolean] = js.undefined
  
  var birthday_type: js.UndefOr[String] = js.undefined
  
  var birthyear: js.UndefOr[String] = js.undefined
  
  var birthyear_needs_agreement: js.UndefOr[Boolean] = js.undefined
  
  var ci: js.UndefOr[String] = js.undefined
  
  var ci_authenticated_at: js.UndefOr[DateTime] = js.undefined
  
  var ci_needs_agreement: js.UndefOr[Boolean] = js.undefined
  
  var email: js.UndefOr[String] = js.undefined
  
  var email_needs_agreement: js.UndefOr[Boolean] = js.undefined
  
  var gender: js.UndefOr[Gender] = js.undefined
  
  var gender_needs_agreement: js.UndefOr[Boolean] = js.undefined
  
  var is_email_valid: js.UndefOr[Boolean] = js.undefined
  
  var is_email_verified: js.UndefOr[Boolean] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var name_needs_agreement: js.UndefOr[Boolean] = js.undefined
  
  var phone_number: js.UndefOr[String] = js.undefined
  
  var phone_number_needs_agreement: js.UndefOr[Boolean] = js.undefined
  
  var profile: js.UndefOr[Isdefaultimage] = js.undefined
  
  var profile_image_needs_agreement: js.UndefOr[Boolean] = js.undefined
  
  var profile_needs_agreement: js.UndefOr[Boolean] = js.undefined
  
  var profile_nickname_needs_agreement: js.UndefOr[Boolean] = js.undefined
}
object Agerange {
  
  inline def apply(): Agerange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Agerange]
  }
  
  extension [Self <: Agerange](x: Self) {
    
    inline def setAge_range(value: AgeRange): Self = StObject.set(x, "age_range", value.asInstanceOf[js.Any])
    
    inline def setAge_rangeUndefined: Self = StObject.set(x, "age_range", js.undefined)
    
    inline def setAge_range_needs_agreement(value: Boolean): Self = StObject.set(x, "age_range_needs_agreement", value.asInstanceOf[js.Any])
    
    inline def setAge_range_needs_agreementUndefined: Self = StObject.set(x, "age_range_needs_agreement", js.undefined)
    
    inline def setBirthday(value: String): Self = StObject.set(x, "birthday", value.asInstanceOf[js.Any])
    
    inline def setBirthdayUndefined: Self = StObject.set(x, "birthday", js.undefined)
    
    inline def setBirthday_needs_agreement(value: Boolean): Self = StObject.set(x, "birthday_needs_agreement", value.asInstanceOf[js.Any])
    
    inline def setBirthday_needs_agreementUndefined: Self = StObject.set(x, "birthday_needs_agreement", js.undefined)
    
    inline def setBirthday_type(value: String): Self = StObject.set(x, "birthday_type", value.asInstanceOf[js.Any])
    
    inline def setBirthday_typeUndefined: Self = StObject.set(x, "birthday_type", js.undefined)
    
    inline def setBirthyear(value: String): Self = StObject.set(x, "birthyear", value.asInstanceOf[js.Any])
    
    inline def setBirthyearUndefined: Self = StObject.set(x, "birthyear", js.undefined)
    
    inline def setBirthyear_needs_agreement(value: Boolean): Self = StObject.set(x, "birthyear_needs_agreement", value.asInstanceOf[js.Any])
    
    inline def setBirthyear_needs_agreementUndefined: Self = StObject.set(x, "birthyear_needs_agreement", js.undefined)
    
    inline def setCi(value: String): Self = StObject.set(x, "ci", value.asInstanceOf[js.Any])
    
    inline def setCiUndefined: Self = StObject.set(x, "ci", js.undefined)
    
    inline def setCi_authenticated_at(value: DateTime): Self = StObject.set(x, "ci_authenticated_at", value.asInstanceOf[js.Any])
    
    inline def setCi_authenticated_atUndefined: Self = StObject.set(x, "ci_authenticated_at", js.undefined)
    
    inline def setCi_needs_agreement(value: Boolean): Self = StObject.set(x, "ci_needs_agreement", value.asInstanceOf[js.Any])
    
    inline def setCi_needs_agreementUndefined: Self = StObject.set(x, "ci_needs_agreement", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setEmail_needs_agreement(value: Boolean): Self = StObject.set(x, "email_needs_agreement", value.asInstanceOf[js.Any])
    
    inline def setEmail_needs_agreementUndefined: Self = StObject.set(x, "email_needs_agreement", js.undefined)
    
    inline def setGender(value: Gender): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
    
    inline def setGenderUndefined: Self = StObject.set(x, "gender", js.undefined)
    
    inline def setGender_needs_agreement(value: Boolean): Self = StObject.set(x, "gender_needs_agreement", value.asInstanceOf[js.Any])
    
    inline def setGender_needs_agreementUndefined: Self = StObject.set(x, "gender_needs_agreement", js.undefined)
    
    inline def setIs_email_valid(value: Boolean): Self = StObject.set(x, "is_email_valid", value.asInstanceOf[js.Any])
    
    inline def setIs_email_validUndefined: Self = StObject.set(x, "is_email_valid", js.undefined)
    
    inline def setIs_email_verified(value: Boolean): Self = StObject.set(x, "is_email_verified", value.asInstanceOf[js.Any])
    
    inline def setIs_email_verifiedUndefined: Self = StObject.set(x, "is_email_verified", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setName_needs_agreement(value: Boolean): Self = StObject.set(x, "name_needs_agreement", value.asInstanceOf[js.Any])
    
    inline def setName_needs_agreementUndefined: Self = StObject.set(x, "name_needs_agreement", js.undefined)
    
    inline def setPhone_number(value: String): Self = StObject.set(x, "phone_number", value.asInstanceOf[js.Any])
    
    inline def setPhone_numberUndefined: Self = StObject.set(x, "phone_number", js.undefined)
    
    inline def setPhone_number_needs_agreement(value: Boolean): Self = StObject.set(x, "phone_number_needs_agreement", value.asInstanceOf[js.Any])
    
    inline def setPhone_number_needs_agreementUndefined: Self = StObject.set(x, "phone_number_needs_agreement", js.undefined)
    
    inline def setProfile(value: Isdefaultimage): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
    
    inline def setProfile_image_needs_agreement(value: Boolean): Self = StObject.set(x, "profile_image_needs_agreement", value.asInstanceOf[js.Any])
    
    inline def setProfile_image_needs_agreementUndefined: Self = StObject.set(x, "profile_image_needs_agreement", js.undefined)
    
    inline def setProfile_needs_agreement(value: Boolean): Self = StObject.set(x, "profile_needs_agreement", value.asInstanceOf[js.Any])
    
    inline def setProfile_needs_agreementUndefined: Self = StObject.set(x, "profile_needs_agreement", js.undefined)
    
    inline def setProfile_nickname_needs_agreement(value: Boolean): Self = StObject.set(x, "profile_nickname_needs_agreement", value.asInstanceOf[js.Any])
    
    inline def setProfile_nickname_needs_agreementUndefined: Self = StObject.set(x, "profile_nickname_needs_agreement", js.undefined)
  }
}
