package typings.maximMazurokGapiClientServicemanagement.gapi.client.servicemanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlowErrorDetails extends StObject {
  
  /** The type of exception (as a class name). */
  var exceptionType: js.UndefOr[String] = js.undefined
  
  /** The step that failed. */
  var flowStepId: js.UndefOr[String] = js.undefined
}
object FlowErrorDetails {
  
  inline def apply(): FlowErrorDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlowErrorDetails]
  }
  
  extension [Self <: FlowErrorDetails](x: Self) {
    
    inline def setExceptionType(value: String): Self = StObject.set(x, "exceptionType", value.asInstanceOf[js.Any])
    
    inline def setExceptionTypeUndefined: Self = StObject.set(x, "exceptionType", js.undefined)
    
    inline def setFlowStepId(value: String): Self = StObject.set(x, "flowStepId", value.asInstanceOf[js.Any])
    
    inline def setFlowStepIdUndefined: Self = StObject.set(x, "flowStepId", js.undefined)
  }
}
