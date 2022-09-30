package typings.mqttPacket.mod

import typings.mqttPacket.anon.AuthenticationMethod
import typings.mqttPacket.anon.Payload
import typings.mqttPacket.mqttPacketInts.`3`
import typings.mqttPacket.mqttPacketInts.`4`
import typings.mqttPacket.mqttPacketInts.`5`
import typings.mqttPacket.mqttPacketStrings.MQIsdp
import typings.mqttPacket.mqttPacketStrings.MQTT
import typings.mqttPacket.mqttPacketStrings.connect
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IConnectPacket
  extends StObject
     with IPacket
     with Packet {
  
  var clean: js.UndefOr[Boolean] = js.undefined
  
  var clientId: String
  
  @JSName("cmd")
  var cmd_IConnectPacket: connect
  
  var keepalive: js.UndefOr[Double] = js.undefined
  
  var password: js.UndefOr[Buffer] = js.undefined
  
  var properties: js.UndefOr[AuthenticationMethod] = js.undefined
  
  var protocolId: js.UndefOr[MQTT | MQIsdp] = js.undefined
  
  var protocolVersion: js.UndefOr[`4` | `5` | `3`] = js.undefined
  
  var username: js.UndefOr[String] = js.undefined
  
  var will: js.UndefOr[Payload] = js.undefined
}
object IConnectPacket {
  
  inline def apply(clientId: String): IConnectPacket = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], cmd = "connect")
    __obj.asInstanceOf[IConnectPacket]
  }
  
  extension [Self <: IConnectPacket](x: Self) {
    
    inline def setClean(value: Boolean): Self = StObject.set(x, "clean", value.asInstanceOf[js.Any])
    
    inline def setCleanUndefined: Self = StObject.set(x, "clean", js.undefined)
    
    inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setCmd(value: connect): Self = StObject.set(x, "cmd", value.asInstanceOf[js.Any])
    
    inline def setKeepalive(value: Double): Self = StObject.set(x, "keepalive", value.asInstanceOf[js.Any])
    
    inline def setKeepaliveUndefined: Self = StObject.set(x, "keepalive", js.undefined)
    
    inline def setPassword(value: Buffer): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setProperties(value: AuthenticationMethod): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setProtocolId(value: MQTT | MQIsdp): Self = StObject.set(x, "protocolId", value.asInstanceOf[js.Any])
    
    inline def setProtocolIdUndefined: Self = StObject.set(x, "protocolId", js.undefined)
    
    inline def setProtocolVersion(value: `4` | `5` | `3`): Self = StObject.set(x, "protocolVersion", value.asInstanceOf[js.Any])
    
    inline def setProtocolVersionUndefined: Self = StObject.set(x, "protocolVersion", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    
    inline def setWill(value: Payload): Self = StObject.set(x, "will", value.asInstanceOf[js.Any])
    
    inline def setWillUndefined: Self = StObject.set(x, "will", js.undefined)
  }
}
