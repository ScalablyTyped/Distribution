package typings
package mqttDashPacketLib.mqttDashPacketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mqtt-packet", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def generate(packet: mqttDashPacketLib.mqttDashPacketMod.Packet): nodeLib.Buffer = js.native
  def parser(): mqttDashPacketLib.mqttDashPacketMod.Parser = js.native
  def writeToStream(`object`: mqttDashPacketLib.mqttDashPacketMod.Packet, stream: nodeLib.NodeJSNs.WritableStream): scala.Unit = js.native
}

