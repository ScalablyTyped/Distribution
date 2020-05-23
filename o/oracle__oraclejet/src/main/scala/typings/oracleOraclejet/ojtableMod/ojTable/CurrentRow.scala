package typings.oracleOraclejet.ojtableMod.ojTable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
/* Rewritten from type alias, can be one of: 
  - typings.oracleOraclejet.anon.RowKey[K]
  - typings.oracleOraclejet.anon.RowIndexRowKey[K]
*/
trait CurrentRow[K] extends js.Object

object CurrentRow {
  @scala.inline
  def RowKey[K](rowIndex: Double, rowKey: K = null): CurrentRow[K] = {
    val __obj = js.Dynamic.literal(rowIndex = rowIndex.asInstanceOf[js.Any])
    if (rowKey != null) __obj.updateDynamic("rowKey")(rowKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentRow[K]]
  }
  @scala.inline
  def RowIndexRowKey[K](rowKey: K, rowIndex: js.UndefOr[Double] = js.undefined): CurrentRow[K] = {
    val __obj = js.Dynamic.literal(rowKey = rowKey.asInstanceOf[js.Any])
    if (!js.isUndefined(rowIndex)) __obj.updateDynamic("rowIndex")(rowIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentRow[K]]
  }
}

