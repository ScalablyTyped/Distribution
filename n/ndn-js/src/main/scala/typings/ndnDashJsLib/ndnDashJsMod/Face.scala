package typings
package ndnDashJsLib.ndnDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js", "Face")
@js.native
class Face ()
  extends ndnDashJsLib.faceMod.Face {
  def this(settings: ndnDashJsLib.faceMod.FaceCtorOptions) = this()
  def this(transport: ndnDashJsLib.transportMod.Transport, connectionInfo: ndnDashJsLib.transportMod.TransportConnectionInfo) = this()
}

/* static members */
@JSImport("ndn-js", "Face")
@js.native
object Face extends js.Object {
  def getMaxNdnPacketSize(): scala.Double = js.native
}

