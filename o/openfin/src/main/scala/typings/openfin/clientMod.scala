package typings.openfin

import typings.openfin.channelChannelMod.ChannelBase
import typings.openfin.channelChannelMod.ProviderIdentity
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openfin/_v2/api/interappbus/channel/client", JSImport.Namespace)
@js.native
object clientMod extends js.Object {
  @js.native
  class ChannelClient protected () extends ChannelBase {
    def this(providerIdentity: ProviderIdentity, send: FnCall, channelMap: Map[String, ChannelBase]) = this()
    var disconnectListener: js.Any = js.native
    val providerIdentity: ProviderIdentity = js.native
    def disconnect(): js.Promise[Unit] = js.native
    def dispatch(action: String): js.Promise[_] = js.native
    def dispatch(action: String, payload: js.Any): js.Promise[_] = js.native
    def onDisconnection(listener: DisconnectionListener): Unit = js.native
  }
  
  type DisconnectionListener = js.Function1[/* providerIdentity */ ProviderIdentity, js.Any]
}

