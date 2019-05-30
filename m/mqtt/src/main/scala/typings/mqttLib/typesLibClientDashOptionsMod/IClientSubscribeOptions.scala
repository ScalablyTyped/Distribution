package typings
package mqttLib.typesLibClientDashOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClientSubscribeOptions extends js.Object {
  /*
    * no local flag
    * */
  var nl: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * the QoS
    */
  var qos: mqttDashPacketLib.mqttDashPacketMod.QoS
  /*
    * Retain As Published flag
    * */
  var rap: js.UndefOr[scala.Boolean] = js.undefined
  /*
    * Retain Handling option
    * */
  var rh: js.UndefOr[scala.Double] = js.undefined
}

object IClientSubscribeOptions {
  @scala.inline
  def apply(
    qos: mqttDashPacketLib.mqttDashPacketMod.QoS,
    nl: js.UndefOr[scala.Boolean] = js.undefined,
    rap: js.UndefOr[scala.Boolean] = js.undefined,
    rh: scala.Int | scala.Double = null
  ): IClientSubscribeOptions = {
    val __obj = js.Dynamic.literal(qos = qos)
    if (!js.isUndefined(nl)) __obj.updateDynamic("nl")(nl)
    if (!js.isUndefined(rap)) __obj.updateDynamic("rap")(rap)
    if (rh != null) __obj.updateDynamic("rh")(rh.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClientSubscribeOptions]
  }
}

