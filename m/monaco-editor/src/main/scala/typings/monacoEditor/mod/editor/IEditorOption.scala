package typings.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEditorOption[K1 /* <: EditorOption */, V] extends js.Object {
  var defaultValue: V
  val id: K1
  val name: String
}

object IEditorOption {
  @scala.inline
  def apply[K1, V](defaultValue: V, id: K1, name: String): IEditorOption[K1, V] = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEditorOption[K1, V]]
  }
}

