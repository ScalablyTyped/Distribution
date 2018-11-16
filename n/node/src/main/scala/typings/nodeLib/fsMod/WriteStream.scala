package typings
package nodeLib.fsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs", "WriteStream")
@js.native
class WriteStream ()
  extends nodeLib.streamMod.Writable {
  var bytesWritten: scala.Double = js.native
  var path: java.lang.String | nodeLib.Buffer = js.native
  @JSName("addListener")
  def addListener_open(event: nodeLib.nodeLibStrings.open, listener: js.Function1[/* fd */ scala.Double, scala.Unit]): this.type = js.native
  def close(): scala.Unit = js.native
  @JSName("on")
  def on_open(event: nodeLib.nodeLibStrings.open, listener: js.Function1[/* fd */ scala.Double, scala.Unit]): this.type = js.native
  @JSName("once")
  def once_open(event: nodeLib.nodeLibStrings.open, listener: js.Function1[/* fd */ scala.Double, scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_open(event: nodeLib.nodeLibStrings.open, listener: js.Function1[/* fd */ scala.Double, scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_open(event: nodeLib.nodeLibStrings.open, listener: js.Function1[/* fd */ scala.Double, scala.Unit]): this.type = js.native
}

