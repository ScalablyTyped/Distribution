package typings.mqttPacket.mod

import typings.mqttPacket.anon.ReasonString
import typings.mqttPacket.mqttPacketStrings.suback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISubackPacket
  extends IPacket
     with Packet {
  
  @JSName("cmd")
  var cmd_ISubackPacket: suback = js.native
  
  var granted: js.Array[Double | js.Object] = js.native
  
  var properties: js.UndefOr[ReasonString] = js.native
}
object ISubackPacket {
  
  @scala.inline
  def apply(cmd: suback, granted: js.Array[Double | js.Object]): ISubackPacket = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any], granted = granted.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISubackPacket]
  }
  
  @scala.inline
  implicit class ISubackPacketMutableBuilder[Self <: ISubackPacket] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCmd(value: suback): Self = StObject.set(x, "cmd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGranted(value: js.Array[Double | js.Object]): Self = StObject.set(x, "granted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrantedVarargs(value: (Double | js.Object)*): Self = StObject.set(x, "granted", js.Array(value :_*))
    
    @scala.inline
    def setProperties(value: ReasonString): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
  }
}
