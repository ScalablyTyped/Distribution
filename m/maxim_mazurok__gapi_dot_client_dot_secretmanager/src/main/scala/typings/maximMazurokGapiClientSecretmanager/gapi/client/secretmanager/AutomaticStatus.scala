package typings.maximMazurokGapiClientSecretmanager.gapi.client.secretmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutomaticStatus extends StObject {
  
  /** Output only. The customer-managed encryption status of the SecretVersion. Only populated if customer-managed encryption is used. */
  var customerManagedEncryption: js.UndefOr[CustomerManagedEncryptionStatus] = js.undefined
}
object AutomaticStatus {
  
  inline def apply(): AutomaticStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutomaticStatus]
  }
  
  extension [Self <: AutomaticStatus](x: Self) {
    
    inline def setCustomerManagedEncryption(value: CustomerManagedEncryptionStatus): Self = StObject.set(x, "customerManagedEncryption", value.asInstanceOf[js.Any])
    
    inline def setCustomerManagedEncryptionUndefined: Self = StObject.set(x, "customerManagedEncryption", js.undefined)
  }
}
