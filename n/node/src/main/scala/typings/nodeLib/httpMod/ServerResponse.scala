package typings
package nodeLib.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/nodejs/node/blob/master/lib/_http_server.js#L108-L256
@JSImport("http", "ServerResponse")
@js.native
class ServerResponse protected () extends OutgoingMessage {
  def this(req: IncomingMessage) = this()
  var statusCode: scala.Double = js.native
  var statusMessage: java.lang.String = js.native
  def assignSocket(socket: nodeLib.netMod.Socket): scala.Unit = js.native
  def detachSocket(socket: nodeLib.netMod.Socket): scala.Unit = js.native
  // https://github.com/nodejs/node/blob/master/test/parallel/test-http-write-callbacks.js#L53
  // no args in writeContinue callback
  def writeContinue(): scala.Unit = js.native
  def writeContinue(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def writeHead(statusCode: scala.Double): this.type = js.native
  def writeHead(statusCode: scala.Double, headers: OutgoingHttpHeaders): this.type = js.native
  def writeHead(statusCode: scala.Double, reasonPhrase: java.lang.String): this.type = js.native
  def writeHead(statusCode: scala.Double, reasonPhrase: java.lang.String, headers: OutgoingHttpHeaders): this.type = js.native
}

