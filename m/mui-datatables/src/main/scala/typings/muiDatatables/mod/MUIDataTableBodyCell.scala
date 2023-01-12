package typings.muiDatatables.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MUIDataTableBodyCell extends StObject {
  
  var children: js.UndefOr[Any] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var classes: js.UndefOr[js.Object] = js.undefined
  
  var colIndex: js.UndefOr[Double] = js.undefined
  
  var columnHeader: js.UndefOr[Any] = js.undefined
  
  var dataIndex: js.UndefOr[Double] = js.undefined
  
  var options: js.UndefOr[MUIDataTableOptions] = js.undefined
  
  var otherProps: js.UndefOr[Any] = js.undefined
  
  var rowIndex: js.UndefOr[Double] = js.undefined
}
object MUIDataTableBodyCell {
  
  inline def apply(): MUIDataTableBodyCell = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MUIDataTableBodyCell]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MUIDataTableBodyCell] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setClasses(value: js.Object): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    inline def setColIndex(value: Double): Self = StObject.set(x, "colIndex", value.asInstanceOf[js.Any])
    
    inline def setColIndexUndefined: Self = StObject.set(x, "colIndex", js.undefined)
    
    inline def setColumnHeader(value: Any): Self = StObject.set(x, "columnHeader", value.asInstanceOf[js.Any])
    
    inline def setColumnHeaderUndefined: Self = StObject.set(x, "columnHeader", js.undefined)
    
    inline def setDataIndex(value: Double): Self = StObject.set(x, "dataIndex", value.asInstanceOf[js.Any])
    
    inline def setDataIndexUndefined: Self = StObject.set(x, "dataIndex", js.undefined)
    
    inline def setOptions(value: MUIDataTableOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setOtherProps(value: Any): Self = StObject.set(x, "otherProps", value.asInstanceOf[js.Any])
    
    inline def setOtherPropsUndefined: Self = StObject.set(x, "otherProps", js.undefined)
    
    inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    
    inline def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
  }
}
