package typings.mdns.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// --- Error ---
trait DnsSdError extends Error {
  var errorCode: js.UndefOr[Double] = js.undefined
}

object DnsSdError {
  @scala.inline
  def apply(message: String, name: String, errorCode: js.UndefOr[Double] = js.undefined, stack: String = null): DnsSdError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(errorCode)) __obj.updateDynamic("errorCode")(errorCode.get.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[DnsSdError]
  }
}

