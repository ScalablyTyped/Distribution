package typings
package mqttLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesLibClientMod {
  type ClientSubscribeCallback = js.Function2[/* err */ stdLib.Error, /* granted */ js.Array[ISubscriptionGrant], scala.Unit]
  type CloseCallback = js.Function0[scala.Unit]
  type ISubscriptionMap = /**
    * object which has topic names as object keys and as value the options, like {'test1': {qos: 0}, 'test2': {qos: 2}}.
    */
  org.scalablytyped.runtime.StringDictionary[mqttLib.Anon_Nl]
  type OnErrorCallback = js.Function1[/* error */ stdLib.Error, scala.Unit]
  type OnMessageCallback = js.Function3[
    /* topic */ java.lang.String, 
    /* payload */ nodeLib.Buffer, 
    /* packet */ mqttDashPacketLib.mqttDashPacketMod.Packet, 
    scala.Unit
  ]
  type OnPacketCallback = js.Function1[/* packet */ mqttDashPacketLib.mqttDashPacketMod.Packet, scala.Unit]
  type PacketCallback = js.Function2[
    /* error */ js.UndefOr[stdLib.Error], 
    /* packet */ js.UndefOr[mqttDashPacketLib.mqttDashPacketMod.Packet], 
    js.Any
  ]
}
