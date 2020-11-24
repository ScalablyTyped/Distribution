package typings.maximMazurokGapiClientDocs.gapi.client.docs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchUpdateDocumentRequest extends js.Object {
  
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
  implicit class BatchUpdateDocumentRequestOps[Self <: BatchUpdateDocumentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRequestsVarargs(value: Request*): Self = this.set("requests", js.Array(value :_*))
    
    @scala.inline
    def setRequests(value: js.Array[Request]): Self = this.set("requests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequests: Self = this.set("requests", js.undefined)
    
    @scala.inline
    def setWriteControl(value: WriteControl): Self = this.set("writeControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWriteControl: Self = this.set("writeControl", js.undefined)
  }
}
