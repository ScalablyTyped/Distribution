package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksListForRefEndpoint extends js.Object {
  var check_name: js.UndefOr[java.lang.String] = js.undefined
  var filter: js.UndefOr[java.lang.String] = js.undefined
  var owner: java.lang.String
  var page: js.UndefOr[scala.Double] = js.undefined
  var per_page: js.UndefOr[scala.Double] = js.undefined
  var ref: java.lang.String
  var repo: java.lang.String
  var status: js.UndefOr[java.lang.String] = js.undefined
}

object ChecksListForRefEndpoint {
  @scala.inline
  def apply(
    owner: java.lang.String,
    ref: java.lang.String,
    repo: java.lang.String,
    check_name: java.lang.String = null,
    filter: java.lang.String = null,
    page: scala.Int | scala.Double = null,
    per_page: scala.Int | scala.Double = null,
    status: java.lang.String = null
  ): ChecksListForRefEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, ref = ref, repo = repo)
    if (check_name != null) __obj.updateDynamic("check_name")(check_name)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[ChecksListForRefEndpoint]
  }
}

