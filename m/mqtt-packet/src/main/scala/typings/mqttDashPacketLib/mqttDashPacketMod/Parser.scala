package typings
package mqttDashPacketLib.mqttDashPacketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Parser
  extends nodeLib.NodeJSNs.EventEmitter {
  @JSName("on")
  def on_error(
    event: mqttDashPacketLib.mqttDashPacketLibStrings.error,
    callback: js.Function1[/* error */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_packet(
    event: mqttDashPacketLib.mqttDashPacketLibStrings.packet,
    callback: js.Function1[/* packet */ Packet, scala.Unit]
  ): this.type = js.native
  def parse(buffer: nodeLib.Buffer): scala.Double = js.native
}

