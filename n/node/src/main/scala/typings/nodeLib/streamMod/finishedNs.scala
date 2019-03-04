package typings
package nodeLib.streamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stream", "finished")
@js.native
object finishedNs extends js.Object {
  def __promisify__(stream: nodeLib.NodeJSNs.ReadWriteStream): js.Promise[scala.Unit] = js.native
  def __promisify__(stream: nodeLib.NodeJSNs.ReadableStream): js.Promise[scala.Unit] = js.native
  def __promisify__(stream: nodeLib.NodeJSNs.WritableStream): js.Promise[scala.Unit] = js.native
}

