package typings.mqttPacket.mod

import typings.mqttPacket.anon.CorrelationData
import typings.mqttPacket.mqttPacketStrings.publish
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPublishPacket
  extends IPacket
     with Packet {
  
  @JSName("cmd")
  var cmd_IPublishPacket: publish = js.native
  
  var dup: Boolean = js.native
  
  var payload: String | Buffer = js.native
  
  var properties: js.UndefOr[CorrelationData] = js.native
  
  var qos: QoS = js.native
  
  var retain: Boolean = js.native
  
  var topic: String = js.native
}
object IPublishPacket {
  
  @scala.inline
  def apply(cmd: publish, dup: Boolean, payload: String | Buffer, qos: QoS, retain: Boolean, topic: String): IPublishPacket = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any], dup = dup.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], qos = qos.asInstanceOf[js.Any], retain = retain.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPublishPacket]
  }
  
  @scala.inline
  implicit class IPublishPacketOps[Self <: IPublishPacket] (val x: Self) extends AnyVal {
    
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
    def setCmd(value: publish): Self = this.set("cmd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDup(value: Boolean): Self = this.set("dup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayload(value: String | Buffer): Self = this.set("payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQos(value: QoS): Self = this.set("qos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetain(value: Boolean): Self = this.set("retain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopic(value: String): Self = this.set("topic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: CorrelationData): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
  }
}
