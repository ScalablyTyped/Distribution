package typings.muiDatatables.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<mui-datatables.mui-datatables.MUIDataTableTextLabels> */
@js.native
trait PartialMUIDataTableTextLaBody extends js.Object {
  
  var body: js.UndefOr[PartialMUIDataTableTextLa] = js.native
  
  var filter: js.UndefOr[PartialMUIDataTableTextLaAll] = js.native
  
  var pagination: js.UndefOr[PartialMUIDataTableTextLaDisplayRows] = js.native
  
  var selectedRows: js.UndefOr[PartialMUIDataTableTextLaDelete] = js.native
  
  var toolbar: js.UndefOr[PartialMUIDataTableTextLaDownloadCsv] = js.native
  
  var viewColumns: js.UndefOr[PartialMUIDataTableTextLaTitle] = js.native
}
object PartialMUIDataTableTextLaBody {
  
  @scala.inline
  def apply(): PartialMUIDataTableTextLaBody = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMUIDataTableTextLaBody]
  }
  
  @scala.inline
  implicit class PartialMUIDataTableTextLaBodyOps[Self <: PartialMUIDataTableTextLaBody] (val x: Self) extends AnyVal {
    
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
    def setBody(value: PartialMUIDataTableTextLa): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setFilter(value: PartialMUIDataTableTextLaAll): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setPagination(value: PartialMUIDataTableTextLaDisplayRows): Self = this.set("pagination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePagination: Self = this.set("pagination", js.undefined)
    
    @scala.inline
    def setSelectedRows(value: PartialMUIDataTableTextLaDelete): Self = this.set("selectedRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedRows: Self = this.set("selectedRows", js.undefined)
    
    @scala.inline
    def setToolbar(value: PartialMUIDataTableTextLaDownloadCsv): Self = this.set("toolbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToolbar: Self = this.set("toolbar", js.undefined)
    
    @scala.inline
    def setViewColumns(value: PartialMUIDataTableTextLaTitle): Self = this.set("viewColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewColumns: Self = this.set("viewColumns", js.undefined)
  }
}
