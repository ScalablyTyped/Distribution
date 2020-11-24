package typings.phantomjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebServer extends js.Object {
  
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
  
  var port: Double = js.native
}
