package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodeActionList extends IDisposable {
  val actions: js.Array[CodeAction] = js.native
}

object CodeActionList {
  @scala.inline
  def apply(actions: js.Array[CodeAction], dispose: () => Unit): CodeActionList = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose))
    __obj.asInstanceOf[CodeActionList]
  }
  @scala.inline
  implicit class CodeActionListOps[Self <: CodeActionList] (val x: Self) extends AnyVal {
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
    def setActionsVarargs(value: CodeAction*): Self = this.set("actions", js.Array(value :_*))
    @scala.inline
    def setActions(value: js.Array[CodeAction]): Self = this.set("actions", value.asInstanceOf[js.Any])
  }
  
}

