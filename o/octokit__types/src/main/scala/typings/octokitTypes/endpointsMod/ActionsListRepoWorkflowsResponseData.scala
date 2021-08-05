package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Badgeurl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionsListRepoWorkflowsResponseData extends StObject {
  
  var total_count: Double
  
  var workflows: js.Array[Badgeurl]
}
object ActionsListRepoWorkflowsResponseData {
  
  inline def apply(total_count: Double, workflows: js.Array[Badgeurl]): ActionsListRepoWorkflowsResponseData = {
    val __obj = js.Dynamic.literal(total_count = total_count.asInstanceOf[js.Any], workflows = workflows.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsListRepoWorkflowsResponseData]
  }
  
  extension [Self <: ActionsListRepoWorkflowsResponseData](x: Self) {
    
    inline def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
    
    inline def setWorkflows(value: js.Array[Badgeurl]): Self = StObject.set(x, "workflows", value.asInstanceOf[js.Any])
    
    inline def setWorkflowsVarargs(value: Badgeurl*): Self = StObject.set(x, "workflows", js.Array(value :_*))
  }
}
