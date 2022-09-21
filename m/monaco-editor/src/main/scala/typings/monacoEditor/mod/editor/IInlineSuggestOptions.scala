package typings.monacoEditor.mod.editor

import typings.monacoEditor.monacoEditorStrings.prefix
import typings.monacoEditor.monacoEditorStrings.subword
import typings.monacoEditor.monacoEditorStrings.subwordSmart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IInlineSuggestOptions extends StObject {
  
  /**
    * Enable or disable the rendering of automatic inline completions.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Configures the mode.
    * Use `prefix` to only show ghost text if the text to replace is a prefix of the suggestion text.
    * Use `subword` to only show ghost text if the replace text is a subword of the suggestion text.
    * Use `subwordSmart` to only show ghost text if the replace text is a subword of the suggestion text, but the subword must start after the cursor position.
    * Defaults to `prefix`.
    */
  var mode: js.UndefOr[prefix | subword | subwordSmart] = js.undefined
}
object IInlineSuggestOptions {
  
  inline def apply(): IInlineSuggestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IInlineSuggestOptions]
  }
  
  extension [Self <: IInlineSuggestOptions](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setMode(value: prefix | subword | subwordSmart): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
