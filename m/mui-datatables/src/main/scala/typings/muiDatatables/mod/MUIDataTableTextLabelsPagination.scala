package typings.muiDatatables.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MUIDataTableTextLabelsPagination extends js.Object {
  
  var displayRows: String = js.native
  
  var jumpToPage: String = js.native
  
  var next: String = js.native
  
  var previous: String = js.native
  
  var rowsPerPage: String = js.native
}
object MUIDataTableTextLabelsPagination {
  
  @scala.inline
  def apply(displayRows: String, jumpToPage: String, next: String, previous: String, rowsPerPage: String): MUIDataTableTextLabelsPagination = {
    val __obj = js.Dynamic.literal(displayRows = displayRows.asInstanceOf[js.Any], jumpToPage = jumpToPage.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], previous = previous.asInstanceOf[js.Any], rowsPerPage = rowsPerPage.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableTextLabelsPagination]
  }
  
  @scala.inline
  implicit class MUIDataTableTextLabelsPaginationOps[Self <: MUIDataTableTextLabelsPagination] (val x: Self) extends AnyVal {
    
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
    def setDisplayRows(value: String): Self = this.set("displayRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJumpToPage(value: String): Self = this.set("jumpToPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext(value: String): Self = this.set("next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevious(value: String): Self = this.set("previous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsPerPage(value: String): Self = this.set("rowsPerPage", value.asInstanceOf[js.Any])
  }
}
