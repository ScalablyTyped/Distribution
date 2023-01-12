package typings.openui5.anon

import typings.openui5.int
import typings.openui5.sapUiCoreLibraryMod.IContextMenu
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnIndex extends StObject {
  
  /**
    * Column index where the context menu opens. This is the index of the column in the `columns` aggregation.
    */
  var columnIndex: js.UndefOr[int] = js.undefined
  
  /**
    * Context menu
    */
  var contextMenu: js.UndefOr[IContextMenu] = js.undefined
  
  /**
    * Row index where the context menu opens.
    */
  var rowIndex: js.UndefOr[int] = js.undefined
}
object ColumnIndex {
  
  inline def apply(): ColumnIndex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnIndex]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColumnIndex] (val x: Self) extends AnyVal {
    
    inline def setColumnIndex(value: int): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
    
    inline def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
    
    inline def setContextMenu(value: IContextMenu): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
    
    inline def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
    
    inline def setRowIndex(value: int): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    
    inline def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
  }
}
