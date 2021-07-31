package typings.maximMazurokGapiClientSecretmanager.gapi.client.secretmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomerManagedEncryptionStatus extends StObject {
  
  /**
    * Required. The resource name of the Cloud KMS CryptoKeyVersion used to encrypt the secret payload, in the following format:
    * `projects/∗/locations/∗/keyRings/∗/cryptoKeys/∗/versions/ *`.
    */
  var kmsKeyVersionName: js.UndefOr[String] = js.undefined
}
object CustomerManagedEncryptionStatus {
  
  @scala.inline
  def apply(): CustomerManagedEncryptionStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomerManagedEncryptionStatus]
  }
  
  @scala.inline
  implicit class CustomerManagedEncryptionStatusMutableBuilder[Self <: CustomerManagedEncryptionStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKmsKeyVersionName(value: String): Self = StObject.set(x, "kmsKeyVersionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyVersionNameUndefined: Self = StObject.set(x, "kmsKeyVersionName", js.undefined)
  }
}
