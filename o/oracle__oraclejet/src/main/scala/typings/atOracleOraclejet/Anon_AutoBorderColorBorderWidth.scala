package typings.atOracleOraclejet

import typings.atOracleOraclejet.atOracleOraclejetStrings.auto
import typings.atOracleOraclejet.atOracleOraclejetStrings.center
import typings.atOracleOraclejet.atOracleOraclejetStrings.horizontal
import typings.atOracleOraclejet.atOracleOraclejetStrings.inner
import typings.atOracleOraclejet.atOracleOraclejetStrings.off
import typings.atOracleOraclejet.atOracleOraclejetStrings.on
import typings.atOracleOraclejet.atOracleOraclejetStrings.outer
import typings.atOracleOraclejet.atOracleOraclejetStrings.rotated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoBorderColorBorderWidth extends js.Object {
  var borderColor: String
  var borderWidth: Double
  var hoverColor: String
  var labelDisplay: horizontal | rotated | off | auto
  var labelHalign: inner | outer | center
  var labelMinLength: Double
  var labelStyle: js.Object
  var selectedInnerColor: String
  var selectedOuterColor: String
  var showDisclosure: on | off
}

object Anon_AutoBorderColorBorderWidth {
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
  ): Anon_AutoBorderColorBorderWidth = {
    val __obj = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], hoverColor = hoverColor.asInstanceOf[js.Any], labelDisplay = labelDisplay.asInstanceOf[js.Any], labelHalign = labelHalign.asInstanceOf[js.Any], labelMinLength = labelMinLength.asInstanceOf[js.Any], labelStyle = labelStyle.asInstanceOf[js.Any], selectedInnerColor = selectedInnerColor.asInstanceOf[js.Any], selectedOuterColor = selectedOuterColor.asInstanceOf[js.Any], showDisclosure = showDisclosure.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AutoBorderColorBorderWidth]
  }
}

