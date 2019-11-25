package typings.pendoDashIoDashBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Delay extends js.Object {
  var delay: js.UndefOr[Boolean] = js.undefined
  var disable: js.UndefOr[Boolean] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var tooltip: js.UndefOr[Anon_ArrowSize] = js.undefined
}

object Anon_Delay {
  @scala.inline
  def apply(
    delay: js.UndefOr[Boolean] = js.undefined,
    disable: js.UndefOr[Boolean] = js.undefined,
    timeout: Int | Double = null,
    tooltip: Anon_ArrowSize = null
  ): Anon_Delay = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (!js.isUndefined(disable)) __obj.updateDynamic("disable")(disable.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Delay]
  }
}

