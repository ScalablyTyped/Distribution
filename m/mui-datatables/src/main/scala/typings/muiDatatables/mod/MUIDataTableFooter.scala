package typings.muiDatatables.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MUIDataTableFooter extends StObject {
  
  var changePage: js.UndefOr[js.Function1[/* e */ Any, Any]] = js.undefined
  
  var changeRowsPerPage: js.UndefOr[js.Function1[/* e */ Any, Any]] = js.undefined
  
  var options: js.UndefOr[MUIDataTableOptions] = js.undefined
  
  var page: js.UndefOr[Double] = js.undefined
  
  var rowCount: js.UndefOr[Double] = js.undefined
  
  var rowsPerPage: js.UndefOr[Double] = js.undefined
}
object MUIDataTableFooter {
  
  inline def apply(): MUIDataTableFooter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MUIDataTableFooter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MUIDataTableFooter] (val x: Self) extends AnyVal {
    
    inline def setChangePage(value: /* e */ Any => Any): Self = StObject.set(x, "changePage", js.Any.fromFunction1(value))
    
    inline def setChangePageUndefined: Self = StObject.set(x, "changePage", js.undefined)
    
    inline def setChangeRowsPerPage(value: /* e */ Any => Any): Self = StObject.set(x, "changeRowsPerPage", js.Any.fromFunction1(value))
    
    inline def setChangeRowsPerPageUndefined: Self = StObject.set(x, "changeRowsPerPage", js.undefined)
    
    inline def setOptions(value: MUIDataTableOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setRowCount(value: Double): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
    
    inline def setRowCountUndefined: Self = StObject.set(x, "rowCount", js.undefined)
    
    inline def setRowsPerPage(value: Double): Self = StObject.set(x, "rowsPerPage", value.asInstanceOf[js.Any])
    
    inline def setRowsPerPageUndefined: Self = StObject.set(x, "rowsPerPage", js.undefined)
  }
}
