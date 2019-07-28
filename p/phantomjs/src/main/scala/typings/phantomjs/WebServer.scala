package typings.phantomjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebServer extends js.Object {
  var port: Double = js.native
  def close(): Unit = js.native
  def listen(ipAddressPort: String): Boolean = js.native
  def listen(
    ipAddressPort: String,
    cb: js.Function2[/* request */ WebServerRequest, /* response */ WebServerResponse, Unit]
  ): Boolean = js.native
  def listen(port: Double): Boolean = js.native
  def listen(
    port: Double,
    cb: js.Function2[/* request */ WebServerRequest, /* response */ WebServerResponse, Unit]
  ): Boolean = js.native
}

