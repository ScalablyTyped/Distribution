package typings.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEditorLightbulbOptions extends js.Object {
  /**
    * Enable the lightbulb code action.
    * Defaults to true.
    */
  var enabled: js.UndefOr[Boolean] = js.native
}

object IEditorLightbulbOptions {
  @scala.inline
  def apply(): IEditorLightbulbOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEditorLightbulbOptions]
  }
  @scala.inline
  implicit class IEditorLightbulbOptionsOps[Self <: IEditorLightbulbOptions] (val x: Self) extends AnyVal {
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
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
  }
  
}

