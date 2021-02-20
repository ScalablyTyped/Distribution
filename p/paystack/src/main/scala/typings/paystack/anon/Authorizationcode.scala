package typings.paystack.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Authorizationcode extends StObject {
  
  var amount: Double = js.native
  
  var authorization_code: String = js.native
  
  var email: String = js.native
  
  var reference: String = js.native
}
object Authorizationcode {
  
  @scala.inline
  def apply(amount: Double, authorization_code: String, email: String, reference: String): Authorizationcode = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], authorization_code = authorization_code.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[Authorizationcode]
  }
  
  @scala.inline
  implicit class AuthorizationcodeMutableBuilder[Self <: Authorizationcode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorization_code(value: String): Self = StObject.set(x, "authorization_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReference(value: String): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
  }
}
