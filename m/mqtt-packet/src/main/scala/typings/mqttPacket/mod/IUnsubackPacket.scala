package typings.mqttPacket.mod

import typings.mqttPacket.anon.ReasonString
import typings.mqttPacket.mqttPacketStrings.unsuback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IUnsubackPacket
  extends IPacket
     with Packet {
  @JSName("cmd")
  var cmd_IUnsubackPacket: unsuback = js.native
  var properties: js.UndefOr[ReasonString] = js.native
}

object IUnsubackPacket {
  @scala.inline
  def apply(cmd: unsuback): IUnsubackPacket = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUnsubackPacket]
  }
  @scala.inline
  implicit class IUnsubackPacketOps[Self <: IUnsubackPacket] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCmd(value: unsuback): Self = this.set("cmd", value.asInstanceOf[js.Any])
    @scala.inline
    def setProperties(value: ReasonString): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
  }
  
}

