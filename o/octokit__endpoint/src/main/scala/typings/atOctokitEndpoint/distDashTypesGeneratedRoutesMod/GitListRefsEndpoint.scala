package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitListRefsEndpoint extends js.Object {
  var namespace: js.UndefOr[String] = js.undefined
  var owner: String
  var page: js.UndefOr[Double] = js.undefined
  var per_page: js.UndefOr[Double] = js.undefined
  var repo: String
}

object GitListRefsEndpoint {
  @scala.inline
  def apply(
    owner: String,
    repo: String,
    namespace: String = null,
    page: Int | Double = null,
    per_page: Int | Double = null
  ): GitListRefsEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
    if (namespace != null) __obj.updateDynamic("namespace")(namespace)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitListRefsEndpoint]
  }
}

