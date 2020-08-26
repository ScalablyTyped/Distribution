package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelCloseIcon extends js.Object {
  var labelCloseIcon: js.UndefOr[String] = js.native
}

object LabelCloseIcon {
  @scala.inline
  def apply(): LabelCloseIcon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelCloseIcon]
  }
  @scala.inline
  implicit class LabelCloseIconOps[Self <: LabelCloseIcon] (val x: Self) extends AnyVal {
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
    def setLabelCloseIcon(value: String): Self = this.set("labelCloseIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelCloseIcon: Self = this.set("labelCloseIcon", js.undefined)
  }
  
}

