package typings.meshblu.Meshblu

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessagePayload extends StObject {
  
  var devices: js.Array[String]
  
  var payload: Any
  
  var qos: js.UndefOr[Double] = js.undefined
  
  var topic: String
}
object MessagePayload {
  
  inline def apply(devices: js.Array[String], payload: Any, topic: String): MessagePayload = {
    val __obj = js.Dynamic.literal(devices = devices.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessagePayload]
  }
  
  extension [Self <: MessagePayload](x: Self) {
    
    inline def setDevices(value: js.Array[String]): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
    
    inline def setDevicesVarargs(value: String*): Self = StObject.set(x, "devices", js.Array(value*))
    
    inline def setPayload(value: Any): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setQos(value: Double): Self = StObject.set(x, "qos", value.asInstanceOf[js.Any])
    
    inline def setQosUndefined: Self = StObject.set(x, "qos", js.undefined)
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
  }
}
