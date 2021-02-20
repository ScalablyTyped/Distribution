package typings.mqttPacket.mod

import typings.mqttPacket.mqttPacketStrings.pingreq
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPingreqPacket
  extends IPacket
     with Packet {
  
  @JSName("cmd")
  var cmd_IPingreqPacket: pingreq = js.native
}
object IPingreqPacket {
  
  @scala.inline
  def apply(cmd: pingreq): IPingreqPacket = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPingreqPacket]
  }
  
  @scala.inline
  implicit class IPingreqPacketMutableBuilder[Self <: IPingreqPacket] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCmd(value: pingreq): Self = StObject.set(x, "cmd", value.asInstanceOf[js.Any])
  }
}
