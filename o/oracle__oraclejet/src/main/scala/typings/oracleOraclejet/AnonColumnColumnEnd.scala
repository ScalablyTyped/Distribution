package typings.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColumnColumnEnd[K, D] extends js.Object {
  var column: AnonClassNameContextLabel[K, D]
  var columnEnd: AnonClassNameContextLabelRenderer[K, D]
  var row: AnonClassNameContextLabelRendererResizable[K, D]
  var rowEnd: AnonClassNameContextLabelRendererResizableStyle[K, D]
}

object AnonColumnColumnEnd {
  @scala.inline
  def apply[K, D](
    column: AnonClassNameContextLabel[K, D],
    columnEnd: AnonClassNameContextLabelRenderer[K, D],
    row: AnonClassNameContextLabelRendererResizable[K, D],
    rowEnd: AnonClassNameContextLabelRendererResizableStyle[K, D]
  ): AnonColumnColumnEnd[K, D] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], columnEnd = columnEnd.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], rowEnd = rowEnd.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonColumnColumnEnd[K, D]]
  }
}

