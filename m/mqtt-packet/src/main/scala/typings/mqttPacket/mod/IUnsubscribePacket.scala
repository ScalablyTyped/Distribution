package typings.mqttPacket.mod

import typings.mqttPacket.anon.ReasonString
import typings.mqttPacket.mqttPacketStrings.unsubscribe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IUnsubscribePacket
  extends IPacket
     with Packet {
  
  @JSName("cmd")
  var cmd_IUnsubscribePacket: unsubscribe = js.native
  
  var properties: js.UndefOr[ReasonString] = js.native
  
  var unsubscriptions: js.Array[String] = js.native
}
object IUnsubscribePacket {
  
  @scala.inline
  def apply(cmd: unsubscribe, unsubscriptions: js.Array[String]): IUnsubscribePacket = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any], unsubscriptions = unsubscriptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUnsubscribePacket]
  }
  
  @scala.inline
  implicit class IUnsubscribePacketMutableBuilder[Self <: IUnsubscribePacket] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCmd(value: unsubscribe): Self = StObject.set(x, "cmd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: ReasonString): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setUnsubscriptions(value: js.Array[String]): Self = StObject.set(x, "unsubscriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnsubscriptionsVarargs(value: String*): Self = StObject.set(x, "unsubscriptions", js.Array(value :_*))
  }
}
