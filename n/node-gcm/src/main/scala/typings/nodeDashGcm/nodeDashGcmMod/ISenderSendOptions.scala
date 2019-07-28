package typings.nodeDashGcm.nodeDashGcmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISenderSendOptions extends js.Object {
  var backoff: js.UndefOr[Double] = js.undefined
  var retries: js.UndefOr[Double] = js.undefined
}

object ISenderSendOptions {
  @scala.inline
  def apply(backoff: Int | Double = null, retries: Int | Double = null): ISenderSendOptions = {
    val __obj = js.Dynamic.literal()
    if (backoff != null) __obj.updateDynamic("backoff")(backoff.asInstanceOf[js.Any])
    if (retries != null) __obj.updateDynamic("retries")(retries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISenderSendOptions]
  }
}

