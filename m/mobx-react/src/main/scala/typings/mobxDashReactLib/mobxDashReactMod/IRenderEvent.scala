package typings
package mobxDashReactLib.mobxDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRenderEvent extends js.Object {
  var component: reactLib.reactMod.ReactNs.ReactElement[_]
  var event: mobxDashReactLib.mobxDashReactLibStrings.render | mobxDashReactLib.mobxDashReactLibStrings.destroy
  // Component instance
  var node: js.Any
  var renderTime: js.UndefOr[scala.Double] = js.undefined
  var totalTime: js.UndefOr[scala.Double] = js.undefined
}

object IRenderEvent {
  @scala.inline
  def apply(
    component: reactLib.reactMod.ReactNs.ReactElement[_],
    event: mobxDashReactLib.mobxDashReactLibStrings.render | mobxDashReactLib.mobxDashReactLibStrings.destroy,
    node: js.Any,
    renderTime: scala.Int | scala.Double = null,
    totalTime: scala.Int | scala.Double = null
  ): IRenderEvent = {
    val __obj = js.Dynamic.literal(component = component, event = event.asInstanceOf[js.Any], node = node)
    if (renderTime != null) __obj.updateDynamic("renderTime")(renderTime.asInstanceOf[js.Any])
    if (totalTime != null) __obj.updateDynamic("totalTime")(totalTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRenderEvent]
  }
}

