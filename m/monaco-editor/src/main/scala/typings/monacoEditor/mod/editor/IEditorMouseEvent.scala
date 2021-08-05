package typings.monacoEditor.mod.editor

import typings.monacoEditor.mod.IMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEditorMouseEvent extends StObject {
  
  val event: IMouseEvent
  
  val target: IMouseTarget
}
object IEditorMouseEvent {
  
  inline def apply(event: IMouseEvent, target: IMouseTarget): IEditorMouseEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEditorMouseEvent]
  }
  
  extension [Self <: IEditorMouseEvent](x: Self) {
    
    inline def setEvent(value: IMouseEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: IMouseTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
