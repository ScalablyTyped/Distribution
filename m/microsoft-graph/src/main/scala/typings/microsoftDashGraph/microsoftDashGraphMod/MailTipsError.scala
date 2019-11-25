package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MailTipsError extends js.Object {
  // The error code.
  var code: js.UndefOr[String] = js.undefined
  // The error message.
  var message: js.UndefOr[String] = js.undefined
}

object MailTipsError {
  @scala.inline
  def apply(code: String = null, message: String = null): MailTipsError = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[MailTipsError]
  }
}

