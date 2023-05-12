package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.completed
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.in_progress
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.queued_
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.waiting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Runnername extends StObject {
  
  /** Format: uri */
  var check_run_url: String
  
  var completed_at: String | Null
  
  var conclusion: String | Null
  
  /** @description The time that the job created. */
  var created_at: String
  
  /** @description The name of the current branch. */
  var head_branch: String | Null
  
  var head_sha: String
  
  /** Format: uri */
  var html_url: String
  
  var id: Double
  
  var labels: js.Array[String]
  
  var name: String
  
  var node_id: String
  
  var run_attempt: Double
  
  var run_id: Double
  
  /** Format: uri */
  var run_url: String
  
  var runner_group_id: Double | Null
  
  var runner_group_name: String | Null
  
  var runner_id: Double | Null
  
  var runner_name: String | Null
  
  /** Format: date-time */
  var started_at: String
  
  /** @enum {string} */
  var status: queued_ | in_progress | completed | waiting
  
  var steps: js.Array[NumberStartedat]
  
  /** Format: uri */
  var url: String
  
  /** @description The name of the workflow. */
  var workflow_name: String | Null
}
object Runnername {
  
  inline def apply(
    check_run_url: String,
    created_at: String,
    head_sha: String,
    html_url: String,
    id: Double,
    labels: js.Array[String],
    name: String,
    node_id: String,
    run_attempt: Double,
    run_id: Double,
    run_url: String,
    started_at: String,
    status: queued_ | in_progress | completed | waiting,
    steps: js.Array[NumberStartedat],
    url: String
  ): Runnername = {
    val __obj = js.Dynamic.literal(check_run_url = check_run_url.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], head_sha = head_sha.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], run_attempt = run_attempt.asInstanceOf[js.Any], run_id = run_id.asInstanceOf[js.Any], run_url = run_url.asInstanceOf[js.Any], started_at = started_at.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], completed_at = null, conclusion = null, head_branch = null, runner_group_id = null, runner_group_name = null, runner_id = null, runner_name = null, workflow_name = null)
    __obj.asInstanceOf[Runnername]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Runnername] (val x: Self) extends AnyVal {
    
    inline def setCheck_run_url(value: String): Self = StObject.set(x, "check_run_url", value.asInstanceOf[js.Any])
    
    inline def setCompleted_at(value: String): Self = StObject.set(x, "completed_at", value.asInstanceOf[js.Any])
    
    inline def setCompleted_atNull: Self = StObject.set(x, "completed_at", null)
    
    inline def setConclusion(value: String): Self = StObject.set(x, "conclusion", value.asInstanceOf[js.Any])
    
    inline def setConclusionNull: Self = StObject.set(x, "conclusion", null)
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setHead_branch(value: String): Self = StObject.set(x, "head_branch", value.asInstanceOf[js.Any])
    
    inline def setHead_branchNull: Self = StObject.set(x, "head_branch", null)
    
    inline def setHead_sha(value: String): Self = StObject.set(x, "head_sha", value.asInstanceOf[js.Any])
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabels(value: js.Array[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsVarargs(value: String*): Self = StObject.set(x, "labels", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setRun_attempt(value: Double): Self = StObject.set(x, "run_attempt", value.asInstanceOf[js.Any])
    
    inline def setRun_id(value: Double): Self = StObject.set(x, "run_id", value.asInstanceOf[js.Any])
    
    inline def setRun_url(value: String): Self = StObject.set(x, "run_url", value.asInstanceOf[js.Any])
    
    inline def setRunner_group_id(value: Double): Self = StObject.set(x, "runner_group_id", value.asInstanceOf[js.Any])
    
    inline def setRunner_group_idNull: Self = StObject.set(x, "runner_group_id", null)
    
    inline def setRunner_group_name(value: String): Self = StObject.set(x, "runner_group_name", value.asInstanceOf[js.Any])
    
    inline def setRunner_group_nameNull: Self = StObject.set(x, "runner_group_name", null)
    
    inline def setRunner_id(value: Double): Self = StObject.set(x, "runner_id", value.asInstanceOf[js.Any])
    
    inline def setRunner_idNull: Self = StObject.set(x, "runner_id", null)
    
    inline def setRunner_name(value: String): Self = StObject.set(x, "runner_name", value.asInstanceOf[js.Any])
    
    inline def setRunner_nameNull: Self = StObject.set(x, "runner_name", null)
    
    inline def setStarted_at(value: String): Self = StObject.set(x, "started_at", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: queued_ | in_progress | completed | waiting): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setSteps(value: js.Array[NumberStartedat]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    inline def setStepsVarargs(value: NumberStartedat*): Self = StObject.set(x, "steps", js.Array(value*))
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setWorkflow_name(value: String): Self = StObject.set(x, "workflow_name", value.asInstanceOf[js.Any])
    
    inline def setWorkflow_nameNull: Self = StObject.set(x, "workflow_name", null)
  }
}
