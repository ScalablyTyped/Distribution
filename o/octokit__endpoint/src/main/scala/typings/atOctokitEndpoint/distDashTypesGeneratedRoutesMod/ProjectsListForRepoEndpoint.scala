package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsListForRepoEndpoint extends js.Object {
  var owner: String
  var page: js.UndefOr[Double] = js.undefined
  var per_page: js.UndefOr[Double] = js.undefined
  var repo: String
  var state: js.UndefOr[String] = js.undefined
}

object ProjectsListForRepoEndpoint {
  @scala.inline
  def apply(
    owner: String,
    repo: String,
    page: Int | Double = null,
    per_page: Int | Double = null,
    state: String = null
  ): ProjectsListForRepoEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[ProjectsListForRepoEndpoint]
  }
}

