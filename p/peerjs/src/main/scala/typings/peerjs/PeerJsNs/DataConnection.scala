package typings.peerjs.PeerJsNs

import typings.peerjs.peerjsStrings.close
import typings.peerjs.peerjsStrings.data
import typings.peerjs.peerjsStrings.error
import typings.peerjs.peerjsStrings.open
import typings.std.RTCDataChannel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataConnection extends js.Object {
  var buffSize: Double = js.native
  var dataChannel: RTCDataChannel = js.native
  var label: String = js.native
  var metadata: js.Any = js.native
  var open: Boolean = js.native
  var peer: String = js.native
  var peerConnection: js.Any = js.native
  var reliable: Boolean = js.native
  var serialization: String = js.native
  var `type`: String = js.native
  def close(): Unit = js.native
  def off(event: String, fn: js.Function): Unit = js.native
  def off(event: String, fn: js.Function, once: Boolean): Unit = js.native
  def on(event: String, cb: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_close(event: close, cb: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_data(event: data, cb: js.Function1[/* data */ js.Any, Unit]): Unit = js.native
  @JSName("on")
  def on_error(event: error, cb: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
  @JSName("on")
  def on_open(event: open, cb: js.Function0[Unit]): Unit = js.native
  def send(data: js.Any): Unit = js.native
}

