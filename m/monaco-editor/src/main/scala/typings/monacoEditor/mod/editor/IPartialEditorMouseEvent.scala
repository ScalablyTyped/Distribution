package typings.monacoEditor.mod.editor

import typings.monacoEditor.mod.IMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPartialEditorMouseEvent extends StObject {
  
  val event: IMouseEvent = js.native
  
  val target: IMouseTarget | Null = js.native
}
object IPartialEditorMouseEvent {
  
  @scala.inline
  def apply(event: IMouseEvent): IPartialEditorMouseEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPartialEditorMouseEvent]
  }
  
  @scala.inline
  implicit class IPartialEditorMouseEventMutableBuilder[Self <: IPartialEditorMouseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvent(value: IMouseEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: IMouseTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetNull: Self = StObject.set(x, "target", null)
  }
}
