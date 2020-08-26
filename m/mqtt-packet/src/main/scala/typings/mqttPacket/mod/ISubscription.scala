package typings.mqttPacket.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISubscription extends js.Object {
  var nl: js.UndefOr[Boolean] = js.native
  var qos: QoS = js.native
  var rap: js.UndefOr[Boolean] = js.native
  var rh: js.UndefOr[Double] = js.native
  var topic: String = js.native
}

object ISubscription {
  @scala.inline
  def apply(qos: QoS, topic: String): ISubscription = {
    val __obj = js.Dynamic.literal(qos = qos.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISubscription]
  }
  @scala.inline
  implicit class ISubscriptionOps[Self <: ISubscription] (val x: Self) extends AnyVal {
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
    def setQos(value: QoS): Self = this.set("qos", value.asInstanceOf[js.Any])
    @scala.inline
    def setTopic(value: String): Self = this.set("topic", value.asInstanceOf[js.Any])
    @scala.inline
    def setNl(value: Boolean): Self = this.set("nl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNl: Self = this.set("nl", js.undefined)
    @scala.inline
    def setRap(value: Boolean): Self = this.set("rap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRap: Self = this.set("rap", js.undefined)
    @scala.inline
    def setRh(value: Double): Self = this.set("rh", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRh: Self = this.set("rh", js.undefined)
  }
  
}

