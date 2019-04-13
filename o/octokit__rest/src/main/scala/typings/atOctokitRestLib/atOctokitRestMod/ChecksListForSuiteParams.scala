package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksListForSuiteParams extends js.Object {
  /**
    * Returns check runs with the specified `name`.
    */
  var check_name: js.UndefOr[java.lang.String] = js.undefined
  var check_suite_id: scala.Double
  /**
    * Filters check runs by their `completed_at` timestamp. Can be one of `latest` (returning the most recent check runs) or `all`.
    */
  var filter: js.UndefOr[
    atOctokitRestLib.atOctokitRestLibStrings.latest | atOctokitRestLib.atOctokitRestLibStrings.all
  ] = js.undefined
  var owner: java.lang.String
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[scala.Double] = js.undefined
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[scala.Double] = js.undefined
  var repo: java.lang.String
  /**
    * Returns check runs with the specified `status`. Can be one of `queued`, `in_progress`, or `completed`.
    */
  var status: js.UndefOr[
    atOctokitRestLib.atOctokitRestLibStrings.queued | atOctokitRestLib.atOctokitRestLibStrings.in_progress | atOctokitRestLib.atOctokitRestLibStrings.completed
  ] = js.undefined
}

object ChecksListForSuiteParams {
  @scala.inline
  def apply(
    check_suite_id: scala.Double,
    owner: java.lang.String,
    repo: java.lang.String,
    check_name: java.lang.String = null,
    filter: atOctokitRestLib.atOctokitRestLibStrings.latest | atOctokitRestLib.atOctokitRestLibStrings.all = null,
    page: scala.Int | scala.Double = null,
    per_page: scala.Int | scala.Double = null,
    status: atOctokitRestLib.atOctokitRestLibStrings.queued | atOctokitRestLib.atOctokitRestLibStrings.in_progress | atOctokitRestLib.atOctokitRestLibStrings.completed = null
  ): ChecksListForSuiteParams = {
    val __obj = js.Dynamic.literal(check_suite_id = check_suite_id, owner = owner, repo = repo)
    if (check_name != null) __obj.updateDynamic("check_name")(check_name)
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChecksListForSuiteParams]
  }
}

