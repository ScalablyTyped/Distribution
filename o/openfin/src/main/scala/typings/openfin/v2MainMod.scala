package typings.openfin

import typings.openfin.anon.FnCall
import typings.openfin.clientMod.RoutingInfo
import typings.openfin.finMod.default
import typings.openfin.identityMod.Identity
import typings.openfin.notificationMod.NotificationOptions
import typings.openfin.shapesIdentityMod.ProviderIdentity
import typings.openfin.wireMod.ConnectConfig
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openfin/_v2/main", JSImport.Namespace)
@js.native
object v2MainMod extends js.Object {
  
  def connect(config: ConnectConfig): js.Promise[default] = js.native
  
  def launch(config: ConnectConfig): js.Promise[Double] = js.native
  
  @js.native
  class Application protected ()
    extends typings.openfin.applicationMod.Application {
    def this(wire: typings.openfin.transportMod.default, identity: Identity) = this()
  }
  
  @js.native
  class ChannelClient protected ()
    extends typings.openfin.clientMod.ChannelClient {
    def this(
      routingInfo: RoutingInfo,
      send: FnCall,
      clientMap: Map[String, typings.openfin.clientMod.ChannelClient]
    ) = this()
  }
  
  @js.native
  class ChannelProvider protected ()
    extends typings.openfin.providerMod.ChannelProvider {
    def this(providerIdentity: ProviderIdentity, send: FnCall) = this()
  }
  
  @js.native
  class Fin protected () extends default {
    def this(wire: typings.openfin.transportMod.default) = this()
  }
  
  @js.native
  class Frame protected ()
    extends typings.openfin.frameFrameMod.Frame {
    def this(wire: typings.openfin.transportMod.default, identity: Identity) = this()
  }
  
  @js.native
  class Notification protected ()
    extends typings.openfin.notificationMod.Notification {
    def this(wire: typings.openfin.transportMod.default, options: NotificationOptions) = this()
  }
  
  @js.native
  class System protected ()
    extends typings.openfin.systemSystemMod.default {
    def this(wire: typings.openfin.transportMod.default) = this()
  }
  
  @js.native
  class View protected ()
    extends typings.openfin.viewViewMod.View {
    def this(wire: typings.openfin.transportMod.default, identity: Identity) = this()
  }
  
  @js.native
  class Window protected ()
    extends typings.openfin.windowWindowMod.Window {
    def this(wire: typings.openfin.transportMod.default, identity: Identity) = this()
  }
}
