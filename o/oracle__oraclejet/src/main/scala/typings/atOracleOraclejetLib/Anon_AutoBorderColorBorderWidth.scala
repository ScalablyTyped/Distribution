package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoBorderColorBorderWidth extends js.Object {
  var borderColor: java.lang.String
  var borderWidth: scala.Double
  var hoverColor: java.lang.String
  var labelDisplay: atOracleOraclejetLib.atOracleOraclejetLibStrings.horizontal | atOracleOraclejetLib.atOracleOraclejetLibStrings.rotated | atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
  var labelHalign: atOracleOraclejetLib.atOracleOraclejetLibStrings.inner | atOracleOraclejetLib.atOracleOraclejetLibStrings.outer | atOracleOraclejetLib.atOracleOraclejetLibStrings.center
  var labelMinLength: scala.Double
  var labelStyle: js.Object
  var selectedInnerColor: java.lang.String
  var selectedOuterColor: java.lang.String
  var showDisclosure: atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off
}

object Anon_AutoBorderColorBorderWidth {
  @scala.inline
  def apply(
    borderColor: java.lang.String,
    borderWidth: scala.Double,
    hoverColor: java.lang.String,
    labelDisplay: atOracleOraclejetLib.atOracleOraclejetLibStrings.horizontal | atOracleOraclejetLib.atOracleOraclejetLibStrings.rotated | atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto,
    labelHalign: atOracleOraclejetLib.atOracleOraclejetLibStrings.inner | atOracleOraclejetLib.atOracleOraclejetLibStrings.outer | atOracleOraclejetLib.atOracleOraclejetLibStrings.center,
    labelMinLength: scala.Double,
    labelStyle: js.Object,
    selectedInnerColor: java.lang.String,
    selectedOuterColor: java.lang.String,
    showDisclosure: atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off
  ): Anon_AutoBorderColorBorderWidth = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("borderColor")(borderColor)
    __obj.updateDynamic("borderWidth")(borderWidth)
    __obj.updateDynamic("hoverColor")(hoverColor)
    __obj.updateDynamic("labelDisplay")(labelDisplay.asInstanceOf[js.Any])
    __obj.updateDynamic("labelHalign")(labelHalign.asInstanceOf[js.Any])
    __obj.updateDynamic("labelMinLength")(labelMinLength)
    __obj.updateDynamic("labelStyle")(labelStyle)
    __obj.updateDynamic("selectedInnerColor")(selectedInnerColor)
    __obj.updateDynamic("selectedOuterColor")(selectedOuterColor)
    __obj.updateDynamic("showDisclosure")(showDisclosure.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AutoBorderColorBorderWidth]
  }
}

