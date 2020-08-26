package typings.officeUiFabricReact.detailsListTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IColumnReorderOptions extends js.Object {
  /**
    * Specifies the number fixed columns from right
    * @defaultvalue 0
    */
  var frozenColumnCountFromEnd: js.UndefOr[Double] = js.native
  /**
    * Specifies the number fixed columns from left
    * @defaultvalue 0
    */
  var frozenColumnCountFromStart: js.UndefOr[Double] = js.native
  /**
    * Callback to handle column reordering.
    * `draggedIndex` is the source column index, which should be placed at `targetIndex`.
    * @deprecated Use `onColumnDrop` instead.
    */
  var handleColumnReorder: js.UndefOr[js.Function2[/* draggedIndex */ Double, /* targetIndex */ Double, Unit]] = js.native
  /**
    * Callback to handle when dragging on this column's DetailsHeader has started.
    */
  var onColumnDragStart: js.UndefOr[js.Function1[/* dragStarted */ Boolean, Unit]] = js.native
  /**
    * Callback to handle column reordering.
    * `draggedIndex` is the source column index, which should be placed at `targetIndex`.
    */
  var onColumnDrop: js.UndefOr[js.Function1[/* dragDropDetails */ IColumnDragDropDetails, Unit]] = js.native
  /**
    * Callback to handle when dragging on this column's DetailsHeader has finished.
    */
  var onDragEnd: js.UndefOr[js.Function1[/* columnDropLocationDetails */ ColumnDragEndLocation, Unit]] = js.native
}

object IColumnReorderOptions {
  @scala.inline
  def apply(): IColumnReorderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IColumnReorderOptions]
  }
  @scala.inline
  implicit class IColumnReorderOptionsOps[Self <: IColumnReorderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFrozenColumnCountFromEnd(value: Double): Self = this.set("frozenColumnCountFromEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrozenColumnCountFromEnd: Self = this.set("frozenColumnCountFromEnd", js.undefined)
    @scala.inline
    def setFrozenColumnCountFromStart(value: Double): Self = this.set("frozenColumnCountFromStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrozenColumnCountFromStart: Self = this.set("frozenColumnCountFromStart", js.undefined)
    @scala.inline
    def setHandleColumnReorder(value: (/* draggedIndex */ Double, /* targetIndex */ Double) => Unit): Self = this.set("handleColumnReorder", js.Any.fromFunction2(value))
    @scala.inline
    def deleteHandleColumnReorder: Self = this.set("handleColumnReorder", js.undefined)
    @scala.inline
    def setOnColumnDragStart(value: /* dragStarted */ Boolean => Unit): Self = this.set("onColumnDragStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnColumnDragStart: Self = this.set("onColumnDragStart", js.undefined)
    @scala.inline
    def setOnColumnDrop(value: /* dragDropDetails */ IColumnDragDropDetails => Unit): Self = this.set("onColumnDrop", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnColumnDrop: Self = this.set("onColumnDrop", js.undefined)
    @scala.inline
    def setOnDragEnd(value: /* columnDropLocationDetails */ ColumnDragEndLocation => Unit): Self = this.set("onDragEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDragEnd: Self = this.set("onDragEnd", js.undefined)
  }
  
}

