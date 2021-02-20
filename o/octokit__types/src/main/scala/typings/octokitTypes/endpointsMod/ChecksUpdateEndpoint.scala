package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`2`
import typings.octokitTypes.octokitTypesStrings.action_required
import typings.octokitTypes.octokitTypesStrings.cancelled
import typings.octokitTypes.octokitTypesStrings.completed
import typings.octokitTypes.octokitTypesStrings.failure
import typings.octokitTypes.octokitTypesStrings.in_progress
import typings.octokitTypes.octokitTypesStrings.neutral
import typings.octokitTypes.octokitTypesStrings.queued
import typings.octokitTypes.octokitTypesStrings.skipped
import typings.octokitTypes.octokitTypesStrings.success
import typings.octokitTypes.octokitTypesStrings.timed_out
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  owner :string,   repo :string,   check_run_id :number,   name :string | undefined,   details_url :string | undefined,   external_id :string | undefined,   started_at :string | undefined,   status :'queued' | 'in_progress' | 'completed' | undefined,   conclusion :'success' | 'failure' | 'neutral' | 'cancelled' | 'skipped' | 'timed_out' | 'action_required' | undefined,   completed_at :string | undefined,   output :@octokit/types.@octokit/types/dist-types/generated/Endpoints.ChecksUpdateParamsOutput | undefined,   actions :std.Array<@octokit/types.@octokit/types/dist-types/generated/Endpoints.ChecksUpdateParamsActions> | undefined} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'antiope'> */
@js.native
trait ChecksUpdateEndpoint extends StObject {
  
  /**
    * Possible further actions the integrator can perform, which a user may trigger. Each action includes a `label`, `identifier` and `description`. A maximum of three actions are accepted. See the [`actions` object](https://developer.github.com/v3/checks/runs/#actions-object) description. To learn more about check runs and requested actions, see "[Check runs and requested actions](https://developer.github.com/v3/checks/runs/#check-runs-and-requested-actions)."
    */
  var actions: js.UndefOr[js.Array[ChecksUpdateParamsActions]] = js.native
  
  var check_run_id: Double = js.native
  
  /**
    * The time the check completed. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
    */
  var completed_at: js.UndefOr[String] = js.native
  
  /**
    * **Required if you provide `completed_at` or a `status` of `completed`**. The final conclusion of the check. Can be one of `success`, `failure`, `neutral`, `cancelled`, `skipped`, `timed_out`, or `action_required`.
    * **Note:** Providing `conclusion` will automatically set the `status` parameter to `completed`. Only GitHub can change a check run conclusion to `stale`.
    */
  var conclusion: js.UndefOr[success | failure | neutral | cancelled | skipped | timed_out | action_required] = js.native
  
  /**
    * The URL of the integrator's site that has the full details of the check.
    */
  var details_url: js.UndefOr[String] = js.native
  
  /**
    * A reference for the run on the integrator's system.
    */
  var external_id: js.UndefOr[String] = js.native
  
  var mediaType: `2` = js.native
  
  /**
    * The name of the check. For example, "code-coverage".
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Check runs can accept a variety of data in the `output` object, including a `title` and `summary` and can optionally provide descriptive details about the run. See the [`output` object](https://developer.github.com/v3/checks/runs/#output-object-1) description.
    */
  var output: js.UndefOr[ChecksUpdateParamsOutput] = js.native
  
  var owner: String = js.native
  
  var repo: String = js.native
  
  /**
    * This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
    */
  var started_at: js.UndefOr[String] = js.native
  
  /**
    * The current status. Can be one of `queued`, `in_progress`, or `completed`.
    */
  var status: js.UndefOr[queued | in_progress | completed] = js.native
}
object ChecksUpdateEndpoint {
  
  @scala.inline
  def apply(check_run_id: Double, mediaType: `2`, owner: String, repo: String): ChecksUpdateEndpoint = {
    val __obj = js.Dynamic.literal(check_run_id = check_run_id.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChecksUpdateEndpoint]
  }
  
  @scala.inline
  implicit class ChecksUpdateEndpointMutableBuilder[Self <: ChecksUpdateEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActions(value: js.Array[ChecksUpdateParamsActions]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    @scala.inline
    def setActionsVarargs(value: ChecksUpdateParamsActions*): Self = StObject.set(x, "actions", js.Array(value :_*))
    
    @scala.inline
    def setCheck_run_id(value: Double): Self = StObject.set(x, "check_run_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompleted_at(value: String): Self = StObject.set(x, "completed_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompleted_atUndefined: Self = StObject.set(x, "completed_at", js.undefined)
    
    @scala.inline
    def setConclusion(value: success | failure | neutral | cancelled | skipped | timed_out | action_required): Self = StObject.set(x, "conclusion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConclusionUndefined: Self = StObject.set(x, "conclusion", js.undefined)
    
    @scala.inline
    def setDetails_url(value: String): Self = StObject.set(x, "details_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetails_urlUndefined: Self = StObject.set(x, "details_url", js.undefined)
    
    @scala.inline
    def setExternal_id(value: String): Self = StObject.set(x, "external_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternal_idUndefined: Self = StObject.set(x, "external_id", js.undefined)
    
    @scala.inline
    def setMediaType(value: `2`): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOutput(value: ChecksUpdateParamsOutput): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStarted_at(value: String): Self = StObject.set(x, "started_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStarted_atUndefined: Self = StObject.set(x, "started_at", js.undefined)
    
    @scala.inline
    def setStatus(value: queued | in_progress | completed): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
