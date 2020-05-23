package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragDrop extends js.Object {
  var drag: js.UndefOr[ItemsDragStart] = js.undefined
  var drop: js.UndefOr[ItemsDragOver] = js.undefined
  var reorder: `12`
}

object DragDrop {
  @scala.inline
  def apply(reorder: `12`, drag: ItemsDragStart = null, drop: ItemsDragOver = null): DragDrop = {
    val __obj = js.Dynamic.literal(reorder = reorder.asInstanceOf[js.Any])
    if (drag != null) __obj.updateDynamic("drag")(drag.asInstanceOf[js.Any])
    if (drop != null) __obj.updateDynamic("drop")(drop.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragDrop]
  }
}

