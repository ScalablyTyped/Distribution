package typings.novaEditorNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompletionAssistant extends js.Object {
  def provideCompletionItems(editor: TextEditor, context: CompletionContext): js.Array[CompletionItem]
}

object CompletionAssistant {
  @scala.inline
  def apply(provideCompletionItems: (TextEditor, CompletionContext) => js.Array[CompletionItem]): CompletionAssistant = {
    val __obj = js.Dynamic.literal(provideCompletionItems = js.Any.fromFunction2(provideCompletionItems))
    __obj.asInstanceOf[CompletionAssistant]
  }
}

