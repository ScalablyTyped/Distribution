package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksCreateParams extends js.Object {
  /**
    * Displays a button on GitHub that can be clicked to alert your app to do additional tasks. For example, a code linting app can display a button that automatically fixes detected errors. The button created in this object is displayed after the check run completes. When a user clicks the button, GitHub sends the [`check_run.requested_action` webhook](https://developer.github.com/v3/activity/events/types/#checkrunevent) to your app. Each action includes a `label`, `identifier` and `description`. A maximum of three actions are accepted. See the [`actions` object](https://developer.github.com/v3/checks/runs/#actions-object) description.
    */
  var actions: js.UndefOr[js.Array[ChecksCreateParamsActions]] = js.undefined
  /**
    * **Required if you provide `conclusion`**. The time the check completed. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
    */
  var completed_at: js.UndefOr[java.lang.String] = js.undefined
  /**
    * **Required if you provide `completed_at` or a `status` of `completed`**. The final conclusion of the check. Can be one of `success`, `failure`, `neutral`, `cancelled`, `timed_out`, or `action_required`. When the conclusion is `action_required`, additional details should be provided on the site specified by `details_url`.
    * **Note:** Providing `conclusion` will automatically set the `status` parameter to `completed`.
    */
  var conclusion: js.UndefOr[
    atOctokitRestLib.atOctokitRestLibStrings.success | atOctokitRestLib.atOctokitRestLibStrings.failure | atOctokitRestLib.atOctokitRestLibStrings.neutral | atOctokitRestLib.atOctokitRestLibStrings.cancelled | atOctokitRestLib.atOctokitRestLibStrings.timed_out | atOctokitRestLib.atOctokitRestLibStrings.action_required
  ] = js.undefined
  /**
    * The URL of the integrator's site that has the full details of the check.
    */
  var details_url: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A reference for the run on the integrator's system.
    */
  var external_id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The SHA of the commit.
    */
  var head_sha: java.lang.String
  /**
    * The name of the check. For example, "code-coverage".
    */
  var name: java.lang.String
  /**
    * Check runs can accept a variety of data in the `output` object, including a `title` and `summary` and can optionally provide descriptive details about the run. See the [`output` object](https://developer.github.com/v3/checks/runs/#output-object) description.
    */
  var output: js.UndefOr[ChecksCreateParamsOutput] = js.undefined
  var owner: java.lang.String
  var repo: java.lang.String
  /**
    * The time that the check run began. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
    */
  var started_at: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The current status. Can be one of `queued`, `in_progress`, or `completed`.
    */
  var status: js.UndefOr[
    atOctokitRestLib.atOctokitRestLibStrings.queued | atOctokitRestLib.atOctokitRestLibStrings.in_progress | atOctokitRestLib.atOctokitRestLibStrings.completed
  ] = js.undefined
}

object ChecksCreateParams {
  @scala.inline
  def apply(
    head_sha: java.lang.String,
    name: java.lang.String,
    owner: java.lang.String,
    repo: java.lang.String,
    actions: js.Array[ChecksCreateParamsActions] = null,
    completed_at: java.lang.String = null,
    conclusion: atOctokitRestLib.atOctokitRestLibStrings.success | atOctokitRestLib.atOctokitRestLibStrings.failure | atOctokitRestLib.atOctokitRestLibStrings.neutral | atOctokitRestLib.atOctokitRestLibStrings.cancelled | atOctokitRestLib.atOctokitRestLibStrings.timed_out | atOctokitRestLib.atOctokitRestLibStrings.action_required = null,
    details_url: java.lang.String = null,
    external_id: java.lang.String = null,
    output: ChecksCreateParamsOutput = null,
    started_at: java.lang.String = null,
    status: atOctokitRestLib.atOctokitRestLibStrings.queued | atOctokitRestLib.atOctokitRestLibStrings.in_progress | atOctokitRestLib.atOctokitRestLibStrings.completed = null
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

