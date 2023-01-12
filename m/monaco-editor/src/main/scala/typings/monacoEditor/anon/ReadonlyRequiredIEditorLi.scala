package typings.monacoEditor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Required<monaco-editor.monaco-editor.editor.IEditorLightbulbOptions>> */
trait ReadonlyRequiredIEditorLi extends StObject {
  
  val enabled: Boolean
}
object ReadonlyRequiredIEditorLi {
  
  inline def apply(enabled: Boolean): ReadonlyRequiredIEditorLi = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyRequiredIEditorLi]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadonlyRequiredIEditorLi] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}
