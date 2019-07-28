package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchLabelsEndpoint extends js.Object {
  var order: js.UndefOr[String] = js.undefined
  var q: String
  var repository_id: Double
  var sort: js.UndefOr[String] = js.undefined
}

object SearchLabelsEndpoint {
  @scala.inline
  def apply(q: String, repository_id: Double, order: String = null, sort: String = null): SearchLabelsEndpoint = {
    val __obj = js.Dynamic.literal(q = q, repository_id = repository_id)
    if (order != null) __obj.updateDynamic("order")(order)
    if (sort != null) __obj.updateDynamic("sort")(sort)
    __obj.asInstanceOf[SearchLabelsEndpoint]
  }
}

