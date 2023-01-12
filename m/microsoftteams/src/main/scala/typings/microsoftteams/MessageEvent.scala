package typings.microsoftteams

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageEvent extends StObject {
  
  var originalEvent: MessageEvent
}
object MessageEvent {
  
  inline def apply(originalEvent: MessageEvent): MessageEvent = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MessageEvent] (val x: Self) extends AnyVal {
    
    inline def setOriginalEvent(value: MessageEvent): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
  }
}
