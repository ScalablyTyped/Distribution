package typings
package mqttDashPacketLib.mqttDashPacketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IPacket extends js.Object {
  var cmd: PacketCmd
  var length: js.UndefOr[scala.Double] = js.undefined
  var messageId: js.UndefOr[scala.Double] = js.undefined
}

