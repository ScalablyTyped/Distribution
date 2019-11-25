package typings.onoff.onoffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var activeLow: js.UndefOr[Boolean] = js.undefined
  var debounceTimeout: js.UndefOr[Double] = js.undefined
  var reconfigureDirection: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    activeLow: js.UndefOr[Boolean] = js.undefined,
    debounceTimeout: Int | Double = null,
    reconfigureDirection: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(activeLow)) __obj.updateDynamic("activeLow")(activeLow.asInstanceOf[js.Any])
    if (debounceTimeout != null) __obj.updateDynamic("debounceTimeout")(debounceTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(reconfigureDirection)) __obj.updateDynamic("reconfigureDirection")(reconfigureDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

