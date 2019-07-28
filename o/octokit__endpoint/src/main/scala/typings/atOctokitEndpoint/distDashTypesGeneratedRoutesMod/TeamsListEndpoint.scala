package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsListEndpoint extends js.Object {
  var org: String
  var page: js.UndefOr[Double] = js.undefined
  var per_page: js.UndefOr[Double] = js.undefined
}

object TeamsListEndpoint {
  @scala.inline
  def apply(org: String, page: Int | Double = null, per_page: Int | Double = null): TeamsListEndpoint = {
    val __obj = js.Dynamic.literal(org = org)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsListEndpoint]
  }
}

