package typings.onoff.mod

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
    debounceTimeout: js.UndefOr[Double] = js.undefined,
    reconfigureDirection: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(activeLow)) __obj.updateDynamic("activeLow")(activeLow.get.asInstanceOf[js.Any])
    if (!js.isUndefined(debounceTimeout)) __obj.updateDynamic("debounceTimeout")(debounceTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reconfigureDirection)) __obj.updateDynamic("reconfigureDirection")(reconfigureDirection.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

