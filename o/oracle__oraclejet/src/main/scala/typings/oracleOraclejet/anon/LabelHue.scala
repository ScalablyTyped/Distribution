package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelHue extends js.Object {
  var labelHue: js.UndefOr[String] = js.native
  var labelOpacity: js.UndefOr[String] = js.native
  var labelSatLum: js.UndefOr[String] = js.native
  var labelThumbDesc: js.UndefOr[String] = js.native
}

object LabelHue {
  @scala.inline
  def apply(): LabelHue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelHue]
  }
  @scala.inline
  implicit class LabelHueOps[Self <: LabelHue] (val x: Self) extends AnyVal {
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
    def setLabelHue(value: String): Self = this.set("labelHue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelHue: Self = this.set("labelHue", js.undefined)
    @scala.inline
    def setLabelOpacity(value: String): Self = this.set("labelOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelOpacity: Self = this.set("labelOpacity", js.undefined)
    @scala.inline
    def setLabelSatLum(value: String): Self = this.set("labelSatLum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelSatLum: Self = this.set("labelSatLum", js.undefined)
    @scala.inline
    def setLabelThumbDesc(value: String): Self = this.set("labelThumbDesc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelThumbDesc: Self = this.set("labelThumbDesc", js.undefined)
  }
  
}

