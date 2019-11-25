package typings.mqtt.typesLibClientMod

import typings.mqttDashPacket.mqttDashPacketMod.QoS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISubscriptionRequest extends js.Object {
  /*
    * no local flag
    * */
  var nl: js.UndefOr[Boolean] = js.undefined
  /**
    *  is the granted qos level on it
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
  /**
    *  is a subscribed to topic
    */
  var topic: String
}

object ISubscriptionRequest {
  @scala.inline
  def apply(
    qos: QoS,
    topic: String,
    nl: js.UndefOr[Boolean] = js.undefined,
    rap: js.UndefOr[Boolean] = js.undefined,
    rh: Int | Double = null
  ): ISubscriptionRequest = {
    val __obj = js.Dynamic.literal(qos = qos.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    if (!js.isUndefined(nl)) __obj.updateDynamic("nl")(nl.asInstanceOf[js.Any])
    if (!js.isUndefined(rap)) __obj.updateDynamic("rap")(rap.asInstanceOf[js.Any])
    if (rh != null) __obj.updateDynamic("rh")(rh.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISubscriptionRequest]
  }
}

