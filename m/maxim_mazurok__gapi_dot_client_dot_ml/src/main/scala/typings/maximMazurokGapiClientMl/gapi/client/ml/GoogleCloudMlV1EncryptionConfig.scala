package typings.maximMazurokGapiClientMl.gapi.client.ml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudMlV1EncryptionConfig extends StObject {
  
  /**
    * The Cloud KMS resource identifier of the customer-managed encryption key used to protect a resource, such as a training job. It has the following format:
    * `projects/{PROJECT_ID}/locations/{REGION}/keyRings/{KEY_RING_NAME}/cryptoKeys/{KEY_NAME}`
    */
  var kmsKeyName: js.UndefOr[String] = js.undefined
}
object GoogleCloudMlV1EncryptionConfig {
  
  @scala.inline
  def apply(): GoogleCloudMlV1EncryptionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1EncryptionConfig]
  }
  
  @scala.inline
  implicit class GoogleCloudMlV1EncryptionConfigMutableBuilder[Self <: GoogleCloudMlV1EncryptionConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKmsKeyName(value: String): Self = StObject.set(x, "kmsKeyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyNameUndefined: Self = StObject.set(x, "kmsKeyName", js.undefined)
  }
}
