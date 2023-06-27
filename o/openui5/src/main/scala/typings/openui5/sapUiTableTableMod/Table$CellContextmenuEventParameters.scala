package typings.openui5.sapUiTableTableMod

import typings.openui5.int
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Table$CellContextmenuEventParameters extends StObject {
  
  /**
    * The control of the cell.
    */
  var cellControl: js.UndefOr[typings.openui5.sapUiCoreControlMod.default] = js.undefined
  
  /**
    * DOM reference of the clicked cell. Can be used to position the context menu.
    */
  var cellDomRef: js.UndefOr[js.Object] = js.undefined
  
  /**
    * Column ID of the selected cell.
    */
  var columnId: js.UndefOr[String] = js.undefined
  
  /**
    * Column index of the selected cell. This is the index of visible columns and might differ from the index
    * maintained in the column aggregation.
    */
  var columnIndex: js.UndefOr[int] = js.undefined
  
  /**
    * Row binding context of the selected cell.
    */
  var rowBindingContext: js.UndefOr[typings.openui5.sapUiModelContextMod.default] = js.undefined
  
  /**
    * Row index of the selected cell.
    */
  var rowIndex: js.UndefOr[int] = js.undefined
}
object Table$CellContextmenuEventParameters {
  
  inline def apply(): Table$CellContextmenuEventParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Table$CellContextmenuEventParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Table$CellContextmenuEventParameters] (val x: Self) extends AnyVal {
    
    inline def setCellControl(value: typings.openui5.sapUiCoreControlMod.default): Self = StObject.set(x, "cellControl", value.asInstanceOf[js.Any])
    
    inline def setCellControlUndefined: Self = StObject.set(x, "cellControl", js.undefined)
    
    inline def setCellDomRef(value: js.Object): Self = StObject.set(x, "cellDomRef", value.asInstanceOf[js.Any])
    
    inline def setCellDomRefUndefined: Self = StObject.set(x, "cellDomRef", js.undefined)
    
    inline def setColumnId(value: String): Self = StObject.set(x, "columnId", value.asInstanceOf[js.Any])
    
    inline def setColumnIdUndefined: Self = StObject.set(x, "columnId", js.undefined)
    
    inline def setColumnIndex(value: int): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
    
    inline def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
    
    inline def setRowBindingContext(value: typings.openui5.sapUiModelContextMod.default): Self = StObject.set(x, "rowBindingContext", value.asInstanceOf[js.Any])
    
    inline def setRowBindingContextUndefined: Self = StObject.set(x, "rowBindingContext", js.undefined)
    
    inline def setRowIndex(value: int): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    
    inline def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
  }
}
