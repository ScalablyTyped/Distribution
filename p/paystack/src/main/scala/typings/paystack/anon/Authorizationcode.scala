package typings.paystack.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Authorizationcode extends js.Object {
  
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
  implicit class AuthorizationcodeOps[Self <: Authorizationcode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAmount(value: Double): Self = this.set("amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorization_code(value: String): Self = this.set("authorization_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReference(value: String): Self = this.set("reference", value.asInstanceOf[js.Any])
  }
}
