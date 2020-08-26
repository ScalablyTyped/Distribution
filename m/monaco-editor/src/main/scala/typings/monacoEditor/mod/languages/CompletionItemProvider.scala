package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.CancellationToken
import typings.monacoEditor.mod.Position
import typings.monacoEditor.mod.editor.ITextModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
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
  ] = js.native
  var triggerCharacters: js.UndefOr[js.Array[String]] = js.native
  /**
    * Provide completion items for the given position and document.
    */
  def provideCompletionItems(model: ITextModel, position: Position, context: CompletionContext, token: CancellationToken): ProviderResult[CompletionList] = js.native
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
  implicit class CompletionItemProviderOps[Self <: CompletionItemProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setProvideCompletionItems(
      value: (ITextModel, Position, CompletionContext, CancellationToken) => ProviderResult[CompletionList]
    ): Self = this.set("provideCompletionItems", js.Any.fromFunction4(value))
    @scala.inline
    def setResolveCompletionItem(
      value: (/* model */ ITextModel, /* position */ Position, /* item */ CompletionItem, /* token */ CancellationToken) => ProviderResult[CompletionItem]
    ): Self = this.set("resolveCompletionItem", js.Any.fromFunction4(value))
    @scala.inline
    def deleteResolveCompletionItem: Self = this.set("resolveCompletionItem", js.undefined)
    @scala.inline
    def setTriggerCharactersVarargs(value: String*): Self = this.set("triggerCharacters", js.Array(value :_*))
    @scala.inline
    def setTriggerCharacters(value: js.Array[String]): Self = this.set("triggerCharacters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTriggerCharacters: Self = this.set("triggerCharacters", js.undefined)
  }
  
}

