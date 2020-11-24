package typings.peerDial.mod

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("peer-dial", "Server")
@js.native
class Server protected () extends EventEmitter {
  def this(options: ServerOptions) = this()
  
  def corsOptionsAppsDelegate(req: String, callback: js.Function2[/* err */ js.Any, /* data */ CorsOptions, Unit]): Unit = js.native
  
  def start(): Unit = js.native
  
  def stop(): Unit = js.native
}
