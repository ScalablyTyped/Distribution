package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSubject extends StObject {
  
  // Email of the data subject.
  var email: js.UndefOr[NullableOption[String]] = js.undefined
  
  // First name of the data subject.
  var firstName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Last Name of the data subject.
  var lastName: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The country/region of residency. The residency information is uesed only for internal reporting but not for the content
    * search.
    */
  var residency: js.UndefOr[NullableOption[String]] = js.undefined
}
object DataSubject {
  
  inline def apply(): DataSubject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSubject]
  }
  
  extension [Self <: DataSubject](x: Self) {
    
    inline def setEmail(value: NullableOption[String]): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailNull: Self = StObject.set(x, "email", null)
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setFirstName(value: NullableOption[String]): Self = StObject.set(x, "firstName", value.asInstanceOf[js.Any])
    
    inline def setFirstNameNull: Self = StObject.set(x, "firstName", null)
    
    inline def setFirstNameUndefined: Self = StObject.set(x, "firstName", js.undefined)
    
    inline def setLastName(value: NullableOption[String]): Self = StObject.set(x, "lastName", value.asInstanceOf[js.Any])
    
    inline def setLastNameNull: Self = StObject.set(x, "lastName", null)
    
    inline def setLastNameUndefined: Self = StObject.set(x, "lastName", js.undefined)
    
    inline def setResidency(value: NullableOption[String]): Self = StObject.set(x, "residency", value.asInstanceOf[js.Any])
    
    inline def setResidencyNull: Self = StObject.set(x, "residency", null)
    
    inline def setResidencyUndefined: Self = StObject.set(x, "residency", js.undefined)
  }
}
