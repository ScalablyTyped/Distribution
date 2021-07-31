package typings.muiDatatables.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MUIDataTablePagination extends StObject {
  
  def changeRowsPerPage(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: js.Any
  ): js.Any
  
  var count: Double
  
  var options: MUIDataTableOptions
  
  var page: Double
  
  var rowsPerPage: Double
}
object MUIDataTablePagination {
  
  @scala.inline
  def apply(
    changeRowsPerPage: js.Any => js.Any,
    count: Double,
    options: MUIDataTableOptions,
    page: Double,
    rowsPerPage: Double
  ): MUIDataTablePagination = {
    val __obj = js.Dynamic.literal(changeRowsPerPage = js.Any.fromFunction1(changeRowsPerPage), count = count.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], rowsPerPage = rowsPerPage.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTablePagination]
  }
  
  @scala.inline
  implicit class MUIDataTablePaginationMutableBuilder[Self <: MUIDataTablePagination] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeRowsPerPage(value: js.Any => js.Any): Self = StObject.set(x, "changeRowsPerPage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: MUIDataTableOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsPerPage(value: Double): Self = StObject.set(x, "rowsPerPage", value.asInstanceOf[js.Any])
  }
}
