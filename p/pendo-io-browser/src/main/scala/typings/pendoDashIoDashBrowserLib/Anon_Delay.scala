package typings
package pendoDashIoDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Delay extends js.Object {
  var delay: js.UndefOr[scala.Boolean] = js.undefined
  var disable: js.UndefOr[scala.Boolean] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var tooltip: js.UndefOr[Anon_ArrowSize] = js.undefined
}

object Anon_Delay {
  @scala.inline
  def apply(
    delay: js.UndefOr[scala.Boolean] = js.undefined,
    disable: js.UndefOr[scala.Boolean] = js.undefined,
    timeout: scala.Int | scala.Double = null,
    tooltip: Anon_ArrowSize = null
  ): Anon_Delay = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay)
    if (!js.isUndefined(disable)) __obj.updateDynamic("disable")(disable)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    __obj.asInstanceOf[Anon_Delay]
  }
}

