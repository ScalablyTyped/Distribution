package typings.monacoEditor.anon

import typings.monacoEditor.monacoEditorStrings.always
import typings.monacoEditor.monacoEditorStrings.onHover
import typings.monacoEditor.monacoEditorStrings.prefix
import typings.monacoEditor.monacoEditorStrings.subword
import typings.monacoEditor.monacoEditorStrings.subwordSmart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Required<monaco-editor.monaco-editor.editor.IInlineSuggestOptions>> */
trait ReadonlyRequiredIInlineSu extends StObject {
  
  val enabled: Boolean
  
  val keepOnBlur: Boolean
  
  val mode: prefix | subword | subwordSmart
  
  val showToolbar: always | onHover
  
  val suppressSuggestions: Boolean
}
object ReadonlyRequiredIInlineSu {
  
  inline def apply(
    enabled: Boolean,
    keepOnBlur: Boolean,
    mode: prefix | subword | subwordSmart,
    showToolbar: always | onHover,
    suppressSuggestions: Boolean
  ): ReadonlyRequiredIInlineSu = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], keepOnBlur = keepOnBlur.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], showToolbar = showToolbar.asInstanceOf[js.Any], suppressSuggestions = suppressSuggestions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyRequiredIInlineSu]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadonlyRequiredIInlineSu] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setKeepOnBlur(value: Boolean): Self = StObject.set(x, "keepOnBlur", value.asInstanceOf[js.Any])
    
    inline def setMode(value: prefix | subword | subwordSmart): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setShowToolbar(value: always | onHover): Self = StObject.set(x, "showToolbar", value.asInstanceOf[js.Any])
    
    inline def setSuppressSuggestions(value: Boolean): Self = StObject.set(x, "suppressSuggestions", value.asInstanceOf[js.Any])
  }
}
