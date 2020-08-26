package typings.novaEditorNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IssueAssistant extends js.Object {
  def provideIssues(editor: TextEditor): js.Array[Issue] = js.native
}

object IssueAssistant {
  @scala.inline
  def apply(provideIssues: TextEditor => js.Array[Issue]): IssueAssistant = {
    val __obj = js.Dynamic.literal(provideIssues = js.Any.fromFunction1(provideIssues))
    __obj.asInstanceOf[IssueAssistant]
  }
  @scala.inline
  implicit class IssueAssistantOps[Self <: IssueAssistant] (val x: Self) extends AnyVal {
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
    def setProvideIssues(value: TextEditor => js.Array[Issue]): Self = this.set("provideIssues", js.Any.fromFunction1(value))
  }
  
}

