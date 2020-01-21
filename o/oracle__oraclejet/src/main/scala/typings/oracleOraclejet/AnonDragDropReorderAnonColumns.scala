package typings.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDragDropReorderAnonColumns[K, D] extends js.Object {
  var drag: AnonRows[K, D]
  var drop: AnonColumns
  var reorder: AnonColumnsDisabled
}

object AnonDragDropReorderAnonColumns {
  @scala.inline
  def apply[K, D](drag: AnonRows[K, D], drop: AnonColumns, reorder: AnonColumnsDisabled): AnonDragDropReorderAnonColumns[K, D] = {
    val __obj = js.Dynamic.literal(drag = drag.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], reorder = reorder.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDragDropReorderAnonColumns[K, D]]
  }
}

