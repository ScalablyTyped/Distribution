package typings.mqttPacket.mod

import typings.mqttPacket.anon.ReasonString
import typings.mqttPacket.mqttPacketStrings.pubrec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPubrecPacket
  extends IPacket
     with Packet {
  
  @JSName("cmd")
  var cmd_IPubrecPacket: pubrec = js.native
  
  var properties: js.UndefOr[ReasonString] = js.native
}
object IPubrecPacket {
  
  @scala.inline
  def apply(cmd: pubrec): IPubrecPacket = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPubrecPacket]
  }
  
  @scala.inline
  implicit class IPubrecPacketMutableBuilder[Self <: IPubrecPacket] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCmd(value: pubrec): Self = StObject.set(x, "cmd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: ReasonString): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
  }
}
