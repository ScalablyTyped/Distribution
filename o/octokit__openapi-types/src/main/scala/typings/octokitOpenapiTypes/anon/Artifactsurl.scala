package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Artifactsurl extends StObject {
  
  var actor: js.UndefOr[Avatarurl] = js.undefined
  
  /**
    * @description The URL to the artifacts for the workflow run.
    * @example https://api.github.com/repos/github/hello-world/actions/runs/5/rerun/artifacts
    */
  var artifacts_url: String
  
  /**
    * @description The URL to cancel the workflow run.
    * @example https://api.github.com/repos/github/hello-world/actions/runs/5/cancel
    */
  var cancel_url: String
  
  /**
    * @description The ID of the associated check suite.
    * @example 42
    */
  var check_suite_id: js.UndefOr[Double] = js.undefined
  
  /**
    * @description The node ID of the associated check suite.
    * @example MDEwOkNoZWNrU3VpdGU0Mg==
    */
  var check_suite_node_id: js.UndefOr[String] = js.undefined
  
  /**
    * @description The URL to the associated check suite.
    * @example https://api.github.com/repos/github/hello-world/check-suites/12
    */
  var check_suite_url: String
  
  /** @example neutral */
  var conclusion: String | Null
  
  /** Format: date-time */
  var created_at: String
  
  /**
    * @description The event-specific title associated with the run or the run-name if set, or the value of `run-name` if it is set in the workflow.
    * @example Simple Workflow
    */
  var display_title: String
  
  /** @example push */
  var event: String
  
  /** @example master */
  var head_branch: String | Null
  
  var head_commit: Timestamp | Null
  
  var head_repository: Branchesurl
  
  /** @example 5 */
  var head_repository_id: js.UndefOr[Double] = js.undefined
  
  /**
    * @description The SHA of the head commit that points to the version of the workflow being run.
    * @example 009b8a3a9ccbb128af87f9b1c0f4c62e8a304f6d
    */
  var head_sha: String
  
  /** @example https://github.com/github/hello-world/suites/4 */
  var html_url: String
  
  /**
    * @description The ID of the workflow run.
    * @example 5
    */
  var id: Double
  
  /**
    * @description The URL to the jobs for the workflow run.
    * @example https://api.github.com/repos/github/hello-world/actions/runs/5/jobs
    */
  var jobs_url: String
  
  /**
    * @description The URL to download the logs for the workflow run.
    * @example https://api.github.com/repos/github/hello-world/actions/runs/5/logs
    */
  var logs_url: String
  
  /**
    * @description The name of the workflow run.
    * @example Build
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /** @example MDEwOkNoZWNrU3VpdGU1 */
  var node_id: String
  
  /**
    * @description The full path of the workflow
    * @example octocat/octo-repo/.github/workflows/ci.yml@main
    */
  var path: String
  
  /**
    * @description The URL to the previous attempted run of this workflow, if one exists.
    * @example https://api.github.com/repos/github/hello-world/actions/runs/5/attempts/3
    */
  var previous_attempt_url: js.UndefOr[String | Null] = js.undefined
  
  var pull_requests: js.Array[HeadId] | Null
  
  var referenced_workflows: js.UndefOr[js.Array[PathRef] | Null] = js.undefined
  
  var repository: Branchesurl
  
  /**
    * @description The URL to rerun the workflow run.
    * @example https://api.github.com/repos/github/hello-world/actions/runs/5/rerun
    */
  var rerun_url: String
  
  /**
    * @description Attempt number of the run, 1 for first attempt and higher if the workflow was re-run.
    * @example 1
    */
  var run_attempt: js.UndefOr[Double] = js.undefined
  
  /**
    * @description The auto incrementing run number for the workflow run.
    * @example 106
    */
  var run_number: Double
  
  /**
    * Format: date-time
    * @description The start time of the latest run. Resets on re-run.
    */
  var run_started_at: js.UndefOr[String] = js.undefined
  
  /** @example completed */
  var status: String | Null
  
  var triggering_actor: js.UndefOr[Avatarurl] = js.undefined
  
  /** Format: date-time */
  var updated_at: String
  
  /**
    * @description The URL to the workflow run.
    * @example https://api.github.com/repos/github/hello-world/actions/runs/5
    */
  var url: String
  
  /**
    * @description The ID of the parent workflow.
    * @example 5
    */
  var workflow_id: Double
  
  /**
    * @description The URL to the workflow.
    * @example https://api.github.com/repos/github/hello-world/actions/workflows/main.yaml
    */
  var workflow_url: String
}
object Artifactsurl {
  
