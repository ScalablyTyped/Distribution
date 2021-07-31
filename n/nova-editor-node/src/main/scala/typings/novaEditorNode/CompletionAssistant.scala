package typings.novaEditorNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompletionAssistant extends StObject {
  
  def provideCompletionItems(editor: TextEditor, context: CompletionContext): AssistantArray[CompletionItem]
}
object CompletionAssistant {
  
  @scala.inline
  def apply(provideCompletionItems: (TextEditor, CompletionContext) => AssistantArray[CompletionItem]): CompletionAssistant = {
    val __obj = js.Dynamic.literal(provideCompletionItems = js.Any.fromFunction2(provideCompletionItems))
    __obj.asInstanceOf[CompletionAssistant]
  }
  
  @scala.inline
  implicit class CompletionAssistantMutableBuilder[Self <: CompletionAssistant] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProvideCompletionItems(value: (TextEditor, CompletionContext) => AssistantArray[CompletionItem]): Self = StObject.set(x, "provideCompletionItems", js.Any.fromFunction2(value))
  }
}
