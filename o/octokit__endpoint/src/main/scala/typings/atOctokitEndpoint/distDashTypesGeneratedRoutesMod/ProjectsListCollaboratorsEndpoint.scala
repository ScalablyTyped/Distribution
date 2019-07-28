package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsListCollaboratorsEndpoint extends js.Object {
  var affiliation: js.UndefOr[String] = js.undefined
  var page: js.UndefOr[Double] = js.undefined
  var per_page: js.UndefOr[Double] = js.undefined
  var project_id: Double
}

object ProjectsListCollaboratorsEndpoint {
  @scala.inline
  def apply(
    project_id: Double,
    affiliation: String = null,
    page: Int | Double = null,
    per_page: Int | Double = null
  ): ProjectsListCollaboratorsEndpoint = {
    val __obj = js.Dynamic.literal(project_id = project_id)
    if (affiliation != null) __obj.updateDynamic("affiliation")(affiliation)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsListCollaboratorsEndpoint]
  }
}

