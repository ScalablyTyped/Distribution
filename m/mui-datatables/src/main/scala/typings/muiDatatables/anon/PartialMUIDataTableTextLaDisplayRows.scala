package typings.muiDatatables.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<mui-datatables.mui-datatables.MUIDataTableTextLabelsPagination> */
@js.native
trait PartialMUIDataTableTextLaDisplayRows extends js.Object {
  
  var displayRows: js.UndefOr[String] = js.native
  
  var jumpToPage: js.UndefOr[String] = js.native
  
  var next: js.UndefOr[String] = js.native
  
  var previous: js.UndefOr[String] = js.native
  
  var rowsPerPage: js.UndefOr[String] = js.native
}
object PartialMUIDataTableTextLaDisplayRows {
  
  @scala.inline
  def apply(): PartialMUIDataTableTextLaDisplayRows = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMUIDataTableTextLaDisplayRows]
  }
  
  @scala.inline
  implicit class PartialMUIDataTableTextLaDisplayRowsOps[Self <: PartialMUIDataTableTextLaDisplayRows] (val x: Self) extends AnyVal {
    
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
    def deleteDisplayRows: Self = this.set("displayRows", js.undefined)
    
    @scala.inline
    def setJumpToPage(value: String): Self = this.set("jumpToPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJumpToPage: Self = this.set("jumpToPage", js.undefined)
    
    @scala.inline
    def setNext(value: String): Self = this.set("next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNext: Self = this.set("next", js.undefined)
    
    @scala.inline
    def setPrevious(value: String): Self = this.set("previous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrevious: Self = this.set("previous", js.undefined)
    
    @scala.inline
    def setRowsPerPage(value: String): Self = this.set("rowsPerPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowsPerPage: Self = this.set("rowsPerPage", js.undefined)
  }
}
