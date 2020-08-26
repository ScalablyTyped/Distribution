package typings.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEditorAction extends js.Object {
  val alias: String = js.native
  val id: String = js.native
  val label: String = js.native
  def isSupported(): Boolean = js.native
  def run(): js.Promise[Unit] = js.native
}

object IEditorAction {
  @scala.inline
  def apply(alias: String, id: String, isSupported: () => Boolean, label: String, run: () => js.Promise[Unit]): IEditorAction = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isSupported = js.Any.fromFunction0(isSupported), label = label.asInstanceOf[js.Any], run = js.Any.fromFunction0(run))
    __obj.asInstanceOf[IEditorAction]
  }
  @scala.inline
  implicit class IEditorActionOps[Self <: IEditorAction] (val x: Self) extends AnyVal {
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
    def setAlias(value: String): Self = this.set("alias", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsSupported(value: () => Boolean): Self = this.set("isSupported", js.Any.fromFunction0(value))
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setRun(value: () => js.Promise[Unit]): Self = this.set("run", js.Any.fromFunction0(value))
  }
  
}

