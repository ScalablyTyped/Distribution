package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeidentifyDatasetRequest extends StObject {
  
  /** Deidentify configuration. Only one of `config` and `gcs_config_uri` can be specified. */
  var config: js.UndefOr[DeidentifyConfig] = js.undefined
  
  /**
    * The name of the dataset resource to create and write the redacted data to. * The destination dataset must not exist. * The destination dataset must be in the same location as the
    * source dataset. De-identifying data across multiple locations is not supported.
    */
  var destinationDataset: js.UndefOr[String] = js.undefined
  
  /**
    * Cloud Storage location to read the JSON cloud.healthcare.deidentify.DeidentifyConfig from, overriding the default config. Must be of the form `gs://{bucket_id}/path/to/object`. The
    * Cloud Storage location must grant the Cloud IAM role `roles/storage.objectViewer` to the project's Cloud Healthcare Service Agent service account. Only one of `config` and
    * `gcs_config_uri` can be specified.
    */
  var gcsConfigUri: js.UndefOr[String] = js.undefined
}
object DeidentifyDatasetRequest {
  
  inline def apply(): DeidentifyDatasetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeidentifyDatasetRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeidentifyDatasetRequest] (val x: Self) extends AnyVal {
    
    inline def setConfig(value: DeidentifyConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setDestinationDataset(value: String): Self = StObject.set(x, "destinationDataset", value.asInstanceOf[js.Any])
    
    inline def setDestinationDatasetUndefined: Self = StObject.set(x, "destinationDataset", js.undefined)
    
    inline def setGcsConfigUri(value: String): Self = StObject.set(x, "gcsConfigUri", value.asInstanceOf[js.Any])
    
    inline def setGcsConfigUriUndefined: Self = StObject.set(x, "gcsConfigUri", js.undefined)
  }
}
