package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnEnd[K, D] extends js.Object {
  var column: Resizable[K, D]
  var columnEnd: ClassNameLabel[K, D]
  var row: Sortable[K, D]
  var rowEnd: LabelRenderer[K, D]
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
}

