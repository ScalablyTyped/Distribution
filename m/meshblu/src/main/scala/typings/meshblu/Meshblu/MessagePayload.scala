package typings.meshblu.Meshblu

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessagePayload extends StObject {
  
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
  implicit class MessagePayloadMutableBuilder[Self <: MessagePayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDevices(value: js.Array[String]): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevicesVarargs(value: String*): Self = StObject.set(x, "devices", js.Array(value :_*))
    
    @scala.inline
    def setPayload(value: js.Any): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQos(value: Double): Self = StObject.set(x, "qos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQosUndefined: Self = StObject.set(x, "qos", js.undefined)
    
    @scala.inline
    def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
  }
}
