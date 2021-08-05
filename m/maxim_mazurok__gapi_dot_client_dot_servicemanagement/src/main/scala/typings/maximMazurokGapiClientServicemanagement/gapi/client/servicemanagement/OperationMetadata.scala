package typings.maximMazurokGapiClientServicemanagement.gapi.client.servicemanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OperationMetadata extends StObject {
  
  /** Percentage of completion of this operation, ranging from 0 to 100. */
  var progressPercentage: js.UndefOr[Double] = js.undefined
  
  /** The full name of the resources that this operation is directly associated with. */
  var resourceNames: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The start time of the operation. */
  var startTime: js.UndefOr[String] = js.undefined
  
  /** Detailed status information for each step. The order is undetermined. */
  var steps: js.UndefOr[js.Array[Step]] = js.undefined
}
object OperationMetadata {
  
  inline def apply(): OperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperationMetadata]
  }
  
  extension [Self <: OperationMetadata](x: Self) {
    
    inline def setProgressPercentage(value: Double): Self = StObject.set(x, "progressPercentage", value.asInstanceOf[js.Any])
    
    inline def setProgressPercentageUndefined: Self = StObject.set(x, "progressPercentage", js.undefined)
    
    inline def setResourceNames(value: js.Array[String]): Self = StObject.set(x, "resourceNames", value.asInstanceOf[js.Any])
    
    inline def setResourceNamesUndefined: Self = StObject.set(x, "resourceNames", js.undefined)
    
    inline def setResourceNamesVarargs(value: String*): Self = StObject.set(x, "resourceNames", js.Array(value :_*))
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setSteps(value: js.Array[Step]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    inline def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
    
    inline def setStepsVarargs(value: Step*): Self = StObject.set(x, "steps", js.Array(value :_*))
  }
}
