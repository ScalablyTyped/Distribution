package typings
package nodemailerLib.libSmtpDashConnectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SMTPError
  extends nodeLib.NodeJSNs.ErrnoException {
  /** command which provoked an error */
  var command: js.UndefOr[java.lang.String] = js.undefined
  /** the last response received from the server (if the error is caused by an error response from the server) */
  var response: js.UndefOr[java.lang.String] = js.undefined
  /** the numeric response code of the response string (if available) */
  var responseCode: js.UndefOr[scala.Double] = js.undefined
}

object SMTPError {
  @scala.inline
  def apply(
    code: java.lang.String = null,
    command: java.lang.String = null,
    errno: scala.Int | scala.Double = null,
    path: java.lang.String = null,
    response: java.lang.String = null,
    responseCode: scala.Int | scala.Double = null,
    stack: java.lang.String = null,
    syscall: java.lang.String = null
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

