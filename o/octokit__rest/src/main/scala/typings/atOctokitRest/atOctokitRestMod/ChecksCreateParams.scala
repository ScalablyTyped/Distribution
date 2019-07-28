package typings.atOctokitRest.atOctokitRestMod

import typings.atOctokitRest.atOctokitRestStrings.action_required
import typings.atOctokitRest.atOctokitRestStrings.cancelled
import typings.atOctokitRest.atOctokitRestStrings.completed
import typings.atOctokitRest.atOctokitRestStrings.failure
import typings.atOctokitRest.atOctokitRestStrings.in_progress
import typings.atOctokitRest.atOctokitRestStrings.neutral
import typings.atOctokitRest.atOctokitRestStrings.queued
import typings.atOctokitRest.atOctokitRestStrings.success
import typings.atOctokitRest.atOctokitRestStrings.timed_out
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksCreateParams extends js.Object {
  /**
    * Displays a button on GitHub that can be clicked to alert your app to do additional tasks. For example, a code linting app can display a button that automatically fixes detected errors. The button created in this object is displayed after the check run completes. When a user clicks the button, GitHub sends the [`check_run.requested_action` webhook](https://developer.github.com/v3/activity/events/types/#checkrunevent) to your app. Each action includes a `label`, `identifier` and `description`. A maximum of three actions are accepted. See the [`actions` object](https://developer.github.com/v3/checks/runs/#actions-object) description. To learn more about check runs and requested actions, see "[Check runs and requested actions](https://developer.github.com/v3/checks/runs/#check-runs-and-requested-actions)."
    */
  var actions: js.UndefOr[js.Array[ChecksCreateParamsActions]] = js.undefined
  /**
    * The time the check completed. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
    */
  var completed_at: js.UndefOr[String] = js.undefined
  /**
    * **Required if you provide `completed_at` or a `status` of `completed`**. The final conclusion of the check. Can be one of `success`, `failure`, `neutral`, `cancelled`, `timed_out`, or `action_required`. When the conclusion is `action_required`, additional details should be provided on the site specified by `details_url`.
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
    * The SHA of the commit.
    */
  var head_sha: String
  /**
    * The name of the check. For example, "code-coverage".
    */
  var name: String
  /**
    * Check runs can accept a variety of data in the `output` object, including a `title` and `summary` and can optionally provide descriptive details about the run. See the [`output` object](https://developer.github.com/v3/checks/runs/#output-object) description.
    */
  var output: js.UndefOr[ChecksCreateParamsOutput] = js.undefined
  var owner: String
  var repo: String
  /**
    * The time that the check run began. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
    */
  var started_at: js.UndefOr[String] = js.undefined
  /**
    * The current status. Can be one of `queued`, `in_progress`, or `completed`.
    */
  var status: js.UndefOr[queued | in_progress | completed] = js.undefined
}

object ChecksCreateParams {
  @scala.inline
  def apply(
    head_sha: String,
    name: String,
    owner: String,
    repo: String,
    actions: js.Array[ChecksCreateParamsActions] = null,
    completed_at: String = null,
    conclusion: success | failure | neutral | cancelled | timed_out | action_required = null,
    details_url: String = null,
    external_id: String = null,
    output: ChecksCreateParamsOutput = null,
    started_at: String = null,
    status: queued | in_progress | completed = null
  ): ChecksCreateParams = {
    val __obj = js.Dynamic.literal(head_sha = head_sha, name = name, owner = owner, repo = repo)
    if (actions != null) __obj.updateDynamic("actions")(actions)
    if (completed_at != null) __obj.updateDynamic("completed_at")(completed_at)
    if (conclusion != null) __obj.updateDynamic("conclusion")(conclusion.asInstanceOf[js.Any])
    if (details_url != null) __obj.updateDynamic("details_url")(details_url)
    if (external_id != null) __obj.updateDynamic("external_id")(external_id)
    if (output != null) __obj.updateDynamic("output")(output)
    if (started_at != null) __obj.updateDynamic("started_at")(started_at)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChecksCreateParams]
  }
}

