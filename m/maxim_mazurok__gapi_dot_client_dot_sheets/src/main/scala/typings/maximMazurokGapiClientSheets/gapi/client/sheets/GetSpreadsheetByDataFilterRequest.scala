package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSpreadsheetByDataFilterRequest extends StObject {
  
  /** The DataFilters used to select which ranges to retrieve from the spreadsheet. */
  var dataFilters: js.UndefOr[js.Array[DataFilter]] = js.undefined
  
  /** True if grid data should be returned. This parameter is ignored if a field mask was set in the request. */
  var includeGridData: js.UndefOr[Boolean] = js.undefined
}
object GetSpreadsheetByDataFilterRequest {
  
  inline def apply(): GetSpreadsheetByDataFilterRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSpreadsheetByDataFilterRequest]
  }
  
  extension [Self <: GetSpreadsheetByDataFilterRequest](x: Self) {
    
    inline def setDataFilters(value: js.Array[DataFilter]): Self = StObject.set(x, "dataFilters", value.asInstanceOf[js.Any])
    
    inline def setDataFiltersUndefined: Self = StObject.set(x, "dataFilters", js.undefined)
    
    inline def setDataFiltersVarargs(value: DataFilter*): Self = StObject.set(x, "dataFilters", js.Array(value*))
    
    inline def setIncludeGridData(value: Boolean): Self = StObject.set(x, "includeGridData", value.asInstanceOf[js.Any])
    
    inline def setIncludeGridDataUndefined: Self = StObject.set(x, "includeGridData", js.undefined)
  }
}
