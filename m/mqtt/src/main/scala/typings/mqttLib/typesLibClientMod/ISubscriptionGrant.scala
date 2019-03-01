package typings
package mqttLib.typesLibClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISubscriptionGrant extends js.Object {
  /**
    *  is the granted qos level on it, may return 128 on error
    */
  var qos: mqttDashPacketLib.mqttDashPacketMod.QoS | scala.Double
  /**
    *  is a subscribed to topic
    */
  var topic: java.lang.String
}

object ISubscriptionGrant {
  @scala.inline
  def apply(qos: mqttDashPacketLib.mqttDashPacketMod.QoS | scala.Double, topic: java.lang.String): ISubscriptionGrant = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qos")(qos.asInstanceOf[js.Any])
    __obj.updateDynamic("topic")(topic)
    __obj.asInstanceOf[ISubscriptionGrant]
  }
}

