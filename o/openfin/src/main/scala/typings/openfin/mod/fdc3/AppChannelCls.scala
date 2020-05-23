package typings.openfin.mod.fdc3

import typings.openfin.contextChannelsMod.AppChannelTransport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openfin", "fdc3.AppChannel")
@js.native
class AppChannelCls protected ()
  extends typings.openfin.mainMod.AppChannel {
  /**
    * @hidden
    *
    * Channel objects should not be created directly by an application, channel objects should be obtained by calling the relevant APIs.
    */
  def this(transport: AppChannelTransport) = this()
}

