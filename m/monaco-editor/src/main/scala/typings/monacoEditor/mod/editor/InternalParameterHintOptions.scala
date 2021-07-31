package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Required<monaco-editor.monaco-editor.editor.IEditorParameterHintOptions>> */
trait InternalParameterHintOptions extends StObject {
  
  val cycle: Boolean
  
  val enabled: Boolean
}
object InternalParameterHintOptions {
  
  @scala.inline
  def apply(cycle: Boolean, enabled: Boolean): InternalParameterHintOptions = {
    val __obj = js.Dynamic.literal(cycle = cycle.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[InternalParameterHintOptions]
  }
  
  @scala.inline
  implicit class InternalParameterHintOptionsMutableBuilder[Self <: InternalParameterHintOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCycle(value: Boolean): Self = StObject.set(x, "cycle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}
