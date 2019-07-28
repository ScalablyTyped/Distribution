package typings.ndnDashJs.ndnDashJsMod

import typings.ndnDashJs.faceMod.FaceCtorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js", "Face")
@js.native
class Face ()
  extends typings.ndnDashJs.faceMod.Face {
  def this(settings: FaceCtorOptions) = this()
  def this(
    transport: typings.ndnDashJs.transportMod.Transport,
    connectionInfo: typings.ndnDashJs.transportMod.TransportConnectionInfo
  ) = this()
}

/* static members */
@JSImport("ndn-js", "Face")
@js.native
object Face extends js.Object {
  def getMaxNdnPacketSize(): Double = js.native
}

