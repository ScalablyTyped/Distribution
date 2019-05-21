package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsListMembershipsEndpoint extends js.Object {
  var page: js.UndefOr[scala.Double] = js.undefined
  var per_page: js.UndefOr[scala.Double] = js.undefined
  var state: js.UndefOr[java.lang.String] = js.undefined
}

object OrgsListMembershipsEndpoint {
  @scala.inline
  def apply(
    page: scala.Int | scala.Double = null,
    per_page: scala.Int | scala.Double = null,
    state: java.lang.String = null
  ): OrgsListMembershipsEndpoint = {
    val __obj = js.Dynamic.literal()
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[OrgsListMembershipsEndpoint]
  }
}

