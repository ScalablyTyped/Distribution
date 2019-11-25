package typings.atOctokitRest.atOctokitRestMod

import typings.atOctokitRest.atOctokitRestStrings.all
import typings.atOctokitRest.atOctokitRestStrings.completed
import typings.atOctokitRest.atOctokitRestStrings.in_progress
import typings.atOctokitRest.atOctokitRestStrings.latest
import typings.atOctokitRest.atOctokitRestStrings.queued
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksListForRefParams extends js.Object {
  /**
    * Returns check runs with the specified `name`.
    */
  var check_name: js.UndefOr[String] = js.undefined
  /**
    * Filters check runs by their `completed_at` timestamp. Can be one of `latest` (returning the most recent check runs) or `all`.
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
  var ref: String
  var repo: String
  /**
    * Returns check runs with the specified `status`. Can be one of `queued`, `in_progress`, or `completed`.
    */
  var status: js.UndefOr[queued | in_progress | completed] = js.undefined
}

object ChecksListForRefParams {
  @scala.inline
  def apply(
    owner: String,
    ref: String,
    repo: String,
    check_name: String = null,
    filter: latest | all = null,
    page: Int | Double = null,
    per_page: Int | Double = null,
    status: queued | in_progress | completed = null
  ): ChecksListForRefParams = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    if (check_name != null) __obj.updateDynamic("check_name")(check_name.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChecksListForRefParams]
  }
}

