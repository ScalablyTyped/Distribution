package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.action_required
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.cancelled
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.completed
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.failure
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.in_progress
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.neutral
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.queued_
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.skipped
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.stale
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.success
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.timed_out
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Completedat extends StObject {
  
  /** @description Possible further actions the integrator can perform, which a user may trigger. Each action includes a `label`, `identifier` and `description`. A maximum of three actions are accepted. See the [`actions` object](https://docs.github.com/rest/reference/checks#actions-object) description. To learn more about check runs and requested actions, see "[Check runs and requested actions](https://docs.github.com/rest/reference/checks#check-runs-and-requested-actions)." */
  var actions: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Format: date-time
    * @description The time the check completed. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
    */
  var completed_at: js.UndefOr[String] = js.undefined
  
  /**
    * @description **Required if you provide `completed_at` or a `status` of `completed`**. The final conclusion of the check.
    * **Note:** Providing `conclusion` will automatically set the `status` parameter to `completed`. You cannot change a check run conclusion to `stale`, only GitHub can set this.
    * @enum {string}
    */
  var conclusion: js.UndefOr[
    action_required | cancelled | failure | neutral | success | skipped | stale | timed_out
  ] = js.undefined
  
  /** @description The URL of the integrator's site that has the full details of the check. */
  var details_url: js.UndefOr[String] = js.undefined
  
  /** @description A reference for the run on the integrator's system. */
  var external_id: js.UndefOr[String] = js.undefined
  
  /** @description The name of the check. For example, "code-coverage". */
  var name: js.UndefOr[String] = js.undefined
  
  /** @description Check runs can accept a variety of data in the `output` object, including a `title` and `summary` and can optionally provide descriptive details about the run. See the [`output` object](https://docs.github.com/rest/reference/checks#output-object-1) description. */
  var output: js.UndefOr[Images] = js.undefined
  
  /**
    * Format: date-time
    * @description This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
    */
  var started_at: js.UndefOr[String] = js.undefined
  
  /**
    * @description The current status.
    * @enum {string}
    */
  var status: js.UndefOr[queued_ | in_progress | completed] = js.undefined
}
object Completedat {
  
  inline def apply(): Completedat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Completedat]
  }
  
  extension [Self <: Completedat](x: Self) {
    
    inline def setActions(value: js.Array[Identifier]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    inline def setActionsVarargs(value: Identifier*): Self = StObject.set(x, "actions", js.Array(value*))
    
    inline def setCompleted_at(value: String): Self = StObject.set(x, "completed_at", value.asInstanceOf[js.Any])
    
    inline def setCompleted_atUndefined: Self = StObject.set(x, "completed_at", js.undefined)
    
    inline def setConclusion(value: action_required | cancelled | failure | neutral | success | skipped | stale | timed_out): Self = StObject.set(x, "conclusion", value.asInstanceOf[js.Any])
    
    inline def setConclusionUndefined: Self = StObject.set(x, "conclusion", js.undefined)
    
    inline def setDetails_url(value: String): Self = StObject.set(x, "details_url", value.asInstanceOf[js.Any])
    
    inline def setDetails_urlUndefined: Self = StObject.set(x, "details_url", js.undefined)
    
    inline def setExternal_id(value: String): Self = StObject.set(x, "external_id", value.asInstanceOf[js.Any])
    
    inline def setExternal_idUndefined: Self = StObject.set(x, "external_id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOutput(value: Images): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
    
    inline def setStarted_at(value: String): Self = StObject.set(x, "started_at", value.asInstanceOf[js.Any])
    
    inline def setStarted_atUndefined: Self = StObject.set(x, "started_at", js.undefined)
    
    inline def setStatus(value: queued_ | in_progress | completed): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
