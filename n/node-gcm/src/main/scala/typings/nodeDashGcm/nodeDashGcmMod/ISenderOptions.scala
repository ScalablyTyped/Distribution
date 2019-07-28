package typings.nodeDashGcm.nodeDashGcmMod

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
  def apply(maxSockets: Int | Double = null, proxy: js.Any = null, timeout: Int | Double = null): ISenderOptions = {
    val __obj = js.Dynamic.literal()
    if (maxSockets != null) __obj.updateDynamic("maxSockets")(maxSockets.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISenderOptions]
  }
}

