package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`12`
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
import scala.scalajs.js.annotation._

/* Inlined {  owner  :string,   repo  :string,   check_run_id  :number,   name ? :string,   details_url ? :string,   external_id ? :string,   started_at ? :string,   status ? :'queued' | 'in_progress' | 'completed',   conclusion ? :'success' | 'failure' | 'neutral' | 'cancelled' | 'skipped' | 'timed_out' | 'action_required',   completed_at ? :string,   output ? :@octokit/types.@octokit/types/dist-types/generated/Endpoints.ChecksUpdateParamsOutput,   actions ? :std.Array<@octokit/types.@octokit/types/dist-types/generated/Endpoints.ChecksUpdateParamsActions>} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'antiope'> */
trait ChecksUpdateEndpoint extends js.Object {
  /**
    * Possible further actions the integrator can perform, which a user may trigger. Each action includes a `label`, `identifier` and `description`. A maximum of three actions are accepted. See the [`actions` object](https://developer.github.com/v3/checks/runs/#actions-object) description. To learn more about check runs and requested actions, see "[Check runs and requested actions](https://developer.github.com/v3/checks/runs/#check-runs-and-requested-actions)."
    */
  var actions: js.UndefOr[js.Array[ChecksUpdateParamsActions]] = js.undefined
  var check_run_id: Double
  /**
    * The time the check completed. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
    */
  var completed_at: js.UndefOr[String] = js.undefined
  /**
    * **Required if you provide `completed_at` or a `status` of `completed`**. The final conclusion of the check. Can be one of `success`, `failure`, `neutral`, `cancelled`, `skipped`, `timed_out`, or `action_required`.
    * **Note:** Providing `conclusion` will automatically set the `status` parameter to `completed`. Only GitHub can change a check run conclusion to `stale`.
    */
  var conclusion: js.UndefOr[success | failure | neutral | cancelled | skipped | timed_out | action_required] = js.undefined
  /**
    * The URL of the integrator's site that has the full details of the check.
    */
  var details_url: js.UndefOr[String] = js.undefined
  /**
    * A reference for the run on the integrator's system.
    */
  var external_id: js.UndefOr[String] = js.undefined
  var mediaType: `12`
  /**
    * The name of the check. For example, "code-coverage".
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Check runs can accept a variety of data in the `output` object, including a `title` and `summary` and can optionally provide descriptive details about the run. See the [`output` object](https://developer.github.com/v3/checks/runs/#output-object-1) description.
    */
  var output: js.UndefOr[ChecksUpdateParamsOutput] = js.undefined
  var owner: String
  var repo: String
  /**
    * This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
    */
  var started_at: js.UndefOr[String] = js.undefined
  /**
    * The current status. Can be one of `queued`, `in_progress`, or `completed`.
    */
  var status: js.UndefOr[queued | in_progress | completed] = js.undefined
}

object ChecksUpdateEndpoint {
  @scala.inline
  def apply(
    check_run_id: Double,
    mediaType: `12`,
    owner: String,
    repo: String,
    actions: js.Array[ChecksUpdateParamsActions] = null,
    completed_at: String = null,
    conclusion: success | failure | neutral | cancelled | skipped | timed_out | action_required = null,
    details_url: String = null,
    external_id: String = null,
    name: String = null,
    output: ChecksUpdateParamsOutput = null,
    started_at: String = null,
    status: queued | in_progress | completed = null
  ): ChecksUpdateEndpoint = {
    val __obj = js.Dynamic.literal(check_run_id = check_run_id.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (completed_at != null) __obj.updateDynamic("completed_at")(completed_at.asInstanceOf[js.Any])
    if (conclusion != null) __obj.updateDynamic("conclusion")(conclusion.asInstanceOf[js.Any])
    if (details_url != null) __obj.updateDynamic("details_url")(details_url.asInstanceOf[js.Any])
    if (external_id != null) __obj.updateDynamic("external_id")(external_id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (output != null) __obj.updateDynamic("output")(output.asInstanceOf[js.Any])
    if (started_at != null) __obj.updateDynamic("started_at")(started_at.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChecksUpdateEndpoint]
  }
}

