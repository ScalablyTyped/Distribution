package typings.maximMazurokGapiClientHomegraph.gapi.client.homegraph

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestSyncDevicesRequest extends StObject {
  
  /** Required. Third-party user ID. */
  var agentUserId: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. If set, the request will be added to a queue and a response will be returned immediately. This enables concurrent requests for the given `agent_user_id`, but the caller
    * will not receive any error responses.
    */
  var async: js.UndefOr[Boolean] = js.undefined
}
object RequestSyncDevicesRequest {
  
  inline def apply(): RequestSyncDevicesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestSyncDevicesRequest]
  }
  
  extension [Self <: RequestSyncDevicesRequest](x: Self) {
    
    inline def setAgentUserId(value: String): Self = StObject.set(x, "agentUserId", value.asInstanceOf[js.Any])
    
    inline def setAgentUserIdUndefined: Self = StObject.set(x, "agentUserId", js.undefined)
    
    inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
  }
}
