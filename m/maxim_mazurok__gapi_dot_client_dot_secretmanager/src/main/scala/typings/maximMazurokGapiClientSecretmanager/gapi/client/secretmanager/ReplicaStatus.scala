package typings.maximMazurokGapiClientSecretmanager.gapi.client.secretmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplicaStatus extends StObject {
  
  /** Output only. The customer-managed encryption status of the SecretVersion. Only populated if customer-managed encryption is used. */
  var customerManagedEncryption: js.UndefOr[CustomerManagedEncryptionStatus] = js.undefined
  
  /** Output only. The canonical ID of the replica location. For example: `"us-east1"`. */
  var location: js.UndefOr[String] = js.undefined
}
object ReplicaStatus {
  
  @scala.inline
  def apply(): ReplicaStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicaStatus]
  }
  
  @scala.inline
  implicit class ReplicaStatusMutableBuilder[Self <: ReplicaStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomerManagedEncryption(value: CustomerManagedEncryptionStatus): Self = StObject.set(x, "customerManagedEncryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerManagedEncryptionUndefined: Self = StObject.set(x, "customerManagedEncryption", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
  }
}
