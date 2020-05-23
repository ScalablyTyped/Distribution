package typings.nodemailer.smtpConnectionMod

import typings.node.NodeJS.ErrnoException
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
    message: String,
    name: String,
    code: String = null,
    command: String = null,
    errno: js.UndefOr[Double] = js.undefined,
    path: String = null,
    response: String = null,
    responseCode: js.UndefOr[Double] = js.undefined,
    stack: String = null,
    syscall: String = null
  ): SMTPError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (command != null) __obj.updateDynamic("command")(command.asInstanceOf[js.Any])
    if (!js.isUndefined(errno)) __obj.updateDynamic("errno")(errno.get.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (response != null) __obj.updateDynamic("response")(response.asInstanceOf[js.Any])
    if (!js.isUndefined(responseCode)) __obj.updateDynamic("responseCode")(responseCode.get.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    if (syscall != null) __obj.updateDynamic("syscall")(syscall.asInstanceOf[js.Any])
    __obj.asInstanceOf[SMTPError]
  }
}

