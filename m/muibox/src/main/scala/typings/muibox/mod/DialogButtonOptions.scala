package typings.muibox.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DialogButtonOptions extends js.Object {
  var color: js.UndefOr[String] = js.native
  var endIcon: js.UndefOr[ReactNode] = js.native
  var startIcon: js.UndefOr[ReactNode] = js.native
  var text: js.UndefOr[String] = js.native
  var variant: js.UndefOr[String] = js.native
}

object DialogButtonOptions {
  @scala.inline
  def apply(): DialogButtonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogButtonOptions]
  }
  @scala.inline
  implicit class DialogButtonOptionsOps[Self <: DialogButtonOptions] (val x: Self) extends AnyVal {
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setEndIcon(value: ReactNode): Self = this.set("endIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndIcon: Self = this.set("endIcon", js.undefined)
    @scala.inline
    def setStartIcon(value: ReactNode): Self = this.set("startIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartIcon: Self = this.set("startIcon", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setVariant(value: String): Self = this.set("variant", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariant: Self = this.set("variant", js.undefined)
  }
  
}

