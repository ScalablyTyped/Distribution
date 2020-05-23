package typings.novaEditorNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/// https://novadocs.panic.com/api-reference/text-editor-edit/
trait TextEditorEdit extends js.Object {
  def delete(range: Range): Unit
  def insert(position: Double, text: String): Unit
  def replace(range: Range, text: String): Unit
}

object TextEditorEdit {
  @scala.inline
  def apply(delete: Range => Unit, insert: (Double, String) => Unit, replace: (Range, String) => Unit): TextEditorEdit = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction2(insert), replace = js.Any.fromFunction2(replace))
    __obj.asInstanceOf[TextEditorEdit]
  }
}

