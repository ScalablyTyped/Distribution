package typings.muiDatatables.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MUIDataTableFooter extends StObject {
  
  var changePage: js.UndefOr[js.Function1[/* e */ js.Any, js.Any]] = js.undefined
  
  var changeRowsPerPage: js.UndefOr[js.Function1[/* e */ js.Any, js.Any]] = js.undefined
  
  var options: js.UndefOr[MUIDataTableOptions] = js.undefined
  
  var page: js.UndefOr[Double] = js.undefined
  
  var rowCount: js.UndefOr[Double] = js.undefined
  
  var rowsPerPage: js.UndefOr[Double] = js.undefined
}
object MUIDataTableFooter {
  
  @scala.inline
  def apply(): MUIDataTableFooter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MUIDataTableFooter]
  }
  
  @scala.inline
  implicit class MUIDataTableFooterMutableBuilder[Self <: MUIDataTableFooter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangePage(value: /* e */ js.Any => js.Any): Self = StObject.set(x, "changePage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChangePageUndefined: Self = StObject.set(x, "changePage", js.undefined)
    
    @scala.inline
    def setChangeRowsPerPage(value: /* e */ js.Any => js.Any): Self = StObject.set(x, "changeRowsPerPage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChangeRowsPerPageUndefined: Self = StObject.set(x, "changeRowsPerPage", js.undefined)
    
    @scala.inline
    def setOptions(value: MUIDataTableOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    @scala.inline
    def setRowCount(value: Double): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowCountUndefined: Self = StObject.set(x, "rowCount", js.undefined)
    
    @scala.inline
    def setRowsPerPage(value: Double): Self = StObject.set(x, "rowsPerPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsPerPageUndefined: Self = StObject.set(x, "rowsPerPage", js.undefined)
  }
}
