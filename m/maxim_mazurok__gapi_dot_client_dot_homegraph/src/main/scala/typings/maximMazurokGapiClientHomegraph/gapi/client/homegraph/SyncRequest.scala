package typings.maximMazurokGapiClientHomegraph.gapi.client.homegraph

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SyncRequest extends StObject {
  
  /** Required. Third-party user ID. */
  var agentUserId: js.UndefOr[String] = js.native
  
  /** Request ID used for debugging. */
  var requestId: js.UndefOr[String] = js.native
}
object SyncRequest {
  
  @scala.inline
  def apply(): SyncRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SyncRequest]
  }
  
  @scala.inline
  implicit class SyncRequestMutableBuilder[Self <: SyncRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAgentUserId(value: String): Self = StObject.set(x, "agentUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgentUserIdUndefined: Self = StObject.set(x, "agentUserId", js.undefined)
    
    @scala.inline
    def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}
