package typings.atOracleOraclejet

import typings.atOracleOraclejet.ojtableMod.ojTable.CurrentRow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RowIndexRowKey[K] extends CurrentRow[K] {
  var rowIndex: js.UndefOr[Double] = js.undefined
  var rowKey: K
}

object Anon_RowIndexRowKey {
  @scala.inline
  def apply[K](rowKey: K, rowIndex: Int | Double = null): Anon_RowIndexRowKey[K] = {
    val __obj = js.Dynamic.literal(rowKey = rowKey.asInstanceOf[js.Any])
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_RowIndexRowKey[K]]
  }
}

