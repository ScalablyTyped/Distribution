package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudVisionV1p1beta1InputConfig extends StObject {
  
  /**
    * File content, represented as a stream of bytes. Note: As with all `bytes` fields, protobuffers use a pure binary representation, whereas JSON representations use base64. Currently,
    * this field only works for BatchAnnotateFiles requests. It does not work for AsyncBatchAnnotateFiles requests.
    */
  var content: js.UndefOr[String] = js.undefined
  
  /** The Google Cloud Storage location to read the input from. */
  var gcsSource: js.UndefOr[GoogleCloudVisionV1p1beta1GcsSource] = js.undefined
  
  /** The type of the file. Currently only "application/pdf", "image/tiff" and "image/gif" are supported. Wildcards are not supported. */
  var mimeType: js.UndefOr[String] = js.undefined
}
object GoogleCloudVisionV1p1beta1InputConfig {
  
  inline def apply(): GoogleCloudVisionV1p1beta1InputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVisionV1p1beta1InputConfig]
  }
  
  extension [Self <: GoogleCloudVisionV1p1beta1InputConfig](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setGcsSource(value: GoogleCloudVisionV1p1beta1GcsSource): Self = StObject.set(x, "gcsSource", value.asInstanceOf[js.Any])
    
    inline def setGcsSourceUndefined: Self = StObject.set(x, "gcsSource", js.undefined)
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
  }
}
