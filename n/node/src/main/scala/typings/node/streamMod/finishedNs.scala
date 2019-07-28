package typings.node.streamMod

import typings.node.NodeJSNs.ReadWriteStream
import typings.node.NodeJSNs.ReadableStream
import typings.node.NodeJSNs.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stream", "finished")
@js.native
object finishedNs extends js.Object {
  def __promisify__(stream: ReadWriteStream): js.Promise[Unit] = js.native
  def __promisify__(stream: ReadableStream): js.Promise[Unit] = js.native
  def __promisify__(stream: WritableStream): js.Promise[Unit] = js.native
}

