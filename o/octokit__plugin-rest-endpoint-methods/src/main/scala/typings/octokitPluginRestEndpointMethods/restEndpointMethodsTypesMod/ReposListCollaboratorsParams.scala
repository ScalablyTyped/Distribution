package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.all
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.direct
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.outside
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposListCollaboratorsParams extends js.Object {
  /**
    * Filter collaborators returned by their affiliation. Can be one of:
    * \* `outside`: All outside collaborators of an organization-owned repository.
    * \* `direct`: All collaborators with permissions to an organization-owned repository, regardless of organization membership status.
    * \* `all`: All collaborators the authenticated user can see.
    */
  var affiliation: js.UndefOr[outside | direct | all] = js.undefined
  var owner: String
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[Double] = js.undefined
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[Double] = js.undefined
  var repo: String
}

object ReposListCollaboratorsParams {
  @scala.inline
  def apply(
    owner: String,
    repo: String,
    affiliation: outside | direct | all = null,
    page: Int | Double = null,
    per_page: Int | Double = null
  ): ReposListCollaboratorsParams = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    if (affiliation != null) __obj.updateDynamic("affiliation")(affiliation.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposListCollaboratorsParams]
  }
}

