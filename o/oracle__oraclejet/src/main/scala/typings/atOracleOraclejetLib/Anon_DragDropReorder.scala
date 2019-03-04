package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DragDropReorder extends js.Object {
  var drag: js.UndefOr[Anon_ItemsAnonDataTypesDragDragEnd] = js.undefined
  var drop: js.UndefOr[Anon_ItemsAnonDataTypesDragEnterDragLeaveDragOver] = js.undefined
  var reorder: Anon_DisabledEnabled
}

object Anon_DragDropReorder {
  @scala.inline
  def apply(
    reorder: Anon_DisabledEnabled,
    drag: Anon_ItemsAnonDataTypesDragDragEnd = null,
    drop: Anon_ItemsAnonDataTypesDragEnterDragLeaveDragOver = null
  ): Anon_DragDropReorder = {
    val __obj = js.Dynamic.literal(reorder = reorder)
    if (drag != null) __obj.updateDynamic("drag")(drag)
    if (drop != null) __obj.updateDynamic("drop")(drop)
    __obj.asInstanceOf[Anon_DragDropReorder]
  }
}

