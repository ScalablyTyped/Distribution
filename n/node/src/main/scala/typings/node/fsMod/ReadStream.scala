package typings.node.fsMod

import typings.node.Buffer
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs", "ReadStream")
@js.native
class ReadStream () extends Readable {
  var bytesRead: Double = js.native
  var path: String | Buffer = js.native
  @JSName("addListener")
  def addListener_open(event: typings.node.nodeStrings.open, listener: js.Function1[/* fd */ Double, Unit]): this.type = js.native
  def close(): Unit = js.native
  @JSName("on")
  def on_open(event: typings.node.nodeStrings.open, listener: js.Function1[/* fd */ Double, Unit]): this.type = js.native
  @JSName("once")
  def once_open(event: typings.node.nodeStrings.open, listener: js.Function1[/* fd */ Double, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_open(event: typings.node.nodeStrings.open, listener: js.Function1[/* fd */ Double, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_open(event: typings.node.nodeStrings.open, listener: js.Function1[/* fd */ Double, Unit]): this.type = js.native
}

