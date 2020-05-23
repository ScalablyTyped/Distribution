package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.newest
import typings.octokitTypes.octokitTypesStrings.oldest
import typings.octokitTypes.octokitTypesStrings.stargazers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposListForksEndpoint extends js.Object {
  var owner: String
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[Double] = js.undefined
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[Double] = js.undefined
  var repo: String
  /**
    * The sort order. Can be either `newest`, `oldest`, or `stargazers`.
    */
  var sort: js.UndefOr[newest | oldest | stargazers] = js.undefined
}

object ReposListForksEndpoint {
  @scala.inline
  def apply(
    owner: String,
    repo: String,
    page: js.UndefOr[Double] = js.undefined,
    per_page: js.UndefOr[Double] = js.undefined,
    sort: newest | oldest | stargazers = null
  ): ReposListForksEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    if (!js.isUndefined(page)) __obj.updateDynamic("page")(page.get.asInstanceOf[js.Any])
    if (!js.isUndefined(per_page)) __obj.updateDynamic("per_page")(per_page.get.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposListForksEndpoint]
  }
}

