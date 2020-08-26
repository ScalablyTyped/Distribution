package typings.monacoEditor.mod.languages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompletionList extends js.Object {
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
  implicit class CompletionListOps[Self <: CompletionList] (val x: Self) extends AnyVal {
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
    def setSuggestionsVarargs(value: CompletionItem*): Self = this.set("suggestions", js.Array(value :_*))
    @scala.inline
    def setSuggestions(value: js.Array[CompletionItem]): Self = this.set("suggestions", value.asInstanceOf[js.Any])
    @scala.inline
    def setDispose(value: () => Unit): Self = this.set("dispose", js.Any.fromFunction0(value))
    @scala.inline
    def deleteDispose: Self = this.set("dispose", js.undefined)
    @scala.inline
    def setIncomplete(value: Boolean): Self = this.set("incomplete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncomplete: Self = this.set("incomplete", js.undefined)
  }
  
}

