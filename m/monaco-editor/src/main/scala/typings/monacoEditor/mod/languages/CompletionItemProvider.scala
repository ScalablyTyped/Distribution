package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.CancellationToken
import typings.monacoEditor.mod.Position
import typings.monacoEditor.mod.editor.ITextModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompletionItemProvider extends StObject {
  
  /**
    * Provide completion items for the given position and document.
    */
  def provideCompletionItems(model: ITextModel, position: Position, context: CompletionContext, token: CancellationToken): ProviderResult[CompletionList]
  
  /**
    * Given a completion item fill in more data, like [doc-comment](#CompletionItem.documentation)
    * or [details](#CompletionItem.detail).
    *
    * The editor will only resolve a completion item once.
    */
  var resolveCompletionItem: js.UndefOr[
    js.Function2[
      /* item */ CompletionItem, 
      /* token */ CancellationToken, 
      ProviderResult[CompletionItem]
    ]
  ] = js.undefined
  
  var triggerCharacters: js.UndefOr[js.Array[String]] = js.undefined
}
object CompletionItemProvider {
  
  @scala.inline
  def apply(
    provideCompletionItems: (ITextModel, Position, CompletionContext, CancellationToken) => ProviderResult[CompletionList]
  ): CompletionItemProvider = {
    val __obj = js.Dynamic.literal(provideCompletionItems = js.Any.fromFunction4(provideCompletionItems))
    __obj.asInstanceOf[CompletionItemProvider]
  }
  
  @scala.inline
  implicit class CompletionItemProviderMutableBuilder[Self <: CompletionItemProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProvideCompletionItems(
      value: (ITextModel, Position, CompletionContext, CancellationToken) => ProviderResult[CompletionList]
    ): Self = StObject.set(x, "provideCompletionItems", js.Any.fromFunction4(value))
    
    @scala.inline
    def setResolveCompletionItem(
      value: (/* item */ CompletionItem, /* token */ CancellationToken) => ProviderResult[CompletionItem]
    ): Self = StObject.set(x, "resolveCompletionItem", js.Any.fromFunction2(value))
    
    @scala.inline
    def setResolveCompletionItemUndefined: Self = StObject.set(x, "resolveCompletionItem", js.undefined)
    
    @scala.inline
    def setTriggerCharacters(value: js.Array[String]): Self = StObject.set(x, "triggerCharacters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerCharactersUndefined: Self = StObject.set(x, "triggerCharacters", js.undefined)
    
    @scala.inline
    def setTriggerCharactersVarargs(value: String*): Self = StObject.set(x, "triggerCharacters", js.Array(value :_*))
  }
}
