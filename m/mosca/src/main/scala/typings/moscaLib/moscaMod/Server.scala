package typings
package moscaLib.moscaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mosca", "Server")
@js.native
class Server protected () extends js.Object {
  def this(opts: js.Any) = this()
  def this(opts: js.Any, callback: js.Function0[scala.Unit]) = this()
  var clients: js.Any = js.native
  var closed: scala.Boolean = js.native
  var id: java.lang.String = js.native
  var modernOpts: js.Any = js.native
  var opts: js.Any = js.native
  def attachHttpServer(server: js.Any): scala.Unit = js.native
  def attachHttpServer(server: js.Any, path: js.Any): scala.Unit = js.native
  def authenticate(
    client: Client,
    username: java.lang.String,
    password: java.lang.String,
    callback: js.Function2[/* obj */ js.Any, /* authenticated */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  def authorizeForward(
    client: Client,
    packet: Packet,
    callback: js.Function2[/* obj */ js.Any, /* authorized */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  def authorizePublish(
    client: Client,
    topic: java.lang.String,
    payload: java.lang.String,
    callback: js.Function2[/* obj */ js.Any, /* authorized */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  def authorizeSubscribe(
    client: Client,
    topic: java.lang.String,
    callback: js.Function2[/* obj */ js.Any, /* authorized */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  def close(): scala.Unit = js.native
  def close(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def deleteOfflinePacket(client: Client, messageId: scala.Double, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def forwardOfflinePackets(client: Client, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def forwardRetained(pattern: java.lang.String, client: Client, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def on(when: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def on(when: java.lang.String, callback: js.Function1[/* client */ Client, scala.Unit]): scala.Unit = js.native
  def on(
    when: java.lang.String,
    callback: js.Function2[/* packet */ Packet, /* client */ Client, scala.Unit]
  ): scala.Unit = js.native
  def once(when: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def persistClient(client: Client, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def publish(message: Message, callback: js.Function2[/* obj */ js.Any, /* packet */ Packet, scala.Unit]): scala.Unit = js.native
  def published(packet: Packet, client: Client, callback: js.Function1[/* obj */ js.Any, scala.Unit]): scala.Unit = js.native
  def restoreClientSubscriptions(client: Client, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def storePacket(packet: Packet, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def subscribe(topic: java.lang.String, callback: js.Function0[scala.Unit], done: js.Function0[scala.Unit]): scala.Unit = js.native
  def updateOfflinePacket(
    client: Client,
    originMessageId: scala.Double,
    packet: Packet,
    callback: js.Function2[/* obj */ js.Any, /* packet */ Packet, scala.Unit]
  ): scala.Unit = js.native
}

