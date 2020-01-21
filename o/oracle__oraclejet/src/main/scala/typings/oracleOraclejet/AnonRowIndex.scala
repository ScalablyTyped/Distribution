package typings.oracleOraclejet

import typings.oracleOraclejet.ojtableMod.ojTable.CurrentRow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRowIndex[K] extends CurrentRow[K] {
  var rowIndex: Double
  var rowKey: js.UndefOr[K] = js.undefined
}

object AnonRowIndex {
  @scala.inline
  def apply[K](rowIndex: Double, rowKey: K = null): AnonRowIndex[K] = {
    val __obj = js.Dynamic.literal(rowIndex = rowIndex.asInstanceOf[js.Any])
    if (rowKey != null) __obj.updateDynamic("rowKey")(rowKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRowIndex[K]]
  }
}

