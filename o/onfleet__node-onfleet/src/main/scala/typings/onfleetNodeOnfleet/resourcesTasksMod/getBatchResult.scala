package typings.onfleetNodeOnfleet.resourcesTasksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait getBatchResult extends StObject {
  
  var errors: js.Array[BatchResultErrors]
  
  var failedTasks: js.Array[OnfleetTask]
  
  var status: String
  
  var submitted: String
  
  var succeededWithWarnings: js.Array[OnfleetTask]
  
  var tasksCreated: Double
  
  var tasksReceived: Double
}
object getBatchResult {
  
  inline def apply(
    errors: js.Array[BatchResultErrors],
    failedTasks: js.Array[OnfleetTask],
    status: String,
    submitted: String,
    succeededWithWarnings: js.Array[OnfleetTask],
    tasksCreated: Double,
    tasksReceived: Double
  ): getBatchResult = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], failedTasks = failedTasks.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], submitted = submitted.asInstanceOf[js.Any], succeededWithWarnings = succeededWithWarnings.asInstanceOf[js.Any], tasksCreated = tasksCreated.asInstanceOf[js.Any], tasksReceived = tasksReceived.asInstanceOf[js.Any])
    __obj.asInstanceOf[getBatchResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: getBatchResult] (val x: Self) extends AnyVal {
    
    inline def setErrors(value: js.Array[BatchResultErrors]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsVarargs(value: BatchResultErrors*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setFailedTasks(value: js.Array[OnfleetTask]): Self = StObject.set(x, "failedTasks", value.asInstanceOf[js.Any])
    
    inline def setFailedTasksVarargs(value: OnfleetTask*): Self = StObject.set(x, "failedTasks", js.Array(value*))
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setSubmitted(value: String): Self = StObject.set(x, "submitted", value.asInstanceOf[js.Any])
    
    inline def setSucceededWithWarnings(value: js.Array[OnfleetTask]): Self = StObject.set(x, "succeededWithWarnings", value.asInstanceOf[js.Any])
    
    inline def setSucceededWithWarningsVarargs(value: OnfleetTask*): Self = StObject.set(x, "succeededWithWarnings", js.Array(value*))
    
    inline def setTasksCreated(value: Double): Self = StObject.set(x, "tasksCreated", value.asInstanceOf[js.Any])
    
    inline def setTasksReceived(value: Double): Self = StObject.set(x, "tasksReceived", value.asInstanceOf[js.Any])
  }
}
