package typings.onfleetNodeOnfleet.resourcesTasksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAsyncMultipleTaskResult extends StObject {
  
  var jobId: String
  
  var status: String
}
object CreateAsyncMultipleTaskResult {
  
  inline def apply(jobId: String, status: String): CreateAsyncMultipleTaskResult = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAsyncMultipleTaskResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateAsyncMultipleTaskResult] (val x: Self) extends AnyVal {
    
    inline def setJobId(value: String): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
