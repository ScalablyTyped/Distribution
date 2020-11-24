package typings.ndnJs.mod

import typings.ndnJs.faceMod.FaceCtorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ndn-js", "Face")
@js.native
class Face ()
  extends typings.ndnJs.faceMod.Face {
  def this(settings: FaceCtorOptions) = this()
  def this(
    transport: typings.ndnJs.transportMod.Transport,
    connectionInfo: typings.ndnJs.transportMod.TransportConnectionInfo
  ) = this()
}
/* static members */
@JSImport("ndn-js", "Face")
@js.native
object Face extends js.Object {
  
  def getMaxNdnPacketSize(): Double = js.native
}
