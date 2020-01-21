package typings.oracleOraclejet

import typings.oracleOraclejet.ojtableMod.ojTable.DragRowContext
import typings.std.DragEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDataTypesDragDragEndDragStart[K, D] extends js.Object {
  var dataTypes: js.UndefOr[String | js.Array[String]] = js.undefined
  var drag: js.UndefOr[js.Function1[/* param0 */ DragEvent, Unit]] = js.undefined
  var dragEnd: js.UndefOr[js.Function1[/* param0 */ DragEvent, Unit]] = js.undefined
  var dragStart: js.UndefOr[js.Function2[/* param0 */ DragEvent, /* param1 */ DragRowContext[K, D], Unit]] = js.undefined
}

object AnonDataTypesDragDragEndDragStart {
  @scala.inline
  def apply[K, D](
    dataTypes: String | js.Array[String] = null,
    drag: /* param0 */ DragEvent => Unit = null,
    dragEnd: /* param0 */ DragEvent => Unit = null,
    dragStart: (/* param0 */ DragEvent, /* param1 */ DragRowContext[K, D]) => Unit = null
  ): AnonDataTypesDragDragEndDragStart[K, D] = {
    val __obj = js.Dynamic.literal()
    if (dataTypes != null) __obj.updateDynamic("dataTypes")(dataTypes.asInstanceOf[js.Any])
    if (drag != null) __obj.updateDynamic("drag")(js.Any.fromFunction1(drag))
    if (dragEnd != null) __obj.updateDynamic("dragEnd")(js.Any.fromFunction1(dragEnd))
    if (dragStart != null) __obj.updateDynamic("dragStart")(js.Any.fromFunction2(dragStart))
    __obj.asInstanceOf[AnonDataTypesDragDragEndDragStart[K, D]]
  }
}

