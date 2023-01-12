package typings.postmark.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmailAddress extends StObject {
  
  var EmailAddress: String
}
object EmailAddress {
  
  inline def apply(EmailAddress: String): EmailAddress = {
    val __obj = js.Dynamic.literal(EmailAddress = EmailAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailAddress]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EmailAddress] (val x: Self) extends AnyVal {
    
    inline def setEmailAddress(value: String): Self = StObject.set(x, "EmailAddress", value.asInstanceOf[js.Any])
  }
}
