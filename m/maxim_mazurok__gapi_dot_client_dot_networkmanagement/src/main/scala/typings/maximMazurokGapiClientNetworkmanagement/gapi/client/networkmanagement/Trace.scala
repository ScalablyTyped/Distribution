package typings.maximMazurokGapiClientNetworkmanagement.gapi.client.networkmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Trace extends StObject {
  
  /**
    * Derived from the source and destination endpoints definition, and validated by the data plane model. If there are multiple traces starting from different source locations, then the
    * endpoint_info may be different between traces.
    */
  var endpointInfo: js.UndefOr[EndpointInfo] = js.undefined
  
  /**
    * A trace of a test contains multiple steps from the initial state to the final state (delivered, dropped, forwarded, or aborted). The steps are ordered by the processing sequence
    * within the simulated network state machine. It is critical to preserve the order of the steps and avoid reordering or sorting them.
    */
  var steps: js.UndefOr[js.Array[Step]] = js.undefined
}
object Trace {
  
  inline def apply(): Trace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Trace]
  }
  
  extension [Self <: Trace](x: Self) {
    
    inline def setEndpointInfo(value: EndpointInfo): Self = StObject.set(x, "endpointInfo", value.asInstanceOf[js.Any])
    
    inline def setEndpointInfoUndefined: Self = StObject.set(x, "endpointInfo", js.undefined)
    
    inline def setSteps(value: js.Array[Step]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    inline def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
    
    inline def setStepsVarargs(value: Step*): Self = StObject.set(x, "steps", js.Array(value :_*))
  }
}
