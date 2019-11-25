package typings.atOctokitRest.atOctokitRestMod

import typings.atOctokitRest.atOctokitRestStrings.newest
import typings.atOctokitRest.atOctokitRestStrings.oldest
import typings.atOctokitRest.atOctokitRestStrings.stargazers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposListForksParams extends js.Object {
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

object ReposListForksParams {
  @scala.inline
  def apply(
    owner: String,
    repo: String,
    page: Int | Double = null,
    per_page: Int | Double = null,
    sort: newest | oldest | stargazers = null
  ): ReposListForksParams = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposListForksParams]
  }
}

