package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropReorder[K, D] extends js.Object {
  var drag: Rows[K, D]
  var drop: Columns
  var reorder: `18`
}

object DropReorder {
  @scala.inline
  def apply[K, D](drag: Rows[K, D], drop: Columns, reorder: `18`): DropReorder[K, D] = {
    val __obj = js.Dynamic.literal(drag = drag.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], reorder = reorder.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropReorder[K, D]]
  }
}

