package typings
package polymerDashTsLib.polymerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FireOptions extends js.Object {
  var bubbles: js.UndefOr[scala.Boolean] = js.undefined
  var cancelable: js.UndefOr[scala.Boolean] = js.undefined
  var node: js.UndefOr[stdLib.HTMLElement | Base] = js.undefined
}

object FireOptions {
  @scala.inline
  def apply(
    bubbles: js.UndefOr[scala.Boolean] = js.undefined,
    cancelable: js.UndefOr[scala.Boolean] = js.undefined,
    node: stdLib.HTMLElement | Base = null
  ): FireOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles)
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable)
    if (node != null) __obj.updateDynamic("node")(node.asInstanceOf[js.Any])
    __obj.asInstanceOf[FireOptions]
  }
}

