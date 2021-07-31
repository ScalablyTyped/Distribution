package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudVisionV1p1beta1AsyncBatchAnnotateFilesResponse extends StObject {
  
  /** The list of file annotation responses, one for each request in AsyncBatchAnnotateFilesRequest. */
  var responses: js.UndefOr[js.Array[GoogleCloudVisionV1p1beta1AsyncAnnotateFileResponse]] = js.undefined
}
object GoogleCloudVisionV1p1beta1AsyncBatchAnnotateFilesResponse {
  
  @scala.inline
  def apply(): GoogleCloudVisionV1p1beta1AsyncBatchAnnotateFilesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVisionV1p1beta1AsyncBatchAnnotateFilesResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudVisionV1p1beta1AsyncBatchAnnotateFilesResponseMutableBuilder[Self <: GoogleCloudVisionV1p1beta1AsyncBatchAnnotateFilesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResponses(value: js.Array[GoogleCloudVisionV1p1beta1AsyncAnnotateFileResponse]): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponsesUndefined: Self = StObject.set(x, "responses", js.undefined)
    
    @scala.inline
    def setResponsesVarargs(value: GoogleCloudVisionV1p1beta1AsyncAnnotateFileResponse*): Self = StObject.set(x, "responses", js.Array(value :_*))
  }
}
