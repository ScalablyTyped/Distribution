package typings.node.httpMod

import typings.node.netMod.Socket
import typings.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/nodejs/node/blob/master/lib/_http_outgoing.js
@JSImport("http", "OutgoingMessage")
@js.native
class OutgoingMessage () extends Writable {
  var chunkedEncoding: Boolean = js.native
  var connection: Socket = js.native
  var finished: Boolean = js.native
  var headersSent: Boolean = js.native
  var sendDate: Boolean = js.native
  var shouldKeepAlive: Boolean = js.native
  var upgrading: Boolean = js.native
  var useChunkedEncodingByDefault: Boolean = js.native
  def addTrailers(headers: js.Array[js.Tuple2[java.lang.String, java.lang.String]]): Unit = js.native
  def addTrailers(headers: OutgoingHttpHeaders): Unit = js.native
  def flushHeaders(): Unit = js.native
  def getHeader(name: java.lang.String): js.UndefOr[Double | java.lang.String | js.Array[java.lang.String]] = js.native
  def getHeaderNames(): js.Array[java.lang.String] = js.native
  def getHeaders(): OutgoingHttpHeaders = js.native
  def hasHeader(name: java.lang.String): Boolean = js.native
  def removeHeader(name: java.lang.String): Unit = js.native
  def setHeader(name: java.lang.String, value: java.lang.String): Unit = js.native
  def setHeader(name: java.lang.String, value: js.Array[java.lang.String]): Unit = js.native
  def setHeader(name: java.lang.String, value: Double): Unit = js.native
  def setTimeout(msecs: Double): this.type = js.native
  def setTimeout(msecs: Double, callback: js.Function0[Unit]): this.type = js.native
}

