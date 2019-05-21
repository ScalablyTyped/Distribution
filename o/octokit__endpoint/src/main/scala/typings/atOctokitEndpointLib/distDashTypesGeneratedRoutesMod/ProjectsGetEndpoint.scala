package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsGetEndpoint extends js.Object {
  var page: js.UndefOr[scala.Double] = js.undefined
  var per_page: js.UndefOr[scala.Double] = js.undefined
  var project_id: scala.Double
}

object ProjectsGetEndpoint {
  @scala.inline
  def apply(
    project_id: scala.Double,
    page: scala.Int | scala.Double = null,
    per_page: scala.Int | scala.Double = null
  ): ProjectsGetEndpoint = {
    val __obj = js.Dynamic.literal(project_id = project_id)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsGetEndpoint]
  }
}

