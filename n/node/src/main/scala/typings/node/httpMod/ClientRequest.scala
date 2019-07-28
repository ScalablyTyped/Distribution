package typings.node.httpMod

import typings.node.netMod.Socket
import typings.node.urlMod.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/nodejs/node/blob/master/lib/_http_client.js#L77
@JSImport("http", "ClientRequest")
@js.native
class ClientRequest protected () extends OutgoingMessage {
  def this(url: java.lang.String) = this()
  def this(url: ClientRequestArgs) = this()
  def this(url: URL) = this()
  def this(url: java.lang.String, cb: js.Function1[/* res */ IncomingMessage, Unit]) = this()
  def this(url: ClientRequestArgs, cb: js.Function1[/* res */ IncomingMessage, Unit]) = this()
  def this(url: URL, cb: js.Function1[/* res */ IncomingMessage, Unit]) = this()
  var aborted: Double = js.native
  val path: java.lang.String = js.native
  var socket: Socket = js.native
  def abort(): Unit = js.native
  def onSocket(socket: Socket): Unit = js.native
  def setNoDelay(): Unit = js.native
  def setNoDelay(noDelay: Boolean): Unit = js.native
  def setSocketKeepAlive(): Unit = js.native
  def setSocketKeepAlive(enable: Boolean): Unit = js.native
  def setSocketKeepAlive(enable: Boolean, initialDelay: Double): Unit = js.native
}

