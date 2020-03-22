package typings.oracleOraclejet

import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.center
import typings.oracleOraclejet.oracleOraclejetStrings.end
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import typings.oracleOraclejet.oracleOraclejetStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLabelHalign extends js.Object {
  var labelHalign: center | end | start
  var labelStyle: js.Object
  var maximizedSvgStyle: js.Object
  var minimizedSvgStyle: js.Object
  var showCount: on | off | auto
  var svgStyle: js.Object
}

object AnonLabelHalign {
  @scala.inline
  def apply(
    labelHalign: center | end | start,
    labelStyle: js.Object,
    maximizedSvgStyle: js.Object,
    minimizedSvgStyle: js.Object,
    showCount: on | off | auto,
    svgStyle: js.Object
  ): AnonLabelHalign = {
    val __obj = js.Dynamic.literal(labelHalign = labelHalign.asInstanceOf[js.Any], labelStyle = labelStyle.asInstanceOf[js.Any], maximizedSvgStyle = maximizedSvgStyle.asInstanceOf[js.Any], minimizedSvgStyle = minimizedSvgStyle.asInstanceOf[js.Any], showCount = showCount.asInstanceOf[js.Any], svgStyle = svgStyle.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLabelHalign]
  }
}

