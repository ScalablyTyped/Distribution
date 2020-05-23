package typings.nodeSsh.anon

import typings.node.Buffer
import typings.nodeSsh.nodeSshStrings.stderr
import typings.nodeSsh.nodeSshStrings.stdout
import typings.ssh2.mod.ExecOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined node-ssh.node-ssh.ExecOptions & {  stream ? :'stdout' | 'stderr'} */
trait ExecOptionsstreamstdoutst extends js.Object {
  var cwd: js.UndefOr[String] = js.undefined
  var onStderr: js.UndefOr[js.Function1[/* chunk */ Buffer, Unit]] = js.undefined
  var onStdout: js.UndefOr[js.Function1[/* chunk */ Buffer, Unit]] = js.undefined
  var options: js.UndefOr[ExecOptions] = js.undefined
  var stdin: js.UndefOr[String] = js.undefined
  var stream: js.UndefOr[stdout | stderr] = js.undefined
}

object ExecOptionsstreamstdoutst {
  @scala.inline
  def apply(
    cwd: String = null,
    onStderr: /* chunk */ Buffer => Unit = null,
    onStdout: /* chunk */ Buffer => Unit = null,
    options: ExecOptions = null,
    stdin: String = null,
    stream: stdout | stderr = null
  ): ExecOptionsstreamstdoutst = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (onStderr != null) __obj.updateDynamic("onStderr")(js.Any.fromFunction1(onStderr))
    if (onStdout != null) __obj.updateDynamic("onStdout")(js.Any.fromFunction1(onStdout))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (stdin != null) __obj.updateDynamic("stdin")(stdin.asInstanceOf[js.Any])
    if (stream != null) __obj.updateDynamic("stream")(stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecOptionsstreamstdoutst]
  }
}

