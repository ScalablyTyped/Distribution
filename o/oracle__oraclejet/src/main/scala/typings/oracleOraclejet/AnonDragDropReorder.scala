package typings.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDragDropReorder extends js.Object {
  var drag: js.UndefOr[AnonItemsAnonDataTypesDragDragEnd] = js.undefined
  var drop: js.UndefOr[AnonItemsAnonDataTypesDragEnterDragLeaveDragOver] = js.undefined
  var reorder: AnonDisabledEnabled
}

object AnonDragDropReorder {
  @scala.inline
  def apply(
    reorder: AnonDisabledEnabled,
    drag: AnonItemsAnonDataTypesDragDragEnd = null,
    drop: AnonItemsAnonDataTypesDragEnterDragLeaveDragOver = null
  ): AnonDragDropReorder = {
    val __obj = js.Dynamic.literal(reorder = reorder.asInstanceOf[js.Any])
    if (drag != null) __obj.updateDynamic("drag")(drag.asInstanceOf[js.Any])
    if (drop != null) __obj.updateDynamic("drop")(drop.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDragDropReorder]
  }
}

