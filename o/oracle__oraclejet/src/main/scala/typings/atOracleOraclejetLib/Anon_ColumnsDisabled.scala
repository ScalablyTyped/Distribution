package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnsDisabled extends js.Object {
  var columns: atOracleOraclejetLib.atOracleOraclejetLibStrings.enabled | atOracleOraclejetLib.atOracleOraclejetLibStrings.disabled
}

object Anon_ColumnsDisabled {
  @scala.inline
  def apply(
    columns: atOracleOraclejetLib.atOracleOraclejetLibStrings.enabled | atOracleOraclejetLib.atOracleOraclejetLibStrings.disabled
  ): Anon_ColumnsDisabled = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ColumnsDisabled]
  }
}

