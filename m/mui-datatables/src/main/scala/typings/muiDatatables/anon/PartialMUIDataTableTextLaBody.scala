package typings.muiDatatables.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<mui-datatables.mui-datatables.MUIDataTableTextLabels> */
trait PartialMUIDataTableTextLaBody extends StObject {
  
  var body: js.UndefOr[PartialMUIDataTableTextLa] = js.undefined
  
  var filter: js.UndefOr[PartialMUIDataTableTextLaAll] = js.undefined
  
  var pagination: js.UndefOr[PartialMUIDataTableTextLaDisplayRows] = js.undefined
  
  var selectedRows: js.UndefOr[PartialMUIDataTableTextLaDelete] = js.undefined
  
  var toolbar: js.UndefOr[PartialMUIDataTableTextLaDownloadCsv] = js.undefined
  
  var viewColumns: js.UndefOr[PartialMUIDataTableTextLaTitle] = js.undefined
}
object PartialMUIDataTableTextLaBody {
  
  @scala.inline
  def apply(): PartialMUIDataTableTextLaBody = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMUIDataTableTextLaBody]
  }
  
  @scala.inline
  implicit class PartialMUIDataTableTextLaBodyMutableBuilder[Self <: PartialMUIDataTableTextLaBody] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: PartialMUIDataTableTextLa): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setFilter(value: PartialMUIDataTableTextLaAll): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setPagination(value: PartialMUIDataTableTextLaDisplayRows): Self = StObject.set(x, "pagination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaginationUndefined: Self = StObject.set(x, "pagination", js.undefined)
    
    @scala.inline
    def setSelectedRows(value: PartialMUIDataTableTextLaDelete): Self = StObject.set(x, "selectedRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedRowsUndefined: Self = StObject.set(x, "selectedRows", js.undefined)
    
    @scala.inline
    def setToolbar(value: PartialMUIDataTableTextLaDownloadCsv): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolbarUndefined: Self = StObject.set(x, "toolbar", js.undefined)
    
    @scala.inline
    def setViewColumns(value: PartialMUIDataTableTextLaTitle): Self = StObject.set(x, "viewColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewColumnsUndefined: Self = StObject.set(x, "viewColumns", js.undefined)
  }
}
