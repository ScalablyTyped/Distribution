package typings
package atOracleOraclejetLib

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("drag")(drag)
    __obj.updateDynamic("drop")(drop)
    __obj.updateDynamic("reorder")(reorder)
    __obj.asInstanceOf[Anon_DragDropReorderAnonColumns[K, D]]
  }
}

