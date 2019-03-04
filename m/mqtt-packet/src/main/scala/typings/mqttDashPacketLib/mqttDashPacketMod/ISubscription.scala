package typings
package mqttDashPacketLib.mqttDashPacketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISubscription extends js.Object {
  var qos: QoS
  var topic: java.lang.String
}

object ISubscription {
  @scala.inline
  def apply(qos: QoS, topic: java.lang.String): ISubscription = {
    val __obj = js.Dynamic.literal(qos = qos, topic = topic)
  
    __obj.asInstanceOf[ISubscription]
  }
}

