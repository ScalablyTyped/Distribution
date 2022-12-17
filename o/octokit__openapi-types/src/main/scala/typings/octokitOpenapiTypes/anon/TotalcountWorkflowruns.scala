package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TotalcountWorkflowruns extends StObject {
  
  var total_count: Double
  
  var workflow_runs: js.Array[Cancelurl]
}
object TotalcountWorkflowruns {
  
  inline def apply(total_count: Double, workflow_runs: js.Array[Cancelurl]): TotalcountWorkflowruns = {
    val __obj = js.Dynamic.literal(total_count = total_count.asInstanceOf[js.Any], workflow_runs = workflow_runs.asInstanceOf[js.Any])
    __obj.asInstanceOf[TotalcountWorkflowruns]
  }
  
  extension [Self <: TotalcountWorkflowruns](x: Self) {
    
    inline def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
    
    inline def setWorkflow_runs(value: js.Array[Cancelurl]): Self = StObject.set(x, "workflow_runs", value.asInstanceOf[js.Any])
    
    inline def setWorkflow_runsVarargs(value: Cancelurl*): Self = StObject.set(x, "workflow_runs", js.Array(value*))
  }
}
