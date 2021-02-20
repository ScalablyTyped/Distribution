package typings.novaEditorNode.anon

import typings.novaEditorNode.novaEditorNodeStrings.onChange
import typings.novaEditorNode.novaEditorNodeStrings.onSave
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Event extends StObject {
  
  var event: onChange | onSave = js.native
}
object Event {
  
  @scala.inline
  def apply(event: onChange | onSave): Event = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  @scala.inline
  implicit class EventMutableBuilder[Self <: Event] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvent(value: onChange | onSave): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
  }
}
