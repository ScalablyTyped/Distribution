package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchUpdateDocumentRequest extends StObject {
  
  /** A list of updates to apply to the document. */
  var requests: js.UndefOr[js.Array[Request]] = js.native
  
  /** Provides control over how write requests are executed. */
  var writeControl: js.UndefOr[WriteControl] = js.native
}
object BatchUpdateDocumentRequest {
  
  @scala.inline
  def apply(): BatchUpdateDocumentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchUpdateDocumentRequest]
  }
  
  @scala.inline
  implicit class BatchUpdateDocumentRequestMutableBuilder[Self <: BatchUpdateDocumentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequests(value: js.Array[Request]): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestsUndefined: Self = StObject.set(x, "requests", js.undefined)
    
    @scala.inline
    def setRequestsVarargs(value: Request*): Self = StObject.set(x, "requests", js.Array(value :_*))
    
    @scala.inline
    def setWriteControl(value: WriteControl): Self = StObject.set(x, "writeControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriteControlUndefined: Self = StObject.set(x, "writeControl", js.undefined)
  }
}
