package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudVisionV1p4beta1AnnotateFileResponse extends StObject {
  
  /** If set, represents the error message for the failed request. The `responses` field will not be set in this case. */
  var error: js.UndefOr[Status] = js.undefined
  
  /** Information about the file for which this response is generated. */
  var inputConfig: js.UndefOr[GoogleCloudVisionV1p4beta1InputConfig] = js.undefined
  
  /** Individual responses to images found within the file. This field will be empty if the `error` field is set. */
  var responses: js.UndefOr[js.Array[GoogleCloudVisionV1p4beta1AnnotateImageResponse]] = js.undefined
  
  /** This field gives the total number of pages in the file. */
  var totalPages: js.UndefOr[Double] = js.undefined
}
object GoogleCloudVisionV1p4beta1AnnotateFileResponse {
  
  @scala.inline
  def apply(): GoogleCloudVisionV1p4beta1AnnotateFileResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVisionV1p4beta1AnnotateFileResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudVisionV1p4beta1AnnotateFileResponseMutableBuilder[Self <: GoogleCloudVisionV1p4beta1AnnotateFileResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: Status): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setInputConfig(value: GoogleCloudVisionV1p4beta1InputConfig): Self = StObject.set(x, "inputConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputConfigUndefined: Self = StObject.set(x, "inputConfig", js.undefined)
    
    @scala.inline
    def setResponses(value: js.Array[GoogleCloudVisionV1p4beta1AnnotateImageResponse]): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponsesUndefined: Self = StObject.set(x, "responses", js.undefined)
    
    @scala.inline
    def setResponsesVarargs(value: GoogleCloudVisionV1p4beta1AnnotateImageResponse*): Self = StObject.set(x, "responses", js.Array(value :_*))
    
    @scala.inline
    def setTotalPages(value: Double): Self = StObject.set(x, "totalPages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalPagesUndefined: Self = StObject.set(x, "totalPages", js.undefined)
  }
}
