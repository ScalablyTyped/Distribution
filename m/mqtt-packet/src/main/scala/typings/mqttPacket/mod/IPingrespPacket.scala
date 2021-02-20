package typings.mqttPacket.mod

import typings.mqttPacket.mqttPacketStrings.pingresp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPingrespPacket
  extends IPacket
     with Packet {
  
  @JSName("cmd")
  var cmd_IPingrespPacket: pingresp = js.native
}
object IPingrespPacket {
  
  @scala.inline
  def apply(cmd: pingresp): IPingrespPacket = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPingrespPacket]
  }
  
  @scala.inline
  implicit class IPingrespPacketMutableBuilder[Self <: IPingrespPacket] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCmd(value: pingresp): Self = StObject.set(x, "cmd", value.asInstanceOf[js.Any])
  }
}
