package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposListAssetsForReleaseEndpoint extends js.Object {
  var owner: java.lang.String
  var page: js.UndefOr[scala.Double] = js.undefined
  var per_page: js.UndefOr[scala.Double] = js.undefined
  var release_id: scala.Double
  var repo: java.lang.String
}

object ReposListAssetsForReleaseEndpoint {
  @scala.inline
  def apply(
    owner: java.lang.String,
    release_id: scala.Double,
    repo: java.lang.String,
    page: scala.Int | scala.Double = null,
    per_page: scala.Int | scala.Double = null
  ): ReposListAssetsForReleaseEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, release_id = release_id, repo = repo)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposListAssetsForReleaseEndpoint]
  }
}

