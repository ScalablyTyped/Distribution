package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudVisionV1p4beta1AsyncBatchAnnotateFilesResponse extends StObject {
  
  /** The list of file annotation responses, one for each request in AsyncBatchAnnotateFilesRequest. */
  var responses: js.UndefOr[js.Array[GoogleCloudVisionV1p4beta1AsyncAnnotateFileResponse]] = js.undefined
}
object GoogleCloudVisionV1p4beta1AsyncBatchAnnotateFilesResponse {
  
  inline def apply(): GoogleCloudVisionV1p4beta1AsyncBatchAnnotateFilesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVisionV1p4beta1AsyncBatchAnnotateFilesResponse]
  }
  
  extension [Self <: GoogleCloudVisionV1p4beta1AsyncBatchAnnotateFilesResponse](x: Self) {
    
    inline def setResponses(value: js.Array[GoogleCloudVisionV1p4beta1AsyncAnnotateFileResponse]): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
    
    inline def setResponsesUndefined: Self = StObject.set(x, "responses", js.undefined)
    
    inline def setResponsesVarargs(value: GoogleCloudVisionV1p4beta1AsyncAnnotateFileResponse*): Self = StObject.set(x, "responses", js.Array(value*))
  }
}
