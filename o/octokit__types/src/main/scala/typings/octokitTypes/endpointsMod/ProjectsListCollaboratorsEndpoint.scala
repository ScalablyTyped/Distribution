package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`8`
import typings.octokitTypes.octokitTypesStrings.all
import typings.octokitTypes.octokitTypesStrings.direct
import typings.octokitTypes.octokitTypesStrings.outside
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  project_id  :number,   affiliation ? :'outside' | 'direct' | 'all',   per_page ? :number,   page ? :number} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'inertia'> */
trait ProjectsListCollaboratorsEndpoint extends js.Object {
  /**
    * Filters the collaborators by their affiliation. Can be one of:
    * \* `outside`: Outside collaborators of a project that are not a member of the project's organization.
    * \* `direct`: Collaborators with permissions to a project, regardless of organization membership status.
    * \* `all`: All collaborators the authenticated user can see.
    */
  var affiliation: js.UndefOr[outside | direct | all] = js.undefined
  var mediaType: `8`
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[Double] = js.undefined
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[Double] = js.undefined
  var project_id: Double
}

object ProjectsListCollaboratorsEndpoint {
  @scala.inline
  def apply(
    mediaType: `8`,
    project_id: Double,
    affiliation: outside | direct | all = null,
    page: js.UndefOr[Double] = js.undefined,
    per_page: js.UndefOr[Double] = js.undefined
  ): ProjectsListCollaboratorsEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], project_id = project_id.asInstanceOf[js.Any])
    if (affiliation != null) __obj.updateDynamic("affiliation")(affiliation.asInstanceOf[js.Any])
    if (!js.isUndefined(page)) __obj.updateDynamic("page")(page.get.asInstanceOf[js.Any])
    if (!js.isUndefined(per_page)) __obj.updateDynamic("per_page")(per_page.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsListCollaboratorsEndpoint]
  }
}

