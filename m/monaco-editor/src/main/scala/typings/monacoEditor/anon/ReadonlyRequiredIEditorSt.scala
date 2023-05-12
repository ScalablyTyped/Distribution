package typings.monacoEditor.anon

import typings.monacoEditor.monacoEditorStrings.foldingProviderModel
import typings.monacoEditor.monacoEditorStrings.indentationModel
import typings.monacoEditor.monacoEditorStrings.outlineModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Required<monaco-editor.monaco-editor.editor.IEditorStickyScrollOptions>> */
trait ReadonlyRequiredIEditorSt extends StObject {
  
  val defaultModel: outlineModel | foldingProviderModel | indentationModel
  
  val enabled: Boolean
  
  val maxLineCount: Double
}
object ReadonlyRequiredIEditorSt {
  
  inline def apply(
    defaultModel: outlineModel | foldingProviderModel | indentationModel,
    enabled: Boolean,
    maxLineCount: Double
  ): ReadonlyRequiredIEditorSt = {
    val __obj = js.Dynamic.literal(defaultModel = defaultModel.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], maxLineCount = maxLineCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyRequiredIEditorSt]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadonlyRequiredIEditorSt] (val x: Self) extends AnyVal {
    
    inline def setDefaultModel(value: outlineModel | foldingProviderModel | indentationModel): Self = StObject.set(x, "defaultModel", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setMaxLineCount(value: Double): Self = StObject.set(x, "maxLineCount", value.asInstanceOf[js.Any])
  }
}
