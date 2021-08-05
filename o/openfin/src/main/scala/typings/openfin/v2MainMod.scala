package typings.openfin

import typings.openfin.anon.FnCall
import typings.openfin.clientMod.RoutingInfo
import typings.openfin.identityMod.Identity
import typings.openfin.notificationMod.NotificationOptions
import typings.openfin.shapesIdentityMod.ProviderIdentity
import typings.openfin.transportMod.default
import typings.openfin.wireMod.ConnectConfig
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v2MainMod {
  
  @JSImport("openfin/_v2/main", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("openfin/_v2/main", "Application")
  @js.native
  class Application protected ()
    extends typings.openfin.applicationMod.Application {
    def this(wire: default, identity: Identity) = this()
  }
  
  @JSImport("openfin/_v2/main", "ChannelClient")
  @js.native
  class ChannelClient protected ()
    extends typings.openfin.clientMod.ChannelClient {
    def this(
      routingInfo: RoutingInfo,
      send: FnCall,
      clientMap: Map[String, typings.openfin.clientMod.ChannelClient]
    ) = this()
  }
  
  @JSImport("openfin/_v2/main", "ChannelProvider")
  @js.native
  class ChannelProvider protected ()
    extends typings.openfin.providerMod.ChannelProvider {
    def this(providerIdentity: ProviderIdentity, send: FnCall) = this()
  }
  
  @JSImport("openfin/_v2/main", "Fin")
  @js.native
  class Fin protected ()
    extends typings.openfin.finMod.default {
    def this(wire: default) = this()
  }
  
  @JSImport("openfin/_v2/main", "Frame")
  @js.native
  class Frame protected ()
    extends typings.openfin.frameFrameMod.Frame {
    def this(wire: default, identity: Identity) = this()
  }
  
  @JSImport("openfin/_v2/main", "Notification")
  @js.native
  class Notification protected ()
    extends typings.openfin.notificationMod.Notification {
    def this(wire: default, options: NotificationOptions) = this()
  }
  
  @JSImport("openfin/_v2/main", "System")
  @js.native
  class System protected ()
    extends typings.openfin.systemSystemMod.default {
    def this(wire: default) = this()
  }
  
  @JSImport("openfin/_v2/main", "View")
  @js.native
  class View protected ()
    extends typings.openfin.viewViewMod.View {
    def this(wire: default, identity: Identity) = this()
  }
  
  @JSImport("openfin/_v2/main", "Window")
  @js.native
  class Window protected ()
    extends typings.openfin.windowWindowMod.Window {
    def this(wire: default, identity: Identity) = this()
  }
  
  inline def connect(config: ConnectConfig): js.Promise[typings.openfin.finMod.default] = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.openfin.finMod.default]]
  
  inline def launch(config: ConnectConfig): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("launch")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Double]]
}
