package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionsDownloadJobLogsForWorkflowRunEndpoint extends StObject {
  
  var job_id: Double
  
  var owner: String
  
  var repo: String
}
object ActionsDownloadJobLogsForWorkflowRunEndpoint {
  
  @scala.inline
  def apply(job_id: Double, owner: String, repo: String): ActionsDownloadJobLogsForWorkflowRunEndpoint = {
    val __obj = js.Dynamic.literal(job_id = job_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsDownloadJobLogsForWorkflowRunEndpoint]
  }
  
  @scala.inline
  implicit class ActionsDownloadJobLogsForWorkflowRunEndpointMutableBuilder[Self <: ActionsDownloadJobLogsForWorkflowRunEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJob_id(value: Double): Self = StObject.set(x, "job_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
