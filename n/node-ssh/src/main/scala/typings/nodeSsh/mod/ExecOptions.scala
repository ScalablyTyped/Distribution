package typings.nodeSsh.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecOptions extends js.Object {
  var cwd: js.UndefOr[String] = js.undefined
  var onStderr: js.UndefOr[js.Function1[/* chunk */ Buffer, Unit]] = js.undefined
  var onStdout: js.UndefOr[js.Function1[/* chunk */ Buffer, Unit]] = js.undefined
  var options: js.UndefOr[typings.ssh2.mod.ExecOptions] = js.undefined
  var stdin: js.UndefOr[String] = js.undefined
}

object ExecOptions {
  @scala.inline
  def apply(
    cwd: String = null,
    onStderr: /* chunk */ Buffer => Unit = null,
    onStdout: /* chunk */ Buffer => Unit = null,
    options: typings.ssh2.mod.ExecOptions = null,
    stdin: String = null
  ): ExecOptions = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (onStderr != null) __obj.updateDynamic("onStderr")(js.Any.fromFunction1(onStderr))
    if (onStdout != null) __obj.updateDynamic("onStdout")(js.Any.fromFunction1(onStdout))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (stdin != null) __obj.updateDynamic("stdin")(stdin.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecOptions]
  }
}

