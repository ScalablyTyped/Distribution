package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoLineColor extends js.Object {
  var lineColor: java.lang.String
  var lineWidth: scala.Double
  var rendered: atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
}

object Anon_AutoLineColor {
  @scala.inline
  def apply(
    lineColor: java.lang.String,
    lineWidth: scala.Double,
    rendered: atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
  ): Anon_AutoLineColor = {
    val __obj = js.Dynamic.literal(lineColor = lineColor, lineWidth = lineWidth, rendered = rendered.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AutoLineColor]
  }
}

