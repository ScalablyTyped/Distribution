package typings.passportFacebookToken

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait FamilyName extends StObject {
    
    var familyName: String
    
    var givenName: String
    
    var middleName: String
  }
  object FamilyName {
    
    inline def apply(familyName: String, givenName: String, middleName: String): FamilyName = {
      val __obj = js.Dynamic.literal(familyName = familyName.asInstanceOf[js.Any], givenName = givenName.asInstanceOf[js.Any], middleName = middleName.asInstanceOf[js.Any])
      __obj.asInstanceOf[FamilyName]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FamilyName] (val x: Self) extends AnyVal {
      
      inline def setFamilyName(value: String): Self = StObject.set(x, "familyName", value.asInstanceOf[js.Any])
      
      inline def setGivenName(value: String): Self = StObject.set(x, "givenName", value.asInstanceOf[js.Any])
      
      inline def setMiddleName(value: String): Self = StObject.set(x, "middleName", value.asInstanceOf[js.Any])
    }
  }
}
