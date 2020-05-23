package typings.nodeGcm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISenderOptions extends js.Object {
  var maxSockets: js.UndefOr[Double] = js.undefined
  var proxy: js.UndefOr[js.Any] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object ISenderOptions {
  @scala.inline
  def apply(
    maxSockets: js.UndefOr[Double] = js.undefined,
    proxy: js.Any = null,
    timeout: js.UndefOr[Double] = js.undefined
  ): ISenderOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxSockets)) __obj.updateDynamic("maxSockets")(maxSockets.get.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISenderOptions]
  }
}

