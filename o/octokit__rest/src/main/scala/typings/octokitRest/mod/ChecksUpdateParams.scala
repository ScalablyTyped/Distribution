package typings.octokitRest.mod

import typings.octokitRest.octokitRestStrings.action_required
import typings.octokitRest.octokitRestStrings.cancelled
import typings.octokitRest.octokitRestStrings.completed
import typings.octokitRest.octokitRestStrings.failure
import typings.octokitRest.octokitRestStrings.in_progress
import typings.octokitRest.octokitRestStrings.neutral
import typings.octokitRest.octokitRestStrings.queued
import typings.octokitRest.octokitRestStrings.success
import typings.octokitRest.octokitRestStrings.timed_out
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksUpdateParams extends js.Object {
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
    * **Required if you provide `completed_at` or a `status` of `completed`**. The final conclusion of the check. Can be one of `success`, `failure`, `neutral`, `cancelled`, `timed_out`, or `action_required`.
    * **Note:** Providing `conclusion` will automatically set the `status` parameter to `completed`.
    */
  var conclusion: js.UndefOr[success | failure | neutral | cancelled | timed_out | action_required] = js.undefined
  /**
    * The URL of the integrator's site that has the full details of the check.
    */
  var details_url: js.UndefOr[String] = js.undefined
  /**
    * A reference for the run on the integrator's system.
    */
  var external_id: js.UndefOr[String] = js.undefined
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

object ChecksUpdateParams {
  @scala.inline
  def apply(
    check_run_id: Double,
    owner: String,
    repo: String,
    actions: js.Array[ChecksUpdateParamsActions] = null,
    completed_at: String = null,
    conclusion: success | failure | neutral | cancelled | timed_out | action_required = null,
    details_url: String = null,
    external_id: String = null,
    name: String = null,
    output: ChecksUpdateParamsOutput = null,
    started_at: String = null,
    status: queued | in_progress | completed = null
  ): ChecksUpdateParams = {
    val __obj = js.Dynamic.literal(check_run_id = check_run_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (completed_at != null) __obj.updateDynamic("completed_at")(completed_at.asInstanceOf[js.Any])
    if (conclusion != null) __obj.updateDynamic("conclusion")(conclusion.asInstanceOf[js.Any])
    if (details_url != null) __obj.updateDynamic("details_url")(details_url.asInstanceOf[js.Any])
    if (external_id != null) __obj.updateDynamic("external_id")(external_id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (output != null) __obj.updateDynamic("output")(output.asInstanceOf[js.Any])
    if (started_at != null) __obj.updateDynamic("started_at")(started_at.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChecksUpdateParams]
  }
}

