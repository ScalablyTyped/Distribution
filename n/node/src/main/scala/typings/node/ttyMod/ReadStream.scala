package typings.node.ttyMod

import typings.node.netMod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tty", "ReadStream")
@js.native
class ReadStream () extends Socket {
  var isRaw: Boolean = js.native
  var isTTY: Boolean = js.native
  def setRawMode(mode: Boolean): Unit = js.native
}

