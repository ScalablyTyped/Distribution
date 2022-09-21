package typings.muiDatatables.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MUIDataTableBodyRow extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
  
  var classes: js.UndefOr[js.Object] = js.undefined
  
  var onClick: js.UndefOr[js.Function1[/* args */ Any, Any]] = js.undefined
  
  var options: MUIDataTableOptions
  
  var rowSelected: js.UndefOr[Boolean] = js.undefined
}
object MUIDataTableBodyRow {
  
  inline def apply(options: MUIDataTableOptions): MUIDataTableBodyRow = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableBodyRow]
  }
  
  extension [Self <: MUIDataTableBodyRow](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setClasses(value: js.Object): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    inline def setOnClick(value: /* args */ Any => Any): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOptions(value: MUIDataTableOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setRowSelected(value: Boolean): Self = StObject.set(x, "rowSelected", value.asInstanceOf[js.Any])
    
    inline def setRowSelectedUndefined: Self = StObject.set(x, "rowSelected", js.undefined)
  }
}
