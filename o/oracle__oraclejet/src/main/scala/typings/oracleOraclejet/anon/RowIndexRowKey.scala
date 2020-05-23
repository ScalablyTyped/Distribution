package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowIndexRowKey[K]
  extends typings.oracleOraclejet.ojtableMod.ojTable.CurrentRow[K] {
  var rowIndex: js.UndefOr[Double] = js.undefined
  var rowKey: K
}

object RowIndexRowKey {
  @scala.inline
  def apply[K](rowKey: K, rowIndex: js.UndefOr[Double] = js.undefined): RowIndexRowKey[K] = {
    val __obj = js.Dynamic.literal(rowKey = rowKey.asInstanceOf[js.Any])
    if (!js.isUndefined(rowIndex)) __obj.updateDynamic("rowIndex")(rowIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowIndexRowKey[K]]
  }
}

