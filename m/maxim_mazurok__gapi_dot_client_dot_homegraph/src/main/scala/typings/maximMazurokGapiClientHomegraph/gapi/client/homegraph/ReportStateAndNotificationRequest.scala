package typings.maximMazurokGapiClientHomegraph.gapi.client.homegraph

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReportStateAndNotificationRequest extends StObject {
  
  /** Required. Third-party user ID. */
  var agentUserId: js.UndefOr[String] = js.undefined
  
  /** Unique identifier per event (for example, a doorbell press). */
  var eventId: js.UndefOr[String] = js.undefined
  
  /**
    * Token to maintain state in the follow up notification response. Deprecated. See the [notifications guide](https://developers.google.com/assistant/smarthome/develop/notifications)
    * for details on implementing follow up notifications.
    */
  var followUpToken: js.UndefOr[String] = js.undefined
  
  /** Required. State of devices to update and notification metadata for devices. */
  var payload: js.UndefOr[StateAndNotificationPayload] = js.undefined
  
  /** Request ID used for debugging. */
  var requestId: js.UndefOr[String] = js.undefined
}
object ReportStateAndNotificationRequest {
  
  @scala.inline
  def apply(): ReportStateAndNotificationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportStateAndNotificationRequest]
  }
  
  @scala.inline
  implicit class ReportStateAndNotificationRequestMutableBuilder[Self <: ReportStateAndNotificationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAgentUserId(value: String): Self = StObject.set(x, "agentUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgentUserIdUndefined: Self = StObject.set(x, "agentUserId", js.undefined)
    
    @scala.inline
    def setEventId(value: String): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventIdUndefined: Self = StObject.set(x, "eventId", js.undefined)
    
    @scala.inline
    def setFollowUpToken(value: String): Self = StObject.set(x, "followUpToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollowUpTokenUndefined: Self = StObject.set(x, "followUpToken", js.undefined)
    
    @scala.inline
    def setPayload(value: StateAndNotificationPayload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    @scala.inline
    def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}
