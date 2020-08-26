package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnEnd[K, D] extends js.Object {
  var column: Resizable[K, D] = js.native
  var columnEnd: ClassNameLabel[K, D] = js.native
  var row: Sortable[K, D] = js.native
  var rowEnd: LabelRenderer[K, D] = js.native
}

object ColumnEnd {
  @scala.inline
  def apply[K, D](
    column: Resizable[K, D],
    columnEnd: ClassNameLabel[K, D],
    row: Sortable[K, D],
    rowEnd: LabelRenderer[K, D]
  ): ColumnEnd[K, D] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], columnEnd = columnEnd.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], rowEnd = rowEnd.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnEnd[K, D]]
  }
  @scala.inline
  implicit class ColumnEndOps[Self <: ColumnEnd[_, _], K, D] (val x: Self with (ColumnEnd[K, D])) extends AnyVal {
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
    def setColumn(value: Resizable[K, D]): Self = this.set("column", value.asInstanceOf[js.Any])
    @scala.inline
    def setColumnEnd(value: ClassNameLabel[K, D]): Self = this.set("columnEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def setRow(value: Sortable[K, D]): Self = this.set("row", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowEnd(value: LabelRenderer[K, D]): Self = this.set("rowEnd", value.asInstanceOf[js.Any])
  }
  
}

