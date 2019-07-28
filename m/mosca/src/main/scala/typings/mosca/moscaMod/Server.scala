package typings.mosca.moscaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mosca", "Server")
@js.native
class Server protected () extends js.Object {
  def this(opts: js.Any) = this()
  def this(opts: js.Any, callback: js.Function0[Unit]) = this()
  var clients: js.Any = js.native
  var closed: Boolean = js.native
  var id: String = js.native
  var modernOpts: js.Any = js.native
  var opts: js.Any = js.native
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
  def close(): Unit = js.native
  def close(callback: js.Function0[Unit]): Unit = js.native
  def deleteOfflinePacket(client: Client, messageId: Double, callback: js.Function0[Unit]): Unit = js.native
  def forwardOfflinePackets(client: Client, callback: js.Function0[Unit]): Unit = js.native
  def forwardRetained(pattern: String, client: Client, callback: js.Function0[Unit]): Unit = js.native
  def on(when: String, callback: js.Function0[Unit]): Unit = js.native
  def on(when: String, callback: js.Function1[/* client */ Client, Unit]): Unit = js.native
  def on(when: String, callback: js.Function2[/* packet */ Packet, /* client */ Client, Unit]): Unit = js.native
  def once(when: String, callback: js.Function0[Unit]): Unit = js.native
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

