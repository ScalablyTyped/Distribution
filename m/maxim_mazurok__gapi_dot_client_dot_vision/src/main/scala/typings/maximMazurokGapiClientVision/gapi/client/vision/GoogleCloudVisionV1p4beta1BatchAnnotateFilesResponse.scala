package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudVisionV1p4beta1BatchAnnotateFilesResponse extends StObject {
  
  /** The list of file annotation responses, each response corresponding to each AnnotateFileRequest in BatchAnnotateFilesRequest. */
  var responses: js.UndefOr[js.Array[GoogleCloudVisionV1p4beta1AnnotateFileResponse]] = js.native
}
object GoogleCloudVisionV1p4beta1BatchAnnotateFilesResponse {
  
  @scala.inline
  def apply(): GoogleCloudVisionV1p4beta1BatchAnnotateFilesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVisionV1p4beta1BatchAnnotateFilesResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudVisionV1p4beta1BatchAnnotateFilesResponseMutableBuilder[Self <: GoogleCloudVisionV1p4beta1BatchAnnotateFilesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResponses(value: js.Array[GoogleCloudVisionV1p4beta1AnnotateFileResponse]): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponsesUndefined: Self = StObject.set(x, "responses", js.undefined)
    
    @scala.inline
    def setResponsesVarargs(value: GoogleCloudVisionV1p4beta1AnnotateFileResponse*): Self = StObject.set(x, "responses", js.Array(value :_*))
  }
}
