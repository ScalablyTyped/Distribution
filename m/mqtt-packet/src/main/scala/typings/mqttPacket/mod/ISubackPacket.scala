package typings.mqttPacket.mod

import typings.mqttPacket.anon.ReasonString
import typings.mqttPacket.mqttPacketStrings.suback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISubackPacket
  extends IPacket
     with Packet {
  @JSName("cmd")
  var cmd_ISubackPacket: suback = js.native
  var granted: js.Array[Double | js.Object] = js.native
  var properties: js.UndefOr[ReasonString] = js.native
}

object ISubackPacket {
  @scala.inline
  def apply(cmd: suback, granted: js.Array[Double | js.Object]): ISubackPacket = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any], granted = granted.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISubackPacket]
  }
  @scala.inline
  implicit class ISubackPacketOps[Self <: ISubackPacket] (val x: Self) extends AnyVal {
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
    def setCmd(value: suback): Self = this.set("cmd", value.asInstanceOf[js.Any])
    @scala.inline
    def setGrantedVarargs(value: (Double | js.Object)*): Self = this.set("granted", js.Array(value :_*))
    @scala.inline
    def setGranted(value: js.Array[Double | js.Object]): Self = this.set("granted", value.asInstanceOf[js.Any])
    @scala.inline
    def setProperties(value: ReasonString): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
  }
  
}

