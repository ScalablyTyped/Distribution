package typings.nodeZookeeperClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-zookeeper-client", "State")
@js.native
class State protected () extends js.Object {
  def this(name: String, code: Double) = this()
  var code: Double = js.native
  var name: String = js.native
}

/* static members */
@JSImport("node-zookeeper-client", "State")
@js.native
object State extends js.Object {
  var AUTH_FAILED: State = js.native
  var CONNECTED_READ_ONLY: State = js.native
  var DISCONNECTED: State = js.native
  var EXPIRED: State = js.native
  var SASL_AUTHENTICATED: State = js.native
  var SYNC_CONNECTED: State = js.native
}

