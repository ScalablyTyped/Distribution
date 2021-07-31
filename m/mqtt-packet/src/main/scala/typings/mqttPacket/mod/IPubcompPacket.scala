package typings.mqttPacket.mod

import typings.mqttPacket.anon.ReasonString
import typings.mqttPacket.mqttPacketStrings.pubcomp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPubcompPacket
  extends StObject
     with IPacket
     with Packet {
  
  @JSName("cmd")
  var cmd_IPubcompPacket: pubcomp
  
  var properties: js.UndefOr[ReasonString] = js.undefined
}
object IPubcompPacket {
  
  @scala.inline
  def apply(): IPubcompPacket = {
    val __obj = js.Dynamic.literal(cmd = "pubcomp")
    __obj.asInstanceOf[IPubcompPacket]
  }
  
  @scala.inline
  implicit class IPubcompPacketMutableBuilder[Self <: IPubcompPacket] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCmd(value: pubcomp): Self = StObject.set(x, "cmd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: ReasonString): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
  }
}
