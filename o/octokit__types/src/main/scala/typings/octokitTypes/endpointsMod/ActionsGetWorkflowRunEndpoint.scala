package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionsGetWorkflowRunEndpoint extends StObject {
  
  var owner: String
  
  var repo: String
  
  var run_id: Double
}
object ActionsGetWorkflowRunEndpoint {
  
  inline def apply(owner: String, repo: String, run_id: Double): ActionsGetWorkflowRunEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], run_id = run_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsGetWorkflowRunEndpoint]
  }
  
  extension [Self <: ActionsGetWorkflowRunEndpoint](x: Self) {
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    inline def setRun_id(value: Double): Self = StObject.set(x, "run_id", value.asInstanceOf[js.Any])
  }
}
