package typings
package officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsListDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IColumnReorderOptions extends js.Object {
  /**
       * Specifies the number fixed columns from right
       * @default 0
       */
  var frozenColumnCountFromEnd: js.UndefOr[scala.Double] = js.undefined
  /**
       * Specifies the number fixed columns from left(0th index)
       * @default 0
       */
  var frozenColumnCountFromStart: js.UndefOr[scala.Double] = js.undefined
  /**
       * Callback to handle the column reorder
       * draggedIndex is the source column index, that need to be placed in targetIndex
       * Use onColumnDrop instead of this
       * @deprecated
       */
  var handleColumnReorder: js.UndefOr[
    js.Function2[/* draggedIndex */ scala.Double, /* targetIndex */ scala.Double, scala.Unit]
  ] = js.undefined
  /**
       * Callback to handle the column dragstart
       * draggedStarted indicates that the column drag has been started on DetailsHeader
       */
  var onColumnDragStart: js.UndefOr[js.Function1[/* dragStarted */ scala.Boolean, scala.Unit]] = js.undefined
  /**
       * Callback to handle the column reorder
       * draggedIndex is the source column index, that need to be placed in targetIndex
       */
  var onColumnDrop: js.UndefOr[js.Function1[/* dragDropDetails */ IColumnDragDropDetails, scala.Unit]] = js.undefined
  /**
       * Callback to handle the column reorder
       */
  var onDragEnd: js.UndefOr[js.Function1[/* columnDropLocationDetails */ ColumnDragEndLocation, scala.Unit]] = js.undefined
}

