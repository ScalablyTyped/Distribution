package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchAnnotateFilesResponse extends StObject {
  
  /** The list of file annotation responses, each response corresponding to each AnnotateFileRequest in BatchAnnotateFilesRequest. */
  var responses: js.UndefOr[js.Array[AnnotateFileResponse]] = js.undefined
}
object BatchAnnotateFilesResponse {
  
  inline def apply(): BatchAnnotateFilesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchAnnotateFilesResponse]
  }
  
  extension [Self <: BatchAnnotateFilesResponse](x: Self) {
    
    inline def setResponses(value: js.Array[AnnotateFileResponse]): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
    
    inline def setResponsesUndefined: Self = StObject.set(x, "responses", js.undefined)
    
    inline def setResponsesVarargs(value: AnnotateFileResponse*): Self = StObject.set(x, "responses", js.Array(value*))
  }
}
