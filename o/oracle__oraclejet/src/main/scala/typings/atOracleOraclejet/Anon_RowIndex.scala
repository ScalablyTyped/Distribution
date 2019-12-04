package typings.atOracleOraclejet

import typings.atOracleOraclejet.ojtableMod.ojTable.CurrentRow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RowIndex[K] extends CurrentRow[K] {
  var rowIndex: Double
  var rowKey: js.UndefOr[K] = js.undefined
}

object Anon_RowIndex {
  @scala.inline
  def apply[K](rowIndex: Double, rowKey: K = null): Anon_RowIndex[K] = {
    val __obj = js.Dynamic.literal(rowIndex = rowIndex.asInstanceOf[js.Any])
    if (rowKey != null) __obj.updateDynamic("rowKey")(rowKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_RowIndex[K]]
  }
}

