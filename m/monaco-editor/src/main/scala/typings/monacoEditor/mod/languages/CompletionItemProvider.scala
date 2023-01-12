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
    * Given a completion item fill in more data, like {@link CompletionItem.documentation doc-comment}
    * or {@link CompletionItem.detail details}.
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
  
  inline def apply(
    provideCompletionItems: (ITextModel, Position, CompletionContext, CancellationToken) => ProviderResult[CompletionList]
  ): CompletionItemProvider = {
    val __obj = js.Dynamic.literal(provideCompletionItems = js.Any.fromFunction4(provideCompletionItems))
    __obj.asInstanceOf[CompletionItemProvider]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CompletionItemProvider] (val x: Self) extends AnyVal {
    
    inline def setProvideCompletionItems(
      value: (ITextModel, Position, CompletionContext, CancellationToken) => ProviderResult[CompletionList]
    ): Self = StObject.set(x, "provideCompletionItems", js.Any.fromFunction4(value))
    
    inline def setResolveCompletionItem(
      value: (/* item */ CompletionItem, /* token */ CancellationToken) => ProviderResult[CompletionItem]
    ): Self = StObject.set(x, "resolveCompletionItem", js.Any.fromFunction2(value))
    
    inline def setResolveCompletionItemUndefined: Self = StObject.set(x, "resolveCompletionItem", js.undefined)
    
    inline def setTriggerCharacters(value: js.Array[String]): Self = StObject.set(x, "triggerCharacters", value.asInstanceOf[js.Any])
    
    inline def setTriggerCharactersUndefined: Self = StObject.set(x, "triggerCharacters", js.undefined)
    
    inline def setTriggerCharactersVarargs(value: String*): Self = StObject.set(x, "triggerCharacters", js.Array(value*))
  }
}
