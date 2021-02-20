package typings.maximMazurokGapiClientHomegraph.gapi.client.homegraph

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryResponse extends StObject {
  
  /** Device states for the devices given in the request. */
  var payload: js.UndefOr[QueryResponsePayload] = js.native
  
  /** Request ID used for debugging. Copied from the request. */
  var requestId: js.UndefOr[String] = js.native
}
object QueryResponse {
  
  @scala.inline
  def apply(): QueryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryResponse]
  }
  
  @scala.inline
  implicit class QueryResponseMutableBuilder[Self <: QueryResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPayload(value: QueryResponsePayload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    @scala.inline
    def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}
