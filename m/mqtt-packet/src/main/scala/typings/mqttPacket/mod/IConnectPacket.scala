package typings.mqttPacket.mod

import typings.mqttPacket.anon.AuthenticationData
import typings.mqttPacket.anon.Payload
import typings.mqttPacket.mqttPacketNumbers.`3`
import typings.mqttPacket.mqttPacketNumbers.`4`
import typings.mqttPacket.mqttPacketNumbers.`5`
import typings.mqttPacket.mqttPacketStrings.MQIsdp
import typings.mqttPacket.mqttPacketStrings.MQTT
import typings.mqttPacket.mqttPacketStrings.connect
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IConnectPacket
  extends IPacket
     with Packet {
  
  var clean: js.UndefOr[Boolean] = js.native
  
  var clientId: String = js.native
  
  @JSName("cmd")
  var cmd_IConnectPacket: connect = js.native
  
  var keepalive: js.UndefOr[Double] = js.native
  
  var password: js.UndefOr[Buffer] = js.native
  
  var properties: js.UndefOr[AuthenticationData] = js.native
  
  var protocolId: js.UndefOr[MQTT | MQIsdp] = js.native
  
  var protocolVersion: js.UndefOr[`4` | `5` | `3`] = js.native
  
  var username: js.UndefOr[String] = js.native
  
  var will: js.UndefOr[Payload] = js.native
}
object IConnectPacket {
  
  @scala.inline
  def apply(clientId: String, cmd: connect): IConnectPacket = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], cmd = cmd.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConnectPacket]
  }
  
  @scala.inline
  implicit class IConnectPacketMutableBuilder[Self <: IConnectPacket] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClean(value: Boolean): Self = StObject.set(x, "clean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCleanUndefined: Self = StObject.set(x, "clean", js.undefined)
    
    @scala.inline
    def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCmd(value: connect): Self = StObject.set(x, "cmd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepalive(value: Double): Self = StObject.set(x, "keepalive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepaliveUndefined: Self = StObject.set(x, "keepalive", js.undefined)
    
    @scala.inline
    def setPassword(value: Buffer): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    @scala.inline
    def setProperties(value: AuthenticationData): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setProtocolId(value: MQTT | MQIsdp): Self = StObject.set(x, "protocolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolIdUndefined: Self = StObject.set(x, "protocolId", js.undefined)
    
    @scala.inline
    def setProtocolVersion(value: `4` | `5` | `3`): Self = StObject.set(x, "protocolVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolVersionUndefined: Self = StObject.set(x, "protocolVersion", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    
    @scala.inline
    def setWill(value: Payload): Self = StObject.set(x, "will", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWillUndefined: Self = StObject.set(x, "will", js.undefined)
  }
}
