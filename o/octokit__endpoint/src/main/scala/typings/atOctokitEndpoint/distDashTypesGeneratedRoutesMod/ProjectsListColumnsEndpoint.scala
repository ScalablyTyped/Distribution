package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsListColumnsEndpoint extends js.Object {
  var page: js.UndefOr[Double] = js.undefined
  var per_page: js.UndefOr[Double] = js.undefined
  var project_id: Double
}

object ProjectsListColumnsEndpoint {
  @scala.inline
  def apply(project_id: Double, page: Int | Double = null, per_page: Int | Double = null): ProjectsListColumnsEndpoint = {
    val __obj = js.Dynamic.literal(project_id = project_id)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsListColumnsEndpoint]
  }
}

