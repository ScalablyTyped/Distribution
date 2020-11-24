package typings.mosca.mod

import typings.mosca.moscaStrings.clientConnected
import typings.mosca.moscaStrings.clientDisconnected
import typings.mosca.moscaStrings.clientDisconnecting
import typings.mosca.moscaStrings.published
import typings.mosca.moscaStrings.ready
import typings.mosca.moscaStrings.subscribed
import typings.mosca.moscaStrings.unsubscribed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mosca", "Server")
@js.native
class Server protected () extends js.Object {
  def this(opts: ServerOptions) = this()
  def this(opts: ServerOptions, callback: js.Function0[Unit]) = this()
  
  def attachHttpServer(server: js.Any): Unit = js.native
  def attachHttpServer(server: js.Any, path: js.Any): Unit = js.native
  
  def authenticate(
    client: Client,
    username: String,
    password: String,
    callback: js.Function2[/* obj */ js.Any, /* authenticated */ Boolean, Unit]
  ): Unit = js.native
  
  def authorizeForward(
    client: Client,
    packet: Packet,
    callback: js.Function2[/* obj */ js.Any, /* authorized */ Boolean, Unit]
  ): Unit = js.native
  
  def authorizePublish(
    client: Client,
    topic: String,
    payload: String,
    callback: js.Function2[/* obj */ js.Any, /* authorized */ Boolean, Unit]
  ): Unit = js.native
  
  def authorizeSubscribe(
    client: Client,
    topic: String,
    callback: js.Function2[/* obj */ js.Any, /* authorized */ Boolean, Unit]
  ): Unit = js.native
  
  var clients: js.Any = js.native
  
  def close(): Unit = js.native
  def close(callback: js.Function0[Unit]): Unit = js.native
  
  var closed: Boolean = js.native
  
  def deleteOfflinePacket(client: Client, messageId: Double, callback: js.Function0[Unit]): Unit = js.native
  
  def forwardOfflinePackets(client: Client, callback: js.Function0[Unit]): Unit = js.native
  
  def forwardRetained(pattern: String, client: Client, callback: js.Function0[Unit]): Unit = js.native
  
  var id: String = js.native
  
  var modernOpts: js.Any = js.native
  
  def on(when: String, callback: js.Function0[Unit]): Unit = js.native
  def on(when: String, callback: js.Function1[/* client */ Client, Unit]): Unit = js.native
  def on(when: String, callback: js.Function2[/* packet */ Packet, /* client */ Client, Unit]): Unit = js.native
  @JSName("on")
  def on_clientConnected(when: clientConnected, callback: js.Function1[/* client */ Client, Unit]): Unit = js.native
  @JSName("on")
  def on_clientDisconnected(when: clientDisconnected, callback: js.Function1[/* client */ Client, Unit]): Unit = js.native
  @JSName("on")
  def on_clientDisconnecting(when: clientDisconnecting, callback: js.Function1[/* client */ Client, Unit]): Unit = js.native
  @JSName("on")
  def on_published(when: published, callback: js.Function2[/* packet */ Packet, /* client */ Client, Unit]): Unit = js.native
  @JSName("on")
  def on_ready(when: ready, callback: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_subscribed(when: subscribed, callback: js.Function2[/* topic */ String, /* client */ Client, Unit]): Unit = js.native
  @JSName("on")
  def on_unsubscribed(when: unsubscribed, callback: js.Function2[/* topic */ String, /* client */ Client, Unit]): Unit = js.native
  
  def once(when: String, callback: js.Function0[Unit]): Unit = js.native
  
  var opts: js.Any = js.native
  
  def persistClient(client: Client, callback: js.Function0[Unit]): Unit = js.native
  
  def publish(message: Message, callback: js.Function2[/* obj */ js.Any, /* packet */ Packet, Unit]): Unit = js.native
  
  def published(packet: Packet, client: Client, callback: js.Function1[/* obj */ js.Any, Unit]): Unit = js.native
  
  def restoreClientSubscriptions(client: Client, callback: js.Function0[Unit]): Unit = js.native
  
  def storePacket(packet: Packet, callback: js.Function0[Unit]): Unit = js.native
  
  def subscribe(topic: String, callback: js.Function0[Unit], done: js.Function0[Unit]): Unit = js.native
  
  def updateOfflinePacket(
    client: Client,
    originMessageId: Double,
    packet: Packet,
    callback: js.Function2[/* obj */ js.Any, /* packet */ Packet, Unit]
  ): Unit = js.native
}
