package typings.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEditorConstructionOptions extends IEditorOptions {
  /**
    * The initial editor dimension (to avoid measuring the container).
    */
  var dimension: js.UndefOr[IDimension] = js.native
}

object IEditorConstructionOptions {
  @scala.inline
  def apply(): IEditorConstructionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEditorConstructionOptions]
  }
  @scala.inline
  implicit class IEditorConstructionOptionsOps[Self <: IEditorConstructionOptions] (val x: Self) extends AnyVal {
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
    def setDimension(value: IDimension): Self = this.set("dimension", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDimension: Self = this.set("dimension", js.undefined)
  }
  
}

