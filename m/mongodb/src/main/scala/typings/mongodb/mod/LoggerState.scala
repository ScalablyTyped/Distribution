package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoggerState extends StObject {
  
  var className: String
  
  var date: scala.Double
  
  var message: String
  
  var pid: scala.Double
  
  var `type`: String
}
object LoggerState {
  
  @scala.inline
  def apply(className: String, date: scala.Double, message: String, pid: scala.Double, `type`: String): LoggerState = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggerState]
  }
  
  @scala.inline
  implicit class LoggerStateMutableBuilder[Self <: LoggerState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDate(value: scala.Double): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPid(value: scala.Double): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
