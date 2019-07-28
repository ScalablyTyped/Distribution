package typings.atOracleOraclejet

import typings.atOracleOraclejet.atOracleOraclejetStrings.auto
import typings.atOracleOraclejet.atOracleOraclejetStrings.center
import typings.atOracleOraclejet.atOracleOraclejetStrings.end
import typings.atOracleOraclejet.atOracleOraclejetStrings.off
import typings.atOracleOraclejet.atOracleOraclejetStrings.on
import typings.atOracleOraclejet.atOracleOraclejetStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoCenterEnd extends js.Object {
  var labelHalign: center | end | start
  var labelStyle: js.Object
  var maximizedSvgStyle: js.Object
  var minimizedSvgStyle: js.Object
  var showCount: on | off | auto
  var svgStyle: js.Object
}

object Anon_AutoCenterEnd {
  @scala.inline
  def apply(
    labelHalign: center | end | start,
    labelStyle: js.Object,
    maximizedSvgStyle: js.Object,
    minimizedSvgStyle: js.Object,
    showCount: on | off | auto,
    svgStyle: js.Object
  ): Anon_AutoCenterEnd = {
    val __obj = js.Dynamic.literal(labelHalign = labelHalign.asInstanceOf[js.Any], labelStyle = labelStyle, maximizedSvgStyle = maximizedSvgStyle, minimizedSvgStyle = minimizedSvgStyle, showCount = showCount.asInstanceOf[js.Any], svgStyle = svgStyle)
  
    __obj.asInstanceOf[Anon_AutoCenterEnd]
  }
}

