package typings.mongodb.mod

import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongodb", "Server")
@js.native
class Server protected () extends EventEmitter {
  def this(host: String, port: scala.Double) = this()
  def this(host: String, port: scala.Double, options: ServerOptions) = this()
  
  def connections(): js.Array[js.Any] = js.native
}
