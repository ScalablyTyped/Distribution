package typings.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEditorOption[K1 /* <: EditorOption */, V] extends js.Object {
  var defaultValue: V = js.native
  val id: K1 = js.native
  val name: String = js.native
}

object IEditorOption {
  @scala.inline
  def apply[/* <: typings.monacoEditor.mod.editor.EditorOption */ K1, V](defaultValue: V, id: K1, name: String): IEditorOption[K1, V] = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEditorOption[K1, V]]
  }
  @scala.inline
  implicit class IEditorOptionOps[Self <: IEditorOption[_, _], /* <: typings.monacoEditor.mod.editor.EditorOption */ K1, V] (val x: Self with (IEditorOption[K1, V])) extends AnyVal {
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
    def setDefaultValue(value: V): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: K1): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

