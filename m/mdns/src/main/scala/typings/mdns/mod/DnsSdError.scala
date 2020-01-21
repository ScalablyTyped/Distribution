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
  def apply(message: String, name: String, errorCode: Int | Double = null, stack: String = null): DnsSdError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (errorCode != null) __obj.updateDynamic("errorCode")(errorCode.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[DnsSdError]
  }
}

