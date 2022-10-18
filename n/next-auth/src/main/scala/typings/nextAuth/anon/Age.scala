package typings.nextAuth.anon

import typings.nextAuth.nextAuthStrings.F
import typings.nextAuth.nextAuthStrings.M
import typings.nextAuth.nextAuthStrings.U
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Age extends StObject {
  
  var age: js.UndefOr[String] = js.undefined
  
  var birthday: js.UndefOr[String] = js.undefined
  
  var birthyear: js.UndefOr[String] = js.undefined
  
  var email: js.UndefOr[String] = js.undefined
  
  var gender: js.UndefOr[F | M | U] = js.undefined
  
  var id: String
  
  var mobile: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var nickname: js.UndefOr[String] = js.undefined
  
  var profile_image: js.UndefOr[String] = js.undefined
}
object Age {
  
  inline def apply(id: String): Age = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Age]
  }
  
  extension [Self <: Age](x: Self) {
    
    inline def setAge(value: String): Self = StObject.set(x, "age", value.asInstanceOf[js.Any])
    
    inline def setAgeUndefined: Self = StObject.set(x, "age", js.undefined)
    
    inline def setBirthday(value: String): Self = StObject.set(x, "birthday", value.asInstanceOf[js.Any])
    
    inline def setBirthdayUndefined: Self = StObject.set(x, "birthday", js.undefined)
    
    inline def setBirthyear(value: String): Self = StObject.set(x, "birthyear", value.asInstanceOf[js.Any])
    
    inline def setBirthyearUndefined: Self = StObject.set(x, "birthyear", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setGender(value: F | M | U): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
    
    inline def setGenderUndefined: Self = StObject.set(x, "gender", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMobile(value: String): Self = StObject.set(x, "mobile", value.asInstanceOf[js.Any])
    
    inline def setMobileUndefined: Self = StObject.set(x, "mobile", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNickname(value: String): Self = StObject.set(x, "nickname", value.asInstanceOf[js.Any])
    
    inline def setNicknameUndefined: Self = StObject.set(x, "nickname", js.undefined)
    
    inline def setProfile_image(value: String): Self = StObject.set(x, "profile_image", value.asInstanceOf[js.Any])
    
    inline def setProfile_imageUndefined: Self = StObject.set(x, "profile_image", js.undefined)
  }
}
