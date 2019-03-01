package typings
package mqttLib.typesLibClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISubscriptionRequest extends js.Object {
  /**
    *  is the granted qos level on it
    */
  var qos: mqttDashPacketLib.mqttDashPacketMod.QoS
  /**
    *  is a subscribed to topic
    */
  var topic: java.lang.String
}

object ISubscriptionRequest {
  @scala.inline
  def apply(qos: mqttDashPacketLib.mqttDashPacketMod.QoS, topic: java.lang.String): ISubscriptionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qos")(qos)
    __obj.updateDynamic("topic")(topic)
    __obj.asInstanceOf[ISubscriptionRequest]
  }
}

