package typings.onoff.onoffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GpioOptions extends js.Object {
  var activeLow: js.UndefOr[Boolean] = js.undefined
  var debounceTimeout: js.UndefOr[Double] = js.undefined
}

object GpioOptions {
  @scala.inline
  def apply(activeLow: js.UndefOr[Boolean] = js.undefined, debounceTimeout: Int | Double = null): GpioOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(activeLow)) __obj.updateDynamic("activeLow")(activeLow)
    if (debounceTimeout != null) __obj.updateDynamic("debounceTimeout")(debounceTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[GpioOptions]
  }
}

