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

trait Checkrunsurl extends StObject {
  
  /** @example d6fde92930d4715a2b49857d24b940956b26d2d3 */
  var after: String | Null
  
  var app: Externalurl | Null
  
  /** @example 146e867f55c26428e5f9fade55a9bbf5e95a7912 */
  var before: String | Null
  
  var check_runs_url: String
  
  /**
    * @example neutral
    * @enum {string|null}
    */
  var conclusion: success | failure | neutral | cancelled | skipped | timed_out | action_required | Null
  
  /** Format: date-time */
  var created_at: String | Null
  
  /** @example master */
  var head_branch: String | Null
  
  var head_commit: Timestamp
  
  /**
    * @description The SHA of the head commit that is being checked.
    * @example 009b8a3a9ccbb128af87f9b1c0f4c62e8a304f6d
    */
  var head_sha: String
  
  /** @example 5 */
  var id: Double
  
  var latest_check_runs_count: Double
  
  /** @example MDEwOkNoZWNrU3VpdGU1 */
  var node_id: String
  
  var pull_requests: js.Array[HeadId] | Null
  
  var repository: Branchesurl
  
  var rerequestable: js.UndefOr[Boolean] = js.undefined
  
  var runs_rerequestable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @example completed
    * @enum {string|null}
    */
  var status: queued_ | in_progress | completed | Null
  
  /** Format: date-time */
  var updated_at: String | Null
  
  /** @example https://api.github.com/repos/github/hello-world/check-suites/5 */
  var url: String | Null
}
object Checkrunsurl {
  
  inline def apply(
    check_runs_url: String,
    head_commit: Timestamp,
    head_sha: String,
    id: Double,
    latest_check_runs_count: Double,
    node_id: String,
    repository: Branchesurl
  ): Checkrunsurl = {
    val __obj = js.Dynamic.literal(check_runs_url = check_runs_url.asInstanceOf[js.Any], head_commit = head_commit.asInstanceOf[js.Any], head_sha = head_sha.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], latest_check_runs_count = latest_check_runs_count.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], after = null, app = null, before = null, conclusion = null, created_at = null, head_branch = null, pull_requests = null, status = null, updated_at = null, url = null)
    __obj.asInstanceOf[Checkrunsurl]
  }
  
  extension [Self <: Checkrunsurl](x: Self) {
    
    inline def setAfter(value: String): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
    
    inline def setAfterNull: Self = StObject.set(x, "after", null)
    
    inline def setApp(value: Externalurl): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    
    inline def setAppNull: Self = StObject.set(x, "app", null)
    
    inline def setBefore(value: String): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    
    inline def setBeforeNull: Self = StObject.set(x, "before", null)
    
    inline def setCheck_runs_url(value: String): Self = StObject.set(x, "check_runs_url", value.asInstanceOf[js.Any])
    
    inline def setConclusion(value: success | failure | neutral | cancelled | skipped | timed_out | action_required): Self = StObject.set(x, "conclusion", value.asInstanceOf[js.Any])
    
    inline def setConclusionNull: Self = StObject.set(x, "conclusion", null)
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setCreated_atNull: Self = StObject.set(x, "created_at", null)
    
    inline def setHead_branch(value: String): Self = StObject.set(x, "head_branch", value.asInstanceOf[js.Any])
    
    inline def setHead_branchNull: Self = StObject.set(x, "head_branch", null)
    
    inline def setHead_commit(value: Timestamp): Self = StObject.set(x, "head_commit", value.asInstanceOf[js.Any])
    
    inline def setHead_sha(value: String): Self = StObject.set(x, "head_sha", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLatest_check_runs_count(value: Double): Self = StObject.set(x, "latest_check_runs_count", value.asInstanceOf[js.Any])
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setPull_requests(value: js.Array[HeadId]): Self = StObject.set(x, "pull_requests", value.asInstanceOf[js.Any])
    
    inline def setPull_requestsNull: Self = StObject.set(x, "pull_requests", null)
    
    inline def setPull_requestsVarargs(value: HeadId*): Self = StObject.set(x, "pull_requests", js.Array(value*))
    
    inline def setRepository(value: Branchesurl): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setRerequestable(value: Boolean): Self = StObject.set(x, "rerequestable", value.asInstanceOf[js.Any])
    
    inline def setRerequestableUndefined: Self = StObject.set(x, "rerequestable", js.undefined)
    
    inline def setRuns_rerequestable(value: Boolean): Self = StObject.set(x, "runs_rerequestable", value.asInstanceOf[js.Any])
    
    inline def setRuns_rerequestableUndefined: Self = StObject.set(x, "runs_rerequestable", js.undefined)
    
    inline def setStatus(value: queued_ | in_progress | completed): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUpdated_atNull: Self = StObject.set(x, "updated_at", null)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlNull: Self = StObject.set(x, "url", null)
  }
}
