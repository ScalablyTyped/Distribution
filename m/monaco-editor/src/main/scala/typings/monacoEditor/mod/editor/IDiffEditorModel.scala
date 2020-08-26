package typings.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDiffEditorModel extends IEditorModel {
  /**
    * Modified model.
    */
  var modified: ITextModel = js.native
  /**
    * Original model.
    */
  var original: ITextModel = js.native
}

object IDiffEditorModel {
  @scala.inline
  def apply(modified: ITextModel, original: ITextModel): IDiffEditorModel = {
    val __obj = js.Dynamic.literal(modified = modified.asInstanceOf[js.Any], original = original.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDiffEditorModel]
  }
  @scala.inline
  implicit class IDiffEditorModelOps[Self <: IDiffEditorModel] (val x: Self) extends AnyVal {
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
    def setModified(value: ITextModel): Self = this.set("modified", value.asInstanceOf[js.Any])
    @scala.inline
    def setOriginal(value: ITextModel): Self = this.set("original", value.asInstanceOf[js.Any])
  }
  
}

