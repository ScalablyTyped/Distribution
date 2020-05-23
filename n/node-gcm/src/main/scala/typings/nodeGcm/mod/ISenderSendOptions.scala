package typings.nodeGcm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISenderSendOptions extends js.Object {
  var backoff: js.UndefOr[Double] = js.undefined
  var retries: js.UndefOr[Double] = js.undefined
}

object ISenderSendOptions {
  @scala.inline
  def apply(backoff: js.UndefOr[Double] = js.undefined, retries: js.UndefOr[Double] = js.undefined): ISenderSendOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(backoff)) __obj.updateDynamic("backoff")(backoff.get.asInstanceOf[js.Any])
    if (!js.isUndefined(retries)) __obj.updateDynamic("retries")(retries.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISenderSendOptions]
  }
}

