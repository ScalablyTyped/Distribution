package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposListContributorsParams extends js.Object {
  /**
    * Set to `1` or `true` to include anonymous contributors in results.
    */
  var anon: js.UndefOr[String] = js.undefined
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
}

object ReposListContributorsParams {
  @scala.inline
  def apply(
    owner: String,
    repo: String,
    anon: String = null,
    page: Int | Double = null,
    per_page: Int | Double = null
  ): ReposListContributorsParams = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    if (anon != null) __obj.updateDynamic("anon")(anon.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposListContributorsParams]
  }
}

