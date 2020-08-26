package typings.oracleOraclejet.anon

import typings.oracleOraclejet.oracleOraclejetStrings.bottom
import typings.oracleOraclejet.oracleOraclejetStrings.center
import typings.oracleOraclejet.oracleOraclejetStrings.end
import typings.oracleOraclejet.oracleOraclejetStrings.header
import typings.oracleOraclejet.oracleOraclejetStrings.node
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.start
import typings.oracleOraclejet.oracleOraclejetStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupLabelDisplay extends js.Object {
  var groupLabelDisplay: node | off | header = js.native
  var header: HoverBackgroundColor = js.native
  var hoverColor: String = js.native
  var labelDisplay: off | node = js.native
  var labelHalign: start | end | center = js.native
  var labelMinLength: Double = js.native
  var labelStyle: js.Object = js.native
  var labelValign: top | bottom | center = js.native
  var selectedInnerColor: String = js.native
  var selectedOuterColor: String = js.native
}

object GroupLabelDisplay {
  @scala.inline
  def apply(
    groupLabelDisplay: node | off | header,
    header: HoverBackgroundColor,
    hoverColor: String,
    labelDisplay: off | node,
    labelHalign: start | end | center,
    labelMinLength: Double,
    labelStyle: js.Object,
    labelValign: top | bottom | center,
    selectedInnerColor: String,
    selectedOuterColor: String
  ): GroupLabelDisplay = {
    val __obj = js.Dynamic.literal(groupLabelDisplay = groupLabelDisplay.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], hoverColor = hoverColor.asInstanceOf[js.Any], labelDisplay = labelDisplay.asInstanceOf[js.Any], labelHalign = labelHalign.asInstanceOf[js.Any], labelMinLength = labelMinLength.asInstanceOf[js.Any], labelStyle = labelStyle.asInstanceOf[js.Any], labelValign = labelValign.asInstanceOf[js.Any], selectedInnerColor = selectedInnerColor.asInstanceOf[js.Any], selectedOuterColor = selectedOuterColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupLabelDisplay]
  }
  @scala.inline
  implicit class GroupLabelDisplayOps[Self <: GroupLabelDisplay] (val x: Self) extends AnyVal {
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
    def setGroupLabelDisplay(value: node | off | header): Self = this.set("groupLabelDisplay", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeader(value: HoverBackgroundColor): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def setHoverColor(value: String): Self = this.set("hoverColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabelDisplay(value: off | node): Self = this.set("labelDisplay", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabelHalign(value: start | end | center): Self = this.set("labelHalign", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabelMinLength(value: Double): Self = this.set("labelMinLength", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabelStyle(value: js.Object): Self = this.set("labelStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabelValign(value: top | bottom | center): Self = this.set("labelValign", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectedInnerColor(value: String): Self = this.set("selectedInnerColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectedOuterColor(value: String): Self = this.set("selectedOuterColor", value.asInstanceOf[js.Any])
  }
  
}

