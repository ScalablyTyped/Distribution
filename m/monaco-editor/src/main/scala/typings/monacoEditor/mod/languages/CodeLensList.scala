package typings.monacoEditor.mod.languages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodeLensList extends js.Object {
  var lenses: js.Array[CodeLens] = js.native
  def dispose(): Unit = js.native
}

object CodeLensList {
  @scala.inline
  def apply(dispose: () => Unit, lenses: js.Array[CodeLens]): CodeLensList = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), lenses = lenses.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeLensList]
  }
  @scala.inline
  implicit class CodeLensListOps[Self <: CodeLensList] (val x: Self) extends AnyVal {
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
    def setDispose(value: () => Unit): Self = this.set("dispose", js.Any.fromFunction0(value))
    @scala.inline
    def setLensesVarargs(value: CodeLens*): Self = this.set("lenses", js.Array(value :_*))
    @scala.inline
    def setLenses(value: js.Array[CodeLens]): Self = this.set("lenses", value.asInstanceOf[js.Any])
  }
  
}

