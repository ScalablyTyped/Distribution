package typings.nodemailer.libSmtpDashConnectionMod

import typings.node.NodeJSNs.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SMTPError extends ErrnoException {
  /** command which provoked an error */
  var command: js.UndefOr[String] = js.undefined
  /** the last response received from the server (if the error is caused by an error response from the server) */
  var response: js.UndefOr[String] = js.undefined
  /** the numeric response code of the response string (if available) */
  var responseCode: js.UndefOr[Double] = js.undefined
}

object SMTPError {
  @scala.inline
  def apply(
    code: String = null,
    command: String = null,
    errno: Int | Double = null,
    path: String = null,
    response: String = null,
    responseCode: Int | Double = null,
    stack: String = null,
    syscall: String = null
  ): SMTPError = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code)
    if (command != null) __obj.updateDynamic("command")(command)
    if (errno != null) __obj.updateDynamic("errno")(errno.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path)
    if (response != null) __obj.updateDynamic("response")(response)
    if (responseCode != null) __obj.updateDynamic("responseCode")(responseCode.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack)
    if (syscall != null) __obj.updateDynamic("syscall")(syscall)
    __obj.asInstanceOf[SMTPError]
  }
}

