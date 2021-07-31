package typings.postmark.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmailAddress extends StObject {
  
  var EmailAddress: String
}
object EmailAddress {
  
  @scala.inline
  def apply(EmailAddress: String): EmailAddress = {
    val __obj = js.Dynamic.literal(EmailAddress = EmailAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailAddress]
  }
  
  @scala.inline
  implicit class EmailAddressMutableBuilder[Self <: EmailAddress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmailAddress(value: String): Self = StObject.set(x, "EmailAddress", value.asInstanceOf[js.Any])
  }
}
