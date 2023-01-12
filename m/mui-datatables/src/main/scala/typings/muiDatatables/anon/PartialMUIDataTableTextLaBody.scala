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
  
  inline def apply(): PartialMUIDataTableTextLaBody = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMUIDataTableTextLaBody]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialMUIDataTableTextLaBody] (val x: Self) extends AnyVal {
    
    inline def setBody(value: PartialMUIDataTableTextLa): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setFilter(value: PartialMUIDataTableTextLaAll): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setPagination(value: PartialMUIDataTableTextLaDisplayRows): Self = StObject.set(x, "pagination", value.asInstanceOf[js.Any])
    
    inline def setPaginationUndefined: Self = StObject.set(x, "pagination", js.undefined)
    
    inline def setSelectedRows(value: PartialMUIDataTableTextLaDelete): Self = StObject.set(x, "selectedRows", value.asInstanceOf[js.Any])
    
    inline def setSelectedRowsUndefined: Self = StObject.set(x, "selectedRows", js.undefined)
    
    inline def setToolbar(value: PartialMUIDataTableTextLaDownloadCsv): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
    
    inline def setToolbarUndefined: Self = StObject.set(x, "toolbar", js.undefined)
    
    inline def setViewColumns(value: PartialMUIDataTableTextLaTitle): Self = StObject.set(x, "viewColumns", value.asInstanceOf[js.Any])
    
    inline def setViewColumnsUndefined: Self = StObject.set(x, "viewColumns", js.undefined)
  }
}
