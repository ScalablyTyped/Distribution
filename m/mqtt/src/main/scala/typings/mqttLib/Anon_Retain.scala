package typings
package mqttLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_Retain extends js.Object {
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

