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
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.skipped
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.stale
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.startup_failure
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.success
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.timed_out
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.waiting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Displaytitle extends StObject {
  
  /** User */
  var actor: Deleted | Null
  
  /** Format: uri */
  var artifacts_url: String
  
  /** Format: uri */
  var cancel_url: String
  
  var check_suite_id: Double
  
  var check_suite_node_id: String
  
  /** Format: uri */
  var check_suite_url: String
  
  /** @enum {string|null} */
  var conclusion: success | failure | neutral | cancelled | timed_out | action_required | stale | _empty | skipped | startup_failure | Null
  
  /** Format: date-time */
  var created_at: String
  
  var display_title: String
  
  var event: String
  
  var head_branch: String | Null
  
  /** SimpleCommit */
  var head_commit: Treeid
  
  /** Repository Lite */
  var head_repository: Forksurl
  
  var head_sha: String
  
  /** Format: uri */
  var html_url: String
  
  var id: Double
  
  /** Format: uri */
  var jobs_url: String
  
  /** Format: uri */
  var logs_url: String
  
  var name: String | Null
  
  var node_id: String
  
  var path: String
  
  /** Format: uri */
  var previous_attempt_url: String | Null
  
  var pull_requests: js.Array[NumberUrl]
  
  var referenced_workflows: js.UndefOr[js.Array[PathRefSha] | Null] = js.undefined
  
  /** Repository Lite */
  var repository: Forksurl
  
  /** Format: uri */
  var rerun_url: String
  
  var run_attempt: Double
  
  var run_number: Double
  
  /** Format: date-time */
  var run_started_at: String
  
  /** @enum {string} */
  var status: requested | in_progress | completed | queued_ | pending | waiting
  
  /** User */
  var triggering_actor: Deleted | Null
  
  /** Format: date-time */
  var updated_at: String
  
  /** Format: uri */
  var url: String
  
  var workflow_id: Double
  
  /** Format: uri */
  var workflow_url: String
}
object Displaytitle {
  
