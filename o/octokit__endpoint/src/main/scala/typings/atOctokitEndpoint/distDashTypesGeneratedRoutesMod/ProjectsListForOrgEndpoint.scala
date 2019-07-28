package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsListForOrgEndpoint extends js.Object {
  var org: String
  var page: js.UndefOr[Double] = js.undefined
  var per_page: js.UndefOr[Double] = js.undefined
  var state: js.UndefOr[String] = js.undefined
}

object ProjectsListForOrgEndpoint {
  @scala.inline
  def apply(org: String, page: Int | Double = null, per_page: Int | Double = null, state: String = null): ProjectsListForOrgEndpoint = {
    val __obj = js.Dynamic.literal(org = org)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[ProjectsListForOrgEndpoint]
  }
}

