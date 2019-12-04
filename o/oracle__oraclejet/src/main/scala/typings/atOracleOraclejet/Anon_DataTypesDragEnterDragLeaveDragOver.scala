package typings.atOracleOraclejet

import typings.atOracleOraclejet.ojlistviewMod.ojListView.ItemsDropContext
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataTypesDragEnterDragLeaveDragOver extends js.Object {
  var dataTypes: js.UndefOr[String | js.Array[String]] = js.undefined
  var dragEnter: js.UndefOr[js.Function2[/* param0 */ Event, /* param1 */ Anon_Item, Unit]] = js.undefined
  var dragLeave: js.UndefOr[js.Function2[/* param0 */ Event, /* param1 */ Anon_Item, Unit]] = js.undefined
  var dragOver: js.UndefOr[js.Function2[/* param0 */ Event, /* param1 */ Anon_Item, Unit]] = js.undefined
  var drop: js.UndefOr[js.Function2[/* param0 */ Event, /* param1 */ ItemsDropContext, Unit]] = js.undefined
}

object Anon_DataTypesDragEnterDragLeaveDragOver {
  @scala.inline
  def apply(
    dataTypes: String | js.Array[String] = null,
    dragEnter: (/* param0 */ Event, /* param1 */ Anon_Item) => Unit = null,
    dragLeave: (/* param0 */ Event, /* param1 */ Anon_Item) => Unit = null,
    dragOver: (/* param0 */ Event, /* param1 */ Anon_Item) => Unit = null,
    drop: (/* param0 */ Event, /* param1 */ ItemsDropContext) => Unit = null
  ): Anon_DataTypesDragEnterDragLeaveDragOver = {
    val __obj = js.Dynamic.literal()
    if (dataTypes != null) __obj.updateDynamic("dataTypes")(dataTypes.asInstanceOf[js.Any])
    if (dragEnter != null) __obj.updateDynamic("dragEnter")(js.Any.fromFunction2(dragEnter))
    if (dragLeave != null) __obj.updateDynamic("dragLeave")(js.Any.fromFunction2(dragLeave))
    if (dragOver != null) __obj.updateDynamic("dragOver")(js.Any.fromFunction2(dragOver))
    if (drop != null) __obj.updateDynamic("drop")(js.Any.fromFunction2(drop))
    __obj.asInstanceOf[Anon_DataTypesDragEnterDragLeaveDragOver]
  }
}

