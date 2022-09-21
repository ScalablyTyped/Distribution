package typings.muiDatatables.mod

import typings.muiDatatables.anon.Data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MUIDataTableToolbarSelect extends StObject {
  
  var classes: js.UndefOr[js.Object] = js.undefined
  
  var displayData: js.UndefOr[DisplayData] = js.undefined
  
  var onRowsDelete: js.UndefOr[js.Function1[/* args */ Any, Any]] = js.undefined
  
  var options: MUIDataTableOptions
  
  var rowSelected: js.UndefOr[Boolean] = js.undefined
  
  var selectRowUpdate: js.UndefOr[js.Function1[/* args */ Any, Any]] = js.undefined
}
object MUIDataTableToolbarSelect {
  
  inline def apply(options: MUIDataTableOptions): MUIDataTableToolbarSelect = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableToolbarSelect]
  }
  
  extension [Self <: MUIDataTableToolbarSelect](x: Self) {
    
    inline def setClasses(value: js.Object): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    inline def setDisplayData(value: DisplayData): Self = StObject.set(x, "displayData", value.asInstanceOf[js.Any])
    
    inline def setDisplayDataUndefined: Self = StObject.set(x, "displayData", js.undefined)
    
    inline def setDisplayDataVarargs(value: Data*): Self = StObject.set(x, "displayData", js.Array(value*))
    
    inline def setOnRowsDelete(value: /* args */ Any => Any): Self = StObject.set(x, "onRowsDelete", js.Any.fromFunction1(value))
    
    inline def setOnRowsDeleteUndefined: Self = StObject.set(x, "onRowsDelete", js.undefined)
    
    inline def setOptions(value: MUIDataTableOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setRowSelected(value: Boolean): Self = StObject.set(x, "rowSelected", value.asInstanceOf[js.Any])
    
    inline def setRowSelectedUndefined: Self = StObject.set(x, "rowSelected", js.undefined)
    
    inline def setSelectRowUpdate(value: /* args */ Any => Any): Self = StObject.set(x, "selectRowUpdate", js.Any.fromFunction1(value))
    
    inline def setSelectRowUpdateUndefined: Self = StObject.set(x, "selectRowUpdate", js.undefined)
  }
}
