package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dashed extends js.Object {
  var lineColor: java.lang.String
  var lineStyle: atOracleOraclejetLib.atOracleOraclejetLibStrings.dotted | atOracleOraclejetLib.atOracleOraclejetLibStrings.dashed | atOracleOraclejetLib.atOracleOraclejetLibStrings.solid
  var lineWidth: scala.Double
  var markerColor: java.lang.String
  var markerDisplayed: atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.on
  var markerSize: scala.Double
}

object Anon_Dashed {
  @scala.inline
  def apply(
    lineColor: java.lang.String,
    lineStyle: atOracleOraclejetLib.atOracleOraclejetLibStrings.dotted | atOracleOraclejetLib.atOracleOraclejetLibStrings.dashed | atOracleOraclejetLib.atOracleOraclejetLibStrings.solid,
    lineWidth: scala.Double,
    markerColor: java.lang.String,
    markerDisplayed: atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.on,
    markerSize: scala.Double
  ): Anon_Dashed = {
    val __obj = js.Dynamic.literal(lineColor = lineColor, lineStyle = lineStyle.asInstanceOf[js.Any], lineWidth = lineWidth, markerColor = markerColor, markerDisplayed = markerDisplayed.asInstanceOf[js.Any], markerSize = markerSize)
  
    __obj.asInstanceOf[Anon_Dashed]
  }
}

