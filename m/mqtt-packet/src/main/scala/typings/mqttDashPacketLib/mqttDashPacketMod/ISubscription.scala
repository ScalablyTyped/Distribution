package typings
package mqttDashPacketLib.mqttDashPacketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISubscription extends js.Object {
  var nl: js.UndefOr[scala.Boolean] = js.undefined
  var qos: QoS
  var rap: js.UndefOr[scala.Boolean] = js.undefined
  var rh: js.UndefOr[scala.Double] = js.undefined
  var topic: java.lang.String
}

object ISubscription {
  @scala.inline
  def apply(
    qos: QoS,
    topic: java.lang.String,
    nl: js.UndefOr[scala.Boolean] = js.undefined,
    rap: js.UndefOr[scala.Boolean] = js.undefined,
    rh: scala.Int | scala.Double = null
  ): ISubscription = {
    val __obj = js.Dynamic.literal(qos = qos, topic = topic)
    if (!js.isUndefined(nl)) __obj.updateDynamic("nl")(nl)
    if (!js.isUndefined(rap)) __obj.updateDynamic("rap")(rap)
    if (rh != null) __obj.updateDynamic("rh")(rh.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISubscription]
  }
}

