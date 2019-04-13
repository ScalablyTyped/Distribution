package typings
package onoffLib.onoffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GpioOptions extends js.Object {
  var activeLow: js.UndefOr[scala.Boolean] = js.undefined
  var debounceTimeout: js.UndefOr[scala.Double] = js.undefined
}

object GpioOptions {
  @scala.inline
  def apply(
    activeLow: js.UndefOr[scala.Boolean] = js.undefined,
    debounceTimeout: scala.Int | scala.Double = null
  ): GpioOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(activeLow)) __obj.updateDynamic("activeLow")(activeLow)
    if (debounceTimeout != null) __obj.updateDynamic("debounceTimeout")(debounceTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[GpioOptions]
  }
}

