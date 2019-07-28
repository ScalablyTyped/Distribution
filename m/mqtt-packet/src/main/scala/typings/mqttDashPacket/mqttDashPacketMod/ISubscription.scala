package typings.mqttDashPacket.mqttDashPacketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISubscription extends js.Object {
  var nl: js.UndefOr[Boolean] = js.undefined
  var qos: QoS
  var rap: js.UndefOr[Boolean] = js.undefined
  var rh: js.UndefOr[Double] = js.undefined
  var topic: String
}

object ISubscription {
  @scala.inline
  def apply(
    qos: QoS,
    topic: String,
    nl: js.UndefOr[Boolean] = js.undefined,
    rap: js.UndefOr[Boolean] = js.undefined,
    rh: Int | Double = null
  ): ISubscription = {
    val __obj = js.Dynamic.literal(qos = qos, topic = topic)
    if (!js.isUndefined(nl)) __obj.updateDynamic("nl")(nl)
    if (!js.isUndefined(rap)) __obj.updateDynamic("rap")(rap)
    if (rh != null) __obj.updateDynamic("rh")(rh.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISubscription]
  }
}

