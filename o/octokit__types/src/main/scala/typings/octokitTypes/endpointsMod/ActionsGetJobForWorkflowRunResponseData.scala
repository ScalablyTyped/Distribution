package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Completedat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionsGetJobForWorkflowRunResponseData extends StObject {
  
  var check_run_url: String
  
  var completed_at: String
  
  var conclusion: String
  
  var head_sha: String
  
  var html_url: String
  
  var id: Double
  
  var name: String
  
  var node_id: String
  
  var run_id: Double
  
  var run_url: String
  
  var started_at: String
  
  var status: String
  
  var steps: js.Array[Completedat]
  
  var url: String
}
object ActionsGetJobForWorkflowRunResponseData {
  
  @scala.inline
  def apply(
    check_run_url: String,
    completed_at: String,
    conclusion: String,
    head_sha: String,
    html_url: String,
    id: Double,
    name: String,
    node_id: String,
    run_id: Double,
    run_url: String,
    started_at: String,
    status: String,
    steps: js.Array[Completedat],
    url: String
  ): ActionsGetJobForWorkflowRunResponseData = {
    val __obj = js.Dynamic.literal(check_run_url = check_run_url.asInstanceOf[js.Any], completed_at = completed_at.asInstanceOf[js.Any], conclusion = conclusion.asInstanceOf[js.Any], head_sha = head_sha.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], run_id = run_id.asInstanceOf[js.Any], run_url = run_url.asInstanceOf[js.Any], started_at = started_at.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsGetJobForWorkflowRunResponseData]
  }
  
  @scala.inline
  implicit class ActionsGetJobForWorkflowRunResponseDataMutableBuilder[Self <: ActionsGetJobForWorkflowRunResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCheck_run_url(value: String): Self = StObject.set(x, "check_run_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompleted_at(value: String): Self = StObject.set(x, "completed_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConclusion(value: String): Self = StObject.set(x, "conclusion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHead_sha(value: String): Self = StObject.set(x, "head_sha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRun_id(value: Double): Self = StObject.set(x, "run_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRun_url(value: String): Self = StObject.set(x, "run_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStarted_at(value: String): Self = StObject.set(x, "started_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSteps(value: js.Array[Completedat]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepsVarargs(value: Completedat*): Self = StObject.set(x, "steps", js.Array(value :_*))
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
