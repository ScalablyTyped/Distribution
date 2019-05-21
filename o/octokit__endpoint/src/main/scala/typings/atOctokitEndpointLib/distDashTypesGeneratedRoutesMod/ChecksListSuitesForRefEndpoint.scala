package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksListSuitesForRefEndpoint extends js.Object {
  var app_id: js.UndefOr[scala.Double] = js.undefined
  var check_name: js.UndefOr[java.lang.String] = js.undefined
  var owner: java.lang.String
  var page: js.UndefOr[scala.Double] = js.undefined
  var per_page: js.UndefOr[scala.Double] = js.undefined
  var ref: java.lang.String
  var repo: java.lang.String
}

object ChecksListSuitesForRefEndpoint {
  @scala.inline
  def apply(
    owner: java.lang.String,
    ref: java.lang.String,
    repo: java.lang.String,
    app_id: scala.Int | scala.Double = null,
    check_name: java.lang.String = null,
    page: scala.Int | scala.Double = null,
    per_page: scala.Int | scala.Double = null
  ): ChecksListSuitesForRefEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, ref = ref, repo = repo)
    if (app_id != null) __obj.updateDynamic("app_id")(app_id.asInstanceOf[js.Any])
    if (check_name != null) __obj.updateDynamic("check_name")(check_name)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChecksListSuitesForRefEndpoint]
  }
}

