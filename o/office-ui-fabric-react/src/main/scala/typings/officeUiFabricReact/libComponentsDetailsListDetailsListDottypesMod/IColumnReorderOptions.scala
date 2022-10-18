package typings.officeUiFabricReact.libComponentsDetailsListDetailsListDottypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IColumnReorderOptions extends StObject {
  
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
  
  inline def apply(): IColumnReorderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IColumnReorderOptions]
  }
  
  extension [Self <: IColumnReorderOptions](x: Self) {
    
    inline def setFrozenColumnCountFromEnd(value: Double): Self = StObject.set(x, "frozenColumnCountFromEnd", value.asInstanceOf[js.Any])
    
    inline def setFrozenColumnCountFromEndUndefined: Self = StObject.set(x, "frozenColumnCountFromEnd", js.undefined)
    
    inline def setFrozenColumnCountFromStart(value: Double): Self = StObject.set(x, "frozenColumnCountFromStart", value.asInstanceOf[js.Any])
    
    inline def setFrozenColumnCountFromStartUndefined: Self = StObject.set(x, "frozenColumnCountFromStart", js.undefined)
    
    inline def setHandleColumnReorder(value: (/* draggedIndex */ Double, /* targetIndex */ Double) => Unit): Self = StObject.set(x, "handleColumnReorder", js.Any.fromFunction2(value))
    
    inline def setHandleColumnReorderUndefined: Self = StObject.set(x, "handleColumnReorder", js.undefined)
    
    inline def setOnColumnDragStart(value: /* dragStarted */ Boolean => Unit): Self = StObject.set(x, "onColumnDragStart", js.Any.fromFunction1(value))
    
    inline def setOnColumnDragStartUndefined: Self = StObject.set(x, "onColumnDragStart", js.undefined)
    
    inline def setOnColumnDrop(value: /* dragDropDetails */ IColumnDragDropDetails => Unit): Self = StObject.set(x, "onColumnDrop", js.Any.fromFunction1(value))
    
    inline def setOnColumnDropUndefined: Self = StObject.set(x, "onColumnDrop", js.undefined)
    
    inline def setOnDragEnd(value: /* columnDropLocationDetails */ ColumnDragEndLocation => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1(value))
    
    inline def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
  }
}
