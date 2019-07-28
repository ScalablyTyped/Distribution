package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivitySetThreadSubscriptionParams extends js.Object {
  /**
    * Unsubscribes and subscribes you to a conversation. Set `ignored` to `true` to block all notifications from this thread.
    */
  var ignored: js.UndefOr[Boolean] = js.undefined
  var thread_id: Double
}

object ActivitySetThreadSubscriptionParams {
  @scala.inline
  def apply(thread_id: Double, ignored: js.UndefOr[Boolean] = js.undefined): ActivitySetThreadSubscriptionParams = {
    val __obj = js.Dynamic.literal(thread_id = thread_id)
    if (!js.isUndefined(ignored)) __obj.updateDynamic("ignored")(ignored)
    __obj.asInstanceOf[ActivitySetThreadSubscriptionParams]
  }
}

