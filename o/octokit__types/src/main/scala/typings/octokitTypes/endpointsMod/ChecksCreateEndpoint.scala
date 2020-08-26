package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`4`
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

/* Inlined {  owner :string,   repo :string,   name :string,   head_sha :string,   details_url :string | undefined,   external_id :string | undefined,   status :'queued' | 'in_progress' | 'completed' | undefined,   started_at :string | undefined,   conclusion :'success' | 'failure' | 'neutral' | 'cancelled' | 'skipped' | 'timed_out' | 'action_required' | undefined,   completed_at :string | undefined,   output :@octokit/types.@octokit/types/dist-types/generated/Endpoints.ChecksCreateParamsOutput | undefined,   actions :std.Array<@octokit/types.@octokit/types/dist-types/generated/Endpoints.ChecksCreateParamsActions> | undefined} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'antiope'> */
@js.native
trait ChecksCreateEndpoint extends js.Object {
  /**
    * Displays a button on GitHub that can be clicked to alert your app to do additional tasks. For example, a code linting app can display a button that automatically fixes detected errors. The button created in this object is displayed after the check run completes. When a user clicks the button, GitHub sends the [`check_run.requested_action` webhook](https://developer.github.com/webhooks/event-payloads/#check_run) to your app. Each action includes a `label`, `identifier` and `description`. A maximum of three actions are accepted. See the [`actions` object](https://developer.github.com/v3/checks/runs/#actions-object) description. To learn more about check runs and requested actions, see "[Check runs and requested actions](https://developer.github.com/v3/checks/runs/#check-runs-and-requested-actions)." To learn more about check runs and requested actions, see "[Check runs and requested actions](https://developer.github.com/v3/checks/runs/#check-runs-and-requested-actions)."
    */
  var actions: js.UndefOr[js.Array[ChecksCreateParamsActions]] = js.native
  /**
    * The time the check completed. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
    */
  var completed_at: js.UndefOr[String] = js.native
  /**
    * **Required if you provide `completed_at` or a `status` of `completed`**. The final conclusion of the check. Can be one of `success`, `failure`, `neutral`, `cancelled`, `skipped`, `timed_out`, or `action_required`. When the conclusion is `action_required`, additional details should be provided on the site specified by `details_url`.
    * **Note:** Providing `conclusion` will automatically set the `status` parameter to `completed`. Only GitHub can change a check run conclusion to `stale`.
    */
  var conclusion: js.UndefOr[success | failure | neutral | cancelled | skipped | timed_out | action_required] = js.native
  /**
    * The URL of the integrator's site that has the full details of the check. If the integrator does not provide this, then the homepage of the GitHub app is used.
    */
  var details_url: js.UndefOr[String] = js.native
  /**
    * A reference for the run on the integrator's system.
    */
  var external_id: js.UndefOr[String] = js.native
  /**
    * The SHA of the commit.
    */
  var head_sha: String = js.native
  var mediaType: `4` = js.native
  /**
    * The name of the check. For example, "code-coverage".
    */
  var name: String = js.native
  /**
    * Check runs can accept a variety of data in the `output` object, including a `title` and `summary` and can optionally provide descriptive details about the run. See the [`output` object](https://developer.github.com/v3/checks/runs/#output-object) description.
    */
  var output: js.UndefOr[ChecksCreateParamsOutput] = js.native
  var owner: String = js.native
  var repo: String = js.native
  /**
    * The time that the check run began. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
    */
  var started_at: js.UndefOr[String] = js.native
  /**
    * The current status. Can be one of `queued`, `in_progress`, or `completed`.
    */
  var status: js.UndefOr[queued | in_progress | completed] = js.native
}

object ChecksCreateEndpoint {
  @scala.inline
  def apply(head_sha: String, mediaType: `4`, name: String, owner: String, repo: String): ChecksCreateEndpoint = {
    val __obj = js.Dynamic.literal(head_sha = head_sha.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChecksCreateEndpoint]
  }
  @scala.inline
  implicit class ChecksCreateEndpointOps[Self <: ChecksCreateEndpoint] (val x: Self) extends AnyVal {
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
    def setHead_sha(value: String): Self = this.set("head_sha", value.asInstanceOf[js.Any])
    @scala.inline
    def setMediaType(value: `4`): Self = this.set("mediaType", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepo(value: String): Self = this.set("repo", value.asInstanceOf[js.Any])
    @scala.inline
    def setActionsVarargs(value: ChecksCreateParamsActions*): Self = this.set("actions", js.Array(value :_*))
    @scala.inline
    def setActions(value: js.Array[ChecksCreateParamsActions]): Self = this.set("actions", value.asInstanceOf[js.Any])
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
    def setOutput(value: ChecksCreateParamsOutput): Self = this.set("output", value.asInstanceOf[js.Any])
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

