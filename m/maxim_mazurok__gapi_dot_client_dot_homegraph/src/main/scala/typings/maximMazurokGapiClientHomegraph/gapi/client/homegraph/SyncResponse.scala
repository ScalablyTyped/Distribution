package typings.maximMazurokGapiClientHomegraph.gapi.client.homegraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SyncResponse extends js.Object {
  
  /** Devices associated with the third-party user. */
  var payload: js.UndefOr[SyncResponsePayload] = js.native
  
  /** Request ID used for debugging. Copied from the request. */
  var requestId: js.UndefOr[String] = js.native
}
object SyncResponse {
  
  @scala.inline
  def apply(): SyncResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SyncResponse]
  }
  
  @scala.inline
  implicit class SyncResponseOps[Self <: SyncResponse] (val x: Self) extends AnyVal {
    
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
    def setPayload(value: SyncResponsePayload): Self = this.set("payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayload: Self = this.set("payload", js.undefined)
    
    @scala.inline
    def setRequestId(value: String): Self = this.set("requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestId: Self = this.set("requestId", js.undefined)
  }
}
