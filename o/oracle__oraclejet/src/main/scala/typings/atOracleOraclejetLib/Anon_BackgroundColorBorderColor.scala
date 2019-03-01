package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BackgroundColorBorderColor extends js.Object {
  var backgroundColor: java.lang.String
  var borderColor: java.lang.String
  var hoverBackgroundColor: java.lang.String
  var hoverInnerColor: java.lang.String
  var hoverOuterColor: java.lang.String
  var isolate: atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.on
  var labelHalign: atOracleOraclejetLib.atOracleOraclejetLibStrings.center | atOracleOraclejetLib.atOracleOraclejetLibStrings.end | atOracleOraclejetLib.atOracleOraclejetLibStrings.start
  var labelStyle: js.Object
  var selectedBackgroundColor: java.lang.String
  var selectedInnerColor: java.lang.String
  var selectedOuterColor: java.lang.String
  var useNodeColor: atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off
}

object Anon_BackgroundColorBorderColor {
  @scala.inline
  def apply(
    backgroundColor: java.lang.String,
    borderColor: java.lang.String,
    hoverBackgroundColor: java.lang.String,
    hoverInnerColor: java.lang.String,
    hoverOuterColor: java.lang.String,
    isolate: atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.on,
    labelHalign: atOracleOraclejetLib.atOracleOraclejetLibStrings.center | atOracleOraclejetLib.atOracleOraclejetLibStrings.end | atOracleOraclejetLib.atOracleOraclejetLibStrings.start,
    labelStyle: js.Object,
    selectedBackgroundColor: java.lang.String,
    selectedInnerColor: java.lang.String,
    selectedOuterColor: java.lang.String,
    useNodeColor: atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off
  ): Anon_BackgroundColorBorderColor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("backgroundColor")(backgroundColor)
    __obj.updateDynamic("borderColor")(borderColor)
    __obj.updateDynamic("hoverBackgroundColor")(hoverBackgroundColor)
    __obj.updateDynamic("hoverInnerColor")(hoverInnerColor)
    __obj.updateDynamic("hoverOuterColor")(hoverOuterColor)
    __obj.updateDynamic("isolate")(isolate.asInstanceOf[js.Any])
    __obj.updateDynamic("labelHalign")(labelHalign.asInstanceOf[js.Any])
    __obj.updateDynamic("labelStyle")(labelStyle)
    __obj.updateDynamic("selectedBackgroundColor")(selectedBackgroundColor)
    __obj.updateDynamic("selectedInnerColor")(selectedInnerColor)
    __obj.updateDynamic("selectedOuterColor")(selectedOuterColor)
    __obj.updateDynamic("useNodeColor")(useNodeColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BackgroundColorBorderColor]
  }
}

