package typings.mosca.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mosca", "Client")
@js.native
class Client protected () extends js.Object {
  def this(connection: js.Any, server: Server) = this()
  
  def close(): Unit = js.native
  def close(callback: js.UndefOr[scala.Nothing], reason: String): Unit = js.native
  def close(callback: js.Function0[Unit]): Unit = js.native
  def close(callback: js.Function0[Unit], reason: String): Unit = js.native
  
  var connection: js.Any = js.native
  
  var id: String = js.native
  
  var inflight: js.Any = js.native
  
  var inflightCounter: Double = js.native
  
  var logger: js.Any = js.native
  
  var nextId: Double = js.native
  
  var server: Server = js.native
  
  var subscriptions: js.Any = js.native
}
