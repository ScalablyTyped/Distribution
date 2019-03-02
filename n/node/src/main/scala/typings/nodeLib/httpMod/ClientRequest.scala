package typings
package nodeLib.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/nodejs/node/blob/master/lib/_http_client.js#L77
@JSImport("http", "ClientRequest")
@js.native
class ClientRequest protected () extends OutgoingMessage {
  def this(url: java.lang.String) = this()
  def this(url: ClientRequestArgs) = this()
  def this(url: nodeLib.urlMod.URL) = this()
  def this(url: java.lang.String, cb: js.Function1[/* res */ IncomingMessage, scala.Unit]) = this()
  def this(url: ClientRequestArgs, cb: js.Function1[/* res */ IncomingMessage, scala.Unit]) = this()
  def this(url: nodeLib.urlMod.URL, cb: js.Function1[/* res */ IncomingMessage, scala.Unit]) = this()
  var aborted: scala.Double = js.native
  val path: java.lang.String = js.native
  var socket: nodeLib.netMod.Socket = js.native
  def abort(): scala.Unit = js.native
  def onSocket(socket: nodeLib.netMod.Socket): scala.Unit = js.native
  def setNoDelay(): scala.Unit = js.native
  def setNoDelay(noDelay: scala.Boolean): scala.Unit = js.native
  def setSocketKeepAlive(): scala.Unit = js.native
  def setSocketKeepAlive(enable: scala.Boolean): scala.Unit = js.native
  def setSocketKeepAlive(enable: scala.Boolean, initialDelay: scala.Double): scala.Unit = js.native
}

