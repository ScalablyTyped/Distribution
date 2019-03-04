package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoDashed extends js.Object {
  var lineColor: java.lang.String
  var lineStyle: atOracleOraclejetLib.atOracleOraclejetLibStrings.dotted | atOracleOraclejetLib.atOracleOraclejetLibStrings.dashed | atOracleOraclejetLib.atOracleOraclejetLibStrings.solid
  var lineWidth: scala.Double
  var rendered: atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
}

object Anon_AutoDashed {
  @scala.inline
  def apply(
    lineColor: java.lang.String,
    lineStyle: atOracleOraclejetLib.atOracleOraclejetLibStrings.dotted | atOracleOraclejetLib.atOracleOraclejetLibStrings.dashed | atOracleOraclejetLib.atOracleOraclejetLibStrings.solid,
    lineWidth: scala.Double,
    rendered: atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
  ): Anon_AutoDashed = {
    val __obj = js.Dynamic.literal(lineColor = lineColor, lineStyle = lineStyle.asInstanceOf[js.Any], lineWidth = lineWidth, rendered = rendered.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AutoDashed]
  }
}

