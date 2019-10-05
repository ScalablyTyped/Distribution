package typings.nanomsg.nanomsgMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nanomsg", "Socket")
@js.native
class Socket protected () extends js.Object {
  def this(`type`: String, opts: Options) = this()
  def bind(addr: String): Unit = js.native
  def close(): Unit = js.native
  def connect(addr: String): Unit = js.native
  def on(event: String, cb: js.Function1[/* data */ Buffer, Unit]): Unit = js.native
  def send(buf: String): Double = js.native
  def send(buf: Buffer): Double = js.native
  def shutdown(addr: String): Unit = js.native
}

@JSImport("nanomsg", "socket")
@js.native
object socket extends js.Object {
  def apply(`type`: String): Socket = js.native
  def apply(`type`: String, opts: Options): Socket = js.native
}

