package typings.nodeDashPowershell.nodeDashPowershellMod

import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
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
    val __obj = js.Dynamic.literal(err = err.asInstanceOf[js.Any], stdin = stdin.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ShellStream]
  }
}

