package typings.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEditorHoverOptions extends js.Object {
  /**
    * Delay for showing the hover.
    * Defaults to 300.
    */
  var delay: js.UndefOr[Double] = js.native
  /**
    * Enable the hover.
    * Defaults to true.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * Is the hover sticky such that it can be clicked and its contents selected?
    * Defaults to true.
    */
  var sticky: js.UndefOr[Boolean] = js.native
}

object IEditorHoverOptions {
  @scala.inline
  def apply(): IEditorHoverOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEditorHoverOptions]
  }
  @scala.inline
  implicit class IEditorHoverOptionsOps[Self <: IEditorHoverOptions] (val x: Self) extends AnyVal {
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
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setSticky(value: Boolean): Self = this.set("sticky", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSticky: Self = this.set("sticky", js.undefined)
  }
  
}

