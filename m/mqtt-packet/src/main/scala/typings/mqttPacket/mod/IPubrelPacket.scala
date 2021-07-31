package typings.mqttPacket.mod

import typings.mqttPacket.anon.ReasonString
import typings.mqttPacket.mqttPacketStrings.pubrel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPubrelPacket
  extends StObject
     with IPacket
     with Packet {
  
  @JSName("cmd")
  var cmd_IPubrelPacket: pubrel
  
  var properties: js.UndefOr[ReasonString] = js.undefined
}
object IPubrelPacket {
  
  @scala.inline
  def apply(): IPubrelPacket = {
    val __obj = js.Dynamic.literal(cmd = "pubrel")
    __obj.asInstanceOf[IPubrelPacket]
  }
  
  @scala.inline
  implicit class IPubrelPacketMutableBuilder[Self <: IPubrelPacket] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCmd(value: pubrel): Self = StObject.set(x, "cmd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: ReasonString): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
  }
}
