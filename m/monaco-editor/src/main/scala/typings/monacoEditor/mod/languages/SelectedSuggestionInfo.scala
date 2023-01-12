package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.IRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectedSuggestionInfo extends StObject {
  
  var completionKind: CompletionItemKind
  
  var isSnippetText: Boolean
  
  var range: IRange
  
  var text: String
}
object SelectedSuggestionInfo {
  
  inline def apply(completionKind: CompletionItemKind, isSnippetText: Boolean, range: IRange, text: String): SelectedSuggestionInfo = {
    val __obj = js.Dynamic.literal(completionKind = completionKind.asInstanceOf[js.Any], isSnippetText = isSnippetText.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectedSuggestionInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SelectedSuggestionInfo] (val x: Self) extends AnyVal {
    
    inline def setCompletionKind(value: CompletionItemKind): Self = StObject.set(x, "completionKind", value.asInstanceOf[js.Any])
    
    inline def setIsSnippetText(value: Boolean): Self = StObject.set(x, "isSnippetText", value.asInstanceOf[js.Any])
    
    inline def setRange(value: IRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
