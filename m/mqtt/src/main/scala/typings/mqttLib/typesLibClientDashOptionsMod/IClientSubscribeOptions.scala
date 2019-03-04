package typings
package mqttLib.typesLibClientDashOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClientSubscribeOptions extends js.Object {
  /**
    * the QoS
    */
  var qos: mqttDashPacketLib.mqttDashPacketMod.QoS
}

object IClientSubscribeOptions {
  @scala.inline
  def apply(qos: mqttDashPacketLib.mqttDashPacketMod.QoS): IClientSubscribeOptions = {
    val __obj = js.Dynamic.literal(qos = qos)
  
    __obj.asInstanceOf[IClientSubscribeOptions]
  }
}

