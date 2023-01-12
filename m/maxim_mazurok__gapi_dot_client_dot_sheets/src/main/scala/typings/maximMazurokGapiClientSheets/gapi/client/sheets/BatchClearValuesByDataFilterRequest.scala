package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchClearValuesByDataFilterRequest extends StObject {
  
  /** The DataFilters used to determine which ranges to clear. */
  var dataFilters: js.UndefOr[js.Array[DataFilter]] = js.undefined
}
object BatchClearValuesByDataFilterRequest {
  
  inline def apply(): BatchClearValuesByDataFilterRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchClearValuesByDataFilterRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchClearValuesByDataFilterRequest] (val x: Self) extends AnyVal {
    
    inline def setDataFilters(value: js.Array[DataFilter]): Self = StObject.set(x, "dataFilters", value.asInstanceOf[js.Any])
    
    inline def setDataFiltersUndefined: Self = StObject.set(x, "dataFilters", js.undefined)
    
    inline def setDataFiltersVarargs(value: DataFilter*): Self = StObject.set(x, "dataFilters", js.Array(value*))
  }
}
