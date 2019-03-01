package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoColor extends js.Object {
  var color: java.lang.String
  var rendered: atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
}

object Anon_AutoColor {
  @scala.inline
  def apply(
    color: java.lang.String,
    rendered: atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
  ): Anon_AutoColor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("color")(color)
    __obj.updateDynamic("rendered")(rendered.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AutoColor]
  }
}

