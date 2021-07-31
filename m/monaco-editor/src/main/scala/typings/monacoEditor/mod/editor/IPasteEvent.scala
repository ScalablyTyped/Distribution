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
  
  @scala.inline
  def apply(range: Range): IPasteEvent = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], mode = null)
    __obj.asInstanceOf[IPasteEvent]
  }
  
  @scala.inline
  implicit class IPasteEventMutableBuilder[Self <: IPasteEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeNull: Self = StObject.set(x, "mode", null)
    
    @scala.inline
    def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
  }
}
