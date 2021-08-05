package typings.monacoEditor.mod.editor

import typings.monacoEditor.mod.IPosition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICursorState extends StObject {
  
  var inSelectionMode: Boolean
  
  var position: IPosition
  
  var selectionStart: IPosition
}
object ICursorState {
  
  inline def apply(inSelectionMode: Boolean, position: IPosition, selectionStart: IPosition): ICursorState = {
    val __obj = js.Dynamic.literal(inSelectionMode = inSelectionMode.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], selectionStart = selectionStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICursorState]
  }
  
  extension [Self <: ICursorState](x: Self) {
    
    inline def setInSelectionMode(value: Boolean): Self = StObject.set(x, "inSelectionMode", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: IPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setSelectionStart(value: IPosition): Self = StObject.set(x, "selectionStart", value.asInstanceOf[js.Any])
  }
}
