package typings.onfleetNodeOnfleet.resourcesTasksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchResultErrors extends StObject {
  
  var cause: String
  
  var errorCode: Double
  
  var message: String
  
  var statusCode: Double
  
  var taskData: OnfleetTask
}
object BatchResultErrors {
  
  inline def apply(cause: String, errorCode: Double, message: String, statusCode: Double, taskData: OnfleetTask): BatchResultErrors = {
    val __obj = js.Dynamic.literal(cause = cause.asInstanceOf[js.Any], errorCode = errorCode.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], taskData = taskData.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchResultErrors]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchResultErrors] (val x: Self) extends AnyVal {
    
    inline def setCause(value: String): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
    
    inline def setErrorCode(value: Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    inline def setTaskData(value: OnfleetTask): Self = StObject.set(x, "taskData", value.asInstanceOf[js.Any])
  }
}
