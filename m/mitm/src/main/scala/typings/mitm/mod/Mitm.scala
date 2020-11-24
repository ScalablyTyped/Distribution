package typings.mitm.mod

import typings.mitm.mitmStrings.connect
import typings.mitm.mitmStrings.connection
import typings.mitm.mitmStrings.request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mitm extends js.Object {
  
  def disable(): Unit = js.native
  
  def on(event: Event, callback: Callback): Unit = js.native
  @JSName("on")
  def on_connect(event: connect, callback: SocketConnectCallback): Unit = js.native
  @JSName("on")
  def on_connection(event: connection, callback: SocketConnectionCallback): Unit = js.native
  @JSName("on")
  def on_request(event: request, callback: HttpCallback): Unit = js.native
}
