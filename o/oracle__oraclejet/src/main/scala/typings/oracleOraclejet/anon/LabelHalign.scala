package typings.oracleOraclejet.anon

import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.center
import typings.oracleOraclejet.oracleOraclejetStrings.end
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import typings.oracleOraclejet.oracleOraclejetStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelHalign extends js.Object {
  var labelHalign: center | end | start = js.native
  var labelStyle: js.Object = js.native
  var maximizedSvgStyle: js.Object = js.native
  var minimizedSvgStyle: js.Object = js.native
  var showCount: on | off | auto = js.native
  var svgStyle: js.Object = js.native
}

object LabelHalign {
  @scala.inline
  def apply(
    labelHalign: center | end | start,
    labelStyle: js.Object,
    maximizedSvgStyle: js.Object,
    minimizedSvgStyle: js.Object,
    showCount: on | off | auto,
    svgStyle: js.Object
  ): LabelHalign = {
    val __obj = js.Dynamic.literal(labelHalign = labelHalign.asInstanceOf[js.Any], labelStyle = labelStyle.asInstanceOf[js.Any], maximizedSvgStyle = maximizedSvgStyle.asInstanceOf[js.Any], minimizedSvgStyle = minimizedSvgStyle.asInstanceOf[js.Any], showCount = showCount.asInstanceOf[js.Any], svgStyle = svgStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelHalign]
  }
  @scala.inline
  implicit class LabelHalignOps[Self <: LabelHalign] (val x: Self) extends AnyVal {
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
    def setLabelHalign(value: center | end | start): Self = this.set("labelHalign", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabelStyle(value: js.Object): Self = this.set("labelStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaximizedSvgStyle(value: js.Object): Self = this.set("maximizedSvgStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinimizedSvgStyle(value: js.Object): Self = this.set("minimizedSvgStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowCount(value: on | off | auto): Self = this.set("showCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setSvgStyle(value: js.Object): Self = this.set("svgStyle", value.asInstanceOf[js.Any])
  }
  
}

