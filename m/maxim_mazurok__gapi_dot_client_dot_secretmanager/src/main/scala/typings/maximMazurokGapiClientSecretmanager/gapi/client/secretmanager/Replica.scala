package typings.maximMazurokGapiClientSecretmanager.gapi.client.secretmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Replica extends js.Object {
  
  /**
    * Optional. The customer-managed encryption configuration of the User-Managed Replica. If no configuration is provided, Google-managed default encryption is used. Updates to the
    * Secret encryption configuration only apply to SecretVersions added afterwards. They do not apply retroactively to existing SecretVersions.
    */
  var customerManagedEncryption: js.UndefOr[CustomerManagedEncryption] = js.native
  
  /** The canonical IDs of the location to replicate data. For example: `"us-east1"`. */
  var location: js.UndefOr[String] = js.native
}
object Replica {
  
  @scala.inline
  def apply(): Replica = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Replica]
  }
  
  @scala.inline
  implicit class ReplicaOps[Self <: Replica] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
  }
}
