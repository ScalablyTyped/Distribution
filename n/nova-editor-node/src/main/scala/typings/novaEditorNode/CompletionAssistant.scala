package typings.novaEditorNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompletionAssistant extends js.Object {
  def provideCompletionItems(editor: TextEditor, context: CompletionContext): js.Array[CompletionItem] = js.native
}

object CompletionAssistant {
  @scala.inline
  def apply(provideCompletionItems: (TextEditor, CompletionContext) => js.Array[CompletionItem]): CompletionAssistant = {
    val __obj = js.Dynamic.literal(provideCompletionItems = js.Any.fromFunction2(provideCompletionItems))
    __obj.asInstanceOf[CompletionAssistant]
  }
  @scala.inline
  implicit class CompletionAssistantOps[Self <: CompletionAssistant] (val x: Self) extends AnyVal {
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
    def setProvideCompletionItems(value: (TextEditor, CompletionContext) => js.Array[CompletionItem]): Self = this.set("provideCompletionItems", js.Any.fromFunction2(value))
  }
  
}

