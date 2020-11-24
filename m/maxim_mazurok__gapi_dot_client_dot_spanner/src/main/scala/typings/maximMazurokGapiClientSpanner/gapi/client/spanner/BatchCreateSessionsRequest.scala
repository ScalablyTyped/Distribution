package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchCreateSessionsRequest extends js.Object {
  
  /**
    * Required. The number of sessions to be created in this batch call. The API may return fewer than the requested number of sessions. If a specific number of sessions are desired, the
    * client can make additional calls to BatchCreateSessions (adjusting session_count as necessary).
    */
  var sessionCount: js.UndefOr[Double] = js.native
  
  /** Parameters to be applied to each created session. */
  var sessionTemplate: js.UndefOr[Session] = js.native
}
object BatchCreateSessionsRequest {
  
  @scala.inline
  def apply(): BatchCreateSessionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchCreateSessionsRequest]
  }
  
  @scala.inline
  implicit class BatchCreateSessionsRequestOps[Self <: BatchCreateSessionsRequest] (val x: Self) extends AnyVal {
    
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
    def setSessionCount(value: Double): Self = this.set("sessionCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionCount: Self = this.set("sessionCount", js.undefined)
    
    @scala.inline
    def setSessionTemplate(value: Session): Self = this.set("sessionTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionTemplate: Self = this.set("sessionTemplate", js.undefined)
  }
}
