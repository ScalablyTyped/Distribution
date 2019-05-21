package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposListContributorsEndpoint extends js.Object {
  var anon: js.UndefOr[java.lang.String] = js.undefined
  var owner: java.lang.String
  var page: js.UndefOr[scala.Double] = js.undefined
  var per_page: js.UndefOr[scala.Double] = js.undefined
  var repo: java.lang.String
}

object ReposListContributorsEndpoint {
  @scala.inline
  def apply(
    owner: java.lang.String,
    repo: java.lang.String,
    anon: java.lang.String = null,
    page: scala.Int | scala.Double = null,
    per_page: scala.Int | scala.Double = null
  ): ReposListContributorsEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
    if (anon != null) __obj.updateDynamic("anon")(anon)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposListContributorsEndpoint]
  }
}

