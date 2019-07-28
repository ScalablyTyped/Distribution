package typings.node.fsMod

import typings.node.Buffer
import typings.node.nodeStrings.open
import typings.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs", "WriteStream")
@js.native
class WriteStream () extends Writable {
  var bytesWritten: Double = js.native
  var path: java.lang.String | Buffer = js.native
  @JSName("addListener")
  def addListener_open(event: open, listener: js.Function1[/* fd */ Double, Unit]): this.type = js.native
  def close(): Unit = js.native
  @JSName("on")
  def on_open(event: open, listener: js.Function1[/* fd */ Double, Unit]): this.type = js.native
  @JSName("once")
  def once_open(event: open, listener: js.Function1[/* fd */ Double, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_open(event: open, listener: js.Function1[/* fd */ Double, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_open(event: open, listener: js.Function1[/* fd */ Double, Unit]): this.type = js.native
}

