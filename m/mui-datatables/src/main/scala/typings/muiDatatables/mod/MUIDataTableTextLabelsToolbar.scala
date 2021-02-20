package typings.muiDatatables.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MUIDataTableTextLabelsToolbar extends StObject {
  
  var downloadCsv: String = js.native
  
  var filterTable: String = js.native
  
  var print: String = js.native
  
  var search: String = js.native
  
  var viewColumns: String = js.native
}
object MUIDataTableTextLabelsToolbar {
  
  @scala.inline
  def apply(downloadCsv: String, filterTable: String, print: String, search: String, viewColumns: String): MUIDataTableTextLabelsToolbar = {
    val __obj = js.Dynamic.literal(downloadCsv = downloadCsv.asInstanceOf[js.Any], filterTable = filterTable.asInstanceOf[js.Any], print = print.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], viewColumns = viewColumns.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableTextLabelsToolbar]
  }
  
  @scala.inline
  implicit class MUIDataTableTextLabelsToolbarMutableBuilder[Self <: MUIDataTableTextLabelsToolbar] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDownloadCsv(value: String): Self = StObject.set(x, "downloadCsv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterTable(value: String): Self = StObject.set(x, "filterTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrint(value: String): Self = StObject.set(x, "print", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewColumns(value: String): Self = StObject.set(x, "viewColumns", value.asInstanceOf[js.Any])
  }
}
