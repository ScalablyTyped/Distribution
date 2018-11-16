package typings
package nodeLib.streamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stream", "finished")
@js.native
object finishedNs extends js.Object {
  def `__promisify__`(stream: nodeLib.NodeJSNs.ReadWriteStream): stdLib.Promise[scala.Unit] = js.native
  def `__promisify__`(stream: nodeLib.NodeJSNs.ReadableStream): stdLib.Promise[scala.Unit] = js.native
  def `__promisify__`(stream: nodeLib.NodeJSNs.WritableStream): stdLib.Promise[scala.Unit] = js.native
}

