package typings.maximMazurokGapiClientSecretmanager.gapi.client.secretmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Replica extends StObject {
  
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
  implicit class ReplicaMutableBuilder[Self <: Replica] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomerManagedEncryption(value: CustomerManagedEncryption): Self = StObject.set(x, "customerManagedEncryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerManagedEncryptionUndefined: Self = StObject.set(x, "customerManagedEncryption", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
  }
}
