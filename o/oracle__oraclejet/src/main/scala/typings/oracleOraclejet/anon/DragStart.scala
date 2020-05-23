package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragStart extends js.Object {
  var dataTypes: js.UndefOr[String | js.Array[String]] = js.undefined
  var drag: js.UndefOr[js.Function1[/* param0 */ typings.std.Event, Unit]] = js.undefined
  var dragEnd: js.UndefOr[js.Function1[/* param0 */ typings.std.Event, Unit]] = js.undefined
  var dragStart: js.UndefOr[js.Function2[/* param0 */ typings.std.Event, /* param1 */ ItemsArray, Unit]] = js.undefined
}

object DragStart {
  @scala.inline
  def apply(
    dataTypes: String | js.Array[String] = null,
    drag: /* param0 */ typings.std.Event => Unit = null,
    dragEnd: /* param0 */ typings.std.Event => Unit = null,
    dragStart: (/* param0 */ typings.std.Event, /* param1 */ ItemsArray) => Unit = null
  ): DragStart = {
    val __obj = js.Dynamic.literal()
    if (dataTypes != null) __obj.updateDynamic("dataTypes")(dataTypes.asInstanceOf[js.Any])
    if (drag != null) __obj.updateDynamic("drag")(js.Any.fromFunction1(drag))
    if (dragEnd != null) __obj.updateDynamic("dragEnd")(js.Any.fromFunction1(dragEnd))
    if (dragStart != null) __obj.updateDynamic("dragStart")(js.Any.fromFunction2(dragStart))
    __obj.asInstanceOf[DragStart]
  }
}

