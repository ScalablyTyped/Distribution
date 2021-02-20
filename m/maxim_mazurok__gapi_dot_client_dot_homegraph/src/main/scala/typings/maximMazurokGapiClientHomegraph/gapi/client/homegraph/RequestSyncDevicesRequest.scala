package typings.maximMazurokGapiClientHomegraph.gapi.client.homegraph

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestSyncDevicesRequest extends StObject {
  
  /** Required. Third-party user ID. */
  var agentUserId: js.UndefOr[String] = js.native
  
  /**
    * Optional. If set, the request will be added to a queue and a response will be returned immediately. This enables concurrent requests for the given `agent_user_id`, but the caller
    * will not receive any error responses.
    */
  var async: js.UndefOr[Boolean] = js.native
}
object RequestSyncDevicesRequest {
  
  @scala.inline
  def apply(): RequestSyncDevicesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestSyncDevicesRequest]
  }
  
  @scala.inline
  implicit class RequestSyncDevicesRequestMutableBuilder[Self <: RequestSyncDevicesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAgentUserId(value: String): Self = StObject.set(x, "agentUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgentUserIdUndefined: Self = StObject.set(x, "agentUserId", js.undefined)
    
    @scala.inline
    def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
  }
}
