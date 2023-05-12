package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings._empty
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.action_required
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.cancelled
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.completed
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.failure
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.in_progress
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.neutral
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.queued_
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.requested
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.stale
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.success
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.timed_out
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rerequestable extends StObject {
  
  var after: String | Null
  
  /**
    * App
    * @description GitHub apps are a new way to extend GitHub. They can be installed directly on organizations and user accounts and granted access to specific repositories. They come with granular permissions and built-in webhooks. GitHub apps are first class actors within GitHub.
    */
  var app: EventsExternalurl
  
  var before: String | Null
  
  /** Format: uri */
  var check_runs_url: String
  
  /**
    * @description The summary conclusion for all check runs that are part of the check suite. Can be one of `success`, `failure`,` neutral`, `cancelled`, `timed_out`, `action_required` or `stale`. This value will be `null` until the check run has completed.
    * @enum {string|null}
    */
  var conclusion: success | failure | neutral | cancelled | timed_out | action_required | stale | _empty | Null
  
  /** Format: date-time */
  var created_at: String
  
  /** @description The head branch name the changes are on. */
  var head_branch: String | Null
  
  /** SimpleCommit */
  var head_commit: Treeid
  
  /** @description The SHA of the head commit that is being checked. */
  var head_sha: String
  
  var id: Double
  
  var latest_check_runs_count: Double
  
  var node_id: String
  
  /** @description An array of pull requests that match this check suite. A pull request matches a check suite if they have the same `head_sha` and `head_branch`. When the check suite's `head_branch` is in a forked repository it will be `null` and the `pull_requests` array will be empty. */
  var pull_requests: js.Array[NumberUrl]
  
  var rerequestable: js.UndefOr[Boolean] = js.undefined
  
  var runs_rerequestable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @description The summary status for all check runs that are part of the check suite. Can be `requested`, `in_progress`, or `completed`.
    * @enum {string|null}
    */
  var status: requested | in_progress | completed | queued_ | _empty | Null
  
  /** Format: date-time */
  var updated_at: String
  
  /**
    * Format: uri
    * @description URL that points to the check suite API resource.
    */
  var url: String
}
object Rerequestable {
  
  inline def apply(
    app: EventsExternalurl,
    check_runs_url: String,
    created_at: String,
    head_commit: Treeid,
    head_sha: String,
    id: Double,
    latest_check_runs_count: Double,
    node_id: String,
    pull_requests: js.Array[NumberUrl],
    updated_at: String,
    url: String
  ): Rerequestable = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], check_runs_url = check_runs_url.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], head_commit = head_commit.asInstanceOf[js.Any], head_sha = head_sha.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], latest_check_runs_count = latest_check_runs_count.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], pull_requests = pull_requests.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], after = null, before = null, conclusion = null, head_branch = null, status = null)
    __obj.asInstanceOf[Rerequestable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Rerequestable] (val x: Self) extends AnyVal {
    
    inline def setAfter(value: String): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
    
    inline def setAfterNull: Self = StObject.set(x, "after", null)
    
    inline def setApp(value: EventsExternalurl): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    
    inline def setBefore(value: String): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    
    inline def setBeforeNull: Self = StObject.set(x, "before", null)
    
    inline def setCheck_runs_url(value: String): Self = StObject.set(x, "check_runs_url", value.asInstanceOf[js.Any])
    
    inline def setConclusion(value: success | failure | neutral | cancelled | timed_out | action_required | stale | _empty): Self = StObject.set(x, "conclusion", value.asInstanceOf[js.Any])
    
    inline def setConclusionNull: Self = StObject.set(x, "conclusion", null)
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setHead_branch(value: String): Self = StObject.set(x, "head_branch", value.asInstanceOf[js.Any])
    
    inline def setHead_branchNull: Self = StObject.set(x, "head_branch", null)
    
    inline def setHead_commit(value: Treeid): Self = StObject.set(x, "head_commit", value.asInstanceOf[js.Any])
    
    inline def setHead_sha(value: String): Self = StObject.set(x, "head_sha", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLatest_check_runs_count(value: Double): Self = StObject.set(x, "latest_check_runs_count", value.asInstanceOf[js.Any])
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setPull_requests(value: js.Array[NumberUrl]): Self = StObject.set(x, "pull_requests", value.asInstanceOf[js.Any])
    
    inline def setPull_requestsVarargs(value: NumberUrl*): Self = StObject.set(x, "pull_requests", js.Array(value*))
    
    inline def setRerequestable(value: Boolean): Self = StObject.set(x, "rerequestable", value.asInstanceOf[js.Any])
    
    inline def setRerequestableUndefined: Self = StObject.set(x, "rerequestable", js.undefined)
    
    inline def setRuns_rerequestable(value: Boolean): Self = StObject.set(x, "runs_rerequestable", value.asInstanceOf[js.Any])
    
    inline def setRuns_rerequestableUndefined: Self = StObject.set(x, "runs_rerequestable", js.undefined)
    
    inline def setStatus(value: requested | in_progress | completed | queued_ | _empty): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
