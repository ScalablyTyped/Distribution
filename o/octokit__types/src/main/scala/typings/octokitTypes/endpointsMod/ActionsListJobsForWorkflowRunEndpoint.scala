package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.all
import typings.octokitTypes.octokitTypesStrings.latest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionsListJobsForWorkflowRunEndpoint extends js.Object {
  /**
    * Filters jobs by their `completed_at` timestamp. Can be one of:
    * \* `latest`: Returns jobs from the most recent execution of the workflow run.
    * \* `all`: Returns all jobs for a workflow run, including from old executions of the workflow run.
    */
  var filter: js.UndefOr[latest | all] = js.undefined
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
  var run_id: Double
}

object ActionsListJobsForWorkflowRunEndpoint {
  @scala.inline
  def apply(
    owner: String,
    repo: String,
    run_id: Double,
    filter: latest | all = null,
    page: js.UndefOr[Double] = js.undefined,
    per_page: js.UndefOr[Double] = js.undefined
  ): ActionsListJobsForWorkflowRunEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], run_id = run_id.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (!js.isUndefined(page)) __obj.updateDynamic("page")(page.get.asInstanceOf[js.Any])
    if (!js.isUndefined(per_page)) __obj.updateDynamic("per_page")(per_page.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsListJobsForWorkflowRunEndpoint]
  }
}

