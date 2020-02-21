package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOrderQ extends js.Object {
  var order: AnonEnum
  var q: AnonRequired
  var repository_id: AnonRequired
  var sort: AnonEnum
}

object AnonOrderQ {
  @scala.inline
  def apply(order: AnonEnum, q: AnonRequired, repository_id: AnonRequired, sort: AnonEnum): AnonOrderQ = {
    val __obj = js.Dynamic.literal(order = order.asInstanceOf[js.Any], q = q.asInstanceOf[js.Any], repository_id = repository_id.asInstanceOf[js.Any], sort = sort.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOrderQ]
  }
}

