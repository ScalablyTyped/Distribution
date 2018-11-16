package typings
package nodeLib.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/nodejs/node/blob/master/lib/_http_outgoing.js
@JSImport("http", "OutgoingMessage")
@js.native
class OutgoingMessage ()
  extends nodeLib.streamMod.Writable {
  var chunkedEncoding: scala.Boolean = js.native
  var connection: nodeLib.netMod.Socket = js.native
  var finished: scala.Boolean = js.native
  var headersSent: scala.Boolean = js.native
  var sendDate: scala.Boolean = js.native
  var shouldKeepAlive: scala.Boolean = js.native
  var upgrading: scala.Boolean = js.native
  var useChunkedEncodingByDefault: scala.Boolean = js.native
  def addTrailers(headers: js.Array[js.Tuple2[java.lang.String, java.lang.String]]): scala.Unit = js.native
  def addTrailers(headers: OutgoingHttpHeaders): scala.Unit = js.native
  def flushHeaders(): scala.Unit = js.native
  def getHeader(name: java.lang.String): js.UndefOr[scala.Double | java.lang.String | js.Array[java.lang.String]] = js.native
  def getHeaderNames(): js.Array[java.lang.String] = js.native
  def getHeaders(): OutgoingHttpHeaders = js.native
  def hasHeader(name: java.lang.String): scala.Boolean = js.native
  def removeHeader(name: java.lang.String): scala.Unit = js.native
  def setHeader(name: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def setHeader(name: java.lang.String, value: js.Array[java.lang.String]): scala.Unit = js.native
  def setHeader(name: java.lang.String, value: scala.Double): scala.Unit = js.native
  def setTimeout(msecs: scala.Double): this.type = js.native
  def setTimeout(msecs: scala.Double, callback: js.Function0[scala.Unit]): this.type = js.native
}

