package typings.openfin.contextChannelsMod

import typings.openfin.openfinStrings.system
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openfin/_v2/fdc3/contextChannels", "SystemChannel")
@js.native
class SystemChannel protected ()
  extends ChannelBase
     with Channel {
  /**
    * @hidden
    *
    * Channel objects should not be created directly by an application, channel objects should be obtained by calling the relevant APIs.
    */
  def this(transport: SystemChannelTransport) = this()
  @JSName("type")
  val type_SystemChannel: system = js.native
  /**
    * How a client application should present this channel in any UI.
    */
  val visualIdentity: DisplayMetadata = js.native
}

