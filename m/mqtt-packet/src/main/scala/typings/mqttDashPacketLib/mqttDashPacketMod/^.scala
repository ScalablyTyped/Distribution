package typings
package mqttDashPacketLib.mqttDashPacketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mqtt-packet", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def generate(packet: Packet): nodeLib.Buffer = js.native
  def generate(packet: Packet, opts: js.Object): nodeLib.Buffer = js.native
  def parser(): Parser = js.native
  def parser(opts: js.Object): Parser = js.native
  def writeToStream(`object`: Packet, stream: nodeLib.NodeJSNs.WritableStream): scala.Unit = js.native
  def writeToStream(`object`: Packet, stream: nodeLib.NodeJSNs.WritableStream, opts: js.Object): scala.Unit = js.native
}

