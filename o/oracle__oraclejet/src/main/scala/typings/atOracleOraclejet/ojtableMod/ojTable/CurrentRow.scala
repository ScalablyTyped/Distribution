package typings.atOracleOraclejet.ojtableMod.ojTable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
/* Rewritten from type alias, can be one of: 
  - typings.atOracleOraclejet.Anon_RowIndex[K]
  - typings.atOracleOraclejet.Anon_RowIndexRowKey[K]
*/
trait CurrentRow[K] extends js.Object

object CurrentRow {
  @scala.inline
  def Anon_RowIndex[K](rowIndex: Double, rowKey: K = null): CurrentRow[K] = {
    val __obj = js.Dynamic.literal(rowIndex = rowIndex.asInstanceOf[js.Any])
    if (rowKey != null) __obj.updateDynamic("rowKey")(rowKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentRow[K]]
  }
  @scala.inline
  def Anon_RowIndexRowKey[K](rowKey: K, rowIndex: Int | Double = null): CurrentRow[K] = {
    val __obj = js.Dynamic.literal(rowKey = rowKey.asInstanceOf[js.Any])
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentRow[K]]
  }
}

