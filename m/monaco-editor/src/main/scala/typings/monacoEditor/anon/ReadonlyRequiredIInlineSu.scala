package typings.monacoEditor.anon

import typings.monacoEditor.monacoEditorStrings.prefix
import typings.monacoEditor.monacoEditorStrings.subword
import typings.monacoEditor.monacoEditorStrings.subwordSmart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Required<monaco-editor.monaco-editor.editor.IInlineSuggestOptions>> */
trait ReadonlyRequiredIInlineSu extends StObject {
  
  val enabled: Boolean
  
  val mode: prefix | subword | subwordSmart
}
object ReadonlyRequiredIInlineSu {
  
  inline def apply(enabled: Boolean, mode: prefix | subword | subwordSmart): ReadonlyRequiredIInlineSu = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyRequiredIInlineSu]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadonlyRequiredIInlineSu] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setMode(value: prefix | subword | subwordSmart): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
  }
}
