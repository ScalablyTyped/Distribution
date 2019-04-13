package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposListCollaboratorsParams extends js.Object {
  /**
    * Filter collaborators returned by their affiliation. Can be one of:  ,* \* `outside`: All outside collaborators of an organization-owned repository.  ,* \* `direct`: All collaborators with permissions to an organization-owned repository, regardless of organization membership status.  ,* \* `all`: All collaborators the authenticated user can see.
    */
  var affiliation: js.UndefOr[
    atOctokitRestLib.atOctokitRestLibStrings.outside | atOctokitRestLib.atOctokitRestLibStrings.direct | atOctokitRestLib.atOctokitRestLibStrings.all
  ] = js.undefined
  var owner: java.lang.String
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[scala.Double] = js.undefined
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[scala.Double] = js.undefined
  var repo: java.lang.String
}

object ReposListCollaboratorsParams {
  @scala.inline
  def apply(
    owner: java.lang.String,
    repo: java.lang.String,
    affiliation: atOctokitRestLib.atOctokitRestLibStrings.outside | atOctokitRestLib.atOctokitRestLibStrings.direct | atOctokitRestLib.atOctokitRestLibStrings.all = null,
    page: scala.Int | scala.Double = null,
    per_page: scala.Int | scala.Double = null
  ): ReposListCollaboratorsParams = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
    if (affiliation != null) __obj.updateDynamic("affiliation")(affiliation.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposListCollaboratorsParams]
  }
}

