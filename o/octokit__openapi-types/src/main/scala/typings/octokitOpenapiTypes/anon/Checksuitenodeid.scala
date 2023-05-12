package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings._empty
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.action_required
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.cancelled
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.completed
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.failure
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.in_progress
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.neutral
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.pending
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.queued_
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.requested
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.stale
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.startup_failure
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.success
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.timed_out
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.waiting
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Checksuitenodeid extends StObject {
  
  /** User */
  var actor: Deleted | Null
  
  var artifacts_url: js.UndefOr[String] = js.undefined
  
  var cancel_url: js.UndefOr[String] = js.undefined
  
  var check_suite_id: Double
  
  var check_suite_node_id: String
  
  var check_suite_url: js.UndefOr[String] = js.undefined
  
  /** @enum {string|null} */
  var conclusion: success | failure | neutral | cancelled | timed_out | action_required | stale | _empty | startup_failure | Null
  
  /** Format: date-time */
  var created_at: String
  
  var display_title: String
  
  var event: String
  
  var head_branch: String
  
  var head_commit: js.UndefOr[(Record[String, Any]) | Null] = js.undefined
  
  var head_repository: js.UndefOr[Deploymentsurl] = js.undefined
  
  var head_sha: String
  
  /** Format: uri */
  var html_url: String
  
  var id: Double
  
  var jobs_url: js.UndefOr[String] = js.undefined
  
  var logs_url: js.UndefOr[String] = js.undefined
  
  var name: String
  
  var node_id: String
  
  var path: String
  
  var previous_attempt_url: js.UndefOr[(Record[String, Any]) | Null] = js.undefined
  
  var pull_requests: js.Array[NumberUrl]
  
  var referenced_workflows: js.UndefOr[js.Array[PathRefSha] | Null] = js.undefined
  
  var repository: js.UndefOr[Deploymentsurl] = js.undefined
  
  var rerun_url: js.UndefOr[String] = js.undefined
  
  var run_attempt: Double
  
  var run_number: Double
  
  /** Format: date-time */
  var run_started_at: String
  
  /** @enum {string} */
  var status: requested | in_progress | completed | queued_ | waiting | pending
  
  /** User */
  var triggering_actor: Deleted | Null
  
  /** Format: date-time */
  var updated_at: String
  
  /** Format: uri */
  var url: String
  
  var workflow_id: Double
  
  var workflow_url: js.UndefOr[String] = js.undefined
}
object Checksuitenodeid {
  
