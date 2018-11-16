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