  inline def apply(
    artifacts_url: String,
    cancel_url: String,
    check_suite_id: Double,
    check_suite_node_id: String,
    check_suite_url: String,
    created_at: String,
    display_title: String,
    event: String,
    head_commit: Treeid,
    head_repository: Forksurl,
    head_sha: String,
    html_url: String,
    id: Double,
    jobs_url: String,
    logs_url: String,
    node_id: String,
    path: String,
    pull_requests: js.Array[NumberUrl],
    repository: Forksurl,
    rerun_url: String,
    run_attempt: Double,
    run_number: Double,
    run_started_at: String,
    status: requested | in_progress | completed | queued_ | pending | waiting,
    updated_at: String,
    url: String,
    workflow_id: Double,
    workflow_url: String
  ): Displaytitle = {
    val __obj = js.Dynamic.literal(artifacts_url = artifacts_url.asInstanceOf[js.Any], cancel_url = cancel_url.asInstanceOf[js.Any], check_suite_id = check_suite_id.asInstanceOf[js.Any], check_suite_node_id = check_suite_node_id.asInstanceOf[js.Any], check_suite_url = check_suite_url.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], display_title = display_title.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], head_commit = head_commit.asInstanceOf[js.Any], head_repository = head_repository.asInstanceOf[js.Any], head_sha = head_sha.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], jobs_url = jobs_url.asInstanceOf[js.Any], logs_url = logs_url.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], pull_requests = pull_requests.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], rerun_url = rerun_url.asInstanceOf[js.Any], run_attempt = run_attempt.asInstanceOf[js.Any], run_number = run_number.asInstanceOf[js.Any], run_started_at = run_started_at.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], workflow_id = workflow_id.asInstanceOf[js.Any], workflow_url = workflow_url.asInstanceOf[js.Any], actor = null, conclusion = null, head_branch = null, name = null, previous_attempt_url = null, triggering_actor = null)
    __obj.asInstanceOf[Displaytitle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Displaytitle] (val x: Self) extends AnyVal {
    
    inline def setActor(value: Deleted): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
    
    inline def setActorNull: Self = StObject.set(x, "actor", null)
    
    inline def setArtifacts_url(value: String): Self = StObject.set(x, "artifacts_url", value.asInstanceOf[js.Any])
    
    inline def setCancel_url(value: String): Self = StObject.set(x, "cancel_url", value.asInstanceOf[js.Any])
    
    inline def setCheck_suite_id(value: Double): Self = StObject.set(x, "check_suite_id", value.asInstanceOf[js.Any])
    
    inline def setCheck_suite_node_id(value: String): Self = StObject.set(x, "check_suite_node_id", value.asInstanceOf[js.Any])
    
    inline def setCheck_suite_url(value: String): Self = StObject.set(x, "check_suite_url", value.asInstanceOf[js.Any])
    
    inline def setConclusion(
      value: success | failure | neutral | cancelled | timed_out | action_required | stale | _empty | skipped | startup_failure
    ): Self = StObject.set(x, "conclusion", value.asInstanceOf[js.Any])
    
    inline def setConclusionNull: Self = StObject.set(x, "conclusion", null)
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setDisplay_title(value: String): Self = StObject.set(x, "display_title", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setHead_branch(value: String): Self = StObject.set(x, "head_branch", value.asInstanceOf[js.Any])
    
    inline def setHead_branchNull: Self = StObject.set(x, "head_branch", null)
    
    inline def setHead_commit(value: Treeid): Self = StObject.set(x, "head_commit", value.asInstanceOf[js.Any])
    
    inline def setHead_repository(value: Forksurl): Self = StObject.set(x, "head_repository", value.asInstanceOf[js.Any])
    
    inline def setHead_sha(value: String): Self = StObject.set(x, "head_sha", value.asInstanceOf[js.Any])
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setJobs_url(value: String): Self = StObject.set(x, "jobs_url", value.asInstanceOf[js.Any])
    
    inline def setLogs_url(value: String): Self = StObject.set(x, "logs_url", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPrevious_attempt_url(value: String): Self = StObject.set(x, "previous_attempt_url", value.asInstanceOf[js.Any])
    
    inline def setPrevious_attempt_urlNull: Self = StObject.set(x, "previous_attempt_url", null)
    
    inline def setPull_requests(value: js.Array[NumberUrl]): Self = StObject.set(x, "pull_requests", value.asInstanceOf[js.Any])
    
    inline def setPull_requestsVarargs(value: NumberUrl*): Self = StObject.set(x, "pull_requests", js.Array(value*))
    
    inline def setReferenced_workflows(value: js.Array[PathRefSha]): Self = StObject.set(x, "referenced_workflows", value.asInstanceOf[js.Any])
    
    inline def setReferenced_workflowsNull: Self = StObject.set(x, "referenced_workflows", null)
    
    inline def setReferenced_workflowsUndefined: Self = StObject.set(x, "referenced_workflows", js.undefined)
    
    inline def setReferenced_workflowsVarargs(value: PathRefSha*): Self = StObject.set(x, "referenced_workflows", js.Array(value*))
    
    inline def setRepository(value: Forksurl): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setRerun_url(value: String): Self = StObject.set(x, "rerun_url", value.asInstanceOf[js.Any])
    
    inline def setRun_attempt(value: Double): Self = StObject.set(x, "run_attempt", value.asInstanceOf[js.Any])
    
    inline def setRun_number(value: Double): Self = StObject.set(x, "run_number", value.asInstanceOf[js.Any])
    
    inline def setRun_started_at(value: String): Self = StObject.set(x, "run_started_at", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: requested | in_progress | completed | queued_ | pending | waiting): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTriggering_actor(value: Deleted): Self = StObject.set(x, "triggering_actor", value.asInstanceOf[js.Any])
    
    inline def setTriggering_actorNull: Self = StObject.set(x, "triggering_actor", null)
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setWorkflow_id(value: Double): Self = StObject.set(x, "workflow_id", value.asInstanceOf[js.Any])
    
    inline def setWorkflow_url(value: String): Self = StObject.set(x, "workflow_url", value.asInstanceOf[js.Any])
  }
}
