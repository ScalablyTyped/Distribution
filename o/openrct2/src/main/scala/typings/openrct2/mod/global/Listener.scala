package typings.openrct2.mod.global

import typings.openrct2.openrct2Strings.connection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Listens for incoming connections.
  * Based on node.js net.Server, see https://nodejs.org/api/net.html for more information.
  */
@js.native
trait Listener extends StObject {
  
  def close(): Listener = js.native
  
  def listen(port: Double): Listener = js.native
  def listen(port: Double, host: String): Listener = js.native
  
  val listening: Boolean = js.native
  
  @JSName("off")
  def off_connection(event: connection, callback: js.Function1[/* socket */ Socket, Unit]): Listener = js.native
  
  @JSName("on")
  def on_connection(event: connection, callback: js.Function1[/* socket */ Socket, Unit]): Listener = js.native
}
