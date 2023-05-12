package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.action_required
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.cancelled
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.completed
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.failure
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.in_progress
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.neutral
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.pending
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.queued_
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.skipped
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.stale
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.startup_failure
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.success
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.timed_out
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.waiting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Conclusion extends StObject {
  
  /** @example d6fde92930d4715a2b49857d24b940956b26d2d3 */
  var after: js.UndefOr[String | Null] = js.undefined
  
  var app: js.UndefOr[Externalurl] = js.undefined
  
  /** @example 146e867f55c26428e5f9fade55a9bbf5e95a7912 */
  var before: js.UndefOr[String | Null] = js.undefined
  
  /**
    * @example neutral
    * @enum {string|null}
    */
  var conclusion: js.UndefOr[
    success | failure | neutral | cancelled | skipped | timed_out | action_required | stale | startup_failure | Null
  ] = js.undefined
  
  /** Format: date-time */
  var created_at: js.UndefOr[String] = js.undefined
  
  /** @example master */
  var head_branch: js.UndefOr[String | Null] = js.undefined
  
  /**
    * @description The SHA of the head commit that is being checked.
    * @example 009b8a3a9ccbb128af87f9b1c0f4c62e8a304f6d
    */
  var head_sha: js.UndefOr[String] = js.undefined
  
  /** @example 5 */
  var id: js.UndefOr[Double] = js.undefined
  
  /** @example MDEwOkNoZWNrU3VpdGU1 */
  var node_id: js.UndefOr[String] = js.undefined
  
  var pull_requests: js.UndefOr[js.Array[HeadId]] = js.undefined
  
  var repository: js.UndefOr[Branchesurl] = js.undefined
  
  /**
    * @example completed
    * @enum {string}
    */
  var status: js.UndefOr[queued_ | in_progress | completed | pending | waiting] = js.undefined
  
  /** Format: date-time */
  var updated_at: js.UndefOr[String] = js.undefined
  
  /** @example https://api.github.com/repos/github/hello-world/check-suites/5 */
  var url: js.UndefOr[String] = js.undefined
}
object Conclusion {
  
  inline def apply(): Conclusion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Conclusion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Conclusion] (val x: Self) extends AnyVal {
    
    inline def setAfter(value: String): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
    
    inline def setAfterNull: Self = StObject.set(x, "after", null)
    
    inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
    
    inline def setApp(value: Externalurl): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    
    inline def setAppUndefined: Self = StObject.set(x, "app", js.undefined)
    
    inline def setBefore(value: String): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    
    inline def setBeforeNull: Self = StObject.set(x, "before", null)
    
    inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
    
    inline def setConclusion(
      value: success | failure | neutral | cancelled | skipped | timed_out | action_required | stale | startup_failure
    ): Self = StObject.set(x, "conclusion", value.asInstanceOf[js.Any])
    
    inline def setConclusionNull: Self = StObject.set(x, "conclusion", null)
    
    inline def setConclusionUndefined: Self = StObject.set(x, "conclusion", js.undefined)
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setCreated_atUndefined: Self = StObject.set(x, "created_at", js.undefined)
    
    inline def setHead_branch(value: String): Self = StObject.set(x, "head_branch", value.asInstanceOf[js.Any])
    
    inline def setHead_branchNull: Self = StObject.set(x, "head_branch", null)
    
    inline def setHead_branchUndefined: Self = StObject.set(x, "head_branch", js.undefined)
    
    inline def setHead_sha(value: String): Self = StObject.set(x, "head_sha", value.asInstanceOf[js.Any])
    
    inline def setHead_shaUndefined: Self = StObject.set(x, "head_sha", js.undefined)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setNode_idUndefined: Self = StObject.set(x, "node_id", js.undefined)
    
    inline def setPull_requests(value: js.Array[HeadId]): Self = StObject.set(x, "pull_requests", value.asInstanceOf[js.Any])
    
    inline def setPull_requestsUndefined: Self = StObject.set(x, "pull_requests", js.undefined)
    
    inline def setPull_requestsVarargs(value: HeadId*): Self = StObject.set(x, "pull_requests", js.Array(value*))
    
    inline def setRepository(value: Branchesurl): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
    
    inline def setStatus(value: queued_ | in_progress | completed | pending | waiting): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUpdated_atUndefined: Self = StObject.set(x, "updated_at", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
