package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.action_required
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.cancelled
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.completed
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.failure
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.in_progress
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.neutral
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.queued_
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.requested
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.skipped
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.stale
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.success
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.timed_out
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.waiting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActorBranch extends StObject {
  
  /** Returns someone's workflow runs. Use the login for the user who created the `push` associated with the check suite or workflow run. */
  var actor: js.UndefOr[String] = js.undefined
  
  /** Returns workflow runs associated with a branch. Use the name of the branch of the `push`. */
  var branch: js.UndefOr[String] = js.undefined
  
  /** Returns workflow runs with the `check_suite_id` that you specify. */
  var check_suite_id: js.UndefOr[Double] = js.undefined
  
  /** Returns workflow runs created within the given date-time range. For more information on the syntax, see "[Understanding the search syntax](https://docs.github.com/search-github/getting-started-with-searching-on-github/understanding-the-search-syntax#query-for-dates)." */
  var created: js.UndefOr[String] = js.undefined
  
  /** Returns workflow run triggered by the event you specify. For example, `push`, `pull_request` or `issue`. For more information, see "[Events that trigger workflows](https://docs.github.com/en/actions/automating-your-workflow-with-github-actions/events-that-trigger-workflows)." */
  var event: js.UndefOr[String] = js.undefined
  
  /** If `true` pull requests are omitted from the response (empty array). */
  var exclude_pull_requests: js.UndefOr[Boolean] = js.undefined
  
  /** Only returns workflow runs that are associated with the specified `head_sha`. */
  var head_sha: js.UndefOr[String] = js.undefined
  
  /** Page number of the results to fetch. */
  var page: js.UndefOr[Double] = js.undefined
  
  /** The number of results per page (max 100). */
  var per_page: js.UndefOr[Double] = js.undefined
  
  /** Returns workflow runs with the check run `status` or `conclusion` that you specify. For example, a conclusion can be `success` or a status can be `in_progress`. Only GitHub can set a status of `waiting` or `requested`. */
  var status: js.UndefOr[
    completed | action_required | cancelled | failure | neutral | skipped | stale | success | timed_out | in_progress | queued_ | requested | waiting
  ] = js.undefined
}
object ActorBranch {
  
  inline def apply(): ActorBranch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActorBranch]
  }
  
  extension [Self <: ActorBranch](x: Self) {
    
    inline def setActor(value: String): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
    
    inline def setActorUndefined: Self = StObject.set(x, "actor", js.undefined)
    
    inline def setBranch(value: String): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
    
    inline def setBranchUndefined: Self = StObject.set(x, "branch", js.undefined)
    
    inline def setCheck_suite_id(value: Double): Self = StObject.set(x, "check_suite_id", value.asInstanceOf[js.Any])
    
    inline def setCheck_suite_idUndefined: Self = StObject.set(x, "check_suite_id", js.undefined)
    
    inline def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    inline def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setExclude_pull_requests(value: Boolean): Self = StObject.set(x, "exclude_pull_requests", value.asInstanceOf[js.Any])
    
    inline def setExclude_pull_requestsUndefined: Self = StObject.set(x, "exclude_pull_requests", js.undefined)
    
    inline def setHead_sha(value: String): Self = StObject.set(x, "head_sha", value.asInstanceOf[js.Any])
    
    inline def setHead_shaUndefined: Self = StObject.set(x, "head_sha", js.undefined)
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setPer_page(value: Double): Self = StObject.set(x, "per_page", value.asInstanceOf[js.Any])
    
    inline def setPer_pageUndefined: Self = StObject.set(x, "per_page", js.undefined)
    
    inline def setStatus(
      value: completed | action_required | cancelled | failure | neutral | skipped | stale | success | timed_out | in_progress | queued_ | requested | waiting
    ): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
