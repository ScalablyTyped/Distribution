package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoBaselineColor extends js.Object {
  var baselineColor: atOracleOraclejetLib.atOracleOraclejetLibStrings.inherit | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
  var baselineStyle: atOracleOraclejetLib.atOracleOraclejetLibStrings.dotted | atOracleOraclejetLib.atOracleOraclejetLibStrings.dashed | atOracleOraclejetLib.atOracleOraclejetLibStrings.solid
  var baselineWidth: scala.Double
  var lineColor: java.lang.String
  var lineStyle: atOracleOraclejetLib.atOracleOraclejetLibStrings.dotted | atOracleOraclejetLib.atOracleOraclejetLibStrings.dashed | atOracleOraclejetLib.atOracleOraclejetLibStrings.solid
  var lineWidth: scala.Double
  var rendered: atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
}

object Anon_AutoBaselineColor {
  @scala.inline
  def apply(
    baselineColor: atOracleOraclejetLib.atOracleOraclejetLibStrings.inherit | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto,
    baselineStyle: atOracleOraclejetLib.atOracleOraclejetLibStrings.dotted | atOracleOraclejetLib.atOracleOraclejetLibStrings.dashed | atOracleOraclejetLib.atOracleOraclejetLibStrings.solid,
    baselineWidth: scala.Double,
    lineColor: java.lang.String,
    lineStyle: atOracleOraclejetLib.atOracleOraclejetLibStrings.dotted | atOracleOraclejetLib.atOracleOraclejetLibStrings.dashed | atOracleOraclejetLib.atOracleOraclejetLibStrings.solid,
    lineWidth: scala.Double,
    rendered: atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
  ): Anon_AutoBaselineColor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("baselineColor")(baselineColor.asInstanceOf[js.Any])
    __obj.updateDynamic("baselineStyle")(baselineStyle.asInstanceOf[js.Any])
    __obj.updateDynamic("baselineWidth")(baselineWidth)
    __obj.updateDynamic("lineColor")(lineColor)
    __obj.updateDynamic("lineStyle")(lineStyle.asInstanceOf[js.Any])
    __obj.updateDynamic("lineWidth")(lineWidth)
    __obj.updateDynamic("rendered")(rendered.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AutoBaselineColor]
  }
}

