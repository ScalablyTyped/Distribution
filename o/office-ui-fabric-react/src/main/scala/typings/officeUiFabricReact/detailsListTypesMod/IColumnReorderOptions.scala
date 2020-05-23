package typings.officeUiFabricReact.detailsListTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColumnReorderOptions extends js.Object {
  /**
    * Specifies the number fixed columns from right
    * @defaultvalue 0
    */
  var frozenColumnCountFromEnd: js.UndefOr[Double] = js.undefined
  /**
    * Specifies the number fixed columns from left
    * @defaultvalue 0
    */
  var frozenColumnCountFromStart: js.UndefOr[Double] = js.undefined
  /**
    * Callback to handle column reordering.
    * `draggedIndex` is the source column index, which should be placed at `targetIndex`.
    * @deprecated Use `onColumnDrop` instead.
    */
  var handleColumnReorder: js.UndefOr[js.Function2[/* draggedIndex */ Double, /* targetIndex */ Double, Unit]] = js.undefined
  /**
    * Callback to handle when dragging on this column's DetailsHeader has started.
    */
  var onColumnDragStart: js.UndefOr[js.Function1[/* dragStarted */ Boolean, Unit]] = js.undefined
  /**
    * Callback to handle column reordering.
    * `draggedIndex` is the source column index, which should be placed at `targetIndex`.
    */
  var onColumnDrop: js.UndefOr[js.Function1[/* dragDropDetails */ IColumnDragDropDetails, Unit]] = js.undefined
  /**
    * Callback to handle when dragging on this column's DetailsHeader has finished.
    */
  var onDragEnd: js.UndefOr[js.Function1[/* columnDropLocationDetails */ ColumnDragEndLocation, Unit]] = js.undefined
}

object IColumnReorderOptions {
  @scala.inline
  def apply(
    frozenColumnCountFromEnd: js.UndefOr[Double] = js.undefined,
    frozenColumnCountFromStart: js.UndefOr[Double] = js.undefined,
    handleColumnReorder: (/* draggedIndex */ Double, /* targetIndex */ Double) => Unit = null,
    onColumnDragStart: /* dragStarted */ Boolean => Unit = null,
    onColumnDrop: /* dragDropDetails */ IColumnDragDropDetails => Unit = null,
    onDragEnd: /* columnDropLocationDetails */ ColumnDragEndLocation => Unit = null
  ): IColumnReorderOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(frozenColumnCountFromEnd)) __obj.updateDynamic("frozenColumnCountFromEnd")(frozenColumnCountFromEnd.get.asInstanceOf[js.Any])
    if (!js.isUndefined(frozenColumnCountFromStart)) __obj.updateDynamic("frozenColumnCountFromStart")(frozenColumnCountFromStart.get.asInstanceOf[js.Any])
    if (handleColumnReorder != null) __obj.updateDynamic("handleColumnReorder")(js.Any.fromFunction2(handleColumnReorder))
    if (onColumnDragStart != null) __obj.updateDynamic("onColumnDragStart")(js.Any.fromFunction1(onColumnDragStart))
    if (onColumnDrop != null) __obj.updateDynamic("onColumnDrop")(js.Any.fromFunction1(onColumnDrop))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction1(onDragEnd))
    __obj.asInstanceOf[IColumnReorderOptions]
  }
}

