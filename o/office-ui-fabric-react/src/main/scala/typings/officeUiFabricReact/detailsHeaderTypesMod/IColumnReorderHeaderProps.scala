package typings.officeUiFabricReact.detailsHeaderTypesMod

import typings.officeUiFabricReact.AnonDropLocation
import typings.officeUiFabricReact.detailsListTypesMod.ColumnDragEndLocation
import typings.officeUiFabricReact.detailsListTypesMod.IColumnDragDropDetails
import typings.officeUiFabricReact.detailsListTypesMod.IColumnReorderOptions
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColumnReorderHeaderProps extends IColumnReorderOptions {
  /** Callback to notify the column dragEnd event to List
    * Need this to check whether the dragEnd has happened on
    * corresponding list or outside of the list
    */
  var onColumnDragEnd: js.UndefOr[js.Function2[/* props */ AnonDropLocation, /* event */ MouseEvent, Unit]] = js.undefined
}

object IColumnReorderHeaderProps {
  @scala.inline
  def apply(
    frozenColumnCountFromEnd: Int | Double = null,
    frozenColumnCountFromStart: Int | Double = null,
    handleColumnReorder: (/* draggedIndex */ Double, /* targetIndex */ Double) => Unit = null,
    onColumnDragEnd: (/* props */ AnonDropLocation, /* event */ MouseEvent) => Unit = null,
    onColumnDragStart: /* dragStarted */ Boolean => Unit = null,
    onColumnDrop: /* dragDropDetails */ IColumnDragDropDetails => Unit = null,
    onDragEnd: /* columnDropLocationDetails */ ColumnDragEndLocation => Unit = null
  ): IColumnReorderHeaderProps = {
    val __obj = js.Dynamic.literal()
    if (frozenColumnCountFromEnd != null) __obj.updateDynamic("frozenColumnCountFromEnd")(frozenColumnCountFromEnd.asInstanceOf[js.Any])
    if (frozenColumnCountFromStart != null) __obj.updateDynamic("frozenColumnCountFromStart")(frozenColumnCountFromStart.asInstanceOf[js.Any])
    if (handleColumnReorder != null) __obj.updateDynamic("handleColumnReorder")(js.Any.fromFunction2(handleColumnReorder))
    if (onColumnDragEnd != null) __obj.updateDynamic("onColumnDragEnd")(js.Any.fromFunction2(onColumnDragEnd))
    if (onColumnDragStart != null) __obj.updateDynamic("onColumnDragStart")(js.Any.fromFunction1(onColumnDragStart))
    if (onColumnDrop != null) __obj.updateDynamic("onColumnDrop")(js.Any.fromFunction1(onColumnDrop))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction1(onDragEnd))
    __obj.asInstanceOf[IColumnReorderHeaderProps]
  }
}

