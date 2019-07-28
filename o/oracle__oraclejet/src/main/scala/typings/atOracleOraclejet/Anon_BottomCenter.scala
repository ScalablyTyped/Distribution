package typings.atOracleOraclejet

import typings.atOracleOraclejet.atOracleOraclejetStrings.bottom
import typings.atOracleOraclejet.atOracleOraclejetStrings.center
import typings.atOracleOraclejet.atOracleOraclejetStrings.end
import typings.atOracleOraclejet.atOracleOraclejetStrings.header
import typings.atOracleOraclejet.atOracleOraclejetStrings.node
import typings.atOracleOraclejet.atOracleOraclejetStrings.off
import typings.atOracleOraclejet.atOracleOraclejetStrings.start
import typings.atOracleOraclejet.atOracleOraclejetStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BottomCenter extends js.Object {
  var groupLabelDisplay: node | off | header
  var header: Anon_BackgroundColorBorderColor
  var hoverColor: String
  var labelDisplay: off | node
  var labelHalign: start | end | center
  var labelMinLength: Double
  var labelStyle: js.Object
  var labelValign: top | bottom | center
  var selectedInnerColor: String
  var selectedOuterColor: String
}

object Anon_BottomCenter {
  @scala.inline
  def apply(
    groupLabelDisplay: node | off | header,
    header: Anon_BackgroundColorBorderColor,
    hoverColor: String,
    labelDisplay: off | node,
    labelHalign: start | end | center,
    labelMinLength: Double,
    labelStyle: js.Object,
    labelValign: top | bottom | center,
    selectedInnerColor: String,
    selectedOuterColor: String
  ): Anon_BottomCenter = {
    val __obj = js.Dynamic.literal(groupLabelDisplay = groupLabelDisplay.asInstanceOf[js.Any], header = header, hoverColor = hoverColor, labelDisplay = labelDisplay.asInstanceOf[js.Any], labelHalign = labelHalign.asInstanceOf[js.Any], labelMinLength = labelMinLength, labelStyle = labelStyle, labelValign = labelValign.asInstanceOf[js.Any], selectedInnerColor = selectedInnerColor, selectedOuterColor = selectedOuterColor)
  
    __obj.asInstanceOf[Anon_BottomCenter]
  }
}

