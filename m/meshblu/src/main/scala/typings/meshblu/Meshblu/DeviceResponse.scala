package typings.meshblu.Meshblu

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceResponse extends StObject {
  
  var color: String
  
  var online: Boolean
  
  var uuid: String
}
object DeviceResponse {
  
  @scala.inline
  def apply(color: String, online: Boolean, uuid: String): DeviceResponse = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], online = online.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceResponse]
  }
  
  @scala.inline
  implicit class DeviceResponseMutableBuilder[Self <: DeviceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnline(value: Boolean): Self = StObject.set(x, "online", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
  }
}
