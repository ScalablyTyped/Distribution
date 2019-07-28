package typings.mqtt

import typings.mqttDashPacket.mqttDashPacketMod.QoS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Nl extends js.Object {
  var nl: js.UndefOr[Boolean] = js.undefined
  var qos: QoS
  var rap: js.UndefOr[Boolean] = js.undefined
  var rh: js.UndefOr[Double] = js.undefined
}

object Anon_Nl {
  @scala.inline
  def apply(
    qos: QoS,
    nl: js.UndefOr[Boolean] = js.undefined,
    rap: js.UndefOr[Boolean] = js.undefined,
    rh: Int | Double = null
  ): Anon_Nl = {
    val __obj = js.Dynamic.literal(qos = qos)
    if (!js.isUndefined(nl)) __obj.updateDynamic("nl")(nl)
    if (!js.isUndefined(rap)) __obj.updateDynamic("rap")(rap)
    if (rh != null) __obj.updateDynamic("rh")(rh.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Nl]
  }
}

