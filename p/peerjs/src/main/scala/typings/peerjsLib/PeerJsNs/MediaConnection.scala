package typings
package peerjsLib.PeerJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaConnection extends js.Object {
  var metadata: js.Any = js.native
  var open: scala.Boolean = js.native
  var peer: java.lang.String = js.native
  var `type`: java.lang.String = js.native
  def answer(): scala.Unit = js.native
  def answer(stream: js.Any): scala.Unit = js.native
  def close(): scala.Unit = js.native
  def off(event: java.lang.String, fn: js.Function): scala.Unit = js.native
  def off(event: java.lang.String, fn: js.Function, once: scala.Boolean): scala.Unit = js.native
  def on(event: java.lang.String, cb: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("on")
  def on_close(event: peerjsLib.peerjsLibStrings.close, cb: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("on")
  def on_error(event: peerjsLib.peerjsLibStrings.error, cb: js.Function1[/* err */ js.Any, scala.Unit]): scala.Unit = js.native
  @JSName("on")
  def on_stream(event: peerjsLib.peerjsLibStrings.stream, cb: js.Function1[/* stream */ js.Any, scala.Unit]): scala.Unit = js.native
}

