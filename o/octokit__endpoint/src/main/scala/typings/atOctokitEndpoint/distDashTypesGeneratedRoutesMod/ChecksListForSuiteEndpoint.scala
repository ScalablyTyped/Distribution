package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksListForSuiteEndpoint extends js.Object {
  var check_name: js.UndefOr[String] = js.undefined
  var check_suite_id: Double
  var filter: js.UndefOr[String] = js.undefined
  var owner: String
  var page: js.UndefOr[Double] = js.undefined
  var per_page: js.UndefOr[Double] = js.undefined
  var repo: String
  var status: js.UndefOr[String] = js.undefined
}

object ChecksListForSuiteEndpoint {
  @scala.inline
  def apply(
    check_suite_id: Double,
    owner: String,
    repo: String,
    check_name: String = null,
    filter: String = null,
    page: Int | Double = null,
    per_page: Int | Double = null,
    status: String = null
  ): ChecksListForSuiteEndpoint = {
    val __obj = js.Dynamic.literal(check_suite_id = check_suite_id, owner = owner, repo = repo)
    if (check_name != null) __obj.updateDynamic("check_name")(check_name)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[ChecksListForSuiteEndpoint]
  }
}

