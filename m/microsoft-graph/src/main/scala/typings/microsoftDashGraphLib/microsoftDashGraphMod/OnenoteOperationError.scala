package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnenoteOperationError extends js.Object {
  // The error code.
  var code: js.UndefOr[java.lang.String] = js.undefined
  // The error message.
  var message: js.UndefOr[java.lang.String] = js.undefined
}

object OnenoteOperationError {
  @scala.inline
  def apply(code: java.lang.String = null, message: java.lang.String = null): OnenoteOperationError = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code)
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[OnenoteOperationError]
  }
}

