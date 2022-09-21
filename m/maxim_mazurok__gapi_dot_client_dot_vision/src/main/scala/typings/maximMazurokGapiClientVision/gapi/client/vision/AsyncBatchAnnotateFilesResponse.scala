package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsyncBatchAnnotateFilesResponse extends StObject {
  
  /** The list of file annotation responses, one for each request in AsyncBatchAnnotateFilesRequest. */
  var responses: js.UndefOr[js.Array[AsyncAnnotateFileResponse]] = js.undefined
}
object AsyncBatchAnnotateFilesResponse {
  
  inline def apply(): AsyncBatchAnnotateFilesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsyncBatchAnnotateFilesResponse]
  }
  
  extension [Self <: AsyncBatchAnnotateFilesResponse](x: Self) {
    
    inline def setResponses(value: js.Array[AsyncAnnotateFileResponse]): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
    
    inline def setResponsesUndefined: Self = StObject.set(x, "responses", js.undefined)
    
    inline def setResponsesVarargs(value: AsyncAnnotateFileResponse*): Self = StObject.set(x, "responses", js.Array(value*))
  }
}
