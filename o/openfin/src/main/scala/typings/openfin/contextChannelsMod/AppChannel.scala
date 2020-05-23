package typings.openfin.contextChannelsMod

import typings.openfin.openfinStrings.app
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openfin/_v2/fdc3/contextChannels", "AppChannel")
@js.native
class AppChannel protected ()
  extends ChannelBase
     with Channel {
  /**
    * @hidden
    *
    * Channel objects should not be created directly by an application, channel objects should be obtained by calling the relevant APIs.
    */
  def this(transport: AppChannelTransport) = this()
  /**
    * The name of this channel. This is the same string as is passed to [[getOrCreateAppChannel]].
    */
  val name: String = js.native
  @JSName("type")
  val type_AppChannel: app = js.native
}

