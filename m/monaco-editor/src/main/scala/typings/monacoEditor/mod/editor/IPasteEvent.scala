package typings.monacoEditor.mod.editor

import typings.monacoEditor.mod.Range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPasteEvent extends StObject {
  
  val mode: String | Null
  
  val range: Range
}
object IPasteEvent {
  
  inline def apply(range: Range): IPasteEvent = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], mode = null)
    __obj.asInstanceOf[IPasteEvent]
  }
  
  extension [Self <: IPasteEvent](x: Self) {
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeNull: Self = StObject.set(x, "mode", null)
    
    inline def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
  }
}
