package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityGetThreadSubscriptionForAuthenticatedUserEndpoint extends js.Object {
  var thread_id: Double
}

object ActivityGetThreadSubscriptionForAuthenticatedUserEndpoint {
  @scala.inline
  def apply(thread_id: Double): ActivityGetThreadSubscriptionForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(thread_id = thread_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityGetThreadSubscriptionForAuthenticatedUserEndpoint]
  }
}

