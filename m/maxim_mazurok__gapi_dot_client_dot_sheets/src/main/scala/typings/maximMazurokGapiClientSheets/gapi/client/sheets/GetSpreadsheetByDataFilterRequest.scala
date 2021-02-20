package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSpreadsheetByDataFilterRequest extends StObject {
  
  /** The DataFilters used to select which ranges to retrieve from the spreadsheet. */
  var dataFilters: js.UndefOr[js.Array[DataFilter]] = js.native
  
  /** True if grid data should be returned. This parameter is ignored if a field mask was set in the request. */
  var includeGridData: js.UndefOr[Boolean] = js.native
}
object GetSpreadsheetByDataFilterRequest {
  
  @scala.inline
  def apply(): GetSpreadsheetByDataFilterRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSpreadsheetByDataFilterRequest]
  }
  
  @scala.inline
  implicit class GetSpreadsheetByDataFilterRequestMutableBuilder[Self <: GetSpreadsheetByDataFilterRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataFilters(value: js.Array[DataFilter]): Self = StObject.set(x, "dataFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataFiltersUndefined: Self = StObject.set(x, "dataFilters", js.undefined)
    
    @scala.inline
    def setDataFiltersVarargs(value: DataFilter*): Self = StObject.set(x, "dataFilters", js.Array(value :_*))
    
    @scala.inline
    def setIncludeGridData(value: Boolean): Self = StObject.set(x, "includeGridData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeGridDataUndefined: Self = StObject.set(x, "includeGridData", js.undefined)
  }
}
