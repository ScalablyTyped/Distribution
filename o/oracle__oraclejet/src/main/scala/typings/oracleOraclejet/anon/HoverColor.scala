package typings.oracleOraclejet.anon

import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.center
import typings.oracleOraclejet.oracleOraclejetStrings.horizontal
import typings.oracleOraclejet.oracleOraclejetStrings.inner
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import typings.oracleOraclejet.oracleOraclejetStrings.outer
import typings.oracleOraclejet.oracleOraclejetStrings.rotated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HoverColor extends js.Object {
  var borderColor: String = js.native
  var borderWidth: Double = js.native
  var hoverColor: String = js.native
  var labelDisplay: horizontal | rotated | off | auto = js.native
  var labelHalign: inner | outer | center = js.native
  var labelMinLength: Double = js.native
  var labelStyle: js.Object = js.native
  var selectedInnerColor: String = js.native
  var selectedOuterColor: String = js.native
  var showDisclosure: on | off = js.native
}

object HoverColor {
  @scala.inline
  def apply(
    borderColor: String,
    borderWidth: Double,
    hoverColor: String,
    labelDisplay: horizontal | rotated | off | auto,
    labelHalign: inner | outer | center,
    labelMinLength: Double,
    labelStyle: js.Object,
    selectedInnerColor: String,
    selectedOuterColor: String,
    showDisclosure: on | off
  ): HoverColor = {
    val __obj = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], hoverColor = hoverColor.asInstanceOf[js.Any], labelDisplay = labelDisplay.asInstanceOf[js.Any], labelHalign = labelHalign.asInstanceOf[js.Any], labelMinLength = labelMinLength.asInstanceOf[js.Any], labelStyle = labelStyle.asInstanceOf[js.Any], selectedInnerColor = selectedInnerColor.asInstanceOf[js.Any], selectedOuterColor = selectedOuterColor.asInstanceOf[js.Any], showDisclosure = showDisclosure.asInstanceOf[js.Any])
    __obj.asInstanceOf[HoverColor]
  }
  @scala.inline
  implicit class HoverColorOps[Self <: HoverColor] (val x: Self) extends AnyVal {
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
    def setBorderWidth(value: Double): Self = this.set("borderWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setHoverColor(value: String): Self = this.set("hoverColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabelDisplay(value: horizontal | rotated | off | auto): Self = this.set("labelDisplay", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabelHalign(value: inner | outer | center): Self = this.set("labelHalign", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabelMinLength(value: Double): Self = this.set("labelMinLength", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabelStyle(value: js.Object): Self = this.set("labelStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectedInnerColor(value: String): Self = this.set("selectedInnerColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectedOuterColor(value: String): Self = this.set("selectedOuterColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowDisclosure(value: on | off): Self = this.set("showDisclosure", value.asInstanceOf[js.Any])
  }
  
}

