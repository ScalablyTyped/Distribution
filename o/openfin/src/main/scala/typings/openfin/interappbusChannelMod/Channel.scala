package typings.openfin.interappbusChannelMod

import typings.openfin.baseMod.EmitterBase
import typings.openfin.channelMod.ChannelEvents
import typings.openfin.clientMod.ChannelClient
import typings.openfin.providerMod.ChannelProvider
import typings.openfin.shapesIdentityMod.ProviderIdentity
import typings.openfin.transportMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openfin/_v2/api/interappbus/channel", "Channel")
@js.native
class Channel protected () extends EmitterBase[ChannelEvents] {
  def this(wire: default) = this()
  var clientMap: js.Any = js.native
  var endpointIdMap: js.Any = js.native
  var processChannelConnection: js.Any = js.native
  var processChannelMessage: js.Any = js.native
  var providerMap: js.Any = js.native
  /* protected */ def addChannelToClientMaps(channel: ChannelClient, channelId: String, endpointId: String): Unit = js.native
  /* protected */ def checkForPreviousClientConnection(channelId: String): Unit = js.native
  def connect(channelName: String): js.Promise[ChannelClient] = js.native
  def connect(channelName: String, options: ConnectOptions): js.Promise[ChannelClient] = js.native
  def create(channelName: String): js.Promise[ChannelProvider] = js.native
  def getAllChannels(): js.Promise[js.Array[ProviderIdentity]] = js.native
  def onChannelConnect(listener: js.Function1[/* repeated */ js.Any, Unit]): js.Promise[Unit] = js.native
  def onChannelDisconnect(listener: js.Function1[/* repeated */ js.Any, Unit]): js.Promise[Unit] = js.native
  def onmessage(msg: ChannelMessage): Boolean = js.native
  /* protected */ def removeChannelFromClientMaps(channelId: String, endpointId: String): Unit = js.native
  /* protected */ def removeChannelFromProviderMap(channelId: String): Unit = js.native
}

