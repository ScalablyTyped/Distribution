package typings.oracleOraclejet

import typings.oracleOraclejet.oracleOraclejetStrings.center
import typings.oracleOraclejet.oracleOraclejetStrings.end
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import typings.oracleOraclejet.oracleOraclejetStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHoverBackgroundColor extends js.Object {
  var backgroundColor: String
  var borderColor: String
  var hoverBackgroundColor: String
  var hoverInnerColor: String
  var hoverOuterColor: String
  var isolate: off | on
  var labelHalign: center | end | start
  var labelStyle: js.Object
  var selectedBackgroundColor: String
  var selectedInnerColor: String
  var selectedOuterColor: String
  var useNodeColor: on | off
}

object AnonHoverBackgroundColor {
  @scala.inline
  def apply(
    backgroundColor: String,
    borderColor: String,
    hoverBackgroundColor: String,
    hoverInnerColor: String,
    hoverOuterColor: String,
    isolate: off | on,
    labelHalign: center | end | start,
    labelStyle: js.Object,
    selectedBackgroundColor: String,
    selectedInnerColor: String,
    selectedOuterColor: String,
    useNodeColor: on | off
  ): AnonHoverBackgroundColor = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], hoverBackgroundColor = hoverBackgroundColor.asInstanceOf[js.Any], hoverInnerColor = hoverInnerColor.asInstanceOf[js.Any], hoverOuterColor = hoverOuterColor.asInstanceOf[js.Any], isolate = isolate.asInstanceOf[js.Any], labelHalign = labelHalign.asInstanceOf[js.Any], labelStyle = labelStyle.asInstanceOf[js.Any], selectedBackgroundColor = selectedBackgroundColor.asInstanceOf[js.Any], selectedInnerColor = selectedInnerColor.asInstanceOf[js.Any], selectedOuterColor = selectedOuterColor.asInstanceOf[js.Any], useNodeColor = useNodeColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHoverBackgroundColor]
  }
}

