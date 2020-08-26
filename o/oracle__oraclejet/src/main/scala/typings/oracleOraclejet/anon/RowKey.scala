package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowKey[K]
  extends typings.oracleOraclejet.ojtableMod.ojTable.CurrentRow[K] {
  var rowIndex: Double = js.native
  var rowKey: js.UndefOr[K] = js.native
}

object RowKey {
  @scala.inline
  def apply[K](rowIndex: Double): RowKey[K] = {
    val __obj = js.Dynamic.literal(rowIndex = rowIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowKey[K]]
  }
  @scala.inline
  implicit class RowKeyOps[Self <: RowKey[_], K] (val x: Self with RowKey[K]) extends AnyVal {
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
    def setRowIndex(value: Double): Self = this.set("rowIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowKey(value: K): Self = this.set("rowKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowKey: Self = this.set("rowKey", js.undefined)
  }
  
}

