package typings
package nesLib.clientMod.ClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientConnectOptions extends js.Object {
  var auth: js.UndefOr[js.Any] = js.undefined
  var delay: js.UndefOr[scala.Double] = js.undefined
  var maxDelay: js.UndefOr[scala.Double] = js.undefined
  var retries: js.UndefOr[scala.Double] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object ClientConnectOptions {
  @scala.inline
  def apply(
    auth: js.Any = null,
    delay: scala.Int | scala.Double = null,
    maxDelay: scala.Int | scala.Double = null,
    retries: scala.Int | scala.Double = null,
    timeout: scala.Int | scala.Double = null
  ): ClientConnectOptions = {
    val __obj = js.Dynamic.literal()
    if (auth != null) __obj.updateDynamic("auth")(auth)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (maxDelay != null) __obj.updateDynamic("maxDelay")(maxDelay.asInstanceOf[js.Any])
    if (retries != null) __obj.updateDynamic("retries")(retries.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientConnectOptions]
  }
}

