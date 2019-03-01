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

object IPacket {
  @scala.inline
  def apply(
    cmd: PacketCmd,
    length: scala.Int | scala.Double = null,
    messageId: scala.Int | scala.Double = null
  ): IPacket = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cmd")(cmd)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPacket]
  }
}

