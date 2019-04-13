package typings
package mdnsLib.mdnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// --- Error ---
trait DnsSdError
  extends stdLib.Error {
  var errorCode: js.UndefOr[scala.Double] = js.undefined
}

object DnsSdError {
  @scala.inline
  def apply(
    message: java.lang.String,
    name: java.lang.String,
    errorCode: scala.Int | scala.Double = null,
    stack: java.lang.String = null
  ): DnsSdError = {
    val __obj = js.Dynamic.literal(message = message, name = name)
    if (errorCode != null) __obj.updateDynamic("errorCode")(errorCode.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[DnsSdError]
  }
}

