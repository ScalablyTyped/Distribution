package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposListAssetsForReleaseEndpoint extends js.Object {
  var owner: String
  var page: js.UndefOr[Double] = js.undefined
  var per_page: js.UndefOr[Double] = js.undefined
  var release_id: Double
  var repo: String
}

object ReposListAssetsForReleaseEndpoint {
  @scala.inline
  def apply(
    owner: String,
    release_id: Double,
    repo: String,
    page: Int | Double = null,
    per_page: Int | Double = null
  ): ReposListAssetsForReleaseEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, release_id = release_id, repo = repo)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposListAssetsForReleaseEndpoint]
  }
}

