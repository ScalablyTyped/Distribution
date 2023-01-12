package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditorEvent extends StObject {
  
  /**
    * The underlying change event of the third-party code editor.
    */
  var editorEvent: js.UndefOr[js.Object] = js.undefined
  
  /**
    * The current value of the code editor.
    */
  var value: js.UndefOr[String] = js.undefined
}
object EditorEvent {
  
  inline def apply(): EditorEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EditorEvent] (val x: Self) extends AnyVal {
    
    inline def setEditorEvent(value: js.Object): Self = StObject.set(x, "editorEvent", value.asInstanceOf[js.Any])
    
    inline def setEditorEventUndefined: Self = StObject.set(x, "editorEvent", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
