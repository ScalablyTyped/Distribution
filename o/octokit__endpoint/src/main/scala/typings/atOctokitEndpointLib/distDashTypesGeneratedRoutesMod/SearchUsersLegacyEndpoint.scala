package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchUsersLegacyEndpoint extends js.Object {
  var keyword: java.lang.String
  var order: js.UndefOr[java.lang.String] = js.undefined
  var sort: js.UndefOr[java.lang.String] = js.undefined
  var start_page: js.UndefOr[java.lang.String] = js.undefined
}

object SearchUsersLegacyEndpoint {
  @scala.inline
  def apply(
    keyword: java.lang.String,
    order: java.lang.String = null,
    sort: java.lang.String = null,
    start_page: java.lang.String = null
  ): SearchUsersLegacyEndpoint = {
    val __obj = js.Dynamic.literal(keyword = keyword)
    if (order != null) __obj.updateDynamic("order")(order)
    if (sort != null) __obj.updateDynamic("sort")(sort)
    if (start_page != null) __obj.updateDynamic("start_page")(start_page)
    __obj.asInstanceOf[SearchUsersLegacyEndpoint]
  }
}

