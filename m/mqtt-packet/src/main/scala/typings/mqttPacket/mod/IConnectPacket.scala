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
  implicit class IConnectPacketOps[Self <: IConnectPacket] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClientId(value: String): Self = this.set("clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCmd(value: connect): Self = this.set("cmd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClean(value: Boolean): Self = this.set("clean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClean: Self = this.set("clean", js.undefined)
    
    @scala.inline
    def setKeepalive(value: Double): Self = this.set("keepalive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepalive: Self = this.set("keepalive", js.undefined)
    
    @scala.inline
    def setPassword(value: Buffer): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    
    @scala.inline
    def setProperties(value: AuthenticationData): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    
    @scala.inline
    def setProtocolId(value: MQTT | MQIsdp): Self = this.set("protocolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocolId: Self = this.set("protocolId", js.undefined)
    
    @scala.inline
    def setProtocolVersion(value: `4` | `5` | `3`): Self = this.set("protocolVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocolVersion: Self = this.set("protocolVersion", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
    
    @scala.inline
    def setWill(value: Payload): Self = this.set("will", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWill: Self = this.set("will", js.undefined)
  }
}
