package typings.maximMazurokGapiClientSecretmanager.gapi.client.secretmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Automatic extends StObject {
  
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
  implicit class AutomaticMutableBuilder[Self <: Automatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomerManagedEncryption(value: CustomerManagedEncryption): Self = StObject.set(x, "customerManagedEncryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerManagedEncryptionUndefined: Self = StObject.set(x, "customerManagedEncryption", js.undefined)
  }
}
