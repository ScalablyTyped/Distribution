package typings
package ndnDashJsLib.transportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js/transport", "Transport")
@js.native
abstract class Transport () extends js.Object {
  def isLocal(): scala.Boolean = js.native
}

/* static members */
@JSImport("ndn-js/transport", "Transport")
@js.native
object Transport extends js.Object {
  var ConnectionInfo: ndnDashJsLib.transportMod.TransportConnectionInfo = js.native
}

