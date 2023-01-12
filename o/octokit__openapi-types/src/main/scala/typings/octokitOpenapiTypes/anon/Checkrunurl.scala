package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.action_required
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.cancelled
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.completed
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.failure
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.in_progress
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.neutral
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.queued_
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.skipped
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.success
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.timed_out
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Checkrunurl extends StObject {
  
  /** @example https://api.github.com/repos/github/hello-world/check-runs/4 */
  var check_run_url: String
  
  /**
    * Format: date-time
    * @description The time that the job finished, in ISO 8601 format.
    * @example 2019-08-08T08:00:00-07:00
    */
  var completed_at: String | Null
  
  /**
    * @description The outcome of the job.
    * @example success
    * @enum {string|null}
    */
  var conclusion: success | failure | neutral | cancelled | skipped | timed_out | action_required | Null
  
  /**
    * @description The SHA of the commit that is being run.
    * @example 009b8a3a9ccbb128af87f9b1c0f4c62e8a304f6d
    */
  var head_sha: String
  
  /** @example https://github.com/github/hello-world/runs/4 */
  var html_url: String | Null
  
  /**
    * @description The id of the job.
    * @example 21
    */
  var id: Double
  
  /**
    * @description Labels for the workflow job. Specified by the "runs_on" attribute in the action's workflow file.
    * @example [
    *   "self-hosted",
    *   "foo",
    *   "bar"
    * ]
    */
  var labels: js.Array[String]
  
  /**
    * @description The name of the job.
    * @example test-coverage
    */
  var name: String
  
  /** @example MDg6Q2hlY2tSdW40 */
  var node_id: String
  
  /**
    * @description Attempt number of the associated workflow run, 1 for first attempt and higher if the workflow was re-run.
    * @example 1
    */
  var run_attempt: js.UndefOr[Double] = js.undefined
  
  /**
    * @description The id of the associated workflow run.
    * @example 5
    */
  var run_id: Double
  
  /** @example https://api.github.com/repos/github/hello-world/actions/runs/5 */
  var run_url: String
  
  /**
    * @description The ID of the runner group to which this job has been assigned. (If a runner hasn't yet been assigned, this will be null.)
    * @example 2
    */
  var runner_group_id: Double | Null
  
  /**
    * @description The name of the runner group to which this job has been assigned. (If a runner hasn't yet been assigned, this will be null.)
    * @example my runner group
    */
  var runner_group_name: String | Null
  
  /**
    * @description The ID of the runner to which this job has been assigned. (If a runner hasn't yet been assigned, this will be null.)
    * @example 1
    */
  var runner_id: Double | Null
  
  /**
    * @description The name of the runner to which this job has been assigned. (If a runner hasn't yet been assigned, this will be null.)
    * @example my runner
    */
  var runner_name: String | Null
  
  /**
    * Format: date-time
    * @description The time that the job started, in ISO 8601 format.
    * @example 2019-08-08T08:00:00-07:00
    */
  var started_at: String
  
  /**
    * @description The phase of the lifecycle that the job is currently in.
    * @example queued
    * @enum {string}
    */
  var status: queued_ | in_progress | completed
  
  /** @description Steps in this job. */
  var steps: js.UndefOr[js.Array[Startedat]] = js.undefined
  
  /** @example https://api.github.com/repos/github/hello-world/actions/jobs/21 */
  var url: String
}
object Checkrunurl {
  
  inline def apply(
    check_run_url: String,
    head_sha: String,
    id: Double,
    labels: js.Array[String],
    name: String,
    node_id: String,
    run_id: Double,
    run_url: String,
    started_at: String,
    status: queued_ | in_progress | completed,
    url: String
  ): Checkrunurl = {
    val __obj = js.Dynamic.literal(check_run_url = check_run_url.asInstanceOf[js.Any], head_sha = head_sha.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], run_id = run_id.asInstanceOf[js.Any], run_url = run_url.asInstanceOf[js.Any], started_at = started_at.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], completed_at = null, conclusion = null, html_url = null, runner_group_id = null, runner_group_name = null, runner_id = null, runner_name = null)
    __obj.asInstanceOf[Checkrunurl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Checkrunurl] (val x: Self) extends AnyVal {
    
    inline def setCheck_run_url(value: String): Self = StObject.set(x, "check_run_url", value.asInstanceOf[js.Any])
    
    inline def setCompleted_at(value: String): Self = StObject.set(x, "completed_at", value.asInstanceOf[js.Any])
    
    inline def setCompleted_atNull: Self = StObject.set(x, "completed_at", null)
    
    inline def setConclusion(value: success | failure | neutral | cancelled | skipped | timed_out | action_required): Self = StObject.set(x, "conclusion", value.asInstanceOf[js.Any])
    
    inline def setConclusionNull: Self = StObject.set(x, "conclusion", null)
    
    inline def setHead_sha(value: String): Self = StObject.set(x, "head_sha", value.asInstanceOf[js.Any])
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setHtml_urlNull: Self = StObject.set(x, "html_url", null)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabels(value: js.Array[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsVarargs(value: String*): Self = StObject.set(x, "labels", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setRun_attempt(value: Double): Self = StObject.set(x, "run_attempt", value.asInstanceOf[js.Any])
    
    inline def setRun_attemptUndefined: Self = StObject.set(x, "run_attempt", js.undefined)
    
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
    
    inline def setStatus(value: queued_ | in_progress | completed): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setSteps(value: js.Array[Startedat]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    inline def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
    
    inline def setStepsVarargs(value: Startedat*): Self = StObject.set(x, "steps", js.Array(value*))
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
