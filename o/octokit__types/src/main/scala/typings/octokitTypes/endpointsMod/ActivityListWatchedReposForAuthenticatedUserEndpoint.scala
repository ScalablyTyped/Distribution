package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityListWatchedReposForAuthenticatedUserEndpoint extends js.Object {
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[Double] = js.undefined
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[Double] = js.undefined
}

object ActivityListWatchedReposForAuthenticatedUserEndpoint {
  @scala.inline
  def apply(page: js.UndefOr[Double] = js.undefined, per_page: js.UndefOr[Double] = js.undefined): ActivityListWatchedReposForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(page)) __obj.updateDynamic("page")(page.get.asInstanceOf[js.Any])
    if (!js.isUndefined(per_page)) __obj.updateDynamic("per_page")(per_page.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityListWatchedReposForAuthenticatedUserEndpoint]
  }
}

