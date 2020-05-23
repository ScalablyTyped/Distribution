package typings.openfin.mod.fdc3

import typings.openfin.contextChannelsMod.SystemChannelTransport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openfin", "fdc3.SystemChannel")
@js.native
class SystemChannelCls protected ()
  extends typings.openfin.mainMod.SystemChannel {
  /**
    * @hidden
    *
    * Channel objects should not be created directly by an application, channel objects should be obtained by calling the relevant APIs.
    */
  def this(transport: SystemChannelTransport) = this()
}

