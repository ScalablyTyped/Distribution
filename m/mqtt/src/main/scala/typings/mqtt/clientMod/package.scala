package typings.mqtt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientMod {
  type ClientSubscribeCallback = js.Function2[
    /* err */ typings.std.Error, 
    /* granted */ js.Array[typings.mqtt.clientMod.ISubscriptionGrant], 
    scala.Unit
  ]
  type CloseCallback = js.Function0[scala.Unit]
  type ISubscriptionMap = /**
    * object which has topic names as object keys and as value the options, like {'test1': {qos: 0}, 'test2': {qos: 2}}.
    */
  org.scalablytyped.runtime.StringDictionary[typings.mqtt.anon.Nl]
  type OnConnectCallback = js.Function1[/* packet */ typings.mqttPacket.mod.Packet, scala.Unit]
  type OnErrorCallback = js.Function1[/* error */ typings.std.Error, scala.Unit]
  type OnMessageCallback = js.Function3[
    /* topic */ java.lang.String, 
    /* payload */ typings.node.Buffer, 
    /* packet */ typings.mqttPacket.mod.Packet, 
    scala.Unit
  ]
  type OnPacketCallback = js.Function1[/* packet */ typings.mqttPacket.mod.Packet, scala.Unit]
  type PacketCallback = js.Function2[
    /* error */ js.UndefOr[typings.std.Error], 
    /* packet */ js.UndefOr[typings.mqttPacket.mod.Packet], 
    js.Any
  ]
}
