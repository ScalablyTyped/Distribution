package typings.oracleOraclejet.ojtableMod.ojTable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
@js.native
trait ContextStatus[K] extends js.Object {
  var currentRow: CurrentRow[K] = js.native
  var rowIndex: Double = js.native
  var rowKey: K = js.native
}

object ContextStatus {
  @scala.inline
  def apply[K](currentRow: CurrentRow[K], rowIndex: Double, rowKey: K): ContextStatus[K] = {
    val __obj = js.Dynamic.literal(currentRow = currentRow.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], rowKey = rowKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextStatus[K]]
  }
  @scala.inline
  implicit class ContextStatusOps[Self <: ContextStatus[_], K] (val x: Self with ContextStatus[K]) extends AnyVal {
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
    def setCurrentRow(value: CurrentRow[K]): Self = this.set("currentRow", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowIndex(value: Double): Self = this.set("rowIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowKey(value: K): Self = this.set("rowKey", value.asInstanceOf[js.Any])
  }
  
}

