package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivitySetThreadSubscriptionEndpoint extends js.Object {
  /**
    * Unsubscribes and subscribes you to a conversation. Set `ignored` to `true` to block all notifications from this thread.
    */
  var ignored: js.UndefOr[Boolean] = js.undefined
  var thread_id: Double
}

object ActivitySetThreadSubscriptionEndpoint {
  @scala.inline
  def apply(thread_id: Double, ignored: js.UndefOr[Boolean] = js.undefined): ActivitySetThreadSubscriptionEndpoint = {
    val __obj = js.Dynamic.literal(thread_id = thread_id.asInstanceOf[js.Any])
    if (!js.isUndefined(ignored)) __obj.updateDynamic("ignored")(ignored.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivitySetThreadSubscriptionEndpoint]
  }
}

