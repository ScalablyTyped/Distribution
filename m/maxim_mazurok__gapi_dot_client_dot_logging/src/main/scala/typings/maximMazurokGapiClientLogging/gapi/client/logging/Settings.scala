package typings.maximMazurokGapiClientLogging.gapi.client.logging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Settings extends StObject {
  
  /**
    * Optional. If set to true, the _Default sink in newly created projects and folders will created in a disabled state. This can be used to automatically disable log ingestion if there
    * is already an aggregated sink configured in the hierarchy. The _Default sink can be re-enabled manually if needed.
    */
  var disableDefaultSink: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional. The resource name for the configured Cloud KMS key.KMS key name format: "projects/[PROJECT_ID]/locations/[LOCATION]/keyRings/[KEYRING]/cryptoKeys/[KEY]" For
    * example:"projects/my-project/locations/us-central1/keyRings/my-ring/cryptoKeys/my-key"To enable CMEK for the Log Router, set this field to a valid kms_key_name for which the
    * associated service account has the required roles/cloudkms.cryptoKeyEncrypterDecrypter role assigned for the key.The Cloud KMS key used by the Log Router can be updated by changing
    * the kms_key_name to a new valid key name. Encryption operations that are in progress will be completed with the key that was in use when they started. Decryption operations will be
    * completed using the key that was used at the time of encryption unless access to that key has been revoked.To disable CMEK for the Log Router, set this field to an empty string.See
    * Enabling CMEK for Log Router (https://cloud.google.com/logging/docs/routing/managed-encryption) for more information.
    */
  var kmsKeyName: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The service account that will be used by the Log Router to access your Cloud KMS key.Before enabling CMEK for Log Router, you must first assign the role
    * roles/cloudkms.cryptoKeyEncrypterDecrypter to the service account that the Log Router will use to access your Cloud KMS key. Use GetSettings to obtain the service account ID.See
    * Enabling CMEK for Log Router (https://cloud.google.com/logging/docs/routing/managed-encryption) for more information.
    */
  var kmsServiceAccountId: js.UndefOr[String] = js.undefined
  
  /** Output only. The resource name of the settings. */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The Cloud region that will be used for _Default and _Required log buckets for newly created projects and folders. For example europe-west1. This setting does not affect
    * the location of custom log buckets.
    */
  var storageLocation: js.UndefOr[String] = js.undefined
}
object Settings {
  
  inline def apply(): Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Settings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Settings] (val x: Self) extends AnyVal {
    
    inline def setDisableDefaultSink(value: Boolean): Self = StObject.set(x, "disableDefaultSink", value.asInstanceOf[js.Any])
    
    inline def setDisableDefaultSinkUndefined: Self = StObject.set(x, "disableDefaultSink", js.undefined)
    
    inline def setKmsKeyName(value: String): Self = StObject.set(x, "kmsKeyName", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyNameUndefined: Self = StObject.set(x, "kmsKeyName", js.undefined)
    
    inline def setKmsServiceAccountId(value: String): Self = StObject.set(x, "kmsServiceAccountId", value.asInstanceOf[js.Any])
    
    inline def setKmsServiceAccountIdUndefined: Self = StObject.set(x, "kmsServiceAccountId", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStorageLocation(value: String): Self = StObject.set(x, "storageLocation", value.asInstanceOf[js.Any])
    
    inline def setStorageLocationUndefined: Self = StObject.set(x, "storageLocation", js.undefined)
  }
}
