package typings.atOracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnColumnEnd[K, D] extends js.Object {
  var column: Anon_ClassNameContextLabel[K, D]
  var columnEnd: Anon_ClassNameContextLabelRenderer[K, D]
  var row: Anon_ClassNameContextLabelRendererResizable[K, D]
  var rowEnd: Anon_ClassNameContextLabelRendererResizableStyle[K, D]
}

object Anon_ColumnColumnEnd {
  @scala.inline
  def apply[K, D](
    column: Anon_ClassNameContextLabel[K, D],
    columnEnd: Anon_ClassNameContextLabelRenderer[K, D],
    row: Anon_ClassNameContextLabelRendererResizable[K, D],
    rowEnd: Anon_ClassNameContextLabelRendererResizableStyle[K, D]
  ): Anon_ColumnColumnEnd[K, D] = {
    val __obj = js.Dynamic.literal(column = column, columnEnd = columnEnd, row = row, rowEnd = rowEnd)
  
    __obj.asInstanceOf[Anon_ColumnColumnEnd[K, D]]
  }
}

