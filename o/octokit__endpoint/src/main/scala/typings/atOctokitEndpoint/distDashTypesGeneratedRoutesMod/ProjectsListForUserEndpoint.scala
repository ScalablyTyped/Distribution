package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsListForUserEndpoint extends js.Object {
  var page: js.UndefOr[Double] = js.undefined
  var per_page: js.UndefOr[Double] = js.undefined
  var state: js.UndefOr[String] = js.undefined
  var username: String
}

object ProjectsListForUserEndpoint {
  @scala.inline
  def apply(username: String, page: Int | Double = null, per_page: Int | Double = null, state: String = null): ProjectsListForUserEndpoint = {
    val __obj = js.Dynamic.literal(username = username)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[ProjectsListForUserEndpoint]
  }
}

