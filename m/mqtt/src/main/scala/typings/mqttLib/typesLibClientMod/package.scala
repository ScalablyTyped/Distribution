package typings
package mqttLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesLibClientMod {
  type ClientSubscribeCallback = js.Function2[/* err */ nodeLib.Error, /* granted */ js.Array[ISubscriptionGrant], scala.Unit]
  type CloseCallback = js.Function0[scala.Unit]
  type OnErrorCallback = js.Function1[/* error */ nodeLib.Error, scala.Unit]
  type OnMessageCallback = js.Function3[
    /* topic */ java.lang.String, 
    /* payload */ nodeLib.Buffer, 
    /* packet */ mqttDashPacketLib.mqttDashPacketMod.Packet, 
    scala.Unit
  ]
  type OnPacketCallback = js.Function1[/* packet */ mqttDashPacketLib.mqttDashPacketMod.Packet, scala.Unit]
  type PacketCallback = js.Function2[
    /* error */ js.UndefOr[nodeLib.Error], 
    /* packet */ js.UndefOr[mqttDashPacketLib.mqttDashPacketMod.Packet], 
    js.Any
  ]
}
