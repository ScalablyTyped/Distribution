package typings.maximMazurokGapiClientNetworkmanagement.gapi.client.networkmanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Trace extends js.Object {
  
  /**
    * Derived from the source and destination endpoints definition, and validated by the data plane model. If there are multiple traces starting from different source locations, then the
    * endpoint_info may be different between traces.
    */
  var endpointInfo: js.UndefOr[EndpointInfo] = js.native
  
  /**
    * A trace of a test contains multiple steps from the initial state to the final state (delivered, dropped, forwarded, or aborted). The steps are ordered by the processing sequence
    * within the simulated network state machine. It is critical to preserve the order of the steps and avoid reordering or sorting them.
    */
  var steps: js.UndefOr[js.Array[Step]] = js.native
}
object Trace {
  
  @scala.inline
  def apply(): Trace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Trace]
  }
  
  @scala.inline
  implicit class TraceOps[Self <: Trace] (val x: Self) extends AnyVal {
    
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
    def setEndpointInfo(value: EndpointInfo): Self = this.set("endpointInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpointInfo: Self = this.set("endpointInfo", js.undefined)
    
    @scala.inline
    def setStepsVarargs(value: Step*): Self = this.set("steps", js.Array(value :_*))
    
    @scala.inline
    def setSteps(value: js.Array[Step]): Self = this.set("steps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSteps: Self = this.set("steps", js.undefined)
  }
}
