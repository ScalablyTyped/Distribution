package typings.monacoEditor.mod.languages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InlineCompletionContext extends StObject {
  
  val selectedSuggestionInfo: js.UndefOr[SelectedSuggestionInfo] = js.undefined
  
  /**
    * How the completion was triggered.
    */
  val triggerKind: InlineCompletionTriggerKind
}
object InlineCompletionContext {
  
  inline def apply(triggerKind: InlineCompletionTriggerKind): InlineCompletionContext = {
    val __obj = js.Dynamic.literal(triggerKind = triggerKind.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineCompletionContext]
  }
  
  extension [Self <: InlineCompletionContext](x: Self) {
    
    inline def setSelectedSuggestionInfo(value: SelectedSuggestionInfo): Self = StObject.set(x, "selectedSuggestionInfo", value.asInstanceOf[js.Any])
    
    inline def setSelectedSuggestionInfoUndefined: Self = StObject.set(x, "selectedSuggestionInfo", js.undefined)
    
    inline def setTriggerKind(value: InlineCompletionTriggerKind): Self = StObject.set(x, "triggerKind", value.asInstanceOf[js.Any])
  }
}
