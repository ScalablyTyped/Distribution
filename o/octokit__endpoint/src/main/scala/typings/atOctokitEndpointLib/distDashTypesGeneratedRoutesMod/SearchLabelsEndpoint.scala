package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchLabelsEndpoint extends js.Object {
  var order: js.UndefOr[java.lang.String] = js.undefined
  var q: java.lang.String
  var repository_id: scala.Double
  var sort: js.UndefOr[java.lang.String] = js.undefined
}

object SearchLabelsEndpoint {
  @scala.inline
  def apply(
    q: java.lang.String,
    repository_id: scala.Double,
    order: java.lang.String = null,
    sort: java.lang.String = null
  ): SearchLabelsEndpoint = {
    val __obj = js.Dynamic.literal(q = q, repository_id = repository_id)
    if (order != null) __obj.updateDynamic("order")(order)
    if (sort != null) __obj.updateDynamic("sort")(sort)
    __obj.asInstanceOf[SearchLabelsEndpoint]
  }
}

