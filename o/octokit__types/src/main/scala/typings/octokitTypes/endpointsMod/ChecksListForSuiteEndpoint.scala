package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`12`
import typings.octokitTypes.octokitTypesStrings.all
import typings.octokitTypes.octokitTypesStrings.completed
import typings.octokitTypes.octokitTypesStrings.in_progress
import typings.octokitTypes.octokitTypesStrings.latest
import typings.octokitTypes.octokitTypesStrings.queued
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  owner  :string,   repo  :string,   check_suite_id  :number,   check_name ? :string,   status ? :'queued' | 'in_progress' | 'completed',   filter ? :'latest' | 'all',   per_page ? :number,   page ? :number} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'antiope'> */
trait ChecksListForSuiteEndpoint extends js.Object {
  /**
    * Returns check runs with the specified `name`.
    */
  var check_name: js.UndefOr[String] = js.undefined
  var check_suite_id: Double
  /**
    * Filters check runs by their `completed_at` timestamp. Can be one of `latest` (returning the most recent check runs) or `all`.
    */
  var filter: js.UndefOr[latest | all] = js.undefined
  var mediaType: `12`
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
    * Returns check runs with the specified `status`. Can be one of `queued`, `in_progress`, or `completed`.
    */
  var status: js.UndefOr[queued | in_progress | completed] = js.undefined
}

object ChecksListForSuiteEndpoint {
  @scala.inline
  def apply(
    check_suite_id: Double,
    mediaType: `12`,
    owner: String,
    repo: String,
    check_name: String = null,
    filter: latest | all = null,
    page: js.UndefOr[Double] = js.undefined,
    per_page: js.UndefOr[Double] = js.undefined,
    status: queued | in_progress | completed = null
  ): ChecksListForSuiteEndpoint = {
    val __obj = js.Dynamic.literal(check_suite_id = check_suite_id.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    if (check_name != null) __obj.updateDynamic("check_name")(check_name.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (!js.isUndefined(page)) __obj.updateDynamic("page")(page.get.asInstanceOf[js.Any])
    if (!js.isUndefined(per_page)) __obj.updateDynamic("per_page")(per_page.get.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChecksListForSuiteEndpoint]
  }
}

