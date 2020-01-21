package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.CancellationToken
import typings.monacoEditor.mod.Position
import typings.monacoEditor.mod.editor.ITextModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompletionItemProvider extends js.Object {
  /**
    * Given a completion item fill in more data, like [doc-comment](#CompletionItem.documentation)
    * or [details](#CompletionItem.detail).
    *
    * The editor will only resolve a completion item once.
    */
  var resolveCompletionItem: js.UndefOr[
    js.Function4[
      /* model */ ITextModel, 
      /* position */ Position, 
      /* item */ CompletionItem, 
      /* token */ CancellationToken, 
      ProviderResult[CompletionItem]
    ]
  ] = js.undefined
  var triggerCharacters: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Provide completion items for the given position and document.
    */
  def provideCompletionItems(model: ITextModel, position: Position, context: CompletionContext, token: CancellationToken): ProviderResult[CompletionList]
}

object CompletionItemProvider {
  @scala.inline
  def apply(
    provideCompletionItems: (ITextModel, Position, CompletionContext, CancellationToken) => ProviderResult[CompletionList],
    resolveCompletionItem: (/* model */ ITextModel, /* position */ Position, /* item */ CompletionItem, /* token */ CancellationToken) => ProviderResult[CompletionItem] = null,
    triggerCharacters: js.Array[String] = null
  ): CompletionItemProvider = {
    val __obj = js.Dynamic.literal(provideCompletionItems = js.Any.fromFunction4(provideCompletionItems))
    if (resolveCompletionItem != null) __obj.updateDynamic("resolveCompletionItem")(js.Any.fromFunction4(resolveCompletionItem))
    if (triggerCharacters != null) __obj.updateDynamic("triggerCharacters")(triggerCharacters.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletionItemProvider]
  }
}

