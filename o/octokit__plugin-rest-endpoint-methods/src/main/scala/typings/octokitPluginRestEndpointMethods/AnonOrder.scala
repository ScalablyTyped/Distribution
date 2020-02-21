package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOrder extends js.Object {
  var order: AnonEnum
  var page: AnonType
  var per_page: AnonType
  var q: AnonRequired
  var sort: AnonEnum
}

object AnonOrder {
  @scala.inline
  def apply(order: AnonEnum, page: AnonType, per_page: AnonType, q: AnonRequired, sort: AnonEnum): AnonOrder = {
    val __obj = js.Dynamic.literal(order = order.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], q = q.asInstanceOf[js.Any], sort = sort.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOrder]
  }
}

