package typings.monacoEditor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Required<monaco-editor.monaco-editor.editor.IEditorParameterHintOptions>> */
trait ReadonlyRequiredIEditorPaCycle extends StObject {
  
  val cycle: Boolean
  
  val enabled: Boolean
}
object ReadonlyRequiredIEditorPaCycle {
  
  inline def apply(cycle: Boolean, enabled: Boolean): ReadonlyRequiredIEditorPaCycle = {
    val __obj = js.Dynamic.literal(cycle = cycle.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyRequiredIEditorPaCycle]
  }
  
  extension [Self <: ReadonlyRequiredIEditorPaCycle](x: Self) {
    
    inline def setCycle(value: Boolean): Self = StObject.set(x, "cycle", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}
