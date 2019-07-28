package typings.mqttDashPacket.mqttDashPacketMod

import typings.node.Buffer
import typings.node.NodeJSNs.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mqtt-packet", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def generate(packet: Packet): Buffer = js.native
  def generate(packet: Packet, opts: js.Object): Buffer = js.native
  def parser(): Parser = js.native
  def parser(opts: js.Object): Parser = js.native
  def writeToStream(`object`: Packet, stream: WritableStream): Unit = js.native
  def writeToStream(`object`: Packet, stream: WritableStream, opts: js.Object): Unit = js.native
}

