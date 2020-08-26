package typings.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDiffEditorViewState extends IEditorViewState {
  var modified: ICodeEditorViewState | Null = js.native
  var original: ICodeEditorViewState | Null = js.native
}

object IDiffEditorViewState {
  @scala.inline
  def apply(): IDiffEditorViewState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDiffEditorViewState]
  }
  @scala.inline
  implicit class IDiffEditorViewStateOps[Self <: IDiffEditorViewState] (val x: Self) extends AnyVal {
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
    def setModified(value: ICodeEditorViewState): Self = this.set("modified", value.asInstanceOf[js.Any])
    @scala.inline
    def setModifiedNull: Self = this.set("modified", null)
    @scala.inline
    def setOriginal(value: ICodeEditorViewState): Self = this.set("original", value.asInstanceOf[js.Any])
    @scala.inline
    def setOriginalNull: Self = this.set("original", null)
  }
  
}

