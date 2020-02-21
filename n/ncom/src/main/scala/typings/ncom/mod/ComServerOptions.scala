package typings.ncom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComServerOptions extends js.Object {
  var allowHalfOpen: js.UndefOr[Boolean] = js.undefined
  var pauseOnConnect: js.UndefOr[Boolean] = js.undefined
}

object ComServerOptions {
  @scala.inline
  def apply(
    allowHalfOpen: js.UndefOr[Boolean] = js.undefined,
    pauseOnConnect: js.UndefOr[Boolean] = js.undefined
  ): ComServerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowHalfOpen)) __obj.updateDynamic("allowHalfOpen")(allowHalfOpen.asInstanceOf[js.Any])
    if (!js.isUndefined(pauseOnConnect)) __obj.updateDynamic("pauseOnConnect")(pauseOnConnect.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComServerOptions]
  }
}

