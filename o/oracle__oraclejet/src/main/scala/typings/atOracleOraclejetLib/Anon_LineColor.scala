package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LineColor extends js.Object {
  var lineColor: java.lang.String
  var lineWidth: scala.Double
  var rendered: atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.on
}

object Anon_LineColor {
  @scala.inline
  def apply(
    lineColor: java.lang.String,
    lineWidth: scala.Double,
    rendered: atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.on
  ): Anon_LineColor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("lineColor")(lineColor)
    __obj.updateDynamic("lineWidth")(lineWidth)
    __obj.updateDynamic("rendered")(rendered.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_LineColor]
  }
}

