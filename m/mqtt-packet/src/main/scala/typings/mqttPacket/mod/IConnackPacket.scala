package typings.mqttPacket.mod

import typings.mqttPacket.anon.AssignedClientIdentifier
import typings.mqttPacket.mqttPacketStrings.connack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IConnackPacket
  extends StObject
     with IPacket
     with Packet {
  
  @JSName("cmd")
  var cmd_IConnackPacket: connack
  
  var properties: js.UndefOr[AssignedClientIdentifier] = js.undefined
  
  var returnCode: Double
  
  var sessionPresent: Boolean
}
object IConnackPacket {
  
  @scala.inline
  def apply(returnCode: Double, sessionPresent: Boolean): IConnackPacket = {
    val __obj = js.Dynamic.literal(cmd = "connack", returnCode = returnCode.asInstanceOf[js.Any], sessionPresent = sessionPresent.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConnackPacket]
  }
  
  @scala.inline
  implicit class IConnackPacketMutableBuilder[Self <: IConnackPacket] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCmd(value: connack): Self = StObject.set(x, "cmd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: AssignedClientIdentifier): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setReturnCode(value: Double): Self = StObject.set(x, "returnCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionPresent(value: Boolean): Self = StObject.set(x, "sessionPresent", value.asInstanceOf[js.Any])
  }
}
