package typings.monacoEditor.mod.languages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompletionList extends StObject {
  
  var dispose: js.UndefOr[js.Function0[Unit]] = js.native
  
  var incomplete: js.UndefOr[Boolean] = js.native
  
  var suggestions: js.Array[CompletionItem] = js.native
}
object CompletionList {
  
  @scala.inline
  def apply(suggestions: js.Array[CompletionItem]): CompletionList = {
    val __obj = js.Dynamic.literal(suggestions = suggestions.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletionList]
  }
  
  @scala.inline
  implicit class CompletionListMutableBuilder[Self <: CompletionList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDisposeUndefined: Self = StObject.set(x, "dispose", js.undefined)
    
    @scala.inline
    def setIncomplete(value: Boolean): Self = StObject.set(x, "incomplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncompleteUndefined: Self = StObject.set(x, "incomplete", js.undefined)
    
    @scala.inline
    def setSuggestions(value: js.Array[CompletionItem]): Self = StObject.set(x, "suggestions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestionsVarargs(value: CompletionItem*): Self = StObject.set(x, "suggestions", js.Array(value :_*))
  }
}
