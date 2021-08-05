package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudVisionV1p1beta1AnnotateFileResponse extends StObject {
  
  /** If set, represents the error message for the failed request. The `responses` field will not be set in this case. */
  var error: js.UndefOr[Status] = js.undefined
  
  /** Information about the file for which this response is generated. */
  var inputConfig: js.UndefOr[GoogleCloudVisionV1p1beta1InputConfig] = js.undefined
  
  /** Individual responses to images found within the file. This field will be empty if the `error` field is set. */
  var responses: js.UndefOr[js.Array[GoogleCloudVisionV1p1beta1AnnotateImageResponse]] = js.undefined
  
  /** This field gives the total number of pages in the file. */
  var totalPages: js.UndefOr[Double] = js.undefined
}
object GoogleCloudVisionV1p1beta1AnnotateFileResponse {
  
  inline def apply(): GoogleCloudVisionV1p1beta1AnnotateFileResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVisionV1p1beta1AnnotateFileResponse]
  }
  
  extension [Self <: GoogleCloudVisionV1p1beta1AnnotateFileResponse](x: Self) {
    
    inline def setError(value: Status): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setInputConfig(value: GoogleCloudVisionV1p1beta1InputConfig): Self = StObject.set(x, "inputConfig", value.asInstanceOf[js.Any])
    
    inline def setInputConfigUndefined: Self = StObject.set(x, "inputConfig", js.undefined)
    
    inline def setResponses(value: js.Array[GoogleCloudVisionV1p1beta1AnnotateImageResponse]): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
    
    inline def setResponsesUndefined: Self = StObject.set(x, "responses", js.undefined)
    
    inline def setResponsesVarargs(value: GoogleCloudVisionV1p1beta1AnnotateImageResponse*): Self = StObject.set(x, "responses", js.Array(value :_*))
    
    inline def setTotalPages(value: Double): Self = StObject.set(x, "totalPages", value.asInstanceOf[js.Any])
    
    inline def setTotalPagesUndefined: Self = StObject.set(x, "totalPages", js.undefined)
  }
}
