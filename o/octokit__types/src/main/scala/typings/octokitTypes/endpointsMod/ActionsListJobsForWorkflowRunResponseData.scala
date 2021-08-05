package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Checkrunurl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionsListJobsForWorkflowRunResponseData extends StObject {
  
  var jobs: js.Array[Checkrunurl]
  
  var total_count: Double
}
object ActionsListJobsForWorkflowRunResponseData {
  
  inline def apply(jobs: js.Array[Checkrunurl], total_count: Double): ActionsListJobsForWorkflowRunResponseData = {
    val __obj = js.Dynamic.literal(jobs = jobs.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsListJobsForWorkflowRunResponseData]
  }
  
  extension [Self <: ActionsListJobsForWorkflowRunResponseData](x: Self) {
    
    inline def setJobs(value: js.Array[Checkrunurl]): Self = StObject.set(x, "jobs", value.asInstanceOf[js.Any])
    
    inline def setJobsVarargs(value: Checkrunurl*): Self = StObject.set(x, "jobs", js.Array(value :_*))
    
    inline def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
  }
}
