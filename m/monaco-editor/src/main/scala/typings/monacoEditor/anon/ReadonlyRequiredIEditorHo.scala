package typings.monacoEditor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Required<monaco-editor.monaco-editor.editor.IEditorHoverOptions>> */
trait ReadonlyRequiredIEditorHo extends StObject {
  
  val above: Boolean
  
  val delay: Double
  
  val enabled: Boolean
  
  val sticky: Boolean
}
object ReadonlyRequiredIEditorHo {
  
  inline def apply(above: Boolean, delay: Double, enabled: Boolean, sticky: Boolean): ReadonlyRequiredIEditorHo = {
    val __obj = js.Dynamic.literal(above = above.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], sticky = sticky.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyRequiredIEditorHo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadonlyRequiredIEditorHo] (val x: Self) extends AnyVal {
    
    inline def setAbove(value: Boolean): Self = StObject.set(x, "above", value.asInstanceOf[js.Any])
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setSticky(value: Boolean): Self = StObject.set(x, "sticky", value.asInstanceOf[js.Any])
  }
}
