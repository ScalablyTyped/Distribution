package typings.openfin.interappbusChannelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectOptions extends js.Object {
  var payload: js.UndefOr[js.Any] = js.undefined
  @JSName("wait")
  var wait_FConnectOptions: js.UndefOr[Boolean] = js.undefined
}

object ConnectOptions {
  @scala.inline
  def apply(payload: js.Any = null, wait: js.UndefOr[Boolean] = js.undefined): ConnectOptions = {
    val __obj = js.Dynamic.literal()
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    if (!js.isUndefined(wait)) __obj.updateDynamic("wait")(wait.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectOptions]
  }
}

