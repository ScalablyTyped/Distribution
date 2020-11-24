package typings.maximMazurokGapiClientHomegraph.gapi.client.homegraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReportStateAndNotificationRequest extends js.Object {
  
  /** Required. Third-party user ID. */
  var agentUserId: js.UndefOr[String] = js.native
  
  /** Unique identifier per event (for example, a doorbell press). */
  var eventId: js.UndefOr[String] = js.native
  
  /**
    * Token to maintain state in the follow up notification response. Deprecated. See the [notifications guide](https://developers.google.com/assistant/smarthome/develop/notifications)
    * for details on implementing follow up notifications.
    */
  var followUpToken: js.UndefOr[String] = js.native
  
  /** Required. State of devices to update and notification metadata for devices. */
  var payload: js.UndefOr[StateAndNotificationPayload] = js.native
  
  /** Request ID used for debugging. */
  var requestId: js.UndefOr[String] = js.native
}
object ReportStateAndNotificationRequest {
  
  @scala.inline
  def apply(): ReportStateAndNotificationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportStateAndNotificationRequest]
  }
  
  @scala.inline
  implicit class ReportStateAndNotificationRequestOps[Self <: ReportStateAndNotificationRequest] (val x: Self) extends AnyVal {
    
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
    def setAgentUserId(value: String): Self = this.set("agentUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAgentUserId: Self = this.set("agentUserId", js.undefined)
    
    @scala.inline
    def setEventId(value: String): Self = this.set("eventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventId: Self = this.set("eventId", js.undefined)
    
    @scala.inline
    def setFollowUpToken(value: String): Self = this.set("followUpToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFollowUpToken: Self = this.set("followUpToken", js.undefined)
    
    @scala.inline
    def setPayload(value: StateAndNotificationPayload): Self = this.set("payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayload: Self = this.set("payload", js.undefined)
    
    @scala.inline
    def setRequestId(value: String): Self = this.set("requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestId: Self = this.set("requestId", js.undefined)
  }
}
