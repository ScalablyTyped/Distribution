package typings
package mqttLib.typesLibClientDashOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClientPublishOptions extends js.Object {
  /**
    * whether or not mark a message as duplicate
    */
  var dup: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * the QoS
    */
  var qos: mqttDashPacketLib.mqttDashPacketMod.QoS
  /**
    * the retain flag
    */
  var retain: js.UndefOr[scala.Boolean] = js.undefined
}

object IClientPublishOptions {
  @scala.inline
  def apply(
    qos: mqttDashPacketLib.mqttDashPacketMod.QoS,
    dup: js.UndefOr[scala.Boolean] = js.undefined,
    retain: js.UndefOr[scala.Boolean] = js.undefined
  ): IClientPublishOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qos")(qos)
    if (!js.isUndefined(dup)) __obj.updateDynamic("dup")(dup)
    if (!js.isUndefined(retain)) __obj.updateDynamic("retain")(retain)
    __obj.asInstanceOf[IClientPublishOptions]
  }
}

