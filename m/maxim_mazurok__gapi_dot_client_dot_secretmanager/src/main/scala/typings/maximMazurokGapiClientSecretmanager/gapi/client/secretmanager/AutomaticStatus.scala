package typings.maximMazurokGapiClientSecretmanager.gapi.client.secretmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutomaticStatus extends js.Object {
  
  /** Output only. The customer-managed encryption status of the SecretVersion. Only populated if customer-managed encryption is used. */
  var customerManagedEncryption: js.UndefOr[CustomerManagedEncryptionStatus] = js.native
}
object AutomaticStatus {
  
  @scala.inline
  def apply(): AutomaticStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutomaticStatus]
  }
  
  @scala.inline
  implicit class AutomaticStatusOps[Self <: AutomaticStatus] (val x: Self) extends AnyVal {
    
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
    def setCustomerManagedEncryption(value: CustomerManagedEncryptionStatus): Self = this.set("customerManagedEncryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomerManagedEncryption: Self = this.set("customerManagedEncryption", js.undefined)
  }
}
