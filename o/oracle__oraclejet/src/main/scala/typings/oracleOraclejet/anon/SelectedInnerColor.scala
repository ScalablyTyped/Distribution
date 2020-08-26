package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectedInnerColor extends js.Object {
  var borderColor: js.UndefOr[String] = js.native
  var hoverColor: js.UndefOr[String] = js.native
  var selectedInnerColor: js.UndefOr[String] = js.native
  var selectedOuterColor: js.UndefOr[String] = js.native
}

object SelectedInnerColor {
  @scala.inline
  def apply(): SelectedInnerColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectedInnerColor]
  }
  @scala.inline
  implicit class SelectedInnerColorOps[Self <: SelectedInnerColor] (val x: Self) extends AnyVal {
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
    def setBorderColor(value: String): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    @scala.inline
    def setHoverColor(value: String): Self = this.set("hoverColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHoverColor: Self = this.set("hoverColor", js.undefined)
    @scala.inline
    def setSelectedInnerColor(value: String): Self = this.set("selectedInnerColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedInnerColor: Self = this.set("selectedInnerColor", js.undefined)
    @scala.inline
    def setSelectedOuterColor(value: String): Self = this.set("selectedOuterColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedOuterColor: Self = this.set("selectedOuterColor", js.undefined)
  }
  
}

