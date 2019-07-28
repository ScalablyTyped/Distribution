package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposListReleasesEndpoint extends js.Object {
  var owner: String
  var page: js.UndefOr[Double] = js.undefined
  var per_page: js.UndefOr[Double] = js.undefined
  var repo: String
}

object ReposListReleasesEndpoint {
  @scala.inline
  def apply(owner: String, repo: String, page: Int | Double = null, per_page: Int | Double = null): ReposListReleasesEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposListReleasesEndpoint]
  }
}

