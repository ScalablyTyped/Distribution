package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchAnnotateImagesResponse extends StObject {
  
  /** Individual responses to image annotation requests within the batch. */
  var responses: js.UndefOr[js.Array[AnnotateImageResponse]] = js.undefined
}
object BatchAnnotateImagesResponse {
  
  inline def apply(): BatchAnnotateImagesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchAnnotateImagesResponse]
  }
  
  extension [Self <: BatchAnnotateImagesResponse](x: Self) {
    
    inline def setResponses(value: js.Array[AnnotateImageResponse]): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
    
    inline def setResponsesUndefined: Self = StObject.set(x, "responses", js.undefined)
    
    inline def setResponsesVarargs(value: AnnotateImageResponse*): Self = StObject.set(x, "responses", js.Array(value*))
  }
}