  inline def apply(
    artifacts_url: String,
    cancel_url: String,
    check_suite_url: String,
    created_at: String,
    display_title: String,
    event: String,
    head_repository: Branchesurl,
    head_sha: String,
    html_url: String,
    id: Double,
    jobs_url: String,
    logs_url: String,
    node_id: String,
    path: String,
    repository: Branchesurl,
    rerun_url: String,
    run_number: Double,
    updated_at: String,
    url: String,
    workflow_id: Double,
    workflow_url: String
  ): Artifactsurl = {
    val __obj = js.Dynamic.literal(artifacts_url = artifacts_url.asInstanceOf[js.Any], cancel_url = cancel_url.asInstanceOf[js.Any], check_suite_url = check_suite_url.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], display_title = display_title.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], head_repository = head_repository.asInstanceOf[js.Any], head_sha = head_sha.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], jobs_url = jobs_url.asInstanceOf[js.Any], logs_url = logs_url.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], rerun_url = rerun_url.asInstanceOf[js.Any], run_number = run_number.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], workflow_id = workflow_id.asInstanceOf[js.Any], workflow_url = workflow_url.asInstanceOf[js.Any], conclusion = null, head_branch = null, head_commit = null, pull_requests = null, status = null)
    __obj.asInstanceOf[Artifactsurl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Artifactsurl] (val x: Self) extends AnyVal {
    
    inline def setActor(value: Avatarurl): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
    
    inline def setActorUndefined: Self = StObject.set(x, "actor", js.undefined)
    
    inline def setArtifacts_url(value: String): Self = StObject.set(x, "artifacts_url", value.asInstanceOf[js.Any])
    
    inline def setCancel_url(value: String): Self = StObject.set(x, "cancel_url", value.asInstanceOf[js.Any])
    
    inline def setCheck_suite_id(value: Double): Self = StObject.set(x, "check_suite_id", value.asInstanceOf[js.Any])
    
    inline def setCheck_suite_idUndefined: Self = StObject.set(x, "check_suite_id", js.undefined)
    
    inline def setCheck_suite_node_id(value: String): Self = StObject.set(x, "check_suite_node_id", value.asInstanceOf[js.Any])
    
    inline def setCheck_suite_node_idUndefined: Self = StObject.set(x, "check_suite_node_id", js.undefined)
    
    inline def setCheck_suite_url(value: String): Self = StObject.set(x, "check_suite_url", value.asInstanceOf[js.Any])
    
    inline def setConclusion(value: String): Self = StObject.set(x, "conclusion", value.asInstanceOf[js.Any])
    
    inline def setConclusionNull: Self = StObject.set(x, "conclusion", null)
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setDisplay_title(value: String): Self = StObject.set(x, "display_title", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setHead_branch(value: String): Self = StObject.set(x, "head_branch", value.asInstanceOf[js.Any])
    
    inline def setHead_branchNull: Self = StObject.set(x, "head_branch", null)
    
    inline def setHead_commit(value: Timestamp): Self = StObject.set(x, "head_commit", value.asInstanceOf[js.Any])
    
    inline def setHead_commitNull: Self = StObject.set(x, "head_commit", null)
    
    inline def setHead_repository(value: Branchesurl): Self = StObject.set(x, "head_repository", value.asInstanceOf[js.Any])
    
    inline def setHead_repository_id(value: Double): Self = StObject.set(x, "head_repository_id", value.asInstanceOf[js.Any])
    
    inline def setHead_repository_idUndefined: Self = StObject.set(x, "head_repository_id", js.undefined)
    
    inline def setHead_sha(value: String): Self = StObject.set(x, "head_sha", value.asInstanceOf[js.Any])
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setJobs_url(value: String): Self = StObject.set(x, "jobs_url", value.asInstanceOf[js.Any])
    
    inline def setLogs_url(value: String): Self = StObject.set(x, "logs_url", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPrevious_attempt_url(value: String): Self = StObject.set(x, "previous_attempt_url", value.asInstanceOf[js.Any])
    
    inline def setPrevious_attempt_urlNull: Self = StObject.set(x, "previous_attempt_url", null)
    
    inline def setPrevious_attempt_urlUndefined: Self = StObject.set(x, "previous_attempt_url", js.undefined)
    
    inline def setPull_requests(value: js.Array[HeadId]): Self = StObject.set(x, "pull_requests", value.asInstanceOf[js.Any])
    
    inline def setPull_requestsNull: Self = StObject.set(x, "pull_requests", null)
    
    inline def setPull_requestsVarargs(value: HeadId*): Self = StObject.set(x, "pull_requests", js.Array(value*))
    
    inline def setReferenced_workflows(value: js.Array[PathRef]): Self = StObject.set(x, "referenced_workflows", value.asInstanceOf[js.Any])
    
    inline def setReferenced_workflowsNull: Self = StObject.set(x, "referenced_workflows", null)
    
    inline def setReferenced_workflowsUndefined: Self = StObject.set(x, "referenced_workflows", js.undefined)
    
    inline def setReferenced_workflowsVarargs(value: PathRef*): Self = StObject.set(x, "referenced_workflows", js.Array(value*))
    
    inline def setRepository(value: Branchesurl): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setRerun_url(value: String): Self = StObject.set(x, "rerun_url", value.asInstanceOf[js.Any])
    
    inline def setRun_attempt(value: Double): Self = StObject.set(x, "run_attempt", value.asInstanceOf[js.Any])
    
    inline def setRun_attemptUndefined: Self = StObject.set(x, "run_attempt", js.undefined)
    
    inline def setRun_number(value: Double): Self = StObject.set(x, "run_number", value.asInstanceOf[js.Any])
    
    inline def setRun_started_at(value: String): Self = StObject.set(x, "run_started_at", value.asInstanceOf[js.Any])
    
    inline def setRun_started_atUndefined: Self = StObject.set(x, "run_started_at", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setTriggering_actor(value: Avatarurl): Self = StObject.set(x, "triggering_actor", value.asInstanceOf[js.Any])
    
    inline def setTriggering_actorUndefined: Self = StObject.set(x, "triggering_actor", js.undefined)
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setWorkflow_id(value: Double): Self = StObject.set(x, "workflow_id", value.asInstanceOf[js.Any])
    
    inline def setWorkflow_url(value: String): Self = StObject.set(x, "workflow_url", value.asInstanceOf[js.Any])
  }
}
