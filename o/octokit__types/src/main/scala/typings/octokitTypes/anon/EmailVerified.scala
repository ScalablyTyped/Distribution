package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmailVerified extends StObject {
  
  var email: String
  
  var verified: Boolean
}
object EmailVerified {
  
  @scala.inline
  def apply(email: String, verified: Boolean): EmailVerified = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], verified = verified.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailVerified]
  }
  
  @scala.inline
  implicit class EmailVerifiedMutableBuilder[Self <: EmailVerified] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerified(value: Boolean): Self = StObject.set(x, "verified", value.asInstanceOf[js.Any])
  }
}
