package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchUpdatePresentationResponse extends StObject {
  
  /** The presentation the updates were applied to. */
  var presentationId: js.UndefOr[String] = js.native
  
  /** The reply of the updates. This maps 1:1 with the updates, although replies to some requests may be empty. */
  var replies: js.UndefOr[js.Array[Response]] = js.native
  
  /** The updated write control after applying the request. */
  var writeControl: js.UndefOr[WriteControl] = js.native
}
object BatchUpdatePresentationResponse {
  
  @scala.inline
  def apply(): BatchUpdatePresentationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchUpdatePresentationResponse]
  }
  
  @scala.inline
  implicit class BatchUpdatePresentationResponseMutableBuilder[Self <: BatchUpdatePresentationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPresentationId(value: String): Self = StObject.set(x, "presentationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPresentationIdUndefined: Self = StObject.set(x, "presentationId", js.undefined)
    
    @scala.inline
    def setReplies(value: js.Array[Response]): Self = StObject.set(x, "replies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepliesUndefined: Self = StObject.set(x, "replies", js.undefined)
    
    @scala.inline
    def setRepliesVarargs(value: Response*): Self = StObject.set(x, "replies", js.Array(value :_*))
    
    @scala.inline
    def setWriteControl(value: WriteControl): Self = StObject.set(x, "writeControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriteControlUndefined: Self = StObject.set(x, "writeControl", js.undefined)
  }
}
