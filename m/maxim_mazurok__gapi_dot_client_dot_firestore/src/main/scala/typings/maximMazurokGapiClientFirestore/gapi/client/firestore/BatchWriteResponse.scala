package typings.maximMazurokGapiClientFirestore.gapi.client.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchWriteResponse extends js.Object {
  
  /** The status of applying the writes. This i-th write status corresponds to the i-th write in the request. */
  var status: js.UndefOr[js.Array[Status]] = js.native
  
  /** The result of applying the writes. This i-th write result corresponds to the i-th write in the request. */
  var writeResults: js.UndefOr[js.Array[WriteResult]] = js.native
}
object BatchWriteResponse {
  
  @scala.inline
  def apply(): BatchWriteResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchWriteResponse]
  }
  
  @scala.inline
  implicit class BatchWriteResponseOps[Self <: BatchWriteResponse] (val x: Self) extends AnyVal {
    
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
    def setStatusVarargs(value: Status*): Self = this.set("status", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: js.Array[Status]): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setWriteResultsVarargs(value: WriteResult*): Self = this.set("writeResults", js.Array(value :_*))
    
    @scala.inline
    def setWriteResults(value: js.Array[WriteResult]): Self = this.set("writeResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWriteResults: Self = this.set("writeResults", js.undefined)
  }
}
