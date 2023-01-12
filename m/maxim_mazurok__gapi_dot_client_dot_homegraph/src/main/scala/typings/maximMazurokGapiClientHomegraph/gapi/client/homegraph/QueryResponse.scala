package typings.maximMazurokGapiClientHomegraph.gapi.client.homegraph

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryResponse extends StObject {
  
  /** Device states for the devices given in the request. */
  var payload: js.UndefOr[QueryResponsePayload] = js.undefined
  
  /** Request ID used for debugging. Copied from the request. */
  var requestId: js.UndefOr[String] = js.undefined
}
object QueryResponse {
  
  inline def apply(): QueryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryResponse] (val x: Self) extends AnyVal {
    
    inline def setPayload(value: QueryResponsePayload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}
