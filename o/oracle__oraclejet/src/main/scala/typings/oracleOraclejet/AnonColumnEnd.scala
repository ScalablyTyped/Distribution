package typings.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColumnEnd[K, D] extends js.Object {
  var column: AnonResizable[K, D]
  var columnEnd: AnonClassNameLabel[K, D]
  var row: AnonSortable[K, D]
  var rowEnd: AnonLabelRenderer[K, D]
}

object AnonColumnEnd {
  @scala.inline
  def apply[K, D](
    column: AnonResizable[K, D],
    columnEnd: AnonClassNameLabel[K, D],
    row: AnonSortable[K, D],
    rowEnd: AnonLabelRenderer[K, D]
  ): AnonColumnEnd[K, D] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], columnEnd = columnEnd.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], rowEnd = rowEnd.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonColumnEnd[K, D]]
  }
}

