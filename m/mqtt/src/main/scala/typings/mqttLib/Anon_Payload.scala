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
  /*
    *  properies object of will
    * */
  var properties: js.UndefOr[Anon_ContentType] = js.undefined
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
    topic: java.lang.String,
    properties: Anon_ContentType = null
  ): Anon_Payload = {
    val __obj = js.Dynamic.literal(payload = payload, qos = qos, retain = retain, topic = topic)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    __obj.asInstanceOf[Anon_Payload]
  }
}

