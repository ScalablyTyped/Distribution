package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsCreateForRepoEndpoint extends js.Object {
  var body: js.UndefOr[String] = js.undefined
  var name: String
  var owner: String
  var page: js.UndefOr[Double] = js.undefined
  var per_page: js.UndefOr[Double] = js.undefined
  var repo: String
}

object ProjectsCreateForRepoEndpoint {
  @scala.inline
  def apply(
    name: String,
    owner: String,
    repo: String,
    body: String = null,
    page: Int | Double = null,
    per_page: Int | Double = null
  ): ProjectsCreateForRepoEndpoint = {
    val __obj = js.Dynamic.literal(name = name, owner = owner, repo = repo)
    if (body != null) __obj.updateDynamic("body")(body)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsCreateForRepoEndpoint]
  }
}

