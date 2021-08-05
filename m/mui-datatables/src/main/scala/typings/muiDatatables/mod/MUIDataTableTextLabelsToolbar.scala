package typings.muiDatatables.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MUIDataTableTextLabelsToolbar extends StObject {
  
  var downloadCsv: String
  
  var filterTable: String
  
  var print: String
  
  var search: String
  
  var viewColumns: String
}
object MUIDataTableTextLabelsToolbar {
  
  inline def apply(downloadCsv: String, filterTable: String, print: String, search: String, viewColumns: String): MUIDataTableTextLabelsToolbar = {
    val __obj = js.Dynamic.literal(downloadCsv = downloadCsv.asInstanceOf[js.Any], filterTable = filterTable.asInstanceOf[js.Any], print = print.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], viewColumns = viewColumns.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableTextLabelsToolbar]
  }
  
  extension [Self <: MUIDataTableTextLabelsToolbar](x: Self) {
    
    inline def setDownloadCsv(value: String): Self = StObject.set(x, "downloadCsv", value.asInstanceOf[js.Any])
    
    inline def setFilterTable(value: String): Self = StObject.set(x, "filterTable", value.asInstanceOf[js.Any])
    
    inline def setPrint(value: String): Self = StObject.set(x, "print", value.asInstanceOf[js.Any])
    
    inline def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    inline def setViewColumns(value: String): Self = StObject.set(x, "viewColumns", value.asInstanceOf[js.Any])
  }
}
