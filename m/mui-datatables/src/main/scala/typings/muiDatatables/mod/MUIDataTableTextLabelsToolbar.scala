package typings.muiDatatables.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MUIDataTableTextLabelsToolbar extends js.Object {
  
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
  implicit class MUIDataTableTextLabelsToolbarOps[Self <: MUIDataTableTextLabelsToolbar] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDownloadCsv(value: String): Self = this.set("downloadCsv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterTable(value: String): Self = this.set("filterTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrint(value: String): Self = this.set("print", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearch(value: String): Self = this.set("search", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewColumns(value: String): Self = this.set("viewColumns", value.asInstanceOf[js.Any])
  }
}
