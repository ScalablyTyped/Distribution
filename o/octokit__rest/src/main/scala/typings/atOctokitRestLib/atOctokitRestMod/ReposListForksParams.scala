package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposListForksParams extends js.Object {
  var owner: java.lang.String
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[scala.Double] = js.undefined
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[scala.Double] = js.undefined
  var repo: java.lang.String
  /**
    * The sort order. Can be either `newest`, `oldest`, or `stargazers`.
    */
  var sort: js.UndefOr[
    atOctokitRestLib.atOctokitRestLibStrings.newest | atOctokitRestLib.atOctokitRestLibStrings.oldest | atOctokitRestLib.atOctokitRestLibStrings.stargazers
  ] = js.undefined
}

object ReposListForksParams {
  @scala.inline
  def apply(
    owner: java.lang.String,
    repo: java.lang.String,
    page: scala.Int | scala.Double = null,
    per_page: scala.Int | scala.Double = null,
    sort: atOctokitRestLib.atOctokitRestLibStrings.newest | atOctokitRestLib.atOctokitRestLibStrings.oldest | atOctokitRestLib.atOctokitRestLibStrings.stargazers = null
  ): ReposListForksParams = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposListForksParams]
  }
}

