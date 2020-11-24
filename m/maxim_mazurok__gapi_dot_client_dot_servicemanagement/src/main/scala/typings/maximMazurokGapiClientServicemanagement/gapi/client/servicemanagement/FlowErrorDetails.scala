package typings.maximMazurokGapiClientServicemanagement.gapi.client.servicemanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlowErrorDetails extends js.Object {
  
  /** The type of exception (as a class name). */
  var exceptionType: js.UndefOr[String] = js.native
  
  /** The step that failed. */
  var flowStepId: js.UndefOr[String] = js.native
}
object FlowErrorDetails {
  
  @scala.inline
  def apply(): FlowErrorDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlowErrorDetails]
  }
  
  @scala.inline
  implicit class FlowErrorDetailsOps[Self <: FlowErrorDetails] (val x: Self) extends AnyVal {
    
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
    def setExceptionType(value: String): Self = this.set("exceptionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExceptionType: Self = this.set("exceptionType", js.undefined)
    
    @scala.inline
    def setFlowStepId(value: String): Self = this.set("flowStepId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlowStepId: Self = this.set("flowStepId", js.undefined)
  }
}
