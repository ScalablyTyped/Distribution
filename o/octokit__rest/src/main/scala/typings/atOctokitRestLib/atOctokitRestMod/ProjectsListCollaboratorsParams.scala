package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsListCollaboratorsParams extends js.Object {
  /**
    * Filters the collaborators by their affiliation. Can be one of:
    * \* `outside`: Outside collaborators of a project that are not a member of the project's organization.
    * \* `direct`: Collaborators with permissions to a project, regardless of organization membership status.
    * \* `all`: All collaborators the authenticated user can see.
    */
  var affiliation: js.UndefOr[
    atOctokitRestLib.atOctokitRestLibStrings.outside | atOctokitRestLib.atOctokitRestLibStrings.direct | atOctokitRestLib.atOctokitRestLibStrings.all
  ] = js.undefined
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[scala.Double] = js.undefined
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[scala.Double] = js.undefined
  var project_id: scala.Double
}

object ProjectsListCollaboratorsParams {
  @scala.inline
  def apply(
    project_id: scala.Double,
    affiliation: atOctokitRestLib.atOctokitRestLibStrings.outside | atOctokitRestLib.atOctokitRestLibStrings.direct | atOctokitRestLib.atOctokitRestLibStrings.all = null,
    page: scala.Int | scala.Double = null,
    per_page: scala.Int | scala.Double = null
  ): ProjectsListCollaboratorsParams = {
    val __obj = js.Dynamic.literal(project_id = project_id)
    if (affiliation != null) __obj.updateDynamic("affiliation")(affiliation.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsListCollaboratorsParams]
  }
}

