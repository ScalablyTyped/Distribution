package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchCodeEndpoint extends js.Object {
  var order: js.UndefOr[java.lang.String] = js.undefined
  var page: js.UndefOr[scala.Double] = js.undefined
  var per_page: js.UndefOr[scala.Double] = js.undefined
  var q: java.lang.String
  var sort: js.UndefOr[java.lang.String] = js.undefined
}

object SearchCodeEndpoint {
  @scala.inline
  def apply(
    q: java.lang.String,
    order: java.lang.String = null,
    page: scala.Int | scala.Double = null,
    per_page: scala.Int | scala.Double = null,
    sort: java.lang.String = null
  ): SearchCodeEndpoint = {
    val __obj = js.Dynamic.literal(q = q)
    if (order != null) __obj.updateDynamic("order")(order)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort)
    __obj.asInstanceOf[SearchCodeEndpoint]
  }
}

