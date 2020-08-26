package typings.mqttPacket.mod

import typings.mqttPacket.anon.AssignedClientIdentifier
import typings.mqttPacket.mqttPacketStrings.connack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IConnackPacket
  extends IPacket
     with Packet {
  @JSName("cmd")
  var cmd_IConnackPacket: connack = js.native
  var properties: js.UndefOr[AssignedClientIdentifier] = js.native
  var returnCode: Double = js.native
  var sessionPresent: Boolean = js.native
}

object IConnackPacket {
  @scala.inline
  def apply(cmd: connack, returnCode: Double, sessionPresent: Boolean): IConnackPacket = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any], returnCode = returnCode.asInstanceOf[js.Any], sessionPresent = sessionPresent.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConnackPacket]
  }
  @scala.inline
  implicit class IConnackPacketOps[Self <: IConnackPacket] (val x: Self) extends AnyVal {
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
    def setCmd(value: connack): Self = this.set("cmd", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnCode(value: Double): Self = this.set("returnCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setSessionPresent(value: Boolean): Self = this.set("sessionPresent", value.asInstanceOf[js.Any])
    @scala.inline
    def setProperties(value: AssignedClientIdentifier): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
  }
  
}

