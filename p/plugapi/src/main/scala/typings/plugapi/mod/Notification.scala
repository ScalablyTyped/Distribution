package typings.plugapi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Notification extends StObject {
  
  var action: String
  
  var id: Double
  
  var timestamp: String
  
  var value: String
}
object Notification {
  
  @scala.inline
  def apply(action: String, id: Double, timestamp: String, value: String): Notification = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Notification]
  }
  
  @scala.inline
  implicit class NotificationMutableBuilder[Self <: Notification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
