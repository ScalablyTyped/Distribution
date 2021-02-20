package typings.muiDatatables.mod

import typings.muiDatatables.anon.PartialMUIDataTableTextLa
import typings.muiDatatables.anon.PartialMUIDataTableTextLaAll
import typings.muiDatatables.anon.PartialMUIDataTableTextLaDelete
import typings.muiDatatables.anon.PartialMUIDataTableTextLaDisplayRows
import typings.muiDatatables.anon.PartialMUIDataTableTextLaDownloadCsv
import typings.muiDatatables.anon.PartialMUIDataTableTextLaTitle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MUIDataTableTextLabels extends StObject {
  
  var body: PartialMUIDataTableTextLa = js.native
  
  var filter: PartialMUIDataTableTextLaAll = js.native
  
  var pagination: PartialMUIDataTableTextLaDisplayRows = js.native
  
  var selectedRows: PartialMUIDataTableTextLaDelete = js.native
  
  var toolbar: PartialMUIDataTableTextLaDownloadCsv = js.native
  
  var viewColumns: PartialMUIDataTableTextLaTitle = js.native
}
object MUIDataTableTextLabels {
  
  @scala.inline
  def apply(
    body: PartialMUIDataTableTextLa,
    filter: PartialMUIDataTableTextLaAll,
    pagination: PartialMUIDataTableTextLaDisplayRows,
    selectedRows: PartialMUIDataTableTextLaDelete,
    toolbar: PartialMUIDataTableTextLaDownloadCsv,
    viewColumns: PartialMUIDataTableTextLaTitle
  ): MUIDataTableTextLabels = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], pagination = pagination.asInstanceOf[js.Any], selectedRows = selectedRows.asInstanceOf[js.Any], toolbar = toolbar.asInstanceOf[js.Any], viewColumns = viewColumns.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableTextLabels]
  }
  
  @scala.inline
  implicit class MUIDataTableTextLabelsMutableBuilder[Self <: MUIDataTableTextLabels] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: PartialMUIDataTableTextLa): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilter(value: PartialMUIDataTableTextLaAll): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagination(value: PartialMUIDataTableTextLaDisplayRows): Self = StObject.set(x, "pagination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedRows(value: PartialMUIDataTableTextLaDelete): Self = StObject.set(x, "selectedRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolbar(value: PartialMUIDataTableTextLaDownloadCsv): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewColumns(value: PartialMUIDataTableTextLaTitle): Self = StObject.set(x, "viewColumns", value.asInstanceOf[js.Any])
  }
}
