package typings.mqtt

import org.scalablytyped.runtime.StringDictionary
import typings.mqtt.Anon_Nl
import typings.mqttDashPacket.mqttDashPacketMod.Packet
import typings.node.Buffer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesLibClientMod {
  type ClientSubscribeCallback = js.Function2[/* err */ Error, /* granted */ js.Array[ISubscriptionGrant], Unit]
  type CloseCallback = js.Function0[Unit]
  type ISubscriptionMap = /**
    * object which has topic names as object keys and as value the options, like {'test1': {qos: 0}, 'test2': {qos: 2}}.
    */
  StringDictionary[Anon_Nl]
  type OnErrorCallback = js.Function1[/* error */ Error, Unit]
  type OnMessageCallback = js.Function3[/* topic */ String, /* payload */ Buffer, /* packet */ Packet, Unit]
  type OnPacketCallback = js.Function1[/* packet */ Packet, Unit]
  type PacketCallback = js.Function2[/* error */ js.UndefOr[Error], /* packet */ js.UndefOr[Packet], js.Any]
}
