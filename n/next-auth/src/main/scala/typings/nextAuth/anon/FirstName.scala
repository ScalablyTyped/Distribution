package typings.nextAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirstName extends StObject {
  
  var email: String
  
  var firstName: String
  
  var id: String
  
  var lastName: String
  
  var picture: String
}
object FirstName {
  
  inline def apply(email: String, firstName: String, id: String, lastName: String, picture: String): FirstName = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], firstName = firstName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastName = lastName.asInstanceOf[js.Any], picture = picture.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirstName]
  }
  
  extension [Self <: FirstName](x: Self) {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setFirstName(value: String): Self = StObject.set(x, "firstName", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLastName(value: String): Self = StObject.set(x, "lastName", value.asInstanceOf[js.Any])
    
    inline def setPicture(value: String): Self = StObject.set(x, "picture", value.asInstanceOf[js.Any])
  }
}
