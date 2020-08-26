package typings.oracleOraclejet.ojtableMod.ojTable

import typings.oracleOraclejet.anon.DataIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
@js.native
trait DragRowContext[K, D] extends js.Object {
  var rows: js.Array[DataIndex[D, K]] = js.native
}

object DragRowContext {
  @scala.inline
  def apply[K, D](rows: js.Array[DataIndex[D, K]]): DragRowContext[K, D] = {
    val __obj = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragRowContext[K, D]]
  }
  @scala.inline
  implicit class DragRowContextOps[Self <: DragRowContext[_, _], K, D] (val x: Self with (DragRowContext[K, D])) extends AnyVal {
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
    def setRowsVarargs(value: (DataIndex[D, K])*): Self = this.set("rows", js.Array(value :_*))
    @scala.inline
    def setRows(value: js.Array[DataIndex[D, K]]): Self = this.set("rows", value.asInstanceOf[js.Any])
  }
  
}

