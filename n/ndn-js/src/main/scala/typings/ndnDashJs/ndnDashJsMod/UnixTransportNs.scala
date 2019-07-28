package typings.ndnDashJs.ndnDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js", "UnixTransport")
@js.native
object UnixTransportNs extends js.Object {
  @js.native
  class ConnectionInfo protected ()
    extends typings.ndnDashJs.transportMod.UnixTransportNs.ConnectionInfo {
    def this(filePath: String) = this()
  }
  
}

