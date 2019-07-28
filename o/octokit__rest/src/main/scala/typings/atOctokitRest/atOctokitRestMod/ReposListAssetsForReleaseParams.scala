package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposListAssetsForReleaseParams extends js.Object {
  var owner: String
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[Double] = js.undefined
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[Double] = js.undefined
  var release_id: Double
  var repo: String
}

object ReposListAssetsForReleaseParams {
  @scala.inline
  def apply(
    owner: String,
    release_id: Double,
    repo: String,
    page: Int | Double = null,
    per_page: Int | Double = null
  ): ReposListAssetsForReleaseParams = {
    val __obj = js.Dynamic.literal(owner = owner, release_id = release_id, repo = repo)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposListAssetsForReleaseParams]
  }
}

