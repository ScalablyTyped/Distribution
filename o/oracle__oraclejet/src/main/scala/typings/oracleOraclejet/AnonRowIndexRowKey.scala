package typings.oracleOraclejet

import typings.oracleOraclejet.ojtableMod.ojTable.CurrentRow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRowIndexRowKey[K] extends CurrentRow[K] {
  var rowIndex: js.UndefOr[Double] = js.undefined
  var rowKey: K
}

object AnonRowIndexRowKey {
  @scala.inline
  def apply[K](rowKey: K, rowIndex: Int | Double = null): AnonRowIndexRowKey[K] = {
    val __obj = js.Dynamic.literal(rowKey = rowKey.asInstanceOf[js.Any])
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRowIndexRowKey[K]]
  }
}

