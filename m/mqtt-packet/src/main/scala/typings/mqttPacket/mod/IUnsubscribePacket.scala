package typings.mqttPacket.mod

import typings.mqttPacket.anon.ReasonString
import typings.mqttPacket.mqttPacketStrings.unsubscribe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IUnsubscribePacket
  extends IPacket
     with Packet {
  @JSName("cmd")
  var cmd_IUnsubscribePacket: unsubscribe = js.native
  var properties: js.UndefOr[ReasonString] = js.native
  var unsubscriptions: js.Array[String] = js.native
}

object IUnsubscribePacket {
  @scala.inline
  def apply(cmd: unsubscribe, unsubscriptions: js.Array[String]): IUnsubscribePacket = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any], unsubscriptions = unsubscriptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUnsubscribePacket]
  }
  @scala.inline
  implicit class IUnsubscribePacketOps[Self <: IUnsubscribePacket] (val x: Self) extends AnyVal {
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
    def setCmd(value: unsubscribe): Self = this.set("cmd", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnsubscriptionsVarargs(value: String*): Self = this.set("unsubscriptions", js.Array(value :_*))
    @scala.inline
    def setUnsubscriptions(value: js.Array[String]): Self = this.set("unsubscriptions", value.asInstanceOf[js.Any])
    @scala.inline
    def setProperties(value: ReasonString): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
  }
  
}

