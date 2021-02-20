package typings.phantomjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebServer extends StObject {
  
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
