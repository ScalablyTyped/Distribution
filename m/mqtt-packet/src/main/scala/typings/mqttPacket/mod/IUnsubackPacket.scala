package typings.mqttPacket.mod

import typings.mqttPacket.anon.ReasonString
import typings.mqttPacket.mqttPacketStrings.unsuback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IUnsubackPacket
  extends IPacket
     with Packet {
  
  @JSName("cmd")
  var cmd_IUnsubackPacket: unsuback = js.native
  
  var properties: js.UndefOr[ReasonString] = js.native
}
object IUnsubackPacket {
  
  @scala.inline
  def apply(cmd: unsuback): IUnsubackPacket = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUnsubackPacket]
  }
  
  @scala.inline
  implicit class IUnsubackPacketMutableBuilder[Self <: IUnsubackPacket] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCmd(value: unsuback): Self = StObject.set(x, "cmd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: ReasonString): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
  }
}
