package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsyncBatchAnnotateFilesResponse extends StObject {
  
  /** The list of file annotation responses, one for each request in AsyncBatchAnnotateFilesRequest. */
  var responses: js.UndefOr[js.Array[AsyncAnnotateFileResponse]] = js.undefined
}
object AsyncBatchAnnotateFilesResponse {
  
  @scala.inline
  def apply(): AsyncBatchAnnotateFilesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsyncBatchAnnotateFilesResponse]
  }
  
  @scala.inline
  implicit class AsyncBatchAnnotateFilesResponseMutableBuilder[Self <: AsyncBatchAnnotateFilesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResponses(value: js.Array[AsyncAnnotateFileResponse]): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponsesUndefined: Self = StObject.set(x, "responses", js.undefined)
    
    @scala.inline
    def setResponsesVarargs(value: AsyncAnnotateFileResponse*): Self = StObject.set(x, "responses", js.Array(value :_*))
  }
}
