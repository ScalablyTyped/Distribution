package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IndexOjtablefooter extends js.Object {
  var index: scala.Double
  var subId: atOracleOraclejetLib.atOracleOraclejetLibStrings.`oj-table-footer` | atOracleOraclejetLib.atOracleOraclejetLibStrings.`oj-table-header`
}

object Anon_IndexOjtablefooter {
  @scala.inline
  def apply(
    index: scala.Double,
    subId: atOracleOraclejetLib.atOracleOraclejetLibStrings.`oj-table-footer` | atOracleOraclejetLib.atOracleOraclejetLibStrings.`oj-table-header`
  ): Anon_IndexOjtablefooter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("subId")(subId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IndexOjtablefooter]
  }
}

