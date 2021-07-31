package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Required<monaco-editor.monaco-editor.editor.IEditorLightbulbOptions>> */
trait EditorLightbulbOptions extends StObject {
  
  val enabled: Boolean
}
object EditorLightbulbOptions {
  
  @scala.inline
  def apply(enabled: Boolean): EditorLightbulbOptions = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorLightbulbOptions]
  }
  
  @scala.inline
  implicit class EditorLightbulbOptionsMutableBuilder[Self <: EditorLightbulbOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}
