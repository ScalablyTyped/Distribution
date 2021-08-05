package typings.muiDatatables.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MUIDataTableTextLabelsPagination extends StObject {
  
  var displayRows: String
  
  var jumpToPage: String
  
  var next: String
  
  var previous: String
  
  var rowsPerPage: String
}
object MUIDataTableTextLabelsPagination {
  
  inline def apply(displayRows: String, jumpToPage: String, next: String, previous: String, rowsPerPage: String): MUIDataTableTextLabelsPagination = {
    val __obj = js.Dynamic.literal(displayRows = displayRows.asInstanceOf[js.Any], jumpToPage = jumpToPage.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], previous = previous.asInstanceOf[js.Any], rowsPerPage = rowsPerPage.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableTextLabelsPagination]
  }
  
  extension [Self <: MUIDataTableTextLabelsPagination](x: Self) {
    
    inline def setDisplayRows(value: String): Self = StObject.set(x, "displayRows", value.asInstanceOf[js.Any])
    
    inline def setJumpToPage(value: String): Self = StObject.set(x, "jumpToPage", value.asInstanceOf[js.Any])
    
    inline def setNext(value: String): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    inline def setPrevious(value: String): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
    
    inline def setRowsPerPage(value: String): Self = StObject.set(x, "rowsPerPage", value.asInstanceOf[js.Any])
  }
}
