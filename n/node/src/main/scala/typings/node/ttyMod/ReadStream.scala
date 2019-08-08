package typings.node.ttyMod

import typings.node.netMod.Socket
import typings.node.netMod.SocketConstructorOpts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tty", "ReadStream")
@js.native
class ReadStream protected () extends Socket {
  def this(fd: Double) = this()
  def this(fd: Double, options: SocketConstructorOpts) = this()
  var isRaw: Boolean = js.native
  var isTTY: Boolean = js.native
  def setRawMode(mode: Boolean): Unit = js.native
}

