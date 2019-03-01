package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RowIndexRowKey[K]
  extends atOracleOraclejetLib.ojtableMod.ojTableNs.CurrentRow[K] {
  var rowIndex: js.UndefOr[scala.Double] = js.undefined
  var rowKey: K
}

object Anon_RowIndexRowKey {
  @scala.inline
  def apply[K](rowKey: K, rowIndex: scala.Int | scala.Double = null): Anon_RowIndexRowKey[K] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("rowKey")(rowKey.asInstanceOf[js.Any])
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_RowIndexRowKey[K]]
  }
}

