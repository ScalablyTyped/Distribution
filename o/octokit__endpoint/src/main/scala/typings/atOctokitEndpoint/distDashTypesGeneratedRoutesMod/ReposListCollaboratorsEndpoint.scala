package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposListCollaboratorsEndpoint extends js.Object {
  var affiliation: js.UndefOr[String] = js.undefined
  var owner: String
  var page: js.UndefOr[Double] = js.undefined
  var per_page: js.UndefOr[Double] = js.undefined
  var repo: String
}

object ReposListCollaboratorsEndpoint {
  @scala.inline
  def apply(
    owner: String,
    repo: String,
    affiliation: String = null,
    page: Int | Double = null,
    per_page: Int | Double = null
  ): ReposListCollaboratorsEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
    if (affiliation != null) __obj.updateDynamic("affiliation")(affiliation)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposListCollaboratorsEndpoint]
  }
}

