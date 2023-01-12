package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Recipient extends StObject {
  
  // The recipient's email address.
  var emailAddress: js.UndefOr[NullableOption[EmailAddress]] = js.undefined
}
object Recipient {
  
  inline def apply(): Recipient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Recipient]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Recipient] (val x: Self) extends AnyVal {
    
    inline def setEmailAddress(value: NullableOption[EmailAddress]): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
    
    inline def setEmailAddressNull: Self = StObject.set(x, "emailAddress", null)
    
    inline def setEmailAddressUndefined: Self = StObject.set(x, "emailAddress", js.undefined)
  }
}
