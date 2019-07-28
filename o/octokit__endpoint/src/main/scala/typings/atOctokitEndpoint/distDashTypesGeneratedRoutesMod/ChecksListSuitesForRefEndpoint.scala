package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksListSuitesForRefEndpoint extends js.Object {
  var app_id: js.UndefOr[Double] = js.undefined
  var check_name: js.UndefOr[String] = js.undefined
  var owner: String
  var page: js.UndefOr[Double] = js.undefined
  var per_page: js.UndefOr[Double] = js.undefined
  var ref: String
  var repo: String
}

object ChecksListSuitesForRefEndpoint {
  @scala.inline
  def apply(
    owner: String,
    ref: String,
    repo: String,
    app_id: Int | Double = null,
    check_name: String = null,
    page: Int | Double = null,
    per_page: Int | Double = null
  ): ChecksListSuitesForRefEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, ref = ref, repo = repo)
    if (app_id != null) __obj.updateDynamic("app_id")(app_id.asInstanceOf[js.Any])
    if (check_name != null) __obj.updateDynamic("check_name")(check_name)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChecksListSuitesForRefEndpoint]
  }
}

