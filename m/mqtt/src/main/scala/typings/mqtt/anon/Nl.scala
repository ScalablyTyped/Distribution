package typings.mqtt.anon

import typings.mqttPacket.mod.QoS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Nl extends js.Object {
  var nl: js.UndefOr[Boolean] = js.undefined
  var qos: QoS
  var rap: js.UndefOr[Boolean] = js.undefined
  var rh: js.UndefOr[Double] = js.undefined
}

object Nl {
  @scala.inline
  def apply(
    qos: QoS,
    nl: js.UndefOr[Boolean] = js.undefined,
    rap: js.UndefOr[Boolean] = js.undefined,
    rh: js.UndefOr[Double] = js.undefined
  ): Nl = {
    val __obj = js.Dynamic.literal(qos = qos.asInstanceOf[js.Any])
    if (!js.isUndefined(nl)) __obj.updateDynamic("nl")(nl.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rap)) __obj.updateDynamic("rap")(rap.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rh)) __obj.updateDynamic("rh")(rh.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Nl]
  }
}

