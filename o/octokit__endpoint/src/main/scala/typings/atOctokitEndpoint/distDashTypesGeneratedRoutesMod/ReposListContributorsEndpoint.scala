package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposListContributorsEndpoint extends js.Object {
  var anon: js.UndefOr[String] = js.undefined
  var owner: String
  var page: js.UndefOr[Double] = js.undefined
  var per_page: js.UndefOr[Double] = js.undefined
  var repo: String
}

object ReposListContributorsEndpoint {
  @scala.inline
  def apply(
    owner: String,
    repo: String,
    anon: String = null,
    page: Int | Double = null,
    per_page: Int | Double = null
  ): ReposListContributorsEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
    if (anon != null) __obj.updateDynamic("anon")(anon)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposListContributorsEndpoint]
  }
}

