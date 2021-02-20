package typings.mqttPacket.mod

import typings.mqttPacket.anon.ReasonString
import typings.mqttPacket.mqttPacketStrings.puback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPubackPacket
  extends IPacket
     with Packet {
  
  @JSName("cmd")
  var cmd_IPubackPacket: puback = js.native
  
  var properties: js.UndefOr[ReasonString] = js.native
}
object IPubackPacket {
  
  @scala.inline
  def apply(cmd: puback): IPubackPacket = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPubackPacket]
  }
  
  @scala.inline
  implicit class IPubackPacketMutableBuilder[Self <: IPubackPacket] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCmd(value: puback): Self = StObject.set(x, "cmd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: ReasonString): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
  }
}
