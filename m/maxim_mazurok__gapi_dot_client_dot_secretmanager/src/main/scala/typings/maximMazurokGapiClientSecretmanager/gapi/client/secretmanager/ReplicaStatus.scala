package typings.maximMazurokGapiClientSecretmanager.gapi.client.secretmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplicaStatus extends js.Object {
  
  /** Output only. The customer-managed encryption status of the SecretVersion. Only populated if customer-managed encryption is used. */
  var customerManagedEncryption: js.UndefOr[CustomerManagedEncryptionStatus] = js.native
  
  /** Output only. The canonical ID of the replica location. For example: `"us-east1"`. */
  var location: js.UndefOr[String] = js.native
}
object ReplicaStatus {
  
  @scala.inline
  def apply(): ReplicaStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicaStatus]
  }
  
  @scala.inline
  implicit class ReplicaStatusOps[Self <: ReplicaStatus] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
  }
}
