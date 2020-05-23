package typings.novaEditorNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssueAssistant extends js.Object {
  def provideIssues(editor: TextEditor): js.Array[Issue]
}

object IssueAssistant {
  @scala.inline
  def apply(provideIssues: TextEditor => js.Array[Issue]): IssueAssistant = {
    val __obj = js.Dynamic.literal(provideIssues = js.Any.fromFunction1(provideIssues))
    __obj.asInstanceOf[IssueAssistant]
  }
}

