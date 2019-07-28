package typings.atOracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DragDropReorderAnonColumns[K, D] extends js.Object {
  var drag: Anon_Rows[K, D]
  var drop: Anon_Columns
  var reorder: Anon_ColumnsDisabled
}

object Anon_DragDropReorderAnonColumns {
  @scala.inline
  def apply[K, D](drag: Anon_Rows[K, D], drop: Anon_Columns, reorder: Anon_ColumnsDisabled): Anon_DragDropReorderAnonColumns[K, D] = {
    val __obj = js.Dynamic.literal(drag = drag, drop = drop, reorder = reorder)
  
    __obj.asInstanceOf[Anon_DragDropReorderAnonColumns[K, D]]
  }
}

