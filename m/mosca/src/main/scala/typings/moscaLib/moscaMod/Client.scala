package typings
package moscaLib.moscaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mosca", "Client")
@js.native
class Client protected () extends js.Object {
  def this(connection: js.Any, server: Server) = this()
  var connection: js.Any = js.native
  var id: java.lang.String = js.native
  var inflight: js.Any = js.native
  var inflightCounter: scala.Double = js.native
  var logger: js.Any = js.native
  var nextId: scala.Double = js.native
  var server: Server = js.native
  var subscriptions: js.Any = js.native
  def close(): scala.Unit = js.native
  def close(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def close(callback: js.Function0[scala.Unit], reason: java.lang.String): scala.Unit = js.native
}

