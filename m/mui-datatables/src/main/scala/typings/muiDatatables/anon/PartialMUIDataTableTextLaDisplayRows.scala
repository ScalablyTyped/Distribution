package typings.muiDatatables.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<mui-datatables.mui-datatables.MUIDataTableTextLabelsPagination> */
trait PartialMUIDataTableTextLaDisplayRows extends StObject {
  
  var displayRows: js.UndefOr[String] = js.undefined
  
  var jumpToPage: js.UndefOr[String] = js.undefined
  
  var next: js.UndefOr[String] = js.undefined
  
  var previous: js.UndefOr[String] = js.undefined
  
  var rowsPerPage: js.UndefOr[String] = js.undefined
}
object PartialMUIDataTableTextLaDisplayRows {
  
  @scala.inline
  def apply(): PartialMUIDataTableTextLaDisplayRows = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMUIDataTableTextLaDisplayRows]
  }
  
  @scala.inline
  implicit class PartialMUIDataTableTextLaDisplayRowsMutableBuilder[Self <: PartialMUIDataTableTextLaDisplayRows] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayRows(value: String): Self = StObject.set(x, "displayRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayRowsUndefined: Self = StObject.set(x, "displayRows", js.undefined)
    
    @scala.inline
    def setJumpToPage(value: String): Self = StObject.set(x, "jumpToPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJumpToPageUndefined: Self = StObject.set(x, "jumpToPage", js.undefined)
    
    @scala.inline
    def setNext(value: String): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    
    @scala.inline
    def setPrevious(value: String): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
    
    @scala.inline
    def setRowsPerPage(value: String): Self = StObject.set(x, "rowsPerPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsPerPageUndefined: Self = StObject.set(x, "rowsPerPage", js.undefined)
  }
}
