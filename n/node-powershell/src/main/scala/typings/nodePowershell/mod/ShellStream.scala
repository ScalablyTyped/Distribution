package typings.nodePowershell.mod

import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShellStream extends js.Object {
  var err: ReadableStream = js.native
  var stdin: WritableStream = js.native
  var stdout: ReadableStream = js.native
}

object ShellStream {
  @scala.inline
  def apply(err: ReadableStream, stdin: WritableStream, stdout: ReadableStream): ShellStream = {
    val __obj = js.Dynamic.literal(err = err.asInstanceOf[js.Any], stdin = stdin.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShellStream]
  }
  @scala.inline
  implicit class ShellStreamOps[Self <: ShellStream] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setErr(value: ReadableStream): Self = this.set("err", value.asInstanceOf[js.Any])
    @scala.inline
    def setStdin(value: WritableStream): Self = this.set("stdin", value.asInstanceOf[js.Any])
    @scala.inline
    def setStdout(value: ReadableStream): Self = this.set("stdout", value.asInstanceOf[js.Any])
  }
  
}

