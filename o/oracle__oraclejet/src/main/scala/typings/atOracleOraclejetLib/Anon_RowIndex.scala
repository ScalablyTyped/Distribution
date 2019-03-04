package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RowIndex[K]
  extends atOracleOraclejetLib.ojtableMod.ojTableNs.CurrentRow[K] {
  var rowIndex: scala.Double
  var rowKey: js.UndefOr[K] = js.undefined
}

object Anon_RowIndex {
  @scala.inline
  def apply[K](rowIndex: scala.Double, rowKey: K = null): Anon_RowIndex[K] = {
    val __obj = js.Dynamic.literal(rowIndex = rowIndex)
    if (rowKey != null) __obj.updateDynamic("rowKey")(rowKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_RowIndex[K]]
  }
}

