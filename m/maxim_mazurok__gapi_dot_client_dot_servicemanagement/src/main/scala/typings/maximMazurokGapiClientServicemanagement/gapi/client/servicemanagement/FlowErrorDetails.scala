package typings.maximMazurokGapiClientServicemanagement.gapi.client.servicemanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlowErrorDetails extends StObject {
  
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
  implicit class FlowErrorDetailsMutableBuilder[Self <: FlowErrorDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExceptionType(value: String): Self = StObject.set(x, "exceptionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExceptionTypeUndefined: Self = StObject.set(x, "exceptionType", js.undefined)
    
    @scala.inline
    def setFlowStepId(value: String): Self = StObject.set(x, "flowStepId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlowStepIdUndefined: Self = StObject.set(x, "flowStepId", js.undefined)
  }
}
