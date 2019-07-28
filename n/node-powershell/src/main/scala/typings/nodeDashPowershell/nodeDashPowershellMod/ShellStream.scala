package typings.nodeDashPowershell.nodeDashPowershellMod

import typings.node.NodeJSNs.ReadableStream
import typings.node.NodeJSNs.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShellStream extends js.Object {
  var err: ReadableStream
  var stdin: WritableStream
  var stdout: ReadableStream
}

object ShellStream {
  @scala.inline
  def apply(err: ReadableStream, stdin: WritableStream, stdout: ReadableStream): ShellStream = {
    val __obj = js.Dynamic.literal(err = err, stdin = stdin, stdout = stdout)
  
    __obj.asInstanceOf[ShellStream]
  }
}

