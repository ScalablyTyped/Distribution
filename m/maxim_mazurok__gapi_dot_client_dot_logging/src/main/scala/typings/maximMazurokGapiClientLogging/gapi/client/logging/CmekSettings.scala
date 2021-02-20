package typings.maximMazurokGapiClientLogging.gapi.client.logging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CmekSettings extends StObject {
  
  /**
    * The resource name for the configured Cloud KMS key.KMS key name format: "projects/PROJECT_ID/locations/LOCATION/keyRings/KEYRING/cryptoKeys/KEY"For example:
    * "projects/my-project-id/locations/my-region/keyRings/key-ring-name/cryptoKeys/key-name"To enable CMEK for the Logs Router, set this field to a valid kms_key_name for which the
    * associated service account has the required roles/cloudkms.cryptoKeyEncrypterDecrypter role assigned for the key.The Cloud KMS key used by the Log Router can be updated by changing
    * the kms_key_name to a new valid key name. Encryption operations that are in progress will be completed with the key that was in use when they started. Decryption operations will be
    * completed using the key that was used at the time of encryption unless access to that key has been revoked.To disable CMEK for the Logs Router, set this field to an empty string.See
    * Enabling CMEK for Logs Router (https://cloud.google.com/logging/docs/routing/managed-encryption) for more information.
    */
  var kmsKeyName: js.UndefOr[String] = js.native
  
  /** Output only. The resource name of the CMEK settings. */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Output only. The service account that will be used by the Logs Router to access your Cloud KMS key.Before enabling CMEK for Logs Router, you must first assign the role
    * roles/cloudkms.cryptoKeyEncrypterDecrypter to the service account that the Logs Router will use to access your Cloud KMS key. Use GetCmekSettings to obtain the service account
    * ID.See Enabling CMEK for Logs Router (https://cloud.google.com/logging/docs/routing/managed-encryption) for more information.
    */
  var serviceAccountId: js.UndefOr[String] = js.native
}
object CmekSettings {
  
  @scala.inline
  def apply(): CmekSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CmekSettings]
  }
  
  @scala.inline
  implicit class CmekSettingsMutableBuilder[Self <: CmekSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKmsKeyName(value: String): Self = StObject.set(x, "kmsKeyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyNameUndefined: Self = StObject.set(x, "kmsKeyName", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setServiceAccountId(value: String): Self = StObject.set(x, "serviceAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceAccountIdUndefined: Self = StObject.set(x, "serviceAccountId", js.undefined)
  }
}
