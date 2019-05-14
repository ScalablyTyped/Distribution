package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivitySetThreadSubscription_Options extends js.Object {
  var ignored: js.UndefOr[scala.Boolean] = js.undefined
  var thread_id: scala.Double
}

object ActivitySetThreadSubscription_Options {
  @scala.inline
  def apply(thread_id: scala.Double, ignored: js.UndefOr[scala.Boolean] = js.undefined): ActivitySetThreadSubscription_Options = {
    val __obj = js.Dynamic.literal(thread_id = thread_id)
    if (!js.isUndefined(ignored)) __obj.updateDynamic("ignored")(ignored)
    __obj.asInstanceOf[ActivitySetThreadSubscription_Options]
  }
}

