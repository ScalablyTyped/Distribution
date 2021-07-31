package typings.maximMazurokGapiClientHomegraph.gapi.client.homegraph

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SyncResponse extends StObject {
  
  /** Devices associated with the third-party user. */
  var payload: js.UndefOr[SyncResponsePayload] = js.undefined
  
  /** Request ID used for debugging. Copied from the request. */
  var requestId: js.UndefOr[String] = js.undefined
}
object SyncResponse {
  
  @scala.inline
  def apply(): SyncResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SyncResponse]
  }
  
  @scala.inline
  implicit class SyncResponseMutableBuilder[Self <: SyncResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPayload(value: SyncResponsePayload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    @scala.inline
    def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}
