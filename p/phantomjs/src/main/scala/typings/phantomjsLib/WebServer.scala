package typings
package phantomjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebServer extends js.Object {
  var port: scala.Double = js.native
  def close(): scala.Unit = js.native
  def listen(ipAddressPort: java.lang.String): scala.Boolean = js.native
  def listen(
    ipAddressPort: java.lang.String,
    cb: js.Function2[/* request */ WebServerRequest, /* response */ WebServerResponse, scala.Unit]
  ): scala.Boolean = js.native
  def listen(port: scala.Double): scala.Boolean = js.native
  def listen(
    port: scala.Double,
    cb: js.Function2[/* request */ WebServerRequest, /* response */ WebServerResponse, scala.Unit]
  ): scala.Boolean = js.native
}

