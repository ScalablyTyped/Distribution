package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenericError extends js.Object {
  // The error code.
  var code: js.UndefOr[String] = js.undefined
  // The error message.
  var message: js.UndefOr[String] = js.undefined
}

object GenericError {
  @scala.inline
  def apply(code: String = null, message: String = null): GenericError = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code)
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[GenericError]
  }
}

