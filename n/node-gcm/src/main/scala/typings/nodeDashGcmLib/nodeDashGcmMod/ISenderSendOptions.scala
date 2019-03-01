package typings
package nodeDashGcmLib.nodeDashGcmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISenderSendOptions extends js.Object {
  var backoff: js.UndefOr[scala.Double] = js.undefined
  var retries: js.UndefOr[scala.Double] = js.undefined
}

object ISenderSendOptions {
  @scala.inline
  def apply(backoff: scala.Int | scala.Double = null, retries: scala.Int | scala.Double = null): ISenderSendOptions = {
    val __obj = js.Dynamic.literal()
    if (backoff != null) __obj.updateDynamic("backoff")(backoff.asInstanceOf[js.Any])
    if (retries != null) __obj.updateDynamic("retries")(retries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISenderSendOptions]
  }
}

