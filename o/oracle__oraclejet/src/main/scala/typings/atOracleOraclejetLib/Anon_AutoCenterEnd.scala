package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoCenterEnd extends js.Object {
  var labelHalign: atOracleOraclejetLib.atOracleOraclejetLibStrings.center | atOracleOraclejetLib.atOracleOraclejetLibStrings.end | atOracleOraclejetLib.atOracleOraclejetLibStrings.start
  var labelStyle: js.Object
  var maximizedSvgStyle: js.Object
  var minimizedSvgStyle: js.Object
  var showCount: atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
  var svgStyle: js.Object
}

object Anon_AutoCenterEnd {
  @scala.inline
  def apply(
    labelHalign: atOracleOraclejetLib.atOracleOraclejetLibStrings.center | atOracleOraclejetLib.atOracleOraclejetLibStrings.end | atOracleOraclejetLib.atOracleOraclejetLibStrings.start,
    labelStyle: js.Object,
    maximizedSvgStyle: js.Object,
    minimizedSvgStyle: js.Object,
    showCount: atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto,
    svgStyle: js.Object
  ): Anon_AutoCenterEnd = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("labelHalign")(labelHalign.asInstanceOf[js.Any])
    __obj.updateDynamic("labelStyle")(labelStyle)
    __obj.updateDynamic("maximizedSvgStyle")(maximizedSvgStyle)
    __obj.updateDynamic("minimizedSvgStyle")(minimizedSvgStyle)
    __obj.updateDynamic("showCount")(showCount.asInstanceOf[js.Any])
    __obj.updateDynamic("svgStyle")(svgStyle)
    __obj.asInstanceOf[Anon_AutoCenterEnd]
  }
}