  inline def apply(
    check_suite_id: Double,
    check_suite_node_id: String,
    created_at: String,
    display_title: String,
    event: String,
    head_branch: String,
    head_sha: String,
    html_url: String,
    id: Double,
    name: String,
    node_id: String,
    path: String,
    pull_requests: js.Array[NumberUrl],
    run_attempt: Double,
    run_number: Double,
    run_started_at: String,
    status: requested | in_progress | completed | queued_ | waiting | pending,
    updated_at: String,
    url: String,
    workflow_id: Double
  ): Checksuitenodeid = {
    val __obj = js.Dynamic.literal(check_suite_id = check_suite_id.asInstanceOf[js.Any], check_suite_node_id = check_suite_node_id.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], display_title = display_title.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], head_branch = head_branch.asInstanceOf[js.Any], head_sha = head_sha.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], pull_requests = pull_requests.asInstanceOf[js.Any], run_attempt = run_attempt.asInstanceOf[js.Any], run_number = run_number.asInstanceOf[js.Any], run_started_at = run_started_at.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], workflow_id = workflow_id.asInstanceOf[js.Any], actor = null, conclusion = null, triggering_actor = null)
    __obj.asInstanceOf[Checksuitenodeid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Checksuitenodeid] (val x: Self) extends AnyVal {
    
    inline def setActor(value: Deleted): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
    
    inline def setActorNull: Self = StObject.set(x, "actor", null)
    
    inline def setArtifacts_url(value: String): Self = StObject.set(x, "artifacts_url", value.asInstanceOf[js.Any])
    
    inline def setArtifacts_urlUndefined: Self = StObject.set(x, "artifacts_url", js.undefined)
    
    inline def setCancel_url(value: String): Self = StObject.set(x, "cancel_url", value.asInstanceOf[js.Any])
    
    inline def setCancel_urlUndefined: Self = StObject.set(x, "cancel_url", js.undefined)
    
    inline def setCheck_suite_id(value: Double): Self = StObject.set(x, "check_suite_id", value.asInstanceOf[js.Any])
    
    inline def setCheck_suite_node_id(value: String): Self = StObject.set(x, "check_suite_node_id", value.asInstanceOf[js.Any])
    
    inline def setCheck_suite_url(value: String): Self = StObject.set(x, "check_suite_url", value.asInstanceOf[js.Any])
    
    inline def setCheck_suite_urlUndefined: Self = StObject.set(x, "check_suite_url", js.undefined)
    
    inline def setConclusion(
      value: success | failure | neutral | cancelled | timed_out | action_required | stale | _empty | startup_failure
    ): Self = StObject.set(x, "conclusion", value.asInstanceOf[js.Any])
    
    inline def setConclusionNull: Self = StObject.set(x, "conclusion", null)
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setDisplay_title(value: String): Self = StObject.set(x, "display_title", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setHead_branch(value: String): Self = StObject.set(x, "head_branch", value.asInstanceOf[js.Any])
    
    inline def setHead_commit(value: Record[String, Any]): Self = StObject.set(x, "head_commit", value.asInstanceOf[js.Any])
    
    inline def setHead_commitNull: Self = StObject.set(x, "head_commit", null)
    
    inline def setHead_commitUndefined: Self = StObject.set(x, "head_commit", js.undefined)
    
    inline def setHead_repository(value: Deploymentsurl): Self = StObject.set(x, "head_repository", value.asInstanceOf[js.Any])
    
    inline def setHead_repositoryUndefined: Self = StObject.set(x, "head_repository", js.undefined)
    
    inline def setHead_sha(value: String): Self = StObject.set(x, "head_sha", value.asInstanceOf[js.Any])
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setJobs_url(value: String): Self = StObject.set(x, "jobs_url", value.asInstanceOf[js.Any])
    
    inline def setJobs_urlUndefined: Self = StObject.set(x, "jobs_url", js.undefined)
    
    inline def setLogs_url(value: String): Self = StObject.set(x, "logs_url", value.asInstanceOf[js.Any])
    
    inline def setLogs_urlUndefined: Self = StObject.set(x, "logs_url", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPrevious_attempt_url(value: Record[String, Any]): Self = StObject.set(x, "previous_attempt_url", value.asInstanceOf[js.Any])
    
    inline def setPrevious_attempt_urlNull: Self = StObject.set(x, "previous_attempt_url", null)
    
    inline def setPrevious_attempt_urlUndefined: Self = StObject.set(x, "previous_attempt_url", js.undefined)
    
    inline def setPull_requests(value: js.Array[NumberUrl]): Self = StObject.set(x, "pull_requests", value.asInstanceOf[js.Any])
    
    inline def setPull_requestsVarargs(value: NumberUrl*): Self = StObject.set(x, "pull_requests", js.Array(value*))
    
    inline def setReferenced_workflows(value: js.Array[PathRefSha]): Self = StObject.set(x, "referenced_workflows", value.asInstanceOf[js.Any])
    
    inline def setReferenced_workflowsNull: Self = StObject.set(x, "referenced_workflows", null)
    
    inline def setReferenced_workflowsUndefined: Self = StObject.set(x, "referenced_workflows", js.undefined)
    
    inline def setReferenced_workflowsVarargs(value: PathRefSha*): Self = StObject.set(x, "referenced_workflows", js.Array(value*))
    
    inline def setRepository(value: Deploymentsurl): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
    
    inline def setRerun_url(value: String): Self = StObject.set(x, "rerun_url", value.asInstanceOf[js.Any])
    
    inline def setRerun_urlUndefined: Self = StObject.set(x, "rerun_url", js.undefined)
    
    inline def setRun_attempt(value: Double): Self = StObject.set(x, "run_attempt", value.asInstanceOf[js.Any])
    
    inline def setRun_number(value: Double): Self = StObject.set(x, "run_number", value.asInstanceOf[js.Any])
    
    inline def setRun_started_at(value: String): Self = StObject.set(x, "run_started_at", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: requested | in_progress | completed | queued_ | waiting | pending): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTriggering_actor(value: Deleted): Self = StObject.set(x, "triggering_actor", value.asInstanceOf[js.Any])
    
    inline def setTriggering_actorNull: Self = StObject.set(x, "triggering_actor", null)
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setWorkflow_id(value: Double): Self = StObject.set(x, "workflow_id", value.asInstanceOf[js.Any])
    
    inline def setWorkflow_url(value: String): Self = StObject.set(x, "workflow_url", value.asInstanceOf[js.Any])
    
    inline def setWorkflow_urlUndefined: Self = StObject.set(x, "workflow_url", js.undefined)
  }
}
