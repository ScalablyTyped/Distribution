package typings
package mqttLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Nl extends js.Object {
  var nl: js.UndefOr[scala.Boolean] = js.undefined
  var qos: mqttDashPacketLib.mqttDashPacketMod.QoS
  var rap: js.UndefOr[scala.Boolean] = js.undefined
  var rh: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Nl {
  @scala.inline
  def apply(
    qos: mqttDashPacketLib.mqttDashPacketMod.QoS,
    nl: js.UndefOr[scala.Boolean] = js.undefined,
    rap: js.UndefOr[scala.Boolean] = js.undefined,
    rh: scala.Int | scala.Double = null
  ): Anon_Nl = {
    val __obj = js.Dynamic.literal(qos = qos)
    if (!js.isUndefined(nl)) __obj.updateDynamic("nl")(nl)
    if (!js.isUndefined(rap)) __obj.updateDynamic("rap")(rap)
    if (rh != null) __obj.updateDynamic("rh")(rh.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Nl]
  }
}

