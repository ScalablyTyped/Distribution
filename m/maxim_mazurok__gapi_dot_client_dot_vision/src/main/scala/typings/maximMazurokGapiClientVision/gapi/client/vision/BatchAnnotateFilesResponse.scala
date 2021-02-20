package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchAnnotateFilesResponse extends StObject {
  
  /** The list of file annotation responses, each response corresponding to each AnnotateFileRequest in BatchAnnotateFilesRequest. */
  var responses: js.UndefOr[js.Array[AnnotateFileResponse]] = js.native
}
object BatchAnnotateFilesResponse {
  
  @scala.inline
  def apply(): BatchAnnotateFilesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchAnnotateFilesResponse]
  }
  
  @scala.inline
  implicit class BatchAnnotateFilesResponseMutableBuilder[Self <: BatchAnnotateFilesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResponses(value: js.Array[AnnotateFileResponse]): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponsesUndefined: Self = StObject.set(x, "responses", js.undefined)
    
    @scala.inline
    def setResponsesVarargs(value: AnnotateFileResponse*): Self = StObject.set(x, "responses", js.Array(value :_*))
  }
}
