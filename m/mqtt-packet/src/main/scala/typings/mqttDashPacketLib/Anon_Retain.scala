package typings
package mqttDashPacketLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_Retain extends js.Object {
  var payload: nodeLib.Buffer
  var qos: js.UndefOr[mqttDashPacketLib.mqttDashPacketMod.QoS] = js.undefined
  var retain: js.UndefOr[scala.Boolean] = js.undefined
  var topic: java.lang.String
}

