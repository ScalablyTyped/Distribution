package typings.mqtt.clientOptionsMod

import typings.mqttPacket.mod.QoS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClientSubscribeOptions extends js.Object {
  /*
    * no local flag
    * */
  var nl: js.UndefOr[Boolean] = js.undefined
  /**
    * the QoS
    */
  var qos: QoS
  /*
    * Retain As Published flag
    * */
  var rap: js.UndefOr[Boolean] = js.undefined
  /*
    * Retain Handling option
    * */
  var rh: js.UndefOr[Double] = js.undefined
}

object IClientSubscribeOptions {
  @scala.inline
  def apply(
    qos: QoS,
    nl: js.UndefOr[Boolean] = js.undefined,
    rap: js.UndefOr[Boolean] = js.undefined,
    rh: js.UndefOr[Double] = js.undefined
  ): IClientSubscribeOptions = {
    val __obj = js.Dynamic.literal(qos = qos.asInstanceOf[js.Any])
    if (!js.isUndefined(nl)) __obj.updateDynamic("nl")(nl.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rap)) __obj.updateDynamic("rap")(rap.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rh)) __obj.updateDynamic("rh")(rh.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClientSubscribeOptions]
  }
}

