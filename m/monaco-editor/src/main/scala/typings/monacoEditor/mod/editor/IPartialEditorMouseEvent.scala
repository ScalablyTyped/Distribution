package typings.monacoEditor.mod.editor

import typings.monacoEditor.mod.IMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPartialEditorMouseEvent extends StObject {
  
  val event: IMouseEvent
  
  val target: IMouseTarget | Null
}
object IPartialEditorMouseEvent {
  
  inline def apply(event: IMouseEvent): IPartialEditorMouseEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], target = null)
    __obj.asInstanceOf[IPartialEditorMouseEvent]
  }
  
  extension [Self <: IPartialEditorMouseEvent](x: Self) {
    
    inline def setEvent(value: IMouseEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: IMouseTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetNull: Self = StObject.set(x, "target", null)
  }
}
