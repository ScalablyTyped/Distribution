package typings
package nanomsgLib.nanomsgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nanomsg", "Socket")
@js.native
class Socket protected () extends js.Object {
  def this(`type`: java.lang.String, opts: Options) = this()
  def bind(addr: java.lang.String): scala.Unit = js.native
  def close(): scala.Unit = js.native
  def connect(addr: java.lang.String): scala.Unit = js.native
  def on(event: java.lang.String, cb: js.Function1[/* data */ nodeLib.Buffer, scala.Unit]): scala.Unit = js.native
  def send(buf: java.lang.String): scala.Double = js.native
  def send(buf: nodeLib.Buffer): scala.Double = js.native
  def shutdown(addr: java.lang.String): scala.Unit = js.native
}

