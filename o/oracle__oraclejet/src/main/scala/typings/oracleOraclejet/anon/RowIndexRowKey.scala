package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowIndexRowKey[K]
  extends typings.oracleOraclejet.ojtableMod.ojTable.CurrentRow[K] {
  var rowIndex: js.UndefOr[Double] = js.native
  var rowKey: K = js.native
}

object RowIndexRowKey {
  @scala.inline
  def apply[K](rowKey: K): RowIndexRowKey[K] = {
    val __obj = js.Dynamic.literal(rowKey = rowKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowIndexRowKey[K]]
  }
  @scala.inline
  implicit class RowIndexRowKeyOps[Self <: RowIndexRowKey[_], K] (val x: Self with RowIndexRowKey[K]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRowKey(value: K): Self = this.set("rowKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowIndex(value: Double): Self = this.set("rowIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowIndex: Self = this.set("rowIndex", js.undefined)
  }
  
}

