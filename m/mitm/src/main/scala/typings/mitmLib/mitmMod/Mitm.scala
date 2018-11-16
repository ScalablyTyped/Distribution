package typings
package mitmLib.mitmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mitm extends js.Object {
  def disable(): scala.Unit = js.native
  def on(event: Event, callback: Callback): scala.Unit = js.native
  @JSName("on")
  def on_connect(event: mitmLib.mitmLibStrings.connect, callback: SocketConnectCallback): scala.Unit = js.native
  @JSName("on")
  def on_connection(event: mitmLib.mitmLibStrings.connection, callback: SocketConnectionCallback): scala.Unit = js.native
  @JSName("on")
  def on_request(event: mitmLib.mitmLibStrings.request, callback: HttpCallback): scala.Unit = js.native
}

