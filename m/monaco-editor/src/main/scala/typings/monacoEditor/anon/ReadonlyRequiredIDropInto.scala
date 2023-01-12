package typings.monacoEditor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Required<monaco-editor.monaco-editor.editor.IDropIntoEditorOptions>> */
trait ReadonlyRequiredIDropInto extends StObject {
  
  val enabled: Boolean
}
object ReadonlyRequiredIDropInto {
  
  inline def apply(enabled: Boolean): ReadonlyRequiredIDropInto = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyRequiredIDropInto]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadonlyRequiredIDropInto] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}
