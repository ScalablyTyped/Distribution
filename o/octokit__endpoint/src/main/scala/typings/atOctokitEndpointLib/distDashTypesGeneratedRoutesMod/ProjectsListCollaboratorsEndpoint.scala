package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsListCollaboratorsEndpoint extends js.Object {
  var affiliation: js.UndefOr[java.lang.String] = js.undefined
  var page: js.UndefOr[scala.Double] = js.undefined
  var per_page: js.UndefOr[scala.Double] = js.undefined
  var project_id: scala.Double
}

object ProjectsListCollaboratorsEndpoint {
  @scala.inline
  def apply(
    project_id: scala.Double,
    affiliation: java.lang.String = null,
    page: scala.Int | scala.Double = null,
    per_page: scala.Int | scala.Double = null
  ): ProjectsListCollaboratorsEndpoint = {
    val __obj = js.Dynamic.literal(project_id = project_id)
    if (affiliation != null) __obj.updateDynamic("affiliation")(affiliation)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsListCollaboratorsEndpoint]
  }
}

