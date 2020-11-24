package typings.paypalRestSdk.mod

import typings.paypalRestSdk.anon.Brandname
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Payee extends js.Object {
  
  var email: String = js.native
  
  var merchant_id: String = js.native
  
  var payee_display_metadata: js.UndefOr[Brandname] = js.native
}
object Payee {
  
  @scala.inline
  def apply(email: String, merchant_id: String): Payee = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], merchant_id = merchant_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Payee]
  }
  
  @scala.inline
  implicit class PayeeOps[Self <: Payee] (val x: Self) extends AnyVal {
    
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
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMerchant_id(value: String): Self = this.set("merchant_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayee_display_metadata(value: Brandname): Self = this.set("payee_display_metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayee_display_metadata: Self = this.set("payee_display_metadata", js.undefined)
  }
}
