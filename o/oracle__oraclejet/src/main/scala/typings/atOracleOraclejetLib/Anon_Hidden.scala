package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Hidden extends js.Object {
  var horizontal: atOracleOraclejetLib.atOracleOraclejetLibStrings.visible | atOracleOraclejetLib.atOracleOraclejetLibStrings.hidden
  var vertical: atOracleOraclejetLib.atOracleOraclejetLibStrings.visible | atOracleOraclejetLib.atOracleOraclejetLibStrings.hidden
}

object Anon_Hidden {
  @scala.inline
  def apply(
    horizontal: atOracleOraclejetLib.atOracleOraclejetLibStrings.visible | atOracleOraclejetLib.atOracleOraclejetLibStrings.hidden,
    vertical: atOracleOraclejetLib.atOracleOraclejetLibStrings.visible | atOracleOraclejetLib.atOracleOraclejetLibStrings.hidden
  ): Anon_Hidden = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Hidden]
  }
}

