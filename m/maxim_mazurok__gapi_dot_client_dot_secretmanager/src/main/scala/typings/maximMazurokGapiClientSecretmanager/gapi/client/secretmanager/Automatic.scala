package typings.maximMazurokGapiClientSecretmanager.gapi.client.secretmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Automatic extends StObject {
  
  /**
    * Optional. The customer-managed encryption configuration of the Secret. If no configuration is provided, Google-managed default encryption is used. Updates to the Secret encryption
    * configuration only apply to SecretVersions added afterwards. They do not apply retroactively to existing SecretVersions.
    */
  var customerManagedEncryption: js.UndefOr[CustomerManagedEncryption] = js.undefined
}
object Automatic {
  
  inline def apply(): Automatic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Automatic]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Automatic] (val x: Self) extends AnyVal {
    
    inline def setCustomerManagedEncryption(value: CustomerManagedEncryption): Self = StObject.set(x, "customerManagedEncryption", value.asInstanceOf[js.Any])
    
    inline def setCustomerManagedEncryptionUndefined: Self = StObject.set(x, "customerManagedEncryption", js.undefined)
  }
}
