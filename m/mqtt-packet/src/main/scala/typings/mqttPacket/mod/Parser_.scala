package typings.mqttPacket.mod

import typings.mqttPacket.mqttPacketStrings.error
import typings.mqttPacket.mqttPacketStrings.packet
import typings.node.Buffer
import typings.node.eventsMod.global.NodeJS.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Parser_
  extends StObject
     with EventEmitter {
  
  @JSName("on")
  def on_error(event: error, callback: js.Function1[/* error */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_packet(event: packet, callback: js.Function1[/* packet */ Packet, Unit]): this.type = js.native
  
  def parse(buffer: Buffer): Double = js.native
  def parse(buffer: Buffer, opts: js.Object): Double = js.native
}
