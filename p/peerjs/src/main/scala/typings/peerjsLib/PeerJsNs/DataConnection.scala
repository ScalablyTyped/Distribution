package typings
package peerjsLib.PeerJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataConnection extends js.Object {
  var buffSize: scala.Double = js.native
  var dataChannel: webrtcLib.RTCDataChannel = js.native
  var label: java.lang.String = js.native
  var metadata: js.Any = js.native
  var open: scala.Boolean = js.native
  var peer: java.lang.String = js.native
  var peerConnection: js.Any = js.native
  var reliable: scala.Boolean = js.native
  var serialization: java.lang.String = js.native
  var `type`: java.lang.String = js.native
  def close(): scala.Unit = js.native
  def off(event: java.lang.String, fn: js.Function): scala.Unit = js.native
  def off(event: java.lang.String, fn: js.Function, once: scala.Boolean): scala.Unit = js.native
  def on(event: java.lang.String, cb: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("on")
  def on_close(event: peerjsLib.peerjsLibStrings.close, cb: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("on")
  def on_data(event: peerjsLib.peerjsLibStrings.data, cb: js.Function1[/* data */ js.Any, scala.Unit]): scala.Unit = js.native
  @JSName("on")
  def on_error(event: peerjsLib.peerjsLibStrings.error, cb: js.Function1[/* err */ js.Any, scala.Unit]): scala.Unit = js.native
  @JSName("on")
  def on_open(event: peerjsLib.peerjsLibStrings.open, cb: js.Function0[scala.Unit]): scala.Unit = js.native
  def send(data: js.Any): scala.Unit = js.native
}

