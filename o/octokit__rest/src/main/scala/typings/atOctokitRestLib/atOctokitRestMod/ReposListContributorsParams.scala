package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposListContributorsParams extends js.Object {
  /**
    * Set to `1` or `true` to include anonymous contributors in results.
    */
  var anon: js.UndefOr[java.lang.String] = js.undefined
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
}

object ReposListContributorsParams {
  @scala.inline
  def apply(
    owner: java.lang.String,
    repo: java.lang.String,
    anon: java.lang.String = null,
    page: scala.Int | scala.Double = null,
    per_page: scala.Int | scala.Double = null
  ): ReposListContributorsParams = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
    if (anon != null) __obj.updateDynamic("anon")(anon)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposListContributorsParams]
  }
}

