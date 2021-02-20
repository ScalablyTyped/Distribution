package typings.maximMazurokGapiClientSecretmanager.gapi.client.secretmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutomaticStatus extends StObject {
  
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
  implicit class AutomaticStatusMutableBuilder[Self <: AutomaticStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomerManagedEncryption(value: CustomerManagedEncryptionStatus): Self = StObject.set(x, "customerManagedEncryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerManagedEncryptionUndefined: Self = StObject.set(x, "customerManagedEncryption", js.undefined)
  }
}
