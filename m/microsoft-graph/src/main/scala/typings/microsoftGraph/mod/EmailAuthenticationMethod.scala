package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmailAuthenticationMethod
  extends StObject
     with Entity {
  
  // The email address registered to this user.
  var emailAddress: js.UndefOr[NullableOption[String]] = js.undefined
}
object EmailAuthenticationMethod {
  
  inline def apply(): EmailAuthenticationMethod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmailAuthenticationMethod]
  }
  
  extension [Self <: EmailAuthenticationMethod](x: Self) {
    
    inline def setEmailAddress(value: NullableOption[String]): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
    
    inline def setEmailAddressNull: Self = StObject.set(x, "emailAddress", null)
    
    inline def setEmailAddressUndefined: Self = StObject.set(x, "emailAddress", js.undefined)
  }
}
