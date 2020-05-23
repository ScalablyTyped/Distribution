package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowKey[K]
  extends typings.oracleOraclejet.ojtableMod.ojTable.CurrentRow[K] {
  var rowIndex: Double
  var rowKey: js.UndefOr[K] = js.undefined
}

object RowKey {
  @scala.inline
  def apply[K](rowIndex: Double, rowKey: K = null): RowKey[K] = {
    val __obj = js.Dynamic.literal(rowIndex = rowIndex.asInstanceOf[js.Any])
    if (rowKey != null) __obj.updateDynamic("rowKey")(rowKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowKey[K]]
  }
}

