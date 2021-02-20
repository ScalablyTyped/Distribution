package typings.mqttPacket

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def generate(packet: typings.mqttPacket.mod.Packet): typings.node.Buffer = typings.mqttPacket.mod.^.asInstanceOf[js.Dynamic].applyDynamic("generate")(packet.asInstanceOf[js.Any]).asInstanceOf[typings.node.Buffer]
  @scala.inline
  def generate(packet: typings.mqttPacket.mod.Packet, opts: js.Object): typings.node.Buffer = (typings.mqttPacket.mod.^.asInstanceOf[js.Dynamic].applyDynamic("generate")(packet.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.node.Buffer]
  
  @scala.inline
  def parser(): typings.mqttPacket.mod.Parser_ = typings.mqttPacket.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parser")().asInstanceOf[typings.mqttPacket.mod.Parser_]
  @scala.inline
  def parser(opts: js.Object): typings.mqttPacket.mod.Parser_ = typings.mqttPacket.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parser")(opts.asInstanceOf[js.Any]).asInstanceOf[typings.mqttPacket.mod.Parser_]
}
