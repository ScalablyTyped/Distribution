package typings.monacoEditor.anon

import typings.monacoEditor.monacoEditorStrings.afterPaste
import typings.monacoEditor.monacoEditorStrings.never
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Required<monaco-editor.monaco-editor.editor.IPasteAsOptions>> */
trait ReadonlyRequiredIPasteAsO extends StObject {
  
  val enabled: Boolean
  
  val showPasteSelector: afterPaste | never
}
object ReadonlyRequiredIPasteAsO {
  
  inline def apply(enabled: Boolean, showPasteSelector: afterPaste | never): ReadonlyRequiredIPasteAsO = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], showPasteSelector = showPasteSelector.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyRequiredIPasteAsO]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadonlyRequiredIPasteAsO] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setShowPasteSelector(value: afterPaste | never): Self = StObject.set(x, "showPasteSelector", value.asInstanceOf[js.Any])
  }
}
