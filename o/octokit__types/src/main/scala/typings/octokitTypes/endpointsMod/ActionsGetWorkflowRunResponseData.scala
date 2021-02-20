package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Archiveurl
import typings.octokitTypes.anon.Assigneesurl
import typings.octokitTypes.anon.Author
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionsGetWorkflowRunResponseData extends StObject {
  
  var artifacts_url: String = js.native
  
  var cancel_url: String = js.native
  
  var check_suite_url: String = js.native
  
  var conclusion: String = js.native
  
  var created_at: String = js.native
  
  var event: String = js.native
  
  var head_branch: String = js.native
  
  var head_commit: Author = js.native
  
  var head_repository: Assigneesurl = js.native
  
  var head_sha: String = js.native
  
  var html_url: String = js.native
  
  var id: Double = js.native
  
  var jobs_url: String = js.native
  
  var logs_url: String = js.native
  
  var node_id: String = js.native
  
  var pull_requests: js.Array[_] = js.native
  
  var repository: Archiveurl = js.native
  
  var rerun_url: String = js.native
  
  var run_number: Double = js.native
  
  var status: String = js.native
  
  var updated_at: String = js.native
  
  var url: String = js.native
  
  var workflow_id: Double = js.native
  
  var workflow_url: String = js.native
}
object ActionsGetWorkflowRunResponseData {
  
  @scala.inline
  def apply(
    artifacts_url: String,
    cancel_url: String,
    check_suite_url: String,
    conclusion: String,
    created_at: String,
    event: String,
    head_branch: String,
    head_commit: Author,
    head_repository: Assigneesurl,
    head_sha: String,
    html_url: String,
    id: Double,
    jobs_url: String,
    logs_url: String,
    node_id: String,
    pull_requests: js.Array[_],
    repository: Archiveurl,
    rerun_url: String,
    run_number: Double,
    status: String,
    updated_at: String,
    url: String,
    workflow_id: Double,
    workflow_url: String
  ): ActionsGetWorkflowRunResponseData = {
    val __obj = js.Dynamic.literal(artifacts_url = artifacts_url.asInstanceOf[js.Any], cancel_url = cancel_url.asInstanceOf[js.Any], check_suite_url = check_suite_url.asInstanceOf[js.Any], conclusion = conclusion.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], head_branch = head_branch.asInstanceOf[js.Any], head_commit = head_commit.asInstanceOf[js.Any], head_repository = head_repository.asInstanceOf[js.Any], head_sha = head_sha.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], jobs_url = jobs_url.asInstanceOf[js.Any], logs_url = logs_url.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], pull_requests = pull_requests.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], rerun_url = rerun_url.asInstanceOf[js.Any], run_number = run_number.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], workflow_id = workflow_id.asInstanceOf[js.Any], workflow_url = workflow_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsGetWorkflowRunResponseData]
  }
  
  @scala.inline
  implicit class ActionsGetWorkflowRunResponseDataMutableBuilder[Self <: ActionsGetWorkflowRunResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArtifacts_url(value: String): Self = StObject.set(x, "artifacts_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancel_url(value: String): Self = StObject.set(x, "cancel_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheck_suite_url(value: String): Self = StObject.set(x, "check_suite_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConclusion(value: String): Self = StObject.set(x, "conclusion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHead_branch(value: String): Self = StObject.set(x, "head_branch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHead_commit(value: Author): Self = StObject.set(x, "head_commit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHead_repository(value: Assigneesurl): Self = StObject.set(x, "head_repository", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHead_sha(value: String): Self = StObject.set(x, "head_sha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobs_url(value: String): Self = StObject.set(x, "jobs_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogs_url(value: String): Self = StObject.set(x, "logs_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPull_requests(value: js.Array[_]): Self = StObject.set(x, "pull_requests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPull_requestsVarargs(value: js.Any*): Self = StObject.set(x, "pull_requests", js.Array(value :_*))
    
    @scala.inline
    def setRepository(value: Archiveurl): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRerun_url(value: String): Self = StObject.set(x, "rerun_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRun_number(value: Double): Self = StObject.set(x, "run_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkflow_id(value: Double): Self = StObject.set(x, "workflow_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkflow_url(value: String): Self = StObject.set(x, "workflow_url", value.asInstanceOf[js.Any])
  }
}
