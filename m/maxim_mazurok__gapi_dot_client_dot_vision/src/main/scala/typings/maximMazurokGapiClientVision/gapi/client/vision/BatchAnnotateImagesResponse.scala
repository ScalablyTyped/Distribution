package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchAnnotateImagesResponse extends StObject {
  
  /** Individual responses to image annotation requests within the batch. */
  var responses: js.UndefOr[js.Array[AnnotateImageResponse]] = js.native
}
object BatchAnnotateImagesResponse {
  
  @scala.inline
  def apply(): BatchAnnotateImagesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchAnnotateImagesResponse]
  }
  
  @scala.inline
  implicit class BatchAnnotateImagesResponseMutableBuilder[Self <: BatchAnnotateImagesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResponses(value: js.Array[AnnotateImageResponse]): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponsesUndefined: Self = StObject.set(x, "responses", js.undefined)
    
    @scala.inline
    def setResponsesVarargs(value: AnnotateImageResponse*): Self = StObject.set(x, "responses", js.Array(value :_*))
  }
}
