package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.completed
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.conclusion
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionsListWorkflowRunsParams extends js.Object {
  /**
    * Returns someone's workflow runs. Use the login for the user who created the `push` associated with the check suite or workflow run.
    */
  var actor: js.UndefOr[String] = js.undefined
  /**
    * Returns workflow runs associated with a branch. Use the name of the branch of the `push`.
    */
  var branch: js.UndefOr[String] = js.undefined
  /**
    * Returns workflow run triggered by the event you specify. For example, `push`, `pull_request` or `issue`. For more information, see "[Events that trigger workflows](https://help.github.com/en/actions/automating-your-workflow-with-github-actions/events-that-trigger-workflows)" in the GitHub Help documentation.
    */
  var event: js.UndefOr[String] = js.undefined
  var owner: String
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[Double] = js.undefined
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[Double] = js.undefined
  var repo: String
  /**
    * Returns workflow runs associated with the check run `status` or `conclusion` you specify. For example, a conclusion can be `success` or a status can be `completed`. For more information, see the `status` and `conclusion` options available in "[Create a check run](https://developer.github.com/v3/checks/runs/#create-a-check-run)."
    */
  var status: js.UndefOr[
    completed | typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.status | conclusion
  ] = js.undefined
  var workflow_id: Double
}

object ActionsListWorkflowRunsParams {
  @scala.inline
  def apply(
    owner: String,
    repo: String,
    workflow_id: Double,
    actor: String = null,
    branch: String = null,
    event: String = null,
    page: Int | Double = null,
    per_page: Int | Double = null,
    status: completed | status | conclusion = null
  ): ActionsListWorkflowRunsParams = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], workflow_id = workflow_id.asInstanceOf[js.Any])
    if (actor != null) __obj.updateDynamic("actor")(actor.asInstanceOf[js.Any])
    if (branch != null) __obj.updateDynamic("branch")(branch.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsListWorkflowRunsParams]
  }
}

