package typings.phoenixLiveView.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Defaults extends js.Object {
  var debounce: js.UndefOr[Double] = js.undefined
  var throttle: js.UndefOr[Double] = js.undefined
}

object Defaults {
  @scala.inline
  def apply(debounce: js.UndefOr[Double] = js.undefined, throttle: js.UndefOr[Double] = js.undefined): Defaults = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(debounce)) __obj.updateDynamic("debounce")(debounce.get.asInstanceOf[js.Any])
    if (!js.isUndefined(throttle)) __obj.updateDynamic("throttle")(throttle.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Defaults]
  }
}

