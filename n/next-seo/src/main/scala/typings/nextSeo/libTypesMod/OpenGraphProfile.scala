package typings.nextSeo.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenGraphProfile extends StObject {
  
  var firstName: js.UndefOr[String] = js.undefined
  
  var gender: js.UndefOr[String] = js.undefined
  
  var lastName: js.UndefOr[String] = js.undefined
  
  var username: js.UndefOr[String] = js.undefined
}
object OpenGraphProfile {
  
  inline def apply(): OpenGraphProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenGraphProfile]
  }
  
  extension [Self <: OpenGraphProfile](x: Self) {
    
    inline def setFirstName(value: String): Self = StObject.set(x, "firstName", value.asInstanceOf[js.Any])
    
    inline def setFirstNameUndefined: Self = StObject.set(x, "firstName", js.undefined)
    
    inline def setGender(value: String): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
    
    inline def setGenderUndefined: Self = StObject.set(x, "gender", js.undefined)
    
    inline def setLastName(value: String): Self = StObject.set(x, "lastName", value.asInstanceOf[js.Any])
    
    inline def setLastNameUndefined: Self = StObject.set(x, "lastName", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
