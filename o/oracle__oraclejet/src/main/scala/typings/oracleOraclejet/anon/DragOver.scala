package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojlistviewMod.ojListView.ItemsDropContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragOver extends js.Object {
  var dataTypes: js.UndefOr[String | js.Array[String]] = js.undefined
  var dragEnter: js.UndefOr[js.Function2[/* param0 */ typings.std.Event, /* param1 */ Item, Unit]] = js.undefined
  var dragLeave: js.UndefOr[js.Function2[/* param0 */ typings.std.Event, /* param1 */ Item, Unit]] = js.undefined
  var dragOver: js.UndefOr[js.Function2[/* param0 */ typings.std.Event, /* param1 */ Item, Unit]] = js.undefined
  var drop: js.UndefOr[
    js.Function2[/* param0 */ typings.std.Event, /* param1 */ ItemsDropContext, Unit]
  ] = js.undefined
}

object DragOver {
  @scala.inline
  def apply(
    dataTypes: String | js.Array[String] = null,
    dragEnter: (/* param0 */ typings.std.Event, /* param1 */ Item) => Unit = null,
    dragLeave: (/* param0 */ typings.std.Event, /* param1 */ Item) => Unit = null,
    dragOver: (/* param0 */ typings.std.Event, /* param1 */ Item) => Unit = null,
    drop: (/* param0 */ typings.std.Event, /* param1 */ ItemsDropContext) => Unit = null
  ): DragOver = {
    val __obj = js.Dynamic.literal()
    if (dataTypes != null) __obj.updateDynamic("dataTypes")(dataTypes.asInstanceOf[js.Any])
    if (dragEnter != null) __obj.updateDynamic("dragEnter")(js.Any.fromFunction2(dragEnter))
    if (dragLeave != null) __obj.updateDynamic("dragLeave")(js.Any.fromFunction2(dragLeave))
    if (dragOver != null) __obj.updateDynamic("dragOver")(js.Any.fromFunction2(dragOver))
    if (drop != null) __obj.updateDynamic("drop")(js.Any.fromFunction2(drop))
    __obj.asInstanceOf[DragOver]
  }
}

