package typings.novaEditorNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/// https://novadocs.panic.com/api-reference/text-editor-edit/
@js.native
trait TextEditorEdit extends js.Object {
  def delete(range: Range): Unit = js.native
  def insert(position: Double, text: String): Unit = js.native
  def replace(range: Range, text: String): Unit = js.native
}

object TextEditorEdit {
  @scala.inline
  def apply(delete: Range => Unit, insert: (Double, String) => Unit, replace: (Range, String) => Unit): TextEditorEdit = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction2(insert), replace = js.Any.fromFunction2(replace))
    __obj.asInstanceOf[TextEditorEdit]
  }
  @scala.inline
  implicit class TextEditorEditOps[Self <: TextEditorEdit] (val x: Self) extends AnyVal {
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
    def setDelete(value: Range => Unit): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: (Double, String) => Unit): Self = this.set("insert", js.Any.fromFunction2(value))
    @scala.inline
    def setReplace(value: (Range, String) => Unit): Self = this.set("replace", js.Any.fromFunction2(value))
  }
  
}

