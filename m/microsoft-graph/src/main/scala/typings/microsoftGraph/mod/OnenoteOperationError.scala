package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnenoteOperationError extends js.Object {
  // The error code.
  var code: js.UndefOr[String] = js.undefined
  // The error message.
  var message: js.UndefOr[String] = js.undefined
}

object OnenoteOperationError {
  @scala.inline
  def apply(code: String = null, message: String = null): OnenoteOperationError = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnenoteOperationError]
  }
}

