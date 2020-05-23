package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityDeleteThreadSubscriptionEndpoint extends js.Object {
  var thread_id: Double
}

object ActivityDeleteThreadSubscriptionEndpoint {
  @scala.inline
  def apply(thread_id: Double): ActivityDeleteThreadSubscriptionEndpoint = {
    val __obj = js.Dynamic.literal(thread_id = thread_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityDeleteThreadSubscriptionEndpoint]
  }
}

