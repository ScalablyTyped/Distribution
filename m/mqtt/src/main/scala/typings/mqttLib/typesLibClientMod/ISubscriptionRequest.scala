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

