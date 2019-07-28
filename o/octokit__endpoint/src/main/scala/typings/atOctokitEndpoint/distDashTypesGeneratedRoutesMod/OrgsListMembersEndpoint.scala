package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsListMembersEndpoint extends js.Object {
  var filter: js.UndefOr[String] = js.undefined
  var org: String
  var page: js.UndefOr[Double] = js.undefined
  var per_page: js.UndefOr[Double] = js.undefined
  var role: js.UndefOr[String] = js.undefined
}

object OrgsListMembersEndpoint {
  @scala.inline
  def apply(
    org: String,
    filter: String = null,
    page: Int | Double = null,
    per_page: Int | Double = null,
    role: String = null
  ): OrgsListMembersEndpoint = {
    val __obj = js.Dynamic.literal(org = org)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role)
    __obj.asInstanceOf[OrgsListMembersEndpoint]
  }
}

