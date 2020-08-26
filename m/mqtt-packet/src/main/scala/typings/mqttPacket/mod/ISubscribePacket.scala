package typings.mqttPacket.mod

import typings.mqttPacket.anon.ReasonString
import typings.mqttPacket.mqttPacketStrings.subscribe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISubscribePacket
  extends IPacket
     with Packet {
  @JSName("cmd")
  var cmd_ISubscribePacket: subscribe = js.native
  var properties: js.UndefOr[ReasonString] = js.native
  var subscriptions: js.Array[ISubscription] = js.native
}

object ISubscribePacket {
  @scala.inline
  def apply(cmd: subscribe, subscriptions: js.Array[ISubscription]): ISubscribePacket = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any], subscriptions = subscriptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISubscribePacket]
  }
  @scala.inline
  implicit class ISubscribePacketOps[Self <: ISubscribePacket] (val x: Self) extends AnyVal {
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
    def setCmd(value: subscribe): Self = this.set("cmd", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubscriptionsVarargs(value: ISubscription*): Self = this.set("subscriptions", js.Array(value :_*))
    @scala.inline
    def setSubscriptions(value: js.Array[ISubscription]): Self = this.set("subscriptions", value.asInstanceOf[js.Any])
    @scala.inline
    def setProperties(value: ReasonString): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
  }
  
}

