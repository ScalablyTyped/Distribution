package typings.muiDatatables.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<mui-datatables.mui-datatables.MUIDataTableTextLabelsToolbar> */
trait PartialMUIDataTableTextLaDownloadCsv extends StObject {
  
  var downloadCsv: js.UndefOr[String] = js.undefined
  
  var filterTable: js.UndefOr[String] = js.undefined
  
  var print: js.UndefOr[String] = js.undefined
  
  var search: js.UndefOr[String] = js.undefined
  
  var viewColumns: js.UndefOr[String] = js.undefined
}
object PartialMUIDataTableTextLaDownloadCsv {
  
  inline def apply(): PartialMUIDataTableTextLaDownloadCsv = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMUIDataTableTextLaDownloadCsv]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialMUIDataTableTextLaDownloadCsv] (val x: Self) extends AnyVal {
    
    inline def setDownloadCsv(value: String): Self = StObject.set(x, "downloadCsv", value.asInstanceOf[js.Any])
    
    inline def setDownloadCsvUndefined: Self = StObject.set(x, "downloadCsv", js.undefined)
    
    inline def setFilterTable(value: String): Self = StObject.set(x, "filterTable", value.asInstanceOf[js.Any])
    
    inline def setFilterTableUndefined: Self = StObject.set(x, "filterTable", js.undefined)
    
    inline def setPrint(value: String): Self = StObject.set(x, "print", value.asInstanceOf[js.Any])
    
    inline def setPrintUndefined: Self = StObject.set(x, "print", js.undefined)
    
    inline def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
    
    inline def setViewColumns(value: String): Self = StObject.set(x, "viewColumns", value.asInstanceOf[js.Any])
    
    inline def setViewColumnsUndefined: Self = StObject.set(x, "viewColumns", js.undefined)
  }
}
