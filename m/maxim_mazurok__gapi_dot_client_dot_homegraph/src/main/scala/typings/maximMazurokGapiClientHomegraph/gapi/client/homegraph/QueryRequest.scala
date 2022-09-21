package typings.maximMazurokGapiClientHomegraph.gapi.client.homegraph

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryRequest extends StObject {
  
  /** Required. Third-party user ID. */
  var agentUserId: js.UndefOr[String] = js.undefined
  
  /** Required. Inputs containing third-party device IDs for which to get the device states. */
  var inputs: js.UndefOr[js.Array[QueryRequestInput]] = js.undefined
  
  /** Request ID used for debugging. */
  var requestId: js.UndefOr[String] = js.undefined
}
object QueryRequest {
  
  inline def apply(): QueryRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryRequest]
  }
  
  extension [Self <: QueryRequest](x: Self) {
    
    inline def setAgentUserId(value: String): Self = StObject.set(x, "agentUserId", value.asInstanceOf[js.Any])
    
    inline def setAgentUserIdUndefined: Self = StObject.set(x, "agentUserId", js.undefined)
    
    inline def setInputs(value: js.Array[QueryRequestInput]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsUndefined: Self = StObject.set(x, "inputs", js.undefined)
    
    inline def setInputsVarargs(value: QueryRequestInput*): Self = StObject.set(x, "inputs", js.Array(value*))
    
    inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}
