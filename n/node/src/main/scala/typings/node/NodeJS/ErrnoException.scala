package typings.node.NodeJS

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrnoException extends Error {
  var code: js.UndefOr[String] = js.undefined
  var errno: js.UndefOr[Double] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var syscall: js.UndefOr[String] = js.undefined
}

object ErrnoException {
  @scala.inline
  def apply(
    message: String,
    name: String,
    code: String = null,
    errno: Int | Double = null,
    path: String = null,
    stack: String = null,
    syscall: String = null
  ): ErrnoException = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (errno != null) __obj.updateDynamic("errno")(errno.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    if (syscall != null) __obj.updateDynamic("syscall")(syscall.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrnoException]
  }
}

