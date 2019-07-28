package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivitySetThreadSubscriptionEndpoint extends js.Object {
  var ignored: js.UndefOr[Boolean] = js.undefined
  var thread_id: Double
}

object ActivitySetThreadSubscriptionEndpoint {
  @scala.inline
  def apply(thread_id: Double, ignored: js.UndefOr[Boolean] = js.undefined): ActivitySetThreadSubscriptionEndpoint = {
    val __obj = js.Dynamic.literal(thread_id = thread_id)
    if (!js.isUndefined(ignored)) __obj.updateDynamic("ignored")(ignored)
    __obj.asInstanceOf[ActivitySetThreadSubscriptionEndpoint]
  }
}

