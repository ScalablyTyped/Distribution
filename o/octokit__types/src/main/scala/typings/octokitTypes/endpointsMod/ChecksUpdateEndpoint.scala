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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  owner :string,   repo :string,   check_run_id :number,   name :string | undefined,   details_url :string | undefined,   external_id :string | undefined,   started_at :string | undefined,   status :'queued' | 'in_progress' | 'completed' | undefined,   conclusion :'success' | 'failure' | 'neutral' | 'cancelled' | 'skipped' | 'timed_out' | 'action_required' | undefined,   completed_at :string | undefined,   output :@octokit/types.@octokit/types/dist-types/generated/Endpoints.ChecksUpdateParamsOutput | undefined,   actions :std.Array<@octokit/types.@octokit/types/dist-types/generated/Endpoints.ChecksUpdateParamsActions> | undefined} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'antiope'> */
@js.native
trait ChecksUpdateEndpoint extends js.Object {
  
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
  implicit class ChecksUpdateEndpointOps[Self <: ChecksUpdateEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCheck_run_id(value: Double): Self = this.set("check_run_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaType(value: `2`): Self = this.set("mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = this.set("repo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsVarargs(value: ChecksUpdateParamsActions*): Self = this.set("actions", js.Array(value :_*))
    
    @scala.inline
    def setActions(value: js.Array[ChecksUpdateParamsActions]): Self = this.set("actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActions: Self = this.set("actions", js.undefined)
    
    @scala.inline
    def setCompleted_at(value: String): Self = this.set("completed_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompleted_at: Self = this.set("completed_at", js.undefined)
    
    @scala.inline
    def setConclusion(value: success | failure | neutral | cancelled | skipped | timed_out | action_required): Self = this.set("conclusion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConclusion: Self = this.set("conclusion", js.undefined)
    
    @scala.inline
    def setDetails_url(value: String): Self = this.set("details_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetails_url: Self = this.set("details_url", js.undefined)
    
    @scala.inline
    def setExternal_id(value: String): Self = this.set("external_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternal_id: Self = this.set("external_id", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOutput(value: ChecksUpdateParamsOutput): Self = this.set("output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutput: Self = this.set("output", js.undefined)
    
    @scala.inline
    def setStarted_at(value: String): Self = this.set("started_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStarted_at: Self = this.set("started_at", js.undefined)
    
    @scala.inline
    def setStatus(value: queued | in_progress | completed): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
