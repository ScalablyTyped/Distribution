package typings.meshblu.Meshblu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessagePayload extends js.Object {
  
  var devices: js.Array[String] = js.native
  
  var payload: js.Any = js.native
  
  var qos: js.UndefOr[Double] = js.native
  
  var topic: String = js.native
}
object MessagePayload {
  
  @scala.inline
  def apply(devices: js.Array[String], payload: js.Any, topic: String): MessagePayload = {
    val __obj = js.Dynamic.literal(devices = devices.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessagePayload]
  }
  
  @scala.inline
  implicit class MessagePayloadOps[Self <: MessagePayload] (val x: Self) extends AnyVal {
    
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
    def setDevicesVarargs(value: String*): Self = this.set("devices", js.Array(value :_*))
    
    @scala.inline
    def setDevices(value: js.Array[String]): Self = this.set("devices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayload(value: js.Any): Self = this.set("payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopic(value: String): Self = this.set("topic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQos(value: Double): Self = this.set("qos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQos: Self = this.set("qos", js.undefined)
  }
}
