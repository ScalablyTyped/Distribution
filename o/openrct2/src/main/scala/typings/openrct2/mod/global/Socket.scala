package typings.openrct2.mod.global

import typings.openrct2.openrct2Strings.close
import typings.openrct2.openrct2Strings.data
import typings.openrct2.openrct2Strings.error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a socket such as a TCP connection.
  * Based on node.js net.Socket, see https://nodejs.org/api/net.html for more information.
  */
@js.native
trait Socket extends StObject {
  
  def connect(port: Double, host: String, callback: js.Function): Socket = js.native
  
  def destroy(error: js.Object): Socket = js.native
  
  def end(): Socket = js.native
  def end(data: String): Socket = js.native
  
  @JSName("off")
  def off_close(event: close, callback: js.Function1[/* hadError */ Boolean, Unit]): Socket = js.native
  @JSName("off")
  def off_data(event: data, callback: js.Function1[/* data */ String, Unit]): Socket = js.native
  @JSName("off")
  def off_error(event: error, callback: js.Function1[/* hadError */ Boolean, Unit]): Socket = js.native
  
  @JSName("on")
  def on_close(event: close, callback: js.Function1[/* hadError */ Boolean, Unit]): Socket = js.native
  @JSName("on")
  def on_data(event: data, callback: js.Function1[/* data */ String, Unit]): Socket = js.native
  @JSName("on")
  def on_error(event: error, callback: js.Function1[/* hadError */ Boolean, Unit]): Socket = js.native
  
  def setNoDelay(noDelay: Boolean): Socket = js.native
  
  def write(data: String): Boolean = js.native
}
