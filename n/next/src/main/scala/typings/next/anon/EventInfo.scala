package typings.next.anon

import typings.next.distTelemetryEventsBuildMod.EventLintCheckCompleted_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventInfo extends StObject {
  
  var eventInfo: EventLintCheckCompleted_
  
  var isError: Boolean
  
  var output: String | Null
}
object EventInfo {
  
  inline def apply(eventInfo: EventLintCheckCompleted_, isError: Boolean): EventInfo = {
    val __obj = js.Dynamic.literal(eventInfo = eventInfo.asInstanceOf[js.Any], isError = isError.asInstanceOf[js.Any], output = null)
    __obj.asInstanceOf[EventInfo]
  }
  
  extension [Self <: EventInfo](x: Self) {
    
    inline def setEventInfo(value: EventLintCheckCompleted_): Self = StObject.set(x, "eventInfo", value.asInstanceOf[js.Any])
    
    inline def setIsError(value: Boolean): Self = StObject.set(x, "isError", value.asInstanceOf[js.Any])
    
    inline def setOutput(value: String): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    inline def setOutputNull: Self = StObject.set(x, "output", null)
  }
}
