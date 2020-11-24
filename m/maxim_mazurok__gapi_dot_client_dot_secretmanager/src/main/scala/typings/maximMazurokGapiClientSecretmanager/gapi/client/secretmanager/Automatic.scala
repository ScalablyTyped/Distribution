package typings.maximMazurokGapiClientSecretmanager.gapi.client.secretmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Automatic extends js.Object {
  
  /**
    * Optional. The customer-managed encryption configuration of the Secret. If no configuration is provided, Google-managed default encryption is used. Updates to the Secret encryption
    * configuration only apply to SecretVersions added afterwards. They do not apply retroactively to existing SecretVersions.
    */
  var customerManagedEncryption: js.UndefOr[CustomerManagedEncryption] = js.native
}
object Automatic {
  
  @scala.inline
  def apply(): Automatic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Automatic]
  }
  
  @scala.inline
  implicit class AutomaticOps[Self <: Automatic] (val x: Self) extends AnyVal {
    
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
    def setCustomerManagedEncryption(value: CustomerManagedEncryption): Self = this.set("customerManagedEncryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomerManagedEncryption: Self = this.set("customerManagedEncryption", js.undefined)
  }
}
