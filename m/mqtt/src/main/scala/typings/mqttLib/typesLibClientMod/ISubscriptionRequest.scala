package typings
package mqttLib.typesLibClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISubscriptionRequest extends js.Object {
  /*
    * no local flag
    * */
  var nl: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *  is the granted qos level on it
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
  /**
    *  is a subscribed to topic
    */
  var topic: java.lang.String
}

object ISubscriptionRequest {
  @scala.inline
  def apply(
    qos: mqttDashPacketLib.mqttDashPacketMod.QoS,
    topic: java.lang.String,
    nl: js.UndefOr[scala.Boolean] = js.undefined,
    rap: js.UndefOr[scala.Boolean] = js.undefined,
    rh: scala.Int | scala.Double = null
  ): ISubscriptionRequest = {
    val __obj = js.Dynamic.literal(qos = qos, topic = topic)
    if (!js.isUndefined(nl)) __obj.updateDynamic("nl")(nl)
    if (!js.isUndefined(rap)) __obj.updateDynamic("rap")(rap)
    if (rh != null) __obj.updateDynamic("rh")(rh.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISubscriptionRequest]
  }
}

