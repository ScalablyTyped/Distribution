package typings.microsoftteams

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessageEvent extends StObject {
  
  var originalEvent: MessageEvent = js.native
}
object MessageEvent {
  
  @scala.inline
  def apply(originalEvent: MessageEvent): MessageEvent = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageEvent]
  }
  
  @scala.inline
  implicit class MessageEventMutableBuilder[Self <: MessageEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOriginalEvent(value: MessageEvent): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
  }
}
