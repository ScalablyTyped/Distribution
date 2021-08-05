package typings.maximMazurokGapiClientSecretmanager.gapi.client.secretmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomerManagedEncryption extends StObject {
  
  /**
    * Required. The resource name of the Cloud KMS CryptoKey used to encrypt secret payloads. For secrets using the UserManaged replication policy type, Cloud KMS CryptoKeys must reside
    * in the same location as the replica location. For secrets using the Automatic replication policy type, Cloud KMS CryptoKeys must reside in `global`. The expected format is
    * `projects/∗/locations/∗/keyRings/∗/cryptoKeys/ *`.
    */
  var kmsKeyName: js.UndefOr[String] = js.undefined
}
object CustomerManagedEncryption {
  
  inline def apply(): CustomerManagedEncryption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomerManagedEncryption]
  }
  
  extension [Self <: CustomerManagedEncryption](x: Self) {
    
    inline def setKmsKeyName(value: String): Self = StObject.set(x, "kmsKeyName", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyNameUndefined: Self = StObject.set(x, "kmsKeyName", js.undefined)
  }
}
