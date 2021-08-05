package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Required<monaco-editor.monaco-editor.editor.IEditorHoverOptions>> */
trait EditorHoverOptions extends StObject {
  
  val delay: Double
  
  val enabled: Boolean
  
  val sticky: Boolean
}
object EditorHoverOptions {
  
  inline def apply(delay: Double, enabled: Boolean, sticky: Boolean): EditorHoverOptions = {
    val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], sticky = sticky.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorHoverOptions]
  }
  
  extension [Self <: EditorHoverOptions](x: Self) {
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setSticky(value: Boolean): Self = StObject.set(x, "sticky", value.asInstanceOf[js.Any])
  }
}
