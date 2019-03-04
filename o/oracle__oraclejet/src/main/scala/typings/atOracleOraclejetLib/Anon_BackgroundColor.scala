package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BackgroundColor extends js.Object {
  var backgroundColor: java.lang.String
  var borderColor: java.lang.String
  var borderWidth: scala.Double
  var rendered: atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.on
}

object Anon_BackgroundColor {
  @scala.inline
  def apply(
    backgroundColor: java.lang.String,
    borderColor: java.lang.String,
    borderWidth: scala.Double,
    rendered: atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.on
  ): Anon_BackgroundColor = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor, borderColor = borderColor, borderWidth = borderWidth, rendered = rendered.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_BackgroundColor]
  }
}

