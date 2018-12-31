package typings
package mqttLib.typesLibClientDashOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClientPublishOptions extends js.Object {
  /**
    * whether or not mark a message as duplicate
    */
  var dup: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * the QoS
    */
  var qos: mqttDashPacketLib.mqttDashPacketMod.QoS
  /**
    * the retain flag
    */
  var retain: js.UndefOr[scala.Boolean] = js.undefined
}

