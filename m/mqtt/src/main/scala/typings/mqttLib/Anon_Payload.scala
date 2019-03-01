package typings
package mqttLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Payload extends js.Object {
  /**
    * the message to publish
    */
  var payload: java.lang.String
  /**
    * the QoS
    */
  var qos: mqttDashPacketLib.mqttDashPacketMod.QoS
  /**
    * the retain flag
    */
  var retain: scala.Boolean
  /**
    * the topic to publish
    */
  var topic: java.lang.String
}

object Anon_Payload {
  @scala.inline
  def apply(
    payload: java.lang.String,
    qos: mqttDashPacketLib.mqttDashPacketMod.QoS,
    retain: scala.Boolean,
    topic: java.lang.String
  ): Anon_Payload = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("payload")(payload)
    __obj.updateDynamic("qos")(qos)
    __obj.updateDynamic("retain")(retain)
    __obj.updateDynamic("topic")(topic)
    __obj.asInstanceOf[Anon_Payload]
  }
}

