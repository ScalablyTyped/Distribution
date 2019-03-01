package typings
package nodeDashPowershellLib.nodeDashPowershellMod.NodePowershellNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShellStream extends js.Object {
  var err: nodeLib.NodeJSNs.ReadableStream
  var stdin: nodeLib.NodeJSNs.WritableStream
  var stdout: nodeLib.NodeJSNs.ReadableStream
}

object ShellStream {
  @scala.inline
  def apply(
    err: nodeLib.NodeJSNs.ReadableStream,
    stdin: nodeLib.NodeJSNs.WritableStream,
    stdout: nodeLib.NodeJSNs.ReadableStream
  ): ShellStream = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("err")(err)
    __obj.updateDynamic("stdin")(stdin)
    __obj.updateDynamic("stdout")(stdout)
    __obj.asInstanceOf[ShellStream]
  }
}

