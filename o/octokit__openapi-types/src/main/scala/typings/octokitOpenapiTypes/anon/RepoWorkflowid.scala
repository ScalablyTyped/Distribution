package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RepoWorkflowid extends StObject {
  
  var owner: String
  
  var repo: String
  
  var workflow_id: Double | String
}
object RepoWorkflowid {
  
  inline def apply(owner: String, repo: String, workflow_id: Double | String): RepoWorkflowid = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], workflow_id = workflow_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepoWorkflowid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RepoWorkflowid] (val x: Self) extends AnyVal {
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    inline def setWorkflow_id(value: Double | String): Self = StObject.set(x, "workflow_id", value.asInstanceOf[js.Any])
  }
}
